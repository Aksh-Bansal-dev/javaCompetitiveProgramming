    // static int[] rank;
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
        int xset = find(par, x);
        // int xset = x;
        int yset = find(par, y);

        // Rank compression
        // if(rank[xset]<rank[yset])
        //     par[xset] = yset;
        // else if(rank[xset]==rank[yset]){
        //     par[xset] = yset;
        //     rank[yset]++; 
        // }
        // else
        //     par[yset] = xset;

        par[xset] = yset;
    }
