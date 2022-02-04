    // Returns nCr % p using Fermat's
    // little theorem.
    static long modInverse(long n, long p)
    {
        return pow(n, p - 2);
    }
 
    static long ncr(int n, int r, int p)
    {
 
          if (n<r)
              return 0;
        // Base case
        if (r == 0)
            return 1;
 
        // ==============================
        // Calculate this only once
        static long[] fac;
 
        fac = new long[n + 1];
        fac[0] = 1;
 
        for (int i = 1; i <= n; i++)
            fac[i] = (fac[i - 1] * i) % mod;
        // ============================

        return (fac[n] * modInverse(fac[r], p)
                % p * modInverse(fac[n - r], p)
                % p)
            % p;
    }

// =================== for large n ==================
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


