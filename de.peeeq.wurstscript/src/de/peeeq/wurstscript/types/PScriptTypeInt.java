package de.peeeq.wurstscript.types;

import de.peeeq.wurstscript.ast.AstElement;


public class PScriptTypeInt extends PscriptTypePrimitive {

	private static final PScriptTypeInt instance = new PScriptTypeInt();

	// make constructor private as we only need one instance
	protected PScriptTypeInt() {
		super("integer");
	}
	
	@Override
	public boolean isSubtypeOf(PscriptType other, AstElement location) {
		if (other instanceof PscriptTypeBoundTypeParam) {
			return isSubtypeOf(((PscriptTypeBoundTypeParam) other).getBaseType(), location);
		}
		return other instanceof PScriptTypeInt;
	}


	public static PScriptTypeInt instance() {
		return instance;
	}
	

}
