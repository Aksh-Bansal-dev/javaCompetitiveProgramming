    static int find(int par[], int i)
    {
        if (par[i] == i)
            return i;
        int res = find(par, par[i]);
        par[i] = res;
        return res;
    }
    static void union(int par[], int x, int y)
    {
        // optional for pure dsu
        // int xset = find(par, x);
        int xset = x;
        int yset = find(par, y);
        par[xset] = yset;
    }
