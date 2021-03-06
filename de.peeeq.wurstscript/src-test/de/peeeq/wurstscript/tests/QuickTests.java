package de.peeeq.wurstscript.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.peeeq.immutablecollections.ImmutableListTest;
import de.peeeq.wurstscript.utils.UtilsTest;

@RunWith(Suite.class)
@SuiteClasses({ 
	SimpleStatementTests.class, 
	SimpleFunctionTests.class,
	ImmutableListTest.class, 
	UtilsTest.class,
	ArrayTests.class,
	ExpressionTests.class,
	ClassesTests.class,
	ModuleTests.class,
	PackageTests.class,
	OptimizerTests.class,
	InterfaceTests.class,
	GenericsTests.class,
	TupleTests.class,
	BugTests.class
})
public class QuickTests {

}
