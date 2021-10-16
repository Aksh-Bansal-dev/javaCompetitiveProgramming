    static long[][] memNcr; 
    static long ncr(int n, int r)
    {
        if(memNcr[n][r]>0)return memNcr[n][r];
        long res = 1;
        for(int i=0;i<r;i++){
            res=res*(n-i)/(i+1);
        }
        memNcr[n][r] = res;
        return res;
    }
