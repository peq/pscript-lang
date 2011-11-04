package de.peeeq.wurstscript.attributes;

import de.peeeq.wurstscript.ast.PackageOrGlobal;
import de.peeeq.wurstscript.ast.AstElement;



/**
 * this attribute gives you the nearest package for a given element
 *
 */
public class AttrNearestPackage {
	
	public static  PackageOrGlobal calculate(AstElement node) {
		if (node == null) {
			return null;
		}
		if (node instanceof PackageOrGlobal) {
			return (PackageOrGlobal) node;
		}
		return node.getParent().attrNearestPackage();
	}


}