lexer grammar MonkeyScanner;

//SIMBOLOS
PCIZQ : '[';
PCDER : ']';
PyCOMA : ';';
PIZQ : '(';
PDER : ')';
LLAVEDER : '}';
LLAVEIZQ : '{';
DOSPUN : ':';
EQUAL : '=';

//OPERADORES
SUMA : '+';
RESTA : '-';
MUL : '*';
DIV : '/';
MAYORK : '>';
MENORK : '<';
MENORIGUALK : '<=';
MAYORIGUALK : '=>';
II : '==';


//PALABRAS RESERVADAS
LET : 'let';
RETURN : 'return';

IF : 'if';
THEN : 'then';
ELSE : 'else';
WHILE : 'while';
BEGIN : 'begin';
END : 'end';
TRUE : 'true';
FALSE : 'false';
FIRST : 'first';
LAST : 'last';
FN : 'fn';
PUTS : 'puts';
COMA: ',';
LEN : 'len';
REST : 'rest';
PUSH : 'push';
//IDENTIFICADOR
ID : LETTER (LETTER | DIGIT)*;

//STRING
STRING : '"' LETTER (LETTER)* '"';

//LITERAL
INT : DIGIT DIGIT*;

//MACROS
fragment LETTER : 'a'..'z' | 'A'..'Z';
fragment DIGIT : '0'..'9';

WS : [ \t\n\r]+ -> skip;

COMMENT : '/*' .*? '*/' -> skip;

LINE_COMMENT : '//' ~[\r\n]* -> skip;