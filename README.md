# Polaris Analyzer

Polaris is a custom programming language inspired by the syntax of C#, Java, Python, and Pascal. Additionally, an IDE was specifically designed for conducting lexical, syntax, and semantic analyses of Polaris code, rather than compilation.


## IDE Features

- An attractive interface that includes its own console.
- In case of an error, the console displays the error type, provides fix instructions, and positions the caret at the error location.
- A menu that allows users to open and save .pol files.
- A button that, when clicked, displays three windows:
  - Lexical Analysis: The code is divided into tokens.
  - Syntax Analysis: A syntax tree is generated by verifying the code’s structure against predefined rules to ensure correct syntax.
  - Semantic Analysis: A symbol table is generated to verify code coherence, functionality, and adherence to Polaris language rules.

## Programming Language Constraints

- Single-line comments are denoted with the hash symbol (#), while multi-line comments are enclosed within forward slashes (/…/).
- To declare variables, you need to specify the data type first, followed by the identifier.
- Variables are assigned values after they have been declared.
- Output is done using writeln, and input is obtained using readln.
- Conditional and iterative structures use parentheses to enclose conditions and values, and curly brackets to denote their beginning and end.
- A semicolon (;) is used at the end of each line of code, similar to other languages.
- Logical operators are used as in C# or Java.
- Post-increment and post-decrement operations are supported.

## Included Programs

Some programs are included for testing, both normal ones and error-free:

- CFE Bill Calculation
- Steel Grade Classifier
- Armstrong Number Finder
- Range Finder
- Prime Factor Finder

# How to Run this Project

You can compile this project using the latest version of Netbeans, or alternatively, download the file from releases. Examples programs are included.

# About this project

This project was developed in Java to create a custom programming language. It encompasses lexical, semantic, and syntactic analysis functionalities of a custom programming language, along with a corresponding IDE. The project was built using JDK 8u391.