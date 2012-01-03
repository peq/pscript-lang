package de.peeeq.wurstscript.parser;

import java.util.Stack;

import java_cup.runtime.Symbol;
import de.peeeq.wurstscript.utils.LineOffsets;
import de.peeeq.wurstscript.utils.Utils;



%%

%class WurstScriptScannerIntern
%unicode
%line
//%public
%column
%char
%eofval{
  return symbol(TokenType.EOF);
%eofval}
%cup
//%cupdebug


%{
	StringBuffer string = new StringBuffer();
	int afterString; // state to which to return after string
	
	// a stack of indentation levels
	Stack<Integer> indentationLevels = new Stack<Integer>();
	Stack<Symbol> returnStack = new Stack<Symbol>();
	
	int currentLineWhiteSpace = 0;
	boolean isStart = true; // are we at the start of a line before the text begins
	int mode = 0; // 0: unknown mode, 1: space mode, 2: tab mode
	
	LineOffsets lineStartOffsets = new LineOffsets(); 
	int currentLine = -1;
	
	int numberOfParantheses = 0;

	{
		indentationLevels.push(0);
	}
	
	private Symbol jassSymbol(int type) {
		return jassSymbol(type, null);
	}

	private Symbol jassSymbol(int type, Object value) {
		System.out.println("jasssymbol " + type);
		if (yyline > currentLine) {
			lineStartOffsets.set(yyline, yychar);
			currentLine = yyline;
		}
		return new Symbol(type, yychar, yychar+yylength(), value);
	}
	
	private Symbol symbol(int type) {
		return symbol(type, null);
	}

	private Symbol symbol(int type, Object value) {
		if (yyline > currentLine) {
			lineStartOffsets.set(yyline, yychar);
			currentLine = yyline;
		}
		Symbol s = new Symbol(type, yychar, yychar+yylength(), value);
		if (isStart) {
			isStart = false;
			if (indentationLevels.peek() > currentLineWhiteSpace) {
				returnStack.push(s);
				while (indentationLevels.peek() > currentLineWhiteSpace) {
					indentationLevels.pop();
					returnStack.push(new Symbol(TokenType.UNINDENT, yychar-1, yychar));
				}
				
				if (indentationLevels.peek() < currentLineWhiteSpace) {
					returnStack.push(new Symbol(TokenType.CUSTOM_ERROR, yychar-1, yychar, "Level of indentation does not align with previous lines."));
				}
				
				
				return returnStack.pop();
			} else if (indentationLevels.peek() < currentLineWhiteSpace) {
				returnStack.push(s);
				if (currentLineWhiteSpace - indentationLevels.peek() < 2) {
					// indent with at least two spaces
					return new Symbol(TokenType.CUSTOM_ERROR, yychar-1, yychar, "Indentation difference too small.");
				}
				
				indentationLevels.push(currentLineWhiteSpace);
				
				return new Symbol(TokenType.INDENT, yychar-1, yychar);
			}
		}
		return s;
	}
%}

DIGIT = [0-9]
LETTER = [a-zA-Z]
NEWLINE = \n | \r | \r\n 
WHITESPACE = [ \t]
IDENT = ({LETTER}|_)({LETTER}|{DIGIT}|_)* 

%state STRING
%state WURST

%%

<YYINITIAL> { // jass code
	{WHITESPACE} 	{
						// ignore					
					}
	{NEWLINE}							
					{ 
						return jassSymbol(TokenType.NL);
					}	
	"//" [^\r\n]* 			           { }
	"/*" ~"*/"                        { }
	"package"							{ mode = 0; yybegin(WURST); return symbol(TokenType.PACKAGE); }
	"return"                          	{ return jassSymbol(TokenType.RETURN); }
	"if"                              	{ return jassSymbol(TokenType.IF); }
	"else"                            	{ return jassSymbol(TokenType.ELSE); }
	"null"                            	{ return jassSymbol(TokenType.NULL); }
	"function"							{ return jassSymbol(TokenType.FUNCTION); }
	"returns"							{ return jassSymbol(TokenType.RETURNS); }
	"native"							{ return jassSymbol(TokenType.NATIVE); }
	"extends"							{ return jassSymbol(TokenType.EXTENDS); }
	"array"								{ return jassSymbol(TokenType.ARRAY); }
	"and"								{ return jassSymbol(TokenType.AND); }
	"or"								{ return jassSymbol(TokenType.OR); }
	"not"								{ return jassSymbol(TokenType.NOT); }
	"type"								{ return jassSymbol(TokenType.TYPE); }
	"globals"							{ return jassSymbol(TokenType.GLOBALS); }
	"endglobals"						{ return jassSymbol(TokenType.ENDGLOBALS); }
	"constant"							{ return jassSymbol(TokenType.CONSTANT); }
	"endfunction"						{ return jassSymbol(TokenType.ENDFUNCTION); }
	"nothing"							{ return jassSymbol(TokenType.NOTHING); }
	"takes"								{ return jassSymbol(TokenType.TAKES); }
	"local"								{ return jassSymbol(TokenType.LOCAL); }
	"loop"								{ return jassSymbol(TokenType.LOOP); }
	"endloop"							{ return jassSymbol(TokenType.ENDLOOP); }
	"exitwhen"							{ return jassSymbol(TokenType.EXITWHEN); }
	"set"								{ return jassSymbol(TokenType.SET); }
	"call"								{ return jassSymbol(TokenType.CALL); }
	"then"								{ return jassSymbol(TokenType.THEN); }
	"elseif"							{ return jassSymbol(TokenType.ELSEIF); }
	"endif"								{ return jassSymbol(TokenType.ENDIF); }
	"true"                            { return jassSymbol(TokenType.TRUE); }
	"false"                           { return jassSymbol(TokenType.FALSE); }
	"("                               { return jassSymbol(TokenType.LPAR); }
	")"                               { return jassSymbol(TokenType.RPAR); }
	","                               { return jassSymbol(TokenType.COMMA); }
	"["                               { return jassSymbol(TokenType.LSQUARE); }
	"]"                               { return jassSymbol(TokenType.RSQUARE); }
	"+"                               { return jassSymbol(TokenType.PLUS); }
	"-"                               { return jassSymbol(TokenType.MINUS); }
	"*"                               { return jassSymbol(TokenType.MULT); }
	"/"                               { return jassSymbol(TokenType.DIV_REAL); }
	"=="                              { return jassSymbol(TokenType.EQEQ); }
	"!="                              { return jassSymbol(TokenType.NOTEQ); }
	">="                              { return jassSymbol(TokenType.GTEQ); }
	"<="                              { return jassSymbol(TokenType.LTEQ); }
	"<"                              { return jassSymbol(TokenType.LT); }
	">"                              { return jassSymbol(TokenType.GT); }
	"="                               { return jassSymbol(TokenType.EQ); }
	{DIGIT}+                          { return jassSymbol(TokenType.INTEGER_LITERAL, Utils.parseInt(yytext())); }
	"0x" [0-9a-fA-F]+                          { return jassSymbol(TokenType.INTEGER_LITERAL, Utils.parseHexInt(yytext())); }
	"'" . "'"						  { return jassSymbol(TokenType.INTEGER_LITERAL, Utils.parseAsciiInt1(yytext())); }
	"'" . . . . "'"					{ return jassSymbol(TokenType.INTEGER_LITERAL, Utils.parseAsciiInt4(yytext())); }
	{DIGIT}+ "." {DIGIT}*			  { return jassSymbol(TokenType.REAL_LITERAL, Double.parseDouble(yytext())); }
	[ \t\n\r]* "." {DIGIT}+			 { return jassSymbol(TokenType.REAL_LITERAL, Double.parseDouble(yytext())); }
	[ \t\n\r]* "."                    { return jassSymbol(TokenType.DOT); } 
	{IDENT}                           { return jassSymbol(TokenType.IDENTIFIER, yytext()); }
	[\"]                             		{ string.setLength(0); afterString = YYINITIAL; yybegin(STRING); }
	
	// error fallback:
	.                              { return symbol(TokenType.error, yytext()); }
}


<WURST> {
	[\t]                    { 
								if (isStart) {
									currentLineWhiteSpace += 4;
									if (mode == 2) {
										returnStack.push(new Symbol(TokenType.CUSTOM_ERROR, yychar-1, yychar, "Mixing tabs and spaces is not allowed."));
									}
									mode = 1;
								}
							}
	[ ]						{ 
								if (isStart) {	
									currentLineWhiteSpace += 1; 
									if (mode == 1) {
										returnStack.push(new Symbol(TokenType.CUSTOM_ERROR, yychar-1, yychar, "Mixing spaces and tabs is not allowed."));
									}
									mode = 2;
								}
							}
	{NEWLINE}							
					{ 
							if (numberOfParantheses > 0) {
								return null; // ignore newlines inside parantheses
							} else {
								numberOfParantheses = 0;
								currentLineWhiteSpace = 0;
								if (!isStart) {
									isStart = true;
									return new Symbol(TokenType.NL, yychar-1, yychar);
								} else {
									return null;
								}
							}
					}	
	"//" [^\r\n]* 			           { }
	"/*" ~"*/"                        { }
	";"									{ return symbol(TokenType.SEMICOLON); }
	"class"                           	{ return symbol(TokenType.CLASS); }
	"return"                          	{ return symbol(TokenType.RETURN); }
	"if"                              	{ return symbol(TokenType.IF); }
	"else"                            	{ return symbol(TokenType.ELSE); }
	"while"                           	{ return symbol(TokenType.WHILE); }
	"for"                           	{ return symbol(TokenType.FOR); }
	"in"                           		{ return symbol(TokenType.IN); }
	"to"                           		{ return symbol(TokenType.TO); }
	"downto"                           	{ return symbol(TokenType.DOWNTO); }
	"step"                           	{ return symbol(TokenType.STEP); }
	"break"                        		{ return symbol(TokenType.BREAK); }
	"new"                             	{ return symbol(TokenType.NEW); }
	"null"                            	{ return symbol(TokenType.NULL); }
	"package"							{ return symbol(TokenType.error, "unexpected package"); }
	"endpackage"						{ yybegin(YYINITIAL); return symbol(TokenType.ENDPACKAGE); }
	"function"							{ return symbol(TokenType.FUNCTION); }
	"returns"							{ return symbol(TokenType.RETURNS); }
	"val"								{ return symbol(TokenType.VAL); }
	"public"							{ return symbol(TokenType.PUBLIC); }
	"publicread"						{ return symbol(TokenType.PUBLICREAD); }
	"private"							{ return symbol(TokenType.PRIVATE); }
	"protected"							{ return symbol(TokenType.PROTECTED); }
	"import"							{ return symbol(TokenType.IMPORT); }
	"native"							{ return symbol(TokenType.NATIVE); }
	"nativetype"						{ return symbol(TokenType.NATIVETYPE); }
	"extends"							{ return symbol(TokenType.EXTENDS); }
	"interface"							{ return symbol(TokenType.INTERFACE); }
	"implements"						{ return symbol(TokenType.IMPLEMENTS); }
	
	"module"							{ return symbol(TokenType.MODULE); }
	"use"								{ return symbol(TokenType.USE); }
	"abstract"							{ return symbol(TokenType.ABSTRACT); }
	"static"							{ return symbol(TokenType.STATIC); }
	"thistype"							{ return symbol(TokenType.THISTYPE); }
	"override"							{ return symbol(TokenType.OVERRIDE); }
	"immutable"							{ return symbol(TokenType.IMMUTABLE); }
	"it"								{ return symbol(TokenType.IT); }
	
	"array"								{ return symbol(TokenType.ARRAY); }
	"and"								{ return symbol(TokenType.AND); }
	"or"								{ return symbol(TokenType.OR); }
	"not"								{ return symbol(TokenType.NOT); }
	"this"								{ return symbol(TokenType.THIS); }
	"construct"							{ return symbol(TokenType.CONSTRUCT); }
	"ondestroy"							{ return symbol(TokenType.ONDESTROY); }
	"destroy"							{ return symbol(TokenType.DESTROY); }
	"type"								{ return symbol(TokenType.TYPE); }
	"globals"							{ return symbol(TokenType.GLOBALS); }
	"endglobals"						{ return symbol(TokenType.ENDGLOBALS); }
	"constant"							{ return symbol(TokenType.CONSTANT); }
	"endfunction"						{ return symbol(TokenType.ENDFUNCTION); }
	"nothing"							{ return symbol(TokenType.NOTHING); }
	"takes"								{ return symbol(TokenType.TAKES); }
	"local"								{ return symbol(TokenType.LOCAL); }
	"loop"								{ return symbol(TokenType.LOOP); }
	"endloop"							{ return symbol(TokenType.ENDLOOP); }
	"exitwhen"							{ return symbol(TokenType.EXITWHEN); }
	"set"								{ return symbol(TokenType.SET); }
	"call"								{ return symbol(TokenType.CALL); }
	"then"								{ return symbol(TokenType.THEN); }
	"elseif"							{ return symbol(TokenType.ELSEIF); }
	"endif"								{ return symbol(TokenType.ENDIF); }
	"init"								{ return symbol(TokenType.INIT); }
	"castTo"							{ return symbol(TokenType.CASTTO); }
	"true"                            { return symbol(TokenType.TRUE); }
	"false"                           { return symbol(TokenType.FALSE); }
	"div"                               { return symbol(TokenType.DIV_INT); }
	"mod"                               { return symbol(TokenType.MOD_INT); } 
	"("                               { numberOfParantheses++; return symbol(TokenType.LPAR); }
	")"                               { numberOfParantheses--; return symbol(TokenType.RPAR); }
	","                               { return symbol(TokenType.COMMA); }
	"{"                               { return symbol(TokenType.LBRACK); }
	"}"                               { return symbol(TokenType.RBRACK); }
	"["                               { return symbol(TokenType.LSQUARE); }
	"]"                               { return symbol(TokenType.RSQUARE); }
	"+"                               { return symbol(TokenType.PLUS); }
	"-"                               { return symbol(TokenType.MINUS); }
	"*"                               { return symbol(TokenType.MULT); }
	"/"                               { return symbol(TokenType.DIV_REAL); }
	"%"                               { return symbol(TokenType.MOD_REAL); }
	"=="                              { return symbol(TokenType.EQEQ); }
	"!="                              { return symbol(TokenType.NOTEQ); }
	">="                              { return symbol(TokenType.GTEQ); }
	"<="                              { return symbol(TokenType.LTEQ); }
	"<"                              { return symbol(TokenType.LT); }
	">"                              { return symbol(TokenType.GT); }
	"="                               { return symbol(TokenType.EQ); }
	"+="                               { return symbol(TokenType.PLUS_EQ); }
	"-="                               { return symbol(TokenType.MINUS_EQ); }
	"*="                               { return symbol(TokenType.MULT_EQ); }
	"++"                               { return symbol(TokenType.PLUS_PLUS); }
	"--"                               { return symbol(TokenType.MINUS_MINUS); }
	"-->"                              { return symbol(TokenType.ARROW); }
	{DIGIT}+                          { return symbol(TokenType.INTEGER_LITERAL, Utils.parseInt(yytext())); }
	"0x" [0-9a-fA-F]+                          { return symbol(TokenType.INTEGER_LITERAL, Utils.parseHexInt(yytext())); }
	"'" . "'"						  { return symbol(TokenType.INTEGER_LITERAL, Utils.parseAsciiInt1(yytext())); }
	"'" . . . . "'"					{ return symbol(TokenType.INTEGER_LITERAL, Utils.parseAsciiInt4(yytext())); }
	{DIGIT}+ "." {DIGIT}*			  { return symbol(TokenType.REAL_LITERAL, Double.parseDouble(yytext())); }
	[ \t\n\r]* "." {DIGIT}+			 { return symbol(TokenType.REAL_LITERAL, Double.parseDouble(yytext())); }
	[ \t\n\r]* "."                    { return symbol(TokenType.DOT); } 
	{IDENT}                           { return symbol(TokenType.IDENTIFIER, yytext()); }
	[\"]                             		{ string.setLength(0); afterString = WURST; yybegin(STRING); }
	// error fallback:
	.                              { return symbol(TokenType.error, yytext()); }
}

<STRING> {
  [\"]                             { yybegin(afterString); 
                                   return symbol(TokenType.STRING_LITERAL, string.toString()); }
	{NEWLINE}			{ yybegin(YYINITIAL); 
								return symbol(TokenType.CUSTOM_ERROR, "unterminated String"); }
  [^\n\r\"\\]+                   { string.append( yytext() ); }

  \\r                            { string.append('\r'); }
  \\\"                           { string.append('\"'); }
  \\                             { string.append('\\'); }
  
}

//error fallback:
.                                 { return symbol(TokenType.error, yytext()); }