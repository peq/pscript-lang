//generated by parseq
package de.peeeq.wurstscript.ast;

public interface TypeRef extends AstElement{
	AstElement getParent();
	void setSource(WPos source);
	WPos getSource();
	void setTypeName(String typeName);
	String getTypeName();
	<T> T match(Matcher<T> s);
	void match(MatcherVoid s);
	public interface Matcher<T> {
		T case_ExprNewObject(ExprNewObject exprNewObject);
		T case_TypeExpr(TypeExpr typeExpr);
	}

	public interface MatcherVoid {
		void case_ExprNewObject(ExprNewObject exprNewObject);
		void case_TypeExpr(TypeExpr typeExpr);
	}

	TypeRef copy();
	public abstract void accept(TypeRef.Visitor v);
	public interface Visitor {
		void visit(ExprNewObject exprNewObject);
		void visit(OpDivInt opDivInt);
		void visit(ExprMemberMethod exprMemberMethod);
		void visit(ExprCast exprCast);
		void visit(ExprFunctionCall exprFunctionCall);
		void visit(Indexes indexes);
		void visit(ArraySizes arraySizes);
		void visit(OpModInt opModInt);
		void visit(OpUnequals opUnequals);
		void visit(ExprBinary exprBinary);
		void visit(ExprBoolVal exprBoolVal);
		void visit(ExprNull exprNull);
		void visit(ExprIntVal exprIntVal);
		void visit(OpMult opMult);
		void visit(ExprFuncRef exprFuncRef);
		void visit(ExprVarArrayAccess exprVarArrayAccess);
		void visit(OpLess opLess);
		void visit(OpOr opOr);
		void visit(OpNot opNot);
		void visit(ExprRealVal exprRealVal);
		void visit(ExprUnary exprUnary);
		void visit(OpLessEq opLessEq);
		void visit(ExprThis exprThis);
		void visit(ExprMemberArrayVar exprMemberArrayVar);
		void visit(OpEquals opEquals);
		void visit(OpModReal opModReal);
		void visit(ExprVarAccess exprVarAccess);
		void visit(ExprStringVal exprStringVal);
		void visit(WPos wPos);
		void visit(OpDivReal opDivReal);
		void visit(ExprMemberVar exprMemberVar);
		void visit(Arguments arguments);
		void visit(OpAnd opAnd);
		void visit(OpGreater opGreater);
		void visit(OpPlus opPlus);
		void visit(TypeExpr typeExpr);
		void visit(OpGreaterEq opGreaterEq);
		void visit(OpMinus opMinus);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(ExprNewObject exprNewObject) {}
		@Override public void visit(OpDivInt opDivInt) {}
		@Override public void visit(ExprMemberMethod exprMemberMethod) {}
		@Override public void visit(ExprCast exprCast) {}
		@Override public void visit(ExprFunctionCall exprFunctionCall) {}
		@Override public void visit(Indexes indexes) {}
		@Override public void visit(ArraySizes arraySizes) {}
		@Override public void visit(OpModInt opModInt) {}
		@Override public void visit(OpUnequals opUnequals) {}
		@Override public void visit(ExprBinary exprBinary) {}
		@Override public void visit(ExprBoolVal exprBoolVal) {}
		@Override public void visit(ExprNull exprNull) {}
		@Override public void visit(ExprIntVal exprIntVal) {}
		@Override public void visit(OpMult opMult) {}
		@Override public void visit(ExprFuncRef exprFuncRef) {}
		@Override public void visit(ExprVarArrayAccess exprVarArrayAccess) {}
		@Override public void visit(OpLess opLess) {}
		@Override public void visit(OpOr opOr) {}
		@Override public void visit(OpNot opNot) {}
		@Override public void visit(ExprRealVal exprRealVal) {}
		@Override public void visit(ExprUnary exprUnary) {}
		@Override public void visit(OpLessEq opLessEq) {}
		@Override public void visit(ExprThis exprThis) {}
		@Override public void visit(ExprMemberArrayVar exprMemberArrayVar) {}
		@Override public void visit(OpEquals opEquals) {}
		@Override public void visit(OpModReal opModReal) {}
		@Override public void visit(ExprVarAccess exprVarAccess) {}
		@Override public void visit(ExprStringVal exprStringVal) {}
		@Override public void visit(WPos wPos) {}
		@Override public void visit(OpDivReal opDivReal) {}
		@Override public void visit(ExprMemberVar exprMemberVar) {}
		@Override public void visit(Arguments arguments) {}
		@Override public void visit(OpAnd opAnd) {}
		@Override public void visit(OpGreater opGreater) {}
		@Override public void visit(OpPlus opPlus) {}
		@Override public void visit(TypeExpr typeExpr) {}
		@Override public void visit(OpGreaterEq opGreaterEq) {}
		@Override public void visit(OpMinus opMinus) {}
	}
	public abstract TypeDef attrTypeDef();
}
