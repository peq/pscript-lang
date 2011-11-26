//generated by parseq
package de.peeeq.wurstscript.ast;

public interface NameRef extends AstElement{
	AstElement getParent();
	void setSource(WPos source);
	WPos getSource();
	void setVarName(String varName);
	String getVarName();
	<T> T match(Matcher<T> s);
	void match(MatcherVoid s);
	public interface Matcher<T> {
		T case_ExprVarArrayAccess(ExprVarArrayAccess exprVarArrayAccess);
		T case_ExprMemberVar(ExprMemberVar exprMemberVar);
		T case_ExprVarAccess(ExprVarAccess exprVarAccess);
		T case_ExprMemberArrayVar(ExprMemberArrayVar exprMemberArrayVar);
	}

	public interface MatcherVoid {
		void case_ExprVarArrayAccess(ExprVarArrayAccess exprVarArrayAccess);
		void case_ExprMemberVar(ExprMemberVar exprMemberVar);
		void case_ExprVarAccess(ExprVarAccess exprVarAccess);
		void case_ExprMemberArrayVar(ExprMemberArrayVar exprMemberArrayVar);
	}

	NameRef copy();
	public abstract void accept(NameRef.Visitor v);
	public interface Visitor {
		void visit(OpDivReal opDivReal);
		void visit(ExprVarArrayAccess exprVarArrayAccess);
		void visit(OpEquals opEquals);
		void visit(WPos wPos);
		void visit(ExprUnary exprUnary);
		void visit(ExprVarAccess exprVarAccess);
		void visit(OpGreaterEq opGreaterEq);
		void visit(ExprRealVal exprRealVal);
		void visit(ExprMemberVar exprMemberVar);
		void visit(OpUnequals opUnequals);
		void visit(ExprFunctionCall exprFunctionCall);
		void visit(ExprNewObject exprNewObject);
		void visit(OpMult opMult);
		void visit(OpNot opNot);
		void visit(OpMinus opMinus);
		void visit(ExprIntVal exprIntVal);
		void visit(ExprBoolVal exprBoolVal);
		void visit(ExprCast exprCast);
		void visit(TypeExpr typeExpr);
		void visit(OpModReal opModReal);
		void visit(Arguments arguments);
		void visit(ExprThis exprThis);
		void visit(OpModInt opModInt);
		void visit(OpDivInt opDivInt);
		void visit(OpAnd opAnd);
		void visit(OpLessEq opLessEq);
		void visit(OpPlus opPlus);
		void visit(ExprMemberMethod exprMemberMethod);
		void visit(OpOr opOr);
		void visit(ExprBinary exprBinary);
		void visit(OpLess opLess);
		void visit(ExprNull exprNull);
		void visit(ExprStringVal exprStringVal);
		void visit(ArraySizes arraySizes);
		void visit(ExprFuncRef exprFuncRef);
		void visit(ExprMemberArrayVar exprMemberArrayVar);
		void visit(OpGreater opGreater);
		void visit(Indexes indexes);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(OpDivReal opDivReal) {}
		@Override public void visit(ExprVarArrayAccess exprVarArrayAccess) {}
		@Override public void visit(OpEquals opEquals) {}
		@Override public void visit(WPos wPos) {}
		@Override public void visit(ExprUnary exprUnary) {}
		@Override public void visit(ExprVarAccess exprVarAccess) {}
		@Override public void visit(OpGreaterEq opGreaterEq) {}
		@Override public void visit(ExprRealVal exprRealVal) {}
		@Override public void visit(ExprMemberVar exprMemberVar) {}
		@Override public void visit(OpUnequals opUnequals) {}
		@Override public void visit(ExprFunctionCall exprFunctionCall) {}
		@Override public void visit(ExprNewObject exprNewObject) {}
		@Override public void visit(OpMult opMult) {}
		@Override public void visit(OpNot opNot) {}
		@Override public void visit(OpMinus opMinus) {}
		@Override public void visit(ExprIntVal exprIntVal) {}
		@Override public void visit(ExprBoolVal exprBoolVal) {}
		@Override public void visit(ExprCast exprCast) {}
		@Override public void visit(TypeExpr typeExpr) {}
		@Override public void visit(OpModReal opModReal) {}
		@Override public void visit(Arguments arguments) {}
		@Override public void visit(ExprThis exprThis) {}
		@Override public void visit(OpModInt opModInt) {}
		@Override public void visit(OpDivInt opDivInt) {}
		@Override public void visit(OpAnd opAnd) {}
		@Override public void visit(OpLessEq opLessEq) {}
		@Override public void visit(OpPlus opPlus) {}
		@Override public void visit(ExprMemberMethod exprMemberMethod) {}
		@Override public void visit(OpOr opOr) {}
		@Override public void visit(ExprBinary exprBinary) {}
		@Override public void visit(OpLess opLess) {}
		@Override public void visit(ExprNull exprNull) {}
		@Override public void visit(ExprStringVal exprStringVal) {}
		@Override public void visit(ArraySizes arraySizes) {}
		@Override public void visit(ExprFuncRef exprFuncRef) {}
		@Override public void visit(ExprMemberArrayVar exprMemberArrayVar) {}
		@Override public void visit(OpGreater opGreater) {}
		@Override public void visit(Indexes indexes) {}
	}
	public abstract NameDef attrNameDef();
}
