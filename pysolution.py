n=int(input())
b=list(map(int,input().split()))
q=int(input())
next=[i for i in range(n)]
for j in range(q):
    x,k=map(int,input().split())
    ans=0
    start=next[x-1]
    stop=start
    dis=start-(x-1)
    for j in range(start,n):
        stop=j
        req=min(k,b[j])
        k-=req
        ans+=(req*dis)
        dis+=1
        b[j]-=req
        if k==0:
            break
    for e in range(start,stop+1):
        next[e]=stop
    print(ans)



