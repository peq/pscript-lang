package de.peeeq.wurstscript.jasstranslation;

import static de.peeeq.wurstscript.jassAst.JassAst.JassExprBinary;
import static de.peeeq.wurstscript.jassAst.JassAst.JassExprBoolVal;
import static de.peeeq.wurstscript.jassAst.JassAst.JassExprFuncRef;
import static de.peeeq.wurstscript.jassAst.JassAst.JassExprFunctionCall;
import static de.peeeq.wurstscript.jassAst.JassAst.JassExprIntVal;
import static de.peeeq.wurstscript.jassAst.JassAst.JassExprNull;
import static de.peeeq.wurstscript.jassAst.JassAst.JassExprRealVal;
import static de.peeeq.wurstscript.jassAst.JassAst.JassExprStringVal;
import static de.peeeq.wurstscript.jassAst.JassAst.JassExprUnary;
import static de.peeeq.wurstscript.jassAst.JassAst.JassExprVarAccess;
import static de.peeeq.wurstscript.jassAst.JassAst.JassExprVarArrayAccess;
import static de.peeeq.wurstscript.jassAst.JassAst.JassExprlist;
import static de.peeeq.wurstscript.jassAst.JassAst.JassOpAnd;
import static de.peeeq.wurstscript.jassAst.JassAst.JassOpDiv;
import static de.peeeq.wurstscript.jassAst.JassAst.JassOpEquals;
import static de.peeeq.wurstscript.jassAst.JassAst.JassOpGreater;
import static de.peeeq.wurstscript.jassAst.JassAst.JassOpGreaterEq;
import static de.peeeq.wurstscript.jassAst.JassAst.JassOpLess;
import static de.peeeq.wurstscript.jassAst.JassAst.JassOpLessEq;
import static de.peeeq.wurstscript.jassAst.JassAst.JassOpMinus;
import static de.peeeq.wurstscript.jassAst.JassAst.JassOpMult;
import static de.peeeq.wurstscript.jassAst.JassAst.JassOpNot;
import static de.peeeq.wurstscript.jassAst.JassAst.JassOpOr;
import static de.peeeq.wurstscript.jassAst.JassAst.JassOpPlus;
import static de.peeeq.wurstscript.jassAst.JassAst.JassOpUnequals;
import static de.peeeq.wurstscript.jassAst.JassAst.JassStatements;
import static de.peeeq.wurstscript.jassAst.JassAst.JassStmtIf;
import static de.peeeq.wurstscript.jassAst.JassAst.JassStmtSet;

import java.util.List;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

import de.peeeq.wurstscript.ast.ConstructorDef;
import de.peeeq.wurstscript.ast.Expr;
import de.peeeq.wurstscript.ast.ExprBinary;
import de.peeeq.wurstscript.ast.ExprBoolVal;
import de.peeeq.wurstscript.ast.ExprCast;
import de.peeeq.wurstscript.ast.ExprFuncRef;
import de.peeeq.wurstscript.ast.ExprFunctionCall;
import de.peeeq.wurstscript.ast.ExprIntVal;
import de.peeeq.wurstscript.ast.ExprMemberArrayVar;
import de.peeeq.wurstscript.ast.ExprMemberMethod;
import de.peeeq.wurstscript.ast.ExprMemberVar;
import de.peeeq.wurstscript.ast.ExprNewObject;
import de.peeeq.wurstscript.ast.ExprNull;
import de.peeeq.wurstscript.ast.ExprRealVal;
import de.peeeq.wurstscript.ast.ExprStringVal;
import de.peeeq.wurstscript.ast.ExprThis;
import de.peeeq.wurstscript.ast.ExprUnary;
import de.peeeq.wurstscript.ast.ExprVarAccess;
import de.peeeq.wurstscript.ast.ExprVarArrayAccess;
import de.peeeq.wurstscript.ast.ExtensionFuncDef;
import de.peeeq.wurstscript.ast.FuncDef;
import de.peeeq.wurstscript.ast.FunctionCall;
import de.peeeq.wurstscript.ast.FunctionDefinition;
import de.peeeq.wurstscript.ast.NameDef;
import de.peeeq.wurstscript.ast.NativeFunc;
import de.peeeq.wurstscript.ast.OpAnd;
import de.peeeq.wurstscript.ast.OpBinary;
import de.peeeq.wurstscript.ast.OpDivInt;
import de.peeeq.wurstscript.ast.OpDivReal;
import de.peeeq.wurstscript.ast.OpEquals;
import de.peeeq.wurstscript.ast.OpGreater;
import de.peeeq.wurstscript.ast.OpGreaterEq;
import de.peeeq.wurstscript.ast.OpLess;
import de.peeeq.wurstscript.ast.OpLessEq;
import de.peeeq.wurstscript.ast.OpMinus;
import de.peeeq.wurstscript.ast.OpModInt;
import de.peeeq.wurstscript.ast.OpModReal;
import de.peeeq.wurstscript.ast.OpMult;
import de.peeeq.wurstscript.ast.OpNot;
import de.peeeq.wurstscript.ast.OpOr;
import de.peeeq.wurstscript.ast.OpPlus;
import de.peeeq.wurstscript.ast.OpUnary;
import de.peeeq.wurstscript.ast.OpUnequals;
import de.peeeq.wurstscript.ast.VarDef;
import de.peeeq.wurstscript.ast.WParameter;
import de.peeeq.wurstscript.ast.WParameters;
import de.peeeq.wurstscript.jassAst.JassExpr;
import de.peeeq.wurstscript.jassAst.JassExprFunctionCall;
import de.peeeq.wurstscript.jassAst.JassExprlist;
import de.peeeq.wurstscript.jassAst.JassFunction;
import de.peeeq.wurstscript.jassAst.JassOpBinary;
import de.peeeq.wurstscript.jassAst.JassOpUnary;
import de.peeeq.wurstscript.jassAst.JassStatement;
import de.peeeq.wurstscript.jassAst.JassStatements;
import de.peeeq.wurstscript.jassAst.JassVar;
import de.peeeq.wurstscript.types.PScriptTypeInt;

public class JassTranslatorExpressions {
	private JassManager manager;
	private JassTranslator translator;

	public JassTranslatorExpressions(JassTranslator t) {
		this.translator = t;
		this.manager = t.manager;
	}
	
	protected ExprTranslationResult translateExpr(final JassFunction f, Expr expr) {
		return expr.match(new Expr.Matcher<ExprTranslationResult>() {

			@Override
			public ExprTranslationResult case_ExprNewObject(ExprNewObject exprNewObject) {
				ConstructorDef constructorFunc = exprNewObject.attrConstructorDef();
				JassFunction constructorJassFunc = manager.getJassConstructorFor(constructorFunc);

				JassExprlist arguments = JassExprlist(); 
				ExprListTranslationResult args = translateArguments(f, exprNewObject.getArgs(), getParameterTypes(constructorFunc.getParams()));
				List<JassStatement> statements = Lists.newLinkedList();
				statements.addAll(args.getStatements());
				arguments.addAll(args.getExprs());
				JassExpr e = JassExprFunctionCall(constructorJassFunc.getName(), arguments);
				return new ExprTranslationResult(statements, e);
			}

			@Override
			public ExprTranslationResult case_ExprRealVal(ExprRealVal exprRealVal) {
				return new ExprTranslationResult(JassExprRealVal(exprRealVal.getVal()));
			}

			@Override
			public ExprTranslationResult case_ExprUnary(ExprUnary exprUnary) {
				ExprTranslationResult right = translateExpr(f, exprUnary.getRight());
				return new ExprTranslationResult(
						right.getStatements(), 
						JassExprUnary(translateOpUnary(exprUnary.getOp()), right.getExpr()));
			}

			@Override
			public ExprTranslationResult case_ExprThis(ExprThis exprThis) {
				return new ExprTranslationResult(JassExprVarAccess("this"));
			}

			@Override
			public ExprTranslationResult case_ExprCast(ExprCast exprCast) {
				// a cast has no effect:
				return translateExpr(f, exprCast.getExpr());
			}

			@Override
			public ExprTranslationResult case_ExprFunctionCall(ExprFunctionCall exprFunctionCall) {
				return translateFunctionCall(f, exprFunctionCall);
			}

			@Override
			public ExprTranslationResult case_ExprMemberMethod(ExprMemberMethod e) {
				return translateFunctionCall(f, e);
			}


			@Override
			public ExprTranslationResult case_ExprMemberArrayVar(ExprMemberArrayVar exprMemberArrayVar) {
				VarDef varDef = (VarDef) exprMemberArrayVar.attrNameDef();
				String varName = manager.getJassVarNameFor(varDef);

				ExprTranslationResult left = translateExpr(f, exprMemberArrayVar.getLeft());
				return new ExprTranslationResult(left.getStatements(), JassExprVarArrayAccess(varName, left.getExpr()));
			}

			@Override
			public ExprTranslationResult case_ExprStringVal(ExprStringVal exprStringVal) {
				return new ExprTranslationResult(JassExprStringVal(exprStringVal.getVal()));
			}

			@Override
			public ExprTranslationResult case_ExprVarAccess(ExprVarAccess exprVarAccess) {
				NameDef nameDef = exprVarAccess.attrNameDef();
				if (nameDef instanceof VarDef) {
					VarDef varDef = (VarDef) nameDef;
					String varName = manager.getJassVarNameFor(varDef);
					if (varDef.attrIsDynamicClassMember()) {
						// access to a field
						JassExpr index = JassExprVarAccess("this");
						return new ExprTranslationResult(JassExprVarArrayAccess(varName, index));
					} else {
						// access to a normal variable
						return new ExprTranslationResult(JassExprVarAccess(varName));
					}
				} else {
					throw new Error("cannot translate var access to " + nameDef.getClass());
				}
			}

			@Override
			public ExprTranslationResult case_ExprBinary(ExprBinary exprBinary) {
				ExprTranslationResult left = translateExpr(f, exprBinary.getLeft());
				ExprTranslationResult right = translateExpr(f, exprBinary.getRight());

				JassExpr leftExpr;
				JassExpr rightExpr;

				List<JassStatement> statements = Lists.newLinkedList();
				statements.addAll(left.getStatements());



				// if the right hand side of the expression uses statements we have to make sure that
				// the left hand side is executed first:
				if (right.getStatements().size() > 0) {
					String type = translator.translateType(exprBinary.getLeft().attrTyp());
					JassVar tempVar = translator.getNewTempVar(f, type);
					statements.add(JassStmtSet(tempVar.getName(), left.getExpr()));
					leftExpr = JassExprVarAccess(tempVar.getName());


					// boolean operators (and, or) have to be treated differently because the evalutation
					// of the right hand side depends on the result of the left hand side.
					if (exprBinary.getOp() instanceof OpAnd) {
						JassStatements thenBlock = JassStatements();
						JassStatements elseBlock  = JassStatements();;
						elseBlock.addAll(right.getStatements());
						elseBlock.add(JassStmtSet(tempVar.getName(), right.getExpr()));
						statements.add(
								JassStmtIf(
										JassExprVarAccess(tempVar.getName()), 
										thenBlock, elseBlock));
						return new ExprTranslationResult(statements, JassExprVarAccess(tempVar.getName()));
					} else if (exprBinary.getOp() instanceof OpAnd) {
						JassStatements thenBlock = JassStatements();
						JassStatements elseBlock  = JassStatements();;
						thenBlock.addAll(right.getStatements());
						thenBlock.add(JassStmtSet(tempVar.getName(), right.getExpr()));
						statements.add(
								JassStmtIf(
										JassExprVarAccess(tempVar.getName()), 
										thenBlock, elseBlock));
						return new ExprTranslationResult(statements, JassExprVarAccess(tempVar.getName()));
					} else {
						rightExpr = right.getExpr();
					}
				} else {
					leftExpr = left.getExpr();
					rightExpr = right.getExpr();
				}

				JassExpr e;

				// modulo operators nead special treatment ...
				if (exprBinary.getOp() instanceof OpModInt) {
					e = JassExprFunctionCall("ModuloInteger", JassExprlist(leftExpr, rightExpr));
				} else if (exprBinary.getOp() instanceof OpModReal) {
					e = JassExprFunctionCall("ModuloReal", JassExprlist(leftExpr, rightExpr));
				} else if (exprBinary.getOp() instanceof OpDivReal 
						&& exprBinary.getLeft().attrTyp() instanceof PScriptTypeInt
						&& exprBinary.getRight().attrTyp() instanceof PScriptTypeInt) {
					// multiply the left expression by 1.0 to convert it to real
					e = JassExprBinary(JassExprBinary(leftExpr, JassOpMult(), JassExprRealVal(1.0)), JassOpDiv(), rightExpr);
				} else {
					e = JassExprBinary(leftExpr, translateOp(exprBinary.getOp()), rightExpr);
				}
				return new ExprTranslationResult(statements, e);
			}

			@Override
			public ExprTranslationResult case_ExprBoolVal(ExprBoolVal exprBoolVal) {
				return new ExprTranslationResult(JassExprBoolVal(exprBoolVal.getVal()));
			}

			@Override
			public ExprTranslationResult case_ExprMemberVar(ExprMemberVar exprMemberVar) {
				VarDef varDef = (VarDef) exprMemberVar.attrNameDef(); // TODO cast not always possible
				String varName = manager.getJassVarNameFor(varDef);

				ExprTranslationResult left = translateExpr(f, exprMemberVar.getLeft());

				JassExpr e = JassExprVarArrayAccess(varName, left.getExpr());
				return new ExprTranslationResult(left.getStatements(), e);
			}

			@Override
			public ExprTranslationResult case_ExprNull(ExprNull exprNull) {
				return new ExprTranslationResult(JassExprNull());
			}

			@Override
			public ExprTranslationResult case_ExprIntVal(ExprIntVal exprIntVal) {
				return new ExprTranslationResult(JassExprIntVal(exprIntVal.getVal()));
			}

			@Override
			public ExprTranslationResult case_ExprFuncRef(ExprFuncRef exprFuncRef) {
				FunctionDefinition funcDef = exprFuncRef.attrFuncDef();
				JassFunction jassFunc = manager.getJassFunctionFor(funcDef);

				// f calls jassfunc
				translator.calledFunctions.put(f, jassFunc);

				String funcName = jassFunc.getName();
				return new ExprTranslationResult(JassExprFuncRef(funcName));
			}

			@Override
			public ExprTranslationResult case_ExprVarArrayAccess(ExprVarArrayAccess exprVarArrayAccess) {
				VarDef varDef = (VarDef) exprVarArrayAccess.attrNameDef();
				String varName = manager.getJassVarNameFor(varDef);

				ExprTranslationResult left;
				if (exprVarArrayAccess.getIndexes().size() == 1) {
					left = translateExpr(f, exprVarArrayAccess.getIndexes().get(0)); 
				} else {
					throw new Error("only one array index is supported currently");
				}
				JassExpr e = JassExprVarArrayAccess(varName, left.getExpr());
				return new ExprTranslationResult(left.getStatements(), e);
			}
		});
	}
	
	/**
	 * translate a list of expressions, makes sure that the arguments are evaluated in correct order
	 * so if we hava a list of expressions (a,b,c) and c requires additional statements then a and b
	 * will use statements too
	 * @param f 
	 */
	private ExprListTranslationResult translateArguments(JassFunction f, List<Expr> args, List<String> types) {
		if (args.size() != types.size()) {
			throw new IllegalArgumentException("argsize = " + args.size() + " but typessize = " + types.size() + " // " + f.getName());
		}
		
		List<ExprTranslationResult> translations = Lists.newLinkedList();
		int lastTranslationWithStatements = 0;
		int i = 0;
		for (Expr arg : args) {
			ExprTranslationResult translation = translateExpr(f, arg);
			if (translation.getStatements().size() > 0) {
				lastTranslationWithStatements = i;
			}
			translations.add(translation);
			i++;
		}



		List<JassStatement> statements = Lists.newLinkedList();
		List<JassExpr> exprs = Lists.newLinkedList();

		i = 0;
		for (ExprTranslationResult arg : translations) {
			statements.addAll(arg.getStatements());
			if (i < lastTranslationWithStatements) {
				JassVar tempVar = translator.getNewTempVar(f, types.get(i));
				statements.add(JassStmtSet(tempVar.getName(), arg.getExpr()));
				exprs.add(JassExprVarAccess(tempVar.getName()));
			} else {
				exprs.add(arg.getExpr());
			}
		}
		return new ExprListTranslationResult(statements, exprs);
	}
	
	
	private JassOpUnary translateOpUnary(OpUnary op) {
		return op.match(new OpUnary.Matcher<JassOpUnary>() {

			@Override
			public JassOpUnary case_OpNot(OpNot opNot) {
				return JassOpNot();
			}

			@Override
			public JassOpUnary case_OpMinus(OpMinus opMinus) {
				return JassOpMinus();
			}
		});
	}
	
	private JassOpBinary translateOp(OpBinary op) {
		return op.match(new OpBinary.Matcher<JassOpBinary>() {

			@Override
			public JassOpBinary case_OpDivInt(OpDivInt opDivInt) {
				return JassOpDiv();
			}

			@Override
			public JassOpBinary case_OpLessEq(OpLessEq opLessEq) {
				return JassOpLessEq();
			}

			@Override
			public JassOpBinary case_OpEquals(OpEquals opEquals) {
				return JassOpEquals();
			}

			@Override
			public JassOpBinary case_OpModReal(OpModReal opModReal) {
				throw new Error("modulo operator cannot be translated");
			}

			@Override
			public JassOpBinary case_OpModInt(OpModInt opModInt) {
				throw new Error("modulo operator cannot be translated");
			}

			@Override
			public JassOpBinary case_OpUnequals(OpUnequals opUnequals) {
				return JassOpUnequals();
			}

			@Override
			public JassOpBinary case_OpDivReal(OpDivReal opDivReal) {
				return JassOpDiv();
			}

			@Override
			public JassOpBinary case_OpAnd(OpAnd opAnd) {
				return JassOpAnd();
			}

			@Override
			public JassOpBinary case_OpGreater(OpGreater opGreater) {
				return JassOpGreater();
			}

			@Override
			public JassOpBinary case_OpPlus(OpPlus opPlus) {
				return JassOpPlus();
			}

			@Override
			public JassOpBinary case_OpMult(OpMult opMult) {
				return JassOpMult();
			}

			@Override
			public JassOpBinary case_OpGreaterEq(OpGreaterEq opGreaterEq) {
				return JassOpGreaterEq();
			}

			@Override
			public JassOpBinary case_OpMinus(OpMinus opMinus) {
				return JassOpMinus();
			}

			@Override
			public JassOpBinary case_OpLess(OpLess opLess) {
				return JassOpLess();
			}

			@Override
			public JassOpBinary case_OpOr(OpOr opOr) {
				return JassOpOr();
			}
		});
	}
	
	List<String> getParameterTypes(WParameters params) {
		List<String> result = Lists.newArrayListWithCapacity(params.size());
		for (WParameter p : params) {
			result.add(translator.translateType(p.getTyp()));
		}
		return result;
	}
	
	private ExprTranslationResult translateFunctionCall(JassFunction f, FunctionCall call) {
		System.out.println("translating function call " + call.getFuncName() + " // " + call);
		List<Expr> arguments = Lists.newLinkedList(call.getArgs());
		if (call.attrImplicitParameter() instanceof Expr) {
			// add implicit parameter to front
			arguments.add(0, (Expr) call.attrImplicitParameter());
		}
		
		FunctionDefinition calledFunc = call.attrFuncDef();
		if (calledFunc == null) {
			// this must be an ignored function
			System.out.println("ignoring function " + call.getFuncName());
			return new ExprTranslationResult(JassExprFunctionCall("DoNothing", JassExprlist()));			
		}
		JassFunction calledJassFunc = manager.getJassFunctionFor(calledFunc);
		
		translator.calledFunctions.put(f, calledJassFunc);
		
		String functionName = calledJassFunc.getName();
		JassExprlist jassArgs = JassExprlist();
		List<JassStatement> statements = Lists.newLinkedList();
		
		// translate arguments:			
		ExprListTranslationResult args = translateArguments(f, arguments, getParameterTypes(calledFunc));
		statements.addAll(args.getStatements());
		jassArgs.addAll(args.getExprs());
		
		
		JassExprFunctionCall ex = JassExprFunctionCall(functionName, jassArgs);
		return new ExprTranslationResult(statements, ex);
	}
	
	
	private List<String> getParameterTypes(FunctionDefinition call) {
		final List<String> result = Lists.newLinkedList();
		// add implicit parameter if any
		call.match(new FunctionDefinition.MatcherVoid() {

			@Override
			public void case_FuncDef(FuncDef funcDef) {
				if (funcDef.attrIsDynamicClassMember()) {
					// add implicit parameter 'this'
					result.add(translator.translateType(PScriptTypeInt.instance()));
				}
			}

			@Override
			public void case_NativeFunc(NativeFunc nativeFunc) {
			}

			@Override
			public void case_ExtensionFuncDef(ExtensionFuncDef extensionFuncDef) {
				result.add(translator.translateType(extensionFuncDef.getExtendedType().attrTyp()));
			}

		});
		// add normal parameters
		for (WParameter p : call.getSignature().getParameters()) {
			result.add(translator.translateType(p.attrTyp()));
		}
		return result;
	}
	
}
