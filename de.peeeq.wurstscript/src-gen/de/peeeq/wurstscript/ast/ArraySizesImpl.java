//generated by parseq
package de.peeeq.wurstscript.ast;

class ArraySizesImpl extends ArraySizes implements AstElementIntern {
 	private AstElement parent;
	public AstElement getParent() { return parent; }
	public void setParent(AstElement parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	protected void other_setParentToThis(Expr t) {
		((AstElementIntern) t).setParent(this);
	}
	protected void other_clearParent(Expr t) {
		((AstElementIntern) t).setParent(null);
	}
	@Override public void accept(CompilationUnit.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(StmtLoop.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(OptTypeExpr.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(FunctionDefinition.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(TypeDef.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(FuncDef.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ClassSlots.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(StmtSet.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(LocalVarDef.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ExprMemberArrayVar.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ExprMemberMethod.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(StmtExitwhen.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(AstElementWithModifier.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ConstructorDef.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(PackageOrGlobal.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(NameRef.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(WStatement.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(VarDef.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(OnDestroyDef.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(InitBlock.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ExprAtomic.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(StmtCall.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ExprNewObject.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(JassGlobalBlock.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(WPackage.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(StmtIf.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ClassOrModule.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(WEntity.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ClassSlot.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(FuncRef.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(WParameter.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(TypeRef.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ClassMember.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(NativeType.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(NativeFunc.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(FuncSignature.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(TopLevelDeclaration.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ExprVarArrayAccess.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(NameDef.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(JassToplevelDeclaration.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(WScope.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(StmtWhile.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(StmtDestroy.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ExprUnary.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(GlobalVarDef.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(Indexes.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(WStatements.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(TypeExpr.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(WEntities.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(Expr.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ModuleDef.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ExprCast.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ExprBinary.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ClassDef.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(OptExpr.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ArraySizes.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ExprAssignable.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(WParameters.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(StmtReturn.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ExprFunctionCall.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(Arguments.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(ExprMemberVar.Visitor v) {
		for (Expr i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	private boolean attr_attrNearestPackage_isCached = false;
	private PackageOrGlobal attr_attrNearestPackage_cache;
	public PackageOrGlobal attrNearestPackage() {
		if (!attr_attrNearestPackage_isCached) {
			attr_attrNearestPackage_cache = de.peeeq.wurstscript.attributes.AttrNearestPackage.calculate(this);
			attr_attrNearestPackage_isCached = true;
		}
		return attr_attrNearestPackage_cache;
	}
	private boolean attr_attrNearestFuncDef_isCached = false;
	private FuncDef attr_attrNearestFuncDef_cache;
	public FuncDef attrNearestFuncDef() {
		if (!attr_attrNearestFuncDef_isCached) {
			attr_attrNearestFuncDef_cache = de.peeeq.wurstscript.attributes.AttrNearestFuncDef.calculate(this);
			attr_attrNearestFuncDef_isCached = true;
		}
		return attr_attrNearestFuncDef_cache;
	}
	private boolean attr_attrNearestClassDef_isCached = false;
	private ClassDef attr_attrNearestClassDef_cache;
	public ClassDef attrNearestClassDef() {
		if (!attr_attrNearestClassDef_isCached) {
			attr_attrNearestClassDef_cache = de.peeeq.wurstscript.attributes.AttrNearestClassDef.calculate(this);
			attr_attrNearestClassDef_isCached = true;
		}
		return attr_attrNearestClassDef_cache;
	}
	private boolean attr_attrNearestClassOrModule_isCached = false;
	private ClassOrModule attr_attrNearestClassOrModule_cache;
	public ClassOrModule attrNearestClassOrModule() {
		if (!attr_attrNearestClassOrModule_isCached) {
			attr_attrNearestClassOrModule_cache = de.peeeq.wurstscript.attributes.AttrNearestClassDef.nearestClassOrModule(this);
			attr_attrNearestClassOrModule_isCached = true;
		}
		return attr_attrNearestClassOrModule_cache;
	}
	@Override public String toString() {
		String result =  "ArraySizes(";
		boolean first = true;
		for (Expr i : this ) {
			if (!first) { result +=", "; }
			if (result.length() > 1000) { result +="..."; break; }
			result += i;
			first = false;
		}
		result +=  ")";
		return result;
	}
}
