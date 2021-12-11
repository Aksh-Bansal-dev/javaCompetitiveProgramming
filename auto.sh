#!/bin/bash

# Colors
RED='\033[1;31m'
GREEN='\033[1;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

javac Gen.java
javac Solution.java
javac Brute.java

testcase=0

while [[ 1 -lt 2 ]]
do 
    testcase=$((testcase+1))
    java Gen > input.txt
    java Brute <input.txt>output2.txt
    java Solution<input.txt>output.txt
    diff -q output.txt output2.txt
    if [[ $? -eq 1 ]] 
    then
        echo "Testcase: $testcase"
        echo -e "${YELLOW}Input: ${NC}"
        cat input.txt
        echo -e "\n${GREEN}Correct Output:${NC}"
        cat output2.txt
        echo -e "${RED}Your Output:${NC}"
        cat output.txt
        break
    fi
done

rm *.class output2.txt
