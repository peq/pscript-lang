Modules are small packages which provide some functionality for classes. Classes can **use** modules to inherit the functionality of the module.

You can use the functions from the used module as if they were declared in the class. You can also **override** functions defined in a module to adjust its behavior.

If you know object oriented languages like Java or C#: Modules are like abstract classes and using a module is like inheriting from an abstract class but **without the subtyping**. _(Wurstscript takes a different approach to enable polymorphism, but this is not implemented yet)_

## Example 1 ##

In this example we just have a class which uses a module A. The resulting program behaves as if the code from module A would be pasted into Class C.

```
module A
    public function foo()
        ...


class C
    use A
```

## Example 2 ##

Modules are more than just a mechanism to copy code. Classes and modules can override functions defined in used modules:

```
// a module to store an integer variable
module IntContainer
    int x

    public function getX() returns int
        return int

    public function setX(int x)
        this.x = x

// a container which only stores positive ints
module PositiveIntContainer
    use IntContainer
    
    // override the setter to only store positive integers
    override function setX(int x)
        if x >= 0
            IntContainer.setX(x)

```

# Advanced use of Modules #


## Visibility & Usage Rules ##

  * Variables of modules are always private
  * private functions are only usable from the module itself
  * each function of a module must be declared public or private
  * if a class uses a module it inherits only the public functions of the module
    * you can use a module with **private** (not implemented yet). This will let you use the functionality of the module without exposing its functions to the outside.




## Overriding Functions ##

  * You can **override** functions which are defined in used modules by writing the override keyword in front of a function.
  * If two modules are used, which have the same function, it **must** be overridden by the underlying class or module in order to avoid ambiguousness (of course this is only possible if the function signatures match. We are thinking about a solution for this)
  * private functions cannot be overridden

## Abstract Functions ##

Modules can declare abstract functions: Functions without a given implementation. Abstract functions have to be implemented by the underlying classes.

## Thistype ##

You can use **thistype** inside a module to refer to the type of the class which uses the module. This can be useful if you need to [castTo](cast.md) the class to an integer and back.