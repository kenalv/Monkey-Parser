parser grammar MonkeyParser;

options {
    tokenVocab = MonkeyScanner;
}

program : statement*                                                        #programa;
statement: LET letStatement                                                    #statementLet
                |RETURN returnStatement                                        #statementReturn
                |expressionStatement                                           #statementExpr;
letStatement: ID EQUAL expression ( PyCOMA | )                              #letStatementId;
returnStatement: expression (PyCOMA | )                                      #returnStatementa;
expressionStatement: expression(PyCOMA | )                                   #expressionStatementa;
expression: additionExpression comparison                                      #expressiona;
comparison: ((MAYORK
                | MENORK
                | MENORIGUALK
                | MAYORIGUALK
                | II ) additionExpression)*                                    #comparisonDesignator;
additionExpression: multiplicationExpression additionFactor                    #additionExpressiona;
additionFactor: (( SUMA | RESTA ) multiplicationExpression)*                   #additionFactorDesignator;
multiplicationExpression: elementExpression multiplicationFactor               #multiplicationExpressiona;
multiplicationFactor: (( MUL | DIV ) elementExpression )*                      #multiplicationFactora;
elementExpression: primitiveExpression (elementAccess | callExpression | )   #elementExpressiona;
elementAccess    : PCIZQ expression PCDER                                      #elementAccessa;
callExpression: PIZQ expressionList PDER                                       #callExpressionExprL;
primitiveExpression: INT                                                       #primitiveExpressionInt
                        | STRING                                               #primitiveExpressionStr
                        | ID                                                   #primitiveExpressionId
                        | TRUE                                                 #primitiveExpressionTrue
                        | FALSE                                                #primitiveExpressionFalse
                        | PIZQ expression PDER                                 #primitiveExpressionExpr
                        | arrayLiteral                                         #primitiveExpressionArLiteral
                        | arrayFunctions PIZQ expressionList PDER              #primitiveExpressionArFunct
                        | functionLiteral                                      #primitiveExpressionFuncLiteral
                        | hashLiteral                                          #primitiveExpressionHashLiteral
                        | printExpression                                      #primitiveExpressionPrint
                        | ifExpression                                         #primitiveExpressionIfExpr;
arrayFunctions: LEN
                | FIRST                                                        #arrayFunctionsFirst
                | LAST                                                         #arrayFunctionsLast
                | REST                                                         #arrayFunctionsRest
                | PUSH                                                         #arrayFunctionsPush;
arrayLiteral: PCIZQ expressionList PCDER                                       #arrayLiterala;
functionLiteral: FN PIZQ functionParameters PDER blockStatement                #functionLiteralFn;
functionParameters: ID moreIdentifiers                                         #functionParametersId;
moreIdentifiers: ( COMA ID )*                                                  #moreIdentifiersa;
hashLiteral: LLAVEIZQ hashContent moreHashContent LLAVEDER                     #hashLiterala;
hashContent: expression DOSPUN expression                                      #hashContenta;
moreHashContent: (COMA hashContent )*                                          #moreHashContenta;
expressionList: expression moreExpressions                                     #expressionLista
                |                                                            #expressionListNada;
moreExpressions: (COMA expression )*                                           #moreExpressionsa;
printExpression: PUTS PIZQ expression PDER                                     #printExpressiona;
ifExpression: IF expression blockStatement (ELSE blockStatement | )          #ifExpressiona;
blockStatement: LLAVEIZQ statement* LLAVEDER                                   #blockStatementa;
