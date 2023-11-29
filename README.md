# 👨🏻‍💻 Compiler-and-interpreter-for-SimplanPlas 🔡
<h2>Compiler and interpreter for a programming language called “SimplanPlus”. 
<br>Project of the "complements of programming languages" course, master's degree in information technology for management at the University of Bologna.</h2>
<br> The aim of this project was to implement a compiler and interpreter for a programming language called “SimplanPlus”.
The project in question is an integral part of the "Complements of programming languages" exam for the year 2022/2023 

<br><h3>Description of SimplanPlus</h3>
SimpLanPlus is a simple imperative language, in which:

- Types also include the void type
- Variable declarations are: type ID (without initialization)
- Functions can be recursive (but not mutually)
- There are commands (a program or the body of a function can be stm or dec stm)
- Function bodies of the type { stm; exp } and in this case the function, after evaluating stm, returns the value of exp .

<br><h3>🎯The delivery contains 4 main points to follow for completion:</h3>

1. Lexical analysis that returns the list of lexical errors in an output file;
2. Development of the program's Symbol Table and verification of undeclared identifiers/functions and identifiers/functions declared multiple times in the same environment;
3. Development of a semantic analysis that verifies both the correctness of the types such as number and type of current parameter if they conform to the formal ones and use of uninitialized variables assuming that the functions never access the global variables;
4. Implementation of the SimpLanPlus interpreter
