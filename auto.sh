a=1
# -lt is less than operator
  
#Iterate the loop until a less than 10
echo "" > diff.txt 

while [ $a -lt 9 ]
do 
    # Print the values
    python3 gen.py > input.txt &&
    java later <input.txt>output2.txt &&
    java Solution<input.txt>output.txt &&
    python3 com.py>>diff.txt
    # increment the value
    a=`expr $a + 1`
done