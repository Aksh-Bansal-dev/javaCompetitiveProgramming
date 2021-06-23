import math
def countDiv(n):
	res = 1
	temp = 0
	while(n>0 and n%2==0):
		temp+=1
		n = n/2;
	
	res = temp+1
	temp=1

	i = 3
	while i*i<=n:
		temp=0
		if(n%i==0):
			while(n%i==0):
				temp+=1
				n = n/i
			res *=(temp+1);
		i+=2
	
	if(n>1):
		res *=2;
	return res;

print(countDiv(24));