a=0
# -lt is less than operator
  
#Iterate the loop until a less than 10
while [ $a -lt 10 ]
do 
    # Print the values
    echo "" > diff.txt && 
    python gen.py>input.txt &&
    python pysolution.py<input.txt>output2.txt &&
    javac Solution.java &&
    java Solution<input.txt>output.txt &&
    python com.py>>diff.txt
      
    # increment the value
    a=`expr $a + 1`
done