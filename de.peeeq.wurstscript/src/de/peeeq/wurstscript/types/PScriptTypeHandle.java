package de.peeeq.wurstscript.types;

import de.peeeq.wurstscript.ast.AstElement;


public class PScriptTypeHandle extends PscriptType {

	private static final PScriptTypeHandle instance = new PScriptTypeHandle();

	// make constructor private as we only need one instance
	private PScriptTypeHandle() {}
	
	@Override
	public boolean isSubtypeOf(PscriptType other, AstElement location) {
		return other instanceof PScriptTypeHandle;
	}


	@Override
	public String getName() {
		return "handle";
	}

	@Override
	public String getFullName() {
		return "handle";
	}

	public static PScriptTypeHandle instance() {
		return instance;
	}

	
	@Override
	public String printJass() {
		return getName();
	}
}
