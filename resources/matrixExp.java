    // ============== Matrix Exponentiation ================== //
    static long[][] pow(long [][] base, long pow)	{
        int N = base.length;
		long [][] ans = new long [N][N];
		// generate identity matrix
		for (int i = 0; i < N; i++)	ans[i][i] = 1;
 
		// binary exponentiation
		while ( pow != 0 )	{
			if	( (pow&1) != 0 )	ans = multiplyMatrix(ans, base);
 
			base = multiplyMatrix(base, base);
 
			pow >>= 1;
		}
 
		return	ans;
	}
 
	/**
	 * compute m * m2
	 * O(N^3)
	**/
	static long [][] multiplyMatrix(long [][] m, long [][] m2)	{
        int r1 = m.length;
        int c1 = m[0].length;
        int r2 = m2.length;
        int c2 = m2[0].length;
        if(c1!=r2){
            System.out.println(c1+"__"+r2);
        }
		long [][] ans = new long [r1][c2];
 
		for (int i = 0; i < r1; i++)	for (int j = 0; j < c2; j++)	{
			ans[i][j] = 0;
			for (int k = 0; k < c1; k++)	{
				ans[i][j] = (ans[i][j]+(m[i][k] * m2[k][j])%mod)%mod;
			}
		}
		return	ans;
	}
