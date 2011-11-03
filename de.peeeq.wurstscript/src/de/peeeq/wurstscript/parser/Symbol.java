package de.peeeq.wurstscript.parser;

public class Symbol {
	public final int type;
	public final int line;
	public final int column;
	public final Object value;
	
	public Symbol(int type, int line, int column, Object value) {
		this.type = type;
		this.line = line;
		this.column = column;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "<" + type + " "  + value + ">";
	}
}
