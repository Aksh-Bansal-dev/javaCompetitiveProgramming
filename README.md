# Java Competitive Programming

My java setup for competitive programming.

## Contents

- Java template
- VScode
  - Snippets for java
  - Shortcut to compile and run `Solution.java`
- Vim session
- Testcase generator
- A shell script to stress test
- A shell script to run java/c/cpp/python program
- Some frequently used data structures/algo in java.

## How to use
- Run `npx java-comp` to copy template to current directory 
- Copy code from `template.java` to `Solution.java`
- Code your solution in `Solution.java`
- Run (VS Code)
  - Enter testcase in `input.txt`
  - Press `Ctrl`+`Shift`+`B` to run your solution and print output in `output.txt`
- Run (General)
  - Run `./run.sh` to run `Solution.java` with input from `input.txt` or you can specify `./run.sh ABC.java` to run `ABC.java`. 
- If you can't find bug then
  - Enter correct solution in `Brute.java`
  - Adjust testcase generator according to the question
  - Run `./auto.sh` in shell and you will get a failing testcase.
