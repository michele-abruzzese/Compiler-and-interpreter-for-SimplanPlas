package ast;

import ast.Type;

public class VoidType extends Type {
    public String toPrint(String s) {
        return s + "void " ;
    }
}
