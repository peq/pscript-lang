//generated by parseq
package de.peeeq.wurstscript.jassAst;

public interface JassExprFunctionCall extends JassAstElement, JassExpr {
	JassAstElement getParent();
	void setFuncName(String funcName);
	String getFuncName();
	void setArguments(JassExprlist arguments);
	JassExprlist getArguments();
	JassExprFunctionCall copy();
	public abstract void accept(JassStmtIf.Visitor v);
	public abstract void accept(JassExprVarArrayAccess.Visitor v);
	public abstract void accept(JassExprlist.Visitor v);
	public abstract void accept(JassExprFunctionCall.Visitor v);
	public abstract void accept(JassStmtReturn.Visitor v);
	public abstract void accept(JassStmtExitwhen.Visitor v);
	public abstract void accept(JassExpr.Visitor v);
	public abstract void accept(JassStmtLoop.Visitor v);
	public abstract void accept(JassStatements.Visitor v);
	public abstract void accept(JassExprBinary.Visitor v);
	public abstract void accept(JassExprUnary.Visitor v);
	public abstract void accept(JassFunctions.Visitor v);
	public abstract void accept(JassStmtSet.Visitor v);
	public abstract void accept(JassFunction.Visitor v);
	public abstract void accept(JassExprAtomic.Visitor v);
	public abstract void accept(JassProg.Visitor v);
	public abstract void accept(JassStmtCall.Visitor v);
	public abstract void accept(JassStatement.Visitor v);
	public abstract void accept(JassStmtSetArray.Visitor v);
	public interface Visitor {
		void visit(JassExprVarArrayAccess jassExprVarArrayAccess);
		void visit(JassExprStringVal jassExprStringVal);
		void visit(JassExprlist jassExprlist);
		void visit(JassExprFunctionCall jassExprFunctionCall);
		void visit(JassExprVarAccess jassExprVarAccess);
		void visit(JassOpGreater jassOpGreater);
		void visit(JassExprFuncRef jassExprFuncRef);
		void visit(JassOpLess jassOpLess);
		void visit(JassExprIntVal jassExprIntVal);
		void visit(JassExprNull jassExprNull);
		void visit(JassExprBoolVal jassExprBoolVal);
		void visit(JassOpEquals jassOpEquals);
		void visit(JassOpMinus jassOpMinus);
		void visit(JassOpNot jassOpNot);
		void visit(JassOpPlus jassOpPlus);
		void visit(JassExprRealVal jassExprRealVal);
		void visit(JassOpOr jassOpOr);
		void visit(JassOpLessEq jassOpLessEq);
		void visit(JassOpGreaterEq jassOpGreaterEq);
		void visit(JassOpDiv jassOpDiv);
		void visit(JassOpAnd jassOpAnd);
		void visit(JassOpUnequals jassOpUnequals);
		void visit(JassExprBinary jassExprBinary);
		void visit(JassExprUnary jassExprUnary);
		void visit(JassOpMult jassOpMult);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(JassExprVarArrayAccess jassExprVarArrayAccess) {}
		@Override public void visit(JassExprStringVal jassExprStringVal) {}
		@Override public void visit(JassExprlist jassExprlist) {}
		@Override public void visit(JassExprFunctionCall jassExprFunctionCall) {}
		@Override public void visit(JassExprVarAccess jassExprVarAccess) {}
		@Override public void visit(JassOpGreater jassOpGreater) {}
		@Override public void visit(JassExprFuncRef jassExprFuncRef) {}
		@Override public void visit(JassOpLess jassOpLess) {}
		@Override public void visit(JassExprIntVal jassExprIntVal) {}
		@Override public void visit(JassExprNull jassExprNull) {}
		@Override public void visit(JassExprBoolVal jassExprBoolVal) {}
		@Override public void visit(JassOpEquals jassOpEquals) {}
		@Override public void visit(JassOpMinus jassOpMinus) {}
		@Override public void visit(JassOpNot jassOpNot) {}
		@Override public void visit(JassOpPlus jassOpPlus) {}
		@Override public void visit(JassExprRealVal jassExprRealVal) {}
		@Override public void visit(JassOpOr jassOpOr) {}
		@Override public void visit(JassOpLessEq jassOpLessEq) {}
		@Override public void visit(JassOpGreaterEq jassOpGreaterEq) {}
		@Override public void visit(JassOpDiv jassOpDiv) {}
		@Override public void visit(JassOpAnd jassOpAnd) {}
		@Override public void visit(JassOpUnequals jassOpUnequals) {}
		@Override public void visit(JassExprBinary jassExprBinary) {}
		@Override public void visit(JassExprUnary jassExprUnary) {}
		@Override public void visit(JassOpMult jassOpMult) {}
	}
}
