package de.peeeq.pscript.intermediateLang;


public class ILexitwhen extends ILStatement {

	private ILvar var;

	public ILexitwhen(ILvar var) {
		this.var = var;
	}

	public ILvar getVar() {
		return var;
	}

}
