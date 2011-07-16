package de.peeeq.pscript.intermediateLang;

import de.peeeq.pscript.types.PscriptType;

public class ILvar {
	private String name;
	private PscriptType type;
	
	
	
	public ILvar(String name, PscriptType type) {
		this.name = name;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PscriptType getType() {
		return type;
	}
	public void setType(PscriptType type) {
		this.type = type;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ILvar) {
			ILvar v = (ILvar) obj;
			return v.name.equals(name) ; //&& v.type.equals(type);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
}
