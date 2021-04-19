import java.util.*;
// import java.lang.*;
import java.io.*;

//           THIS TEMPLATE MADE BY AKSH BANSAL.

class Solution {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    private static boolean[] isPrime;
    private static void primes(){
        int num = (int)1e6; // PRIMES FROM 1 TO NUM
        isPrime = new boolean[num];
     
        for (int i = 2; i< isPrime.length; i++) {
           isPrime[i] = true;
        }
        for (int i = 2; i< Math.sqrt(num); i++) {
           if(isPrime[i] == true) {
              for(int j = (i*i); j<num; j = j+i) {
                 isPrime[j] = false;
              }
           }
        }
    }
    private static long gcd(long a, long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        // primes();
        // ________________________________

        // int t = sc.nextInt();
        // StringBuilder output = new StringBuilder();

        // while (t-- > 0) {
        // }

        // out.println(output);
        // _______________________________

        // int n = sc.nextInt();
            int n = sc.nextInt();
            int[] arr =new int[n];
            for(int i=0;i<n;i++){
                arr[i]  = sc.nextInt();
            }
            int q = sc.nextInt();
            int[][] qq = new int[q][2];
            for(int i=0;i<q;i++){
                qq[i][0] = sc.nextInt();
                qq[i][1] = sc.nextInt();
            }
            // output.append().append("\n");
            solver(arr, n, qq, q, out);
        // out.println(solver());
        // ________________________________
        out.flush();
    }
    private static int[] par;
    private static int res;
    public static void solver(int[] arr, int n, int[][] qq, int q, PrintWriter out) {
        par = new int[n];
        res = 0;
        for(int i=0;i<n;i++){
            par[i] = i+1;
        }

        for(int i=0;i<q;i++){
            res = 0;
            helper(arr, n, qq[i][0]-1, qq[i][1], qq[i][0]-1);
            out.println(Math.max(0,res));
        }
        
    }
    private static int helper(int[] arr, int n, int pos, int count, int d){
        if(pos>=n-1 || arr[pos]>=count){
            res += (pos-d)*Math.min(arr[pos], count);
        // System.out.println(pos+"__"+ res);
            arr[pos]-=count;
            return pos==0?pos+1:pos;
        }
        res += (pos-d)*arr[pos];
        int temp = arr[pos];
        arr[pos] = 0;
        par[pos] = helper(arr, n, par[pos], count-temp, d);
        return par[pos];
    }
}