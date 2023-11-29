package ast;

import antlr.simplanPlusBaseVisitor;
import antlr.simplanPlusParser;

import java.util.ArrayList;

public class simplanPlusVisitorImpl extends simplanPlusBaseVisitor<Node> {
    @Override
    public Node visitProgSimple(simplanPlusParser.ProgSimpleContext ctx) {
        //simply return the result of the visit to the inner exp
        return new ProgNode(visit(ctx.exp()));
    }

    @Override
    public Node visitProgComplex(simplanPlusParser.ProgComplexContext ctx) {
        ArrayList<Node> _dec = new ArrayList<>();
        ArrayList<Node> _stm = new ArrayList<>();
        for(simplanPlusParser.DecContext dec : ctx.dec()){
            _dec.add(visit(dec));
        }

        for(simplanPlusParser.StmContext stm : ctx.stm()){
            _stm.add(visit(stm));
        }

        Node _exp = null;

        if(ctx.exp()!=null){
            _exp=visit(ctx.exp());
        }

        return new ProgDecStmNode(_dec,_stm,_exp);
    }

    @Override
    public Node visitDecId(simplanPlusParser.DecIdContext ctx) {
        //visit the type
        Node typeNode = visit(ctx.type());
        //build the varNode
        return new DecNode(ctx.ID().getText(), typeNode);

    }

    @Override
    public Node visitDecFun(simplanPlusParser.DecFunContext ctx) {
        //initialize @res with the visits to the type and its ID


        //add argument declarations
        //we are getting a shortcut here by constructing directly the ParNode
        //this could be done differently by visiting instead the VardecContext
        ArrayList<ParNode> _param = new ArrayList<ParNode>() ;

        for (simplanPlusParser.ParamContext vc : ctx.param())
            _param.add( new ParNode(vc.ID().getText(), (Type) visit( vc.type() )) );

        //get the exp body
        Node body = visit(ctx.body());

        return new FunNode(ctx.ID().getText(), (Type) visit(ctx.type()), _param, body);
    }

    //va bene cosi
    @Override
    public Node visitParam(simplanPlusParser.ParamContext ctx) {
        return super.visitParam(ctx);
    }

    @Override
    public Node visitBody(simplanPlusParser.BodyContext ctx) {
        ArrayList<Node> _dec = new ArrayList<>();
        ArrayList<Node> _stm = new ArrayList<>();
        for(simplanPlusParser.DecContext dec : ctx.dec()){
            _dec.add(visit(dec));
        }

        for(simplanPlusParser.StmContext stm : ctx.stm()){
            _stm.add(visit(stm));
        }

        Node _exp = null;

        if(ctx.exp()!=null){
            _exp=visit(ctx.exp());
        }

        return new BodyNode(_dec,_stm,_exp);
    }

    @Override
    public Node visitType(simplanPlusParser.TypeContext ctx) {
        if(ctx.getText().equals("int"))
            return new IntType();
        else if ((ctx.getText().equals("void"))){
            return new VoidType();
        }else return new BoolType();
    }

    @Override
    public Node visitStmVar(simplanPlusParser.StmVarContext ctx) {
        //prendo l' id

        String stringId = ctx.ID().getText();
        //visit the exp
        Node expNode = visit(ctx.exp());
        return new AssNode(stringId,expNode);
    }

    @Override
    public Node visitStmFun(simplanPlusParser.StmFunContext ctx) {

        String id = ctx.ID().getText();

        ArrayList<Node> params = new ArrayList<>();

        for (simplanPlusParser.ExpContext exp : ctx.exp()){
            params.add(visit(exp));
        }

        return new CallNode(id,params);
    }

    @Override
    public Node visitStmIf(simplanPlusParser.StmIfContext ctx) {

        Node condExp = visit (ctx.cond);

        ArrayList<Node> thenB = new ArrayList<>();

        for(simplanPlusParser.StmContext stm : ctx.thenBranch.stm()){
            thenB.add(visit(stm));
        }

        ArrayList<Node> elseB = new ArrayList<>();

        if(ctx.elseBranch!=null) {
            for (simplanPlusParser.StmContext stm : ctx.elseBranch.stm()) {
                elseB.add(visit(stm));
            }
        }


        return new IfNode(condExp,thenB,elseB,false);
    }

    @Override
    public Node visitExpPluMin(simplanPlusParser.ExpPluMinContext ctx) {

        if(ctx.plus != null){
            return new PlusNode(visit(ctx.left), visit(ctx.right));
        }else {

            return new MinusNode(visit(ctx.left), visit(ctx.right));
        }

    }

    @Override
    public Node visitExpLogic(simplanPlusParser.ExpLogicContext ctx) {
        if(ctx.and != null){
            return new AndNode(visit(ctx.left), visit(ctx.right));
        }else {

            return new OrNode(visit(ctx.left), visit(ctx.right));
        }
    }

    @Override
    public Node visitExpTrue(simplanPlusParser.ExpTrueContext ctx) {
        //there is no need to perform a check here, the lexer ensures this text is a boolean
        return new BoolNode(Boolean.parseBoolean(ctx.getText()));
    }

    @Override
    public Node visitExpCompar(simplanPlusParser.ExpComparContext ctx) {
        if(ctx.mag != null){
            return new GreaterNode(visit(ctx.left), visit(ctx.right));
        }else if(ctx.min != null) {

            return new MinorNode(visit(ctx.left), visit(ctx.right));
        }else if(ctx.magUg != null) {

            return new GreatEqNode(visit(ctx.left), visit(ctx.right));
        }else if(ctx.minUg != null) {

            return new MinEqNode(visit(ctx.left), visit(ctx.right));
        }else if(ctx.ug != null) {

            return new EqualNode(visit(ctx.left), visit(ctx.right));
        }

        return null;
    }

    @Override
    public Node visitExpFun(simplanPlusParser.ExpFunContext ctx) {

        String id = ctx.ID().getText();

        ArrayList<Node> params = new ArrayList<>();

        for (simplanPlusParser.ExpContext exp : ctx.exp()){
            params.add(visit(exp));
        }

        return new CallNode(id,params);
    }

    @Override
    public Node visitExpPar(simplanPlusParser.ExpParContext ctx) {
        return new ParenNode(visit(ctx.exp()));
    }

    @Override
    public Node visitExpif(simplanPlusParser.ExpifContext ctx) {
        Node condExp = visit (ctx.cond);

        ArrayList<Node> thenB = new ArrayList<>();

        for(simplanPlusParser.StmContext stm : ctx.thenBranch.stm()){
            thenB.add(visit(stm));
        }

        thenB.add(visit(ctx.thenBranch.exp()));

        ArrayList<Node> elseB = new ArrayList<>();

        for (simplanPlusParser.StmContext stm : ctx.elseBranch.stm()){
            elseB.add(visit(stm));
        }

        elseB.add(visit(ctx.elseBranch.exp()));

        return new IfNode(condExp,thenB,elseB, true);
    }

    @Override
    public Node visitExpInteger(simplanPlusParser.ExpIntegerContext ctx) {
        // notice that this method is not actually a rule but a named production #intVal
        //there is no need to perform a check here, the lexer ensures this text is an int
        return new IntNode(Integer.parseInt(ctx.INTEGER().getText()));
    }

    @Override
    public Node visitExpNot(simplanPlusParser.ExpNotContext ctx) {

        return new NotNode(visit(ctx.right));
    }

    @Override
    public Node visitExpFalse(simplanPlusParser.ExpFalseContext ctx) {
        //there is no need to perform a check here, the lexer ensures this text is a boolean
        return new BoolNode(Boolean.parseBoolean(ctx.getText()));
    }

    @Override
    public Node visitExpId(simplanPlusParser.ExpIdContext ctx) {
        //this corresponds to a variable access
        return new IdNode(ctx.ID().getText());
    }

    @Override
    public Node visitExpPerDiv(simplanPlusParser.ExpPerDivContext ctx) {

        if(ctx.div != null){
            return new DivNode(visit(ctx.left), visit(ctx.right));
        }else {

            return new MultNode(visit(ctx.left), visit(ctx.right));
        }
    }

    @Override
    public Node visitIfS(simplanPlusParser.IfSContext ctx) {
        ArrayList<Node> stm = new ArrayList<>();

        for (simplanPlusParser.StmContext s : ctx.stm()){
            stm.add(visit(s));
        }

        return new IfSNode(stm);
    }

    @Override
    public Node visitIfE(simplanPlusParser.IfEContext ctx) {
        ArrayList<Node> nodes = new ArrayList<>();

        for (simplanPlusParser.StmContext s : ctx.stm()){
            nodes.add(visit(s));
        }

        nodes.add(visit(ctx.exp()));

        return new IfSNode(nodes);
    }
}
