#!/bin/bash

num="$#"
if [[ "$num" = '0' ]]; then
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
    if [ "${fileExtname}" = 'java' ]; then 
        javac ${filename} && java ${fileBasenameNoExtension} <input.txt; 
    elif [ 'py' = "${fileExtname}" ]; then python3 ${filename} <input.txt; 
    elif [ "${fileExtname}" = 'c' ] || [ "${fileExtname}" = 'cpp' ]; then g++ ${filename} && ./a.out <input.txt; 
    else echo 'File extension not supported'; fi
    rm *.class
done
