# Iteration 0: #

Packages and Functions compile. We have a language with the same power as jass but with different syntax.

# Iteration 1: #

## Modules (Packages) ##

Basically namespaces, which can require other namespaces

```
module abc
requires 
pscript.util.list,
pscript.util.queue {

}
```


## Classes ##

```
interface Point //declare an interface
                extends Object //interfaces can extend other interfaces
                {
        construct(real x, real y) //constructor
        function getX:real
        function getY:real
        function moveTo(x:real, y:real)

}


class Point // start class definition (can have same name as interface as classes are no real types)
implements Point // can explicity implement a point
requires Math math // explicit declaration of required interfaces
// (maybe this should better be handled by imports)
{
        private {
                var x:real
                var y:real
        }

        function Point(x:real, y:real) {
                this.x = x
                this.y = y
        }

        function getX:real {
		return x
	}
   
	function getY:real {
                return y
        }

        function moveTo(x:real, y:real) {
                this.x = x
                this.y = y
	}

}

//somewhere else:

val p = new Point(2,3)
p.moveTo(3,4)
val a = p.x // actually resolves ot x.getX as x cannot be accessed directly (-> see properties)

p.destroy()
```

  * Maybe I can add garbage collection via alias counting. Just increase count whenever an alias is created and reduce count whenever an alias is destroyed. (might be difficult to do with custom value of dying units and such things)
  * aybe just garbage collection for local variables (might be confusing)
  * aybe something like explicit garbage collection with keyword managed - managed variables are reference counted and must not be stored to uncontrollable or hard to control entities like units (would need explicit declaration as unmanaged via nogc(x))
  * ublic functions must be declared in interfaces, so if you want public functions you must use interfaces
  * lass members are class-private by default, can be made public
  * lass members are public by default, can be made private or internal
  * internal: can be used inside current module
  * private: can be used by class
  * there is no protected: in my opinion protected is not useful in general and totally useless for pscript as there is no inheritence
  * nterface members are always public
  * nterfaces are implemented when all implemented methods are implemented (implements clause is optional)
  * ote: no static members -> use namespaces
  * or every class an interface is declared automatically which consists of all public methods. The interface has the same name as the class. So other classes could implement other variants of the class.

### Properties ###

Often inexperienced programmers and java programmers do not like properties as in c# or overloading of the assignment-operator as in vjass or other languages. The main reason is often “I want to know if I call a method or just access a field”. But you must not know this (see information hiding principle)!

Java does not have any of those and this leads to a very verbose way to write classes: Make all fields private and create getter and setter methods for each field. Note that providing getter and setter method essentially makes the field public. So why is it best practice to do this in Java? Its because your class might change later. You might change the internal representation of your data or you might want to add some functionality like listeners. If you just had public fields you could not add the functionality without breaking the interface to your class.

But if you have some way to “override” fields with methods you can do this and write your classes very concise in the first place.

This is how pScript handles this problem:

Read Access: a.x

  1. check if a has a visible field named “x”
  1. check if a has a visible method named “getX” with 0 parameters

Read Access: a.getX()

  1. check if a has a visible method named “getX” with 0 parameters
  1. check if a has a visible field named “x”

The same is true for a.x = z and a.setX(z)

Something special here is that setX will return a by default which allows for fluent interfaces.

### Nullable Types ###

by default there is no null. If you want a variable to be able to be null you have to annotate its type with a questionmark. The compiler should be able to automatically do the casts from null types to non null types if it is clear and easily computable that a variable cannot be null at some point in the program. If the compiler fails to detect this you can add an extra “assert x != null” statement.

```
var x:Point? = null // allowed
var y:Point = null // not allowed

//...

if (x != null) {
        // now x is automatically “cast” to type Point, as long noone writes the variable
}
```

### Multi Functions ###

Functions can overloaded and it will automatically and dynamically choose the most specific function. If there are more functions applicable choose the one in the same package first or in the uppermost package of the requirements.

See Nice Programming language: http://nice.sourceforge.net/visitor.html


```
interface Expression { }

class IntExp implements Expression {
         var value:int
}

class AddExp implements Expression {
         var e1:Expression , e2:Expression
}

// Behaviour can now be defined on Expressions

def prettyPrint(e:Expression) {
        print(“not Supported”);
}

def prettyPrint(e:IntExp) {
         print(e.value); // e.value can be accessed because it is in the same package
}

def prettyPrint(e:AddExp) {
	prettyPrint(e.e1);
	print(" + ");
	prettyPrint(e.e2);
}
```
### Trigger ###

There is a special syntax to write triggers:

```
trigger bla // optional trigger name
on unitEntersRegion() // use any function with an trigger as first parameter (which is implicitly passed here)
when getTriggeringUnit().owner == player(1) // optional boolean expression
do {
        // usual function  block
}
```

If you want something to run on map load time use:

```
init {     

}
```

Syntactic Sugar

  * infer semicolons at the end of lines (like scala)
  * parantheses are optional for if, while, etc.

```
if x>6 { … }

if (x>6) {}
```

  * call functions with different notation

These two are the same:
```
x = add(a,b);
x = a.add(b);
```

  * omit parantheses for functions without parameters
```
real getX {
        return x
}

set x = p.getX()
set x = p.getX
```

  * implicit conversions (will probably not be implemented)
    * String to Text (sc2)
    * int to real
    * int to string
    * real to string
  * local variable declaration freedom + scopes
  * declaring more than one variable per line
  * foreach loop
```
foreach val x in y {
        A
}
```
becomes
```
val iterator = y.getIterator()
while (iterator.hasNext())  {
        val x = iterator.next()
        A
}
iterator.destroy()
```


# Iteration 2 #
## Parametic Classes/Interfaces ##

## Forwarding & Delegation ##

## Macro ##

```
macro sort(var ar:int[]) {
        // sort the array
}

// use:
run sort(ar);
```

macros can only be called inside functions and macros (without recursion)

the sort function probably is the only useful application, since arrays cannot be passed by reference

Functions as parameters / Higher Order Functions

```
// cheap implementation of a map function
List[S] map(List[R] list, Function[R,S] f) {
        List[S] reverseresult = new List[S]()
	foreach (val r in list) {
                reverseresult = f(r)::reverseresult  
        }
        return reverseresult.reverse
}

List[int] x = [1,2,4,5,6,8]
List[int] xsquare = x.map(square)
```

## Anonymous functions, closures ##

```
List[int] x = x.map(function(int x) {return x + 2})
Function[real,real,real] add = function(real x, real y) {return x+y};
```

### Namespaces ###

Namespaces can be used on the package, interface or class level

```
class Blob
	namespace Blub {
		def foo {}
        }
}

//call like
val blob = new Blob()
blob.Blub.foo()

using Blub {
        // omit “Blub”
        blob.foo();
}
```
Basically it just adds the name followed by a dot to the name of everything defined within the namespace, so this is basically syntactic sugar
Syntactic Sugar II

  * Allow function names to consist of chars only

Those functions must take exactly two parameters

```
def +(a:Point, b:Point):real {
        return new Point(a.x + b.x, a.y + b.y)
}
```

  * if function name consists of signs it can be used in infix notation:
```
x = a + b; 
```
  * init arrays
```
val x = array[1,2,3,4,5]
```
  * init lists
```
val x = list[1,2,3,4,5]
```