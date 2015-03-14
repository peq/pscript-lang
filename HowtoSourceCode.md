# Introduction #

Currently this tool is in development. If it is finished you will be able to download it but **there are no binary downloads yet**.

# Downloading Source #

First you need to get the source code. You can follow the instructions listed under the Source Tab.

## Repository structure ##

In the repository you will find several projects:

  * **de.peeeq.wurstscript** This is the compiler.
  * **MpqCL** this is a small tool to extract/insert the mapscript from/into an mpq archive
  * **parseq** this is a small project which is used by the main project to generate the data structure for the abstract syntax trees
  * **WurstEdit** This is a code editor for wurstscript
  * **Wurstpack** This is a pack to use wurstscript inside the wc3 world editor

# Compiling the Compiler #

In the compiler project you can find the ant build-script "build.xml". You can call "ant" from the command line to build the whole project.

If you are using eclipse, you can use the eclipse compiler to compile the java sources. However you have to **execute the "gen" target of the build file** in order to generate some of the java files (scanner, parser and abstract syntax tree data structures are generated from higher level descriptions).

You should never modify the generated source files in "src-gen". The files in this folder are generated from the files in "parseq".


If you have any problems compiling the sources, please use the comments below.