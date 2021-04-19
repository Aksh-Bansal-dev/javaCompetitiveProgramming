import random;

n = 5
q = 5
print(n)
for i in range(n):
    print(random.randint(1,10), end=" ")

print(f"\n{q}")
for i in range(q):
    print(f"{random.randint(1,n-1)} {random.randint(1,10)}")
