Wurstscript is a scripting language which can compile to jass code which is used in wc3.
Wurstscript is no general purpose language. This means that it will/might have language constructs/features which are unique to Wc3/Jass.

# The Compiler #
The WurstScript compiler & optimizer are both written in Java, making it able to compile your code almost¹ platform independent.

The choose of Java as implementation an implementation language hopefully allows other people to contribute to the tools. The project is open source and released under the GNU Lesser GPL, which means that you are allowed to use this project as a base to create your own language. But we would rather have you in our team than having an other language ;)


# WurstPack #

The easiest way to use Wurst, is by using the Wurstpack (altered JNGP) - which only works on windows.

# The language #

The WurstScript language is designed with some simple principles in mind:
  * Write structured code
    * Avoid macros and other preprocessor like commands in the language
    * Organize code in packages
    * Organize reusable code in modules
    * Encourage information hiding (default visibility is package level)
    * Support Real classes
  * Make the language safe
    * No implicit casts
      * not even from int to real
      * `5 / 2 == 2.5 // this is true in Wurst, use "div" if you require integer division`
    * Check high level types
    * More type safety features (like generics) planned in the feature
  * Make the language compilable to efficient Jass code
    * avoids dynamic dispatch when possible
    * build in optimizer (will have function inlining support)
    * sorts functions instead of using TriggerEvaluate
  * Avoid boilerplate code
    * automatically adds the code to set local variables to null
    * while and for loops
  * Nice syntax (at least we think it is nice ;)
    * clean
    * concise
    * easy to read
    * prefer named keywords above symbols
    * indentation base (similar to python)

## Syntax ##

The WurstScript syntax aims to be clean, concise and easy to read. The syntax is indentation based (similar to python).

## Examples ##


# The optimizer #
The Wurst Compiler has a built-in script optimizer (froptimizer).
In the Wurstpack the optimizing services can be disabled.
Basic features:
  * Remove comments,tabs and excessive white-spaces
  * Compress function and variable names
  * Clean jass Stuff

# Usage: #
## Requries ##
  * Java Runtime Eviroment 7 - http://www.oracle.com/technetwork/java/javase/downloads/index.html

## Links & download ##
  * Google Codepage - http://code.google.com/p/pscript-lang/
    * Wiki page explaining how to get and build the source code- http://code.google.com/p/pscript-lang/wiki/HowtoSourceCode
  * Downloads - http://code.google.com/p/pscript-lang/downloads/list
  * Wiki + Documentation - http://code.google.com/p/pscript-lang/w/list

# FAQ #
  1. WurstScript can't access the .j files
    * Start Wurstpack as administrator


¹) Runs on every platform which supports the required Java platform; mpq access is not implemented in Java and requires an external platform dependent tool