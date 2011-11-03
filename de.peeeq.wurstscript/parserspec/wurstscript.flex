package de.peeeq.wurstscript.parser;

import de.peeeq.wurstscript.utils.Utils;
%%

%class WurstScriptScanner
%public
%unicode
%line
%column
%type Symbol


%eofval{
  return symbol(WurstTokens.ENDINPUT);
%eofval}
//%cup
//%cupdebug


%{
	  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline+1, yycolumn, null);
  }
    
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline+1, yycolumn, value);
  }
%}

DIGIT = [0-9]
LETTER = [a-zA-Z]
NEWLINE = \n | \r | \r\n 
WHITESPACE = [ \t]
IDENT = ({LETTER}|_)({LETTER}|{DIGIT}|_)* 

%state STRING

%%

<YYINITIAL> {
	{WHITESPACE}*                     { }
	"//" [^\r\n]* 			           { }
	"/*" ~"*/"                        { }
	{NEWLINE}							{ return symbol(WurstTokens.NL); }
	"class"                           	{ return symbol(WurstTokens.CLASS); }
	"return"                          	{ return symbol(WurstTokens.RETURN); }
	"if"                              	{ return symbol(WurstTokens.IF); }
	"else"                            	{ return symbol(WurstTokens.ELSE); }
	"while"                           	{ return symbol(WurstTokens.WHILE); }
	"new"                             	{ return symbol(WurstTokens.NEW); }
	"null"                            	{ return symbol(WurstTokens.NULL); }
	"package"							{ return symbol(WurstTokens.PACKAGE); }
	"function"							{ return symbol(WurstTokens.FUNCTION); }
	"returns"							{ return symbol(WurstTokens.RETURNS); }
//	"val"								{ return symbol(WurstTokens.VAL); }
	"public"							{ return symbol(WurstTokens.PUBLIC); }
	"publicread"						{ return symbol(WurstTokens.PUBLICREAD); }
	"private"							{ return symbol(WurstTokens.PRIVATE); }
	"protected"							{ return symbol(WurstTokens.PROTECTED); }
	"import"							{ return symbol(WurstTokens.IMPORT); }
	"native"							{ return symbol(WurstTokens.NATIVE); }
	"nativetype"						{ return symbol(WurstTokens.NATIVETYPE); }
	"extends"							{ return symbol(WurstTokens.EXTENDS); }
	"interface"							{ return symbol(WurstTokens.INTERFACE); }
	"implements"						{ return symbol(WurstTokens.IMPLEMENTS); }
	"array"								{ return symbol(WurstTokens.ARRAY); }
	"and"								{ return symbol(WurstTokens.AND); }
	"or"								{ return symbol(WurstTokens.OR); }
	"not"								{ return symbol(WurstTokens.NOT); }
	"this"								{ return symbol(WurstTokens.THIS); }
	"construct"							{ return symbol(WurstTokens.CONSTRUCT); }
	"ondestroy"							{ return symbol(WurstTokens.ONDESTROY); }
	"destroy"							{ return symbol(WurstTokens.DESTROY); }
	"type"								{ return symbol(WurstTokens.TYPE); }
	"globals"							{ return symbol(WurstTokens.GLOBALS); }
	"endglobals"						{ return symbol(WurstTokens.ENDGLOBALS); }
	"constant"							{ return symbol(WurstTokens.CONSTANT); }
	"endfunction"						{ return symbol(WurstTokens.ENDFUNCTION); }
	"nothing"							{ return symbol(WurstTokens.NOTHING); }
	"takes"								{ return symbol(WurstTokens.TAKES); }
	"local"								{ return symbol(WurstTokens.LOCAL); }
	"loop"								{ return symbol(WurstTokens.LOOP); }
	"endloop"							{ return symbol(WurstTokens.ENDLOOP); }
	"exitwhen"							{ return symbol(WurstTokens.EXITWHEN); }
	"set"								{ return symbol(WurstTokens.SET); }
	"call"								{ return symbol(WurstTokens.CALL); }
	"then"								{ return symbol(WurstTokens.THEN); }
	"elseif"							{ return symbol(WurstTokens.ELSEIF); }
	"endif"								{ return symbol(WurstTokens.ENDIF); }
	"init"								{ return symbol(WurstTokens.INIT); }
	"castTo"							{ return symbol(WurstTokens.CASTTO); }
	"("                               { return symbol(WurstTokens.LPAR); }
	")"                               { return symbol(WurstTokens.RPAR); }
	","                               { return symbol(WurstTokens.COMMA); }
	"{"                               { return symbol(WurstTokens.LBRACK); }
	"}"                               { return symbol(WurstTokens.RBRACK); }
	"["                               { return symbol(WurstTokens.LSQUARE); }
	"]"                               { return symbol(WurstTokens.RSQUARE); }
	"."                               { return symbol(WurstTokens.DOT); }
	"+"                               { return symbol(WurstTokens.PLUS); }
	"-"                               { return symbol(WurstTokens.MINUS); }
	"*"                               { return symbol(WurstTokens.MULT); }
	"/"                               { return symbol(WurstTokens.DIV_REAL); }
	"div"                               { return symbol(WurstTokens.DIV_INT); }
	"%"                               { return symbol(WurstTokens.MOD_REAL); }
	"mod"                               { return symbol(WurstTokens.MOD_INT); }
	"=="                              { return symbol(WurstTokens.EQEQ); }
	"!="                              { return symbol(WurstTokens.NOTEQ); }
	">="                              { return symbol(WurstTokens.GTEQ); }
	"<="                              { return symbol(WurstTokens.LTEQ); }
	"<"                              { return symbol(WurstTokens.LT); }
	">"                              { return symbol(WurstTokens.GT); }
	"="                               { return symbol(WurstTokens.EQ); }
	{DIGIT}+                          { return symbol(WurstTokens.INTEGER_LITERAL, Utils.parseInt(yytext())); }
	"0x" [0-9a-fA-F]+                          { return symbol(WurstTokens.INTEGER_LITERAL, Utils.parseHexInt(yytext())); }
	"'" . "'"						  { return symbol(WurstTokens.INTEGER_LITERAL, Utils.parseAsciiInt1(yytext())); }
	"'" . . . . "'"					{ return symbol(WurstTokens.INTEGER_LITERAL, Utils.parseAsciiInt4(yytext())); }
	{DIGIT}+ "." {DIGIT}*			  { return symbol(WurstTokens.REAL_LITERAL, Double.parseDouble(yytext())); }
	"." {DIGIT}+					  { return symbol(WurstTokens.REAL_LITERAL, Double.parseDouble(yytext())); } 
	"true"                            { return symbol(WurstTokens.TRUE); }
	"false"                           { return symbol(WurstTokens.FALSE); }
	{IDENT}                           { return symbol(WurstTokens.IDENTIFIER, yytext()); }
	\"                             		{ string.setLength(0); yybegin(STRING); }
}


<STRING> {
  \"                             { yybegin(YYINITIAL); 
                                   return symbol(WurstTokens.STRING_LITERAL, 
                                   string.toString()); }
  [^\n\r\"\\]+                   { string.append( yytext() ); }
  \\t                            { string.append('\t'); }
  \\n                            { string.append('\n'); }

  \\r                            { string.append('\r'); }
  \\\"                           { string.append('\"'); }
  \\                             { string.append('\\'); }
}

// error fallback:
.                                 { return symbol(WurstTokens.error, yytext()); }