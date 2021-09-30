    // Range sum fenwick Tree
    static class FenwickTree {
        public int[] tree;
        public int size;
    
        public FenwickTree(int size) {
            this.size = size;
            tree = new int[size + 5];
        }
    
        public void add(int i, int v) {
            while (i <= size) {
                tree[i] += v;
                i += i & -i;
            }
        }
    
        public int find(int i) {
            int res = 0;
            while (i >= 1) {
                res += tree[i];
                i -= i & -i;
            }
            return res;
        }
    
        public int find(int l, int r) {
            return find(r) - find(l - 1);
        }
    }

    /*
    * To calculate count of numbers in range
    * compress the array to compressed arr
    * Then use that with fenwick tree
    * Add elem ->   ft.add(compressed[i], 1)
    * Each elem has weight 1
    */
    public static int[] compress(int[] arr) {
        ArrayList<Integer> ls = new ArrayList<>();
        for (int x : arr)
            ls.add(x);
        Collections.sort(ls);
        HashMap<Integer, Integer> map = new HashMap<>();
        int currentMinimum = 1;
        for (int x : ls)
            if (!map.containsKey(x))
                map.put(x, currentMinimum++);
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            brr[i] = map.get(arr[i]);
        return brr;
    }