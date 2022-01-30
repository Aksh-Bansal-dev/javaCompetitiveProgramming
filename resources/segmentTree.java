	// =================================== Sum segment tree ============================================
	static class SegmentTree
	{
		long st[]; 
		int n;
	    SegmentTree(int arr[])
		{
			this.n = arr.length;
			int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));
			int max_size = 2 * (int) Math.pow(2, x) - 1; 
			// max_size = 4*n
			st = new long[max_size]; 
			constructSTUtil(arr, 0, n - 1, 0);
		}
		int getMid(int s, int e) {
			return s + (e - s) / 2;
		}
		long getSumUtil(int ss, int se, int qs, int qe, int si)
		{
			if (qs <= ss && qe >= se)
				return st[si];
			if (se < qs || ss > qe)
				return 0;
			int mid = getMid(ss, se);
			return getSumUtil(ss, mid, qs, qe, 2 * si + 1) +
					getSumUtil(mid + 1, se, qs, qe, 2 * si + 2);
		}
		void updateValueUtil(int ss, int se, int i, long diff, int si)
		{
			if (i < ss || i > se)
				return;
			st[si] += diff;
			if (se != ss) {
				int mid = getMid(ss, se);
				updateValueUtil(ss, mid, i, diff, 2 * si + 1);
				updateValueUtil(mid + 1, se, i, diff, 2 * si + 2);
			}
		}
		void update(int i, long new_val)
		{
			if (i < 0 || i > n - 1) {
				System.out.println(i+" Invalid Input u "+n);
				return;
			}
            long prev = this.get(i,i);
			updateValueUtil(0, n - 1, i, new_val-prev, 0);
		}
		long get(int qs, int qe)
		{
			if (qs < 0 || qe > n - 1 || qs > qe) {
				System.out.println(qs+" Invalid Input g "+qe);
				return -1;
			}
			return getSumUtil(0, n - 1, qs, qe, 0);
		}
		long constructSTUtil(int arr[], int ss, int se, int si)
		{
			if (ss == se) {
				st[si] = arr[ss];
				return arr[ss];
			}
			int mid = getMid(ss, se);
			st[si] = constructSTUtil(arr, ss, mid, si * 2 + 1) +
					constructSTUtil(arr, mid + 1, se, si * 2 + 2);
			return st[si];
		}
	}




	// =================================== GCD segment tree ============================================
	static class SegmentTree
	{
		long st[]; 
		int n;
	    SegmentTree(int arr[])
		{
			this.n = arr.length;
			int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));
			int max_size = 2 * (int) Math.pow(2, x) - 1; 
			// max_size = 4*n
			st = new long[max_size]; 
			constructSTUtil(arr, 0, n - 1, 0);
		}
		int getMid(int s, int e) {
			return s + (e - s) / 2;
		}
		long getSumUtil(int ss, int se, int qs, int qe, int si)
		{
			if (qs <= ss && qe >= se)
				return st[si];
			if (se < qs || ss > qe)
				return 0;
			int mid = getMid(ss, se);
			return gcd(getSumUtil(ss, mid, qs, qe, 2 * si + 1) ,
					getSumUtil(mid + 1, se, qs, qe, 2 * si + 2));
		}
		void updateValueUtil(int ss, int se, int i, long diff, int si)
		{
			if (i < ss || i > se)
				return;
			if (se != ss) {
				int mid = getMid(ss, se);
				updateValueUtil(ss, mid, i, diff, 2 * si + 1);
				updateValueUtil(mid + 1, se, i, diff, 2 * si + 2);
                st[si] = gcd(get(ss,mid), get(mid+1,se));
			}
            if(se==ss)
			    st[si] = diff;
		}
		void update(int i, long new_val)
		{
			if (i < 0 || i > n - 1) {
				System.out.println(i+" Invalid Input u "+n);
				return;
			}
			updateValueUtil(0, n - 1, i, new_val, 0);
		}
		long get(int qs, int qe)
		{
			if (qs < 0 || qe > n - 1 || qs > qe) {
				System.out.println(qs+" Invalid Input g "+qe);
				return -1;
			}
			return getSumUtil(0, n - 1, qs, qe, 0);
		}
		long constructSTUtil(int arr[], int ss, int se, int si)
		{
			if (ss == se) {
				st[si] = arr[ss];
				return arr[ss];
			}
			int mid = getMid(ss, se);
			st[si] = gcd(constructSTUtil(arr, ss, mid, si * 2 + 1) ,
					constructSTUtil(arr, mid + 1, se, si * 2 + 2));
			return st[si];
		}
	}




	// =================================== MIN segment tree ============================================
	static class SegmentTree
	{
		long st[]; 
        int n;
	    SegmentTree(int arr[])
		{
            this.n = arr.length;
			int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));
			int max_size = 2 * (int) Math.pow(2, x) - 1; 
			// max_size = 4*n
			st = new long[max_size]; 
			constructSTUtil(arr, 0, n - 1, 0);
		}
		int getMid(int s, int e) {
			return s + (e - s) / 2;
		}
		long getSumUtil(int ss, int se, int qs, int qe, int si)
		{
			if (qs <= ss && qe >= se){
				return st[si];
            }
			if (se < qs || ss > qe){
				return Integer.MAX_VALUE;
            }
			int mid = getMid(ss, se);
			return Math.min(getSumUtil(ss, mid, qs, qe, 2 * si + 1) ,
					getSumUtil(mid + 1, se, qs, qe, 2 * si + 2));
		}
		void updateValueUtil(int ss, int se, int i, long diff, int si)
		{
			if (i < ss || i > se)
				return;
			if (se != ss) {
				int mid = getMid(ss, se);
				updateValueUtil(ss, mid, i, diff, 2 * si + 1);
				updateValueUtil(mid + 1, se, i, diff, 2 * si + 2);
                st[si] = Math.min(st[si*2+1], st[si*2+2]);
			}
            else{
			    st[si] = diff;
            }
		}
		void update( int i, long new_val)
		{
			if (i < 0 || i > n - 1) {
				System.out.println("Invalid Input u"+i);
				return;
			}
            // System.out.println(i+"__"+ new_val);
			updateValueUtil(0, n - 1, i, new_val, 0);
		}
		long get(int qs, int qe)
		{
			if (qs < 0 || qe > n - 1 || qs > qe) {
				System.out.println(qs+"Invalid Input g"+qe+" "+n);
				return -1;
			}
			return getSumUtil(0, n - 1, qs, qe, 0);
		}
		long constructSTUtil(int arr[], int ss, int se, int si)
		{
			if (ss == se) {
				st[si] = arr[ss];
				return arr[ss];
			}
			int mid = getMid(ss, se);
			st[si] = Math.min(constructSTUtil(arr, ss, mid, si * 2 + 1) ,
					constructSTUtil(arr, mid + 1, se, si * 2 + 2));
			return st[si];
		}
	}


	// =================================== Max segment tree ============================================
	static class SegmentTree
	{
		long st[]; 
        int n;
	    SegmentTree(int arr[])
		{
            this.n = arr.length;
			int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));
			int max_size = 2 * (int) Math.pow(2, x) - 1; 
			// max_size = 4*n
			st = new long[max_size]; 
			constructSTUtil(arr, 0, n - 1, 0);
		}
		int getMid(int s, int e) {
			return s + (e - s) / 2;
		}
		long getSumUtil(int ss, int se, int qs, int qe, int si)
		{
			if (qs <= ss && qe >= se)
				return st[si];
			if (se < qs || ss > qe)
				return -1;
			int mid = getMid(ss, se);
			return Math.max(getSumUtil(ss, mid, qs, qe, 2 * si + 1) ,
					getSumUtil(mid + 1, se, qs, qe, 2 * si + 2));
		}
		void updateValueUtil(int ss, int se, int i, long diff, int si)
		{
			if (i < ss || i > se)
				return;
			if (se != ss) {
				int mid = getMid(ss, se);
				updateValueUtil(ss, mid, i, diff, 2 * si + 1);
				updateValueUtil(mid + 1, se, i, diff, 2 * si + 2);
                st[si] = Math.max(st[si*2+1], st[si*2+2]);
			}
            else{
			    st[si] = diff;
            }
		}
		void update( int i, long new_val)
		{
			if (i < 0 || i > n - 1) {
				System.out.println("Invalid Input u"+i);
				return;
			}
            // System.out.println(i+"__"+ new_val);
			updateValueUtil(0, n - 1, i, new_val, 0);
		}
		long get(int qs, int qe)
		{
			if (qs < 0 || qe > n - 1 || qs > qe) {
				System.out.println(qs+"Invalid Input g"+qe+" "+n);
				return -1;
			}
			return getSumUtil(0, n - 1, qs, qe, 0);
		}
		long constructSTUtil(int arr[], int ss, int se, int si)
		{
			if (ss == se) {
				st[si] = arr[ss];
				return arr[ss];
			}
			int mid = getMid(ss, se);
			st[si] = Math.max(constructSTUtil(arr, ss, mid, si * 2 + 1) ,
					constructSTUtil(arr, mid + 1, se, si * 2 + 2));
			return st[si];
		}
	}
