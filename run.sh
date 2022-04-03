#!/bin/bash

# Colors
RED='\033[1;31m'
GREEN='\033[1;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color


num="$#"
if [ "$num" = '0' ] || [ "$1" != '-ni' ]; then
    echo -e "${YELLOW}Input: ${NC}"
    cat input.txt
    echo -e "\n${YELLOW}Output: ${NC}"
fi

if [ "$num" = '0' ] || [ "$1 $num" = '-ni 1' ]; then
    javac Solution.java && java Solution <input.txt  
    rm *.class
    exit 1
fi

files="$@"
for i in $files;
do
    filename="${i##*/}"
    fileExtname="${filename##*.}"
    fileBasenameNoExtension="${filename%%.*}"
    if [ "$i" = '-ni' ]; then
        continue
    elif [ "${fileExtname}" = 'java' ]; then 
        javac ${filename} && java ${fileBasenameNoExtension} <input.txt; 
        rm *.class;
    elif [ 'py' = "${fileExtname}" ]; then python3 ${filename} <input.txt; 
    elif [ "${fileExtname}" = 'c' ] || [ "${fileExtname}" = 'cpp' ]; then 
        g++ -o tttt.out ${filename} && ./tttt.out <input.txt; 
        rm tttt.out
    else echo 'File extension not supported'; fi
done
