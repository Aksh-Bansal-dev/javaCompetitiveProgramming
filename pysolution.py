import math

t = int(input())
for test in range(t):
    n = int(input())
    if n == 1:
        print("FastestFinger")
    elif n == 2:
        print("Ashishgup")
    elif n % 2 != 0:
        print("Ashishgup")
    else:
        even = 1
        codd = 0
        for i in range(2, math.floor(math.sqrt(n)) + 1):
            if n % i == 0:
                if i % 2 == 0:
                    even *= i
                else:
                    codd += 1
                num2 = n // i
                if num2 % 2 == 0:
                    even *= num2
                else:
                    codd += 1
        if even == 2:
            if codd == 1 or codd == 0:
                print("FastestFinger")
            else:
                print("Ashishgup")
        else:
            if codd == 0:
                print("FastestFinger")
            else:
                print("Ashishgup")
