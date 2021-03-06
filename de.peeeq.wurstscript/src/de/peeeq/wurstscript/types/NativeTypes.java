package de.peeeq.wurstscript.types;

import de.peeeq.wurstscript.intermediateLang.ILconst;
import de.peeeq.wurstscript.intermediateLang.ILconstBool;
import de.peeeq.wurstscript.intermediateLang.ILconstInt;
import de.peeeq.wurstscript.intermediateLang.ILconstNull;
import de.peeeq.wurstscript.intermediateLang.ILconstReal;
import de.peeeq.wurstscript.intermediateLang.ILconstString;

public class NativeTypes {
	/**
	 * returns the PscriptType for a given nativetype definition
	 * @param b 
	 */
	public static PscriptType nativeType(String typeName, boolean isJassCode) {
		if (typeName.equals("int") || typeName.equals("integer")) {
			if (isJassCode) {
				return PScriptTypeJassInt.instance();
			} else {
				return PScriptTypeInt.instance();
			}
		}
		if (typeName.equals("bool") || typeName.equals("boolean")) {
			return PScriptTypeBool.instance();
		}
		if (typeName.equals("real")) {
			return PScriptTypeReal.instance();
		}
		if (typeName.equals("string")) {
			return PScriptTypeString.instance();
		}
		if (typeName.equals("code")) {
			return PScriptTypeCode.instance();
		}
		if (typeName.equals("handle")) {
			return PScriptTypeHandle.instance();
		}
		return null;
	}

	public static ILconst getDefaultValue(PscriptType type) {
		if (type.isSubtypeOf(PScriptTypeInt.instance(), null)) {
			return new ILconstInt(0);
		}
		if (type.isSubtypeOf(PScriptTypeBool.instance(), null)) {
			return ILconstBool.FALSE;
		}
		if (type.isSubtypeOf(PScriptTypeReal.instance(), null)) {
			return new ILconstReal(0.0);
		}
		if (type.isSubtypeOf(PScriptTypeString.instance(), null)) {
			return new ILconstString(null);
		}
		if (type.isSubtypeOf(PScriptTypeCode.instance(), null)) {
			return new ILconstNull();
		}
		if (type.isSubtypeOf(PScriptTypeHandle.instance(), null)) {
			return new ILconstNull();
		}
		if (type instanceof PscriptTypeClass) {
			return new ILconstInt(0);
		}
		throw new Error("default value for type " + type + " not implemented");
	}
}
