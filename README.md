# Java Competitive Programming

My java setup for competitive programming.

## Contents

- Template
- VScode
  - Snippets for java
  - Shortcut to compile and run `Solution.java`
- Testcase generator
- A python script to compare output files and print the testcases at which your code fails
- A shell script to run everything with a single command
- Some resources

## How to use
- Run `npx java-comp` to copy template to current directory 
- Copy code from `template.java` to `Solution.java`
- Code your solution in `Solution.java`
- Enter testcase in `input.txt`
- Press `Ctrl`+`Shift`+`B` to run your solution and print output in `output.txt`
- If you can't find bug then
  - Enter correct solution in `pysolution.py`
  - Adjust testcase generator according to the question
  - Run `./auto.sh` in shell
  - Check `diff.txt` for failing testcases
