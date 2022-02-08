#!/bin/bash

# Colors
RED='\033[1;31m'
GREEN='\033[1;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

# Compile common files
javac Gen.java
javac Solution.java

if [[ $# -eq 1  ]] 
then 

    # Constructive solution(Solution with multiple correct answer)  
    # Match word -> 'Wrong!'
    if [[ $1 = '-c' ]]
    then
        testcase=0
        while [[ 1 -lt 2 ]]
        do 
            testcase=$((testcase+1))
            echo -ne "Testcase: $testcase\r"
            java Gen > input.txt
            java Solution<input.txt>output.txt

            if grep -q 'Wrong!' output.txt; then
                echo  "Testcase: $testcase"
                echo -e "${YELLOW}Input: ${NC}"
                cat input.txt
                echo -e "\n${RED}Output:${NC}"
                cat output.txt
                break
            fi
        done

        rm *.class
        exit 0
    else
        echo "Bad arguments"
        exit 1
    fi
else
    # Solution with single correct answer
    javac Brute.java
    testcase=0
    while [[ 1 -lt 2 ]]
    do 
        testcase=$((testcase+1))
        echo -ne "Testcase: $testcase\r"
        java Gen > input.txt
        java Brute <input.txt>output2.txt
        java Solution<input.txt>output.txt
        diff -wq output.txt output2.txt
        if [[ $? -eq 1 ]] 
        then
            echo  "Testcase: $testcase"
            echo -e "${YELLOW}Input: ${NC}"
            cat input.txt
            echo -e "\n${GREEN}Correct Output:${NC}"
            cat output2.txt
            echo -e "\n${RED}Your Output:${NC}"
            cat output.txt
            break
        fi
    done

    rm *.class

fi
