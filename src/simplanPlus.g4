grammar simplanPlus ;

prog   : exp                                                                                                 #progSimple
       | (dec)+ (stm)* (exp)?                                                                               #progComplex
       ;

dec    : type ID ';'                                                                                              #decId
       | type ID '(' ( param ( ',' param)* )? ')' '{' body '}'                                                   #decFun
       ;

param  : type ID ;

body   : (dec)* (stm)* (exp)?
	   ;

type   : 'int'
       | 'bool'
       | 'void'
       ;

stm    : ID '=' exp ';'                                                                                          #stmVar
       | ID '(' (exp (',' exp)* )? ')' ';'                                                                       #stmFun
       | 'if' '(' cond=exp ')' thenBranch=ifS ('else' elseBranch=ifS)?                                            #stmIf
	   ;

exp    :  INTEGER                                                                                            #expInteger
       | 'true'                                                                                                 #expTrue
       | 'false'                                                                                               #expFalse
       | ID                                                                                                       #expId
       | not='!' right=exp                                                                                       #expNot
       | left=exp ( per='*' | div='/') right=exp                                                              #expPerDiv
       | left=exp (plus='+' | min='-') right=exp                                                              #expPluMin
       | left=exp (mag='>' | min='<' | magUg='>=' | minUg='<=' | ug='==') right=exp                           #expCompar
       | left=exp ( and='&&' | or='||') right=exp                                                              #expLogic
       | 'if' '(' cond=exp ')' thenBranch=ifE 'else' elseBranch=ifE                                               #expif
       | '(' exp ')'                                                                                             #expPar
       | ID '(' (exp (',' exp)* )? ')'                                                                           #expFun
       ;

ifS    : '{' (stm)+ '}' ;

ifE    : '{' (stm)* exp '}';
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

//Numbers
fragment DIGIT  : '0'..'9';
INTEGER         : DIGIT+;

//IDs
fragment CHAR   : 'a'..'z' |'A'..'Z' ;
ID              : CHAR (CHAR | DIGIT)* ;

//ESCAPE SEQUENCES
WS              : (' '|'\t'|'\n'|'\r')-> skip;
LINECOMENTS     : '//' (~('\n'|'\r'))* -> skip;
BLOCKCOMENTS    : '/*'( ~('/'|'*')|'/'~'*'|'*'~'/'|BLOCKCOMENTS)* '*/' -> skip;

ERR             : .  -> channel(HIDDEN);