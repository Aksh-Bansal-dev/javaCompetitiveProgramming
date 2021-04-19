// A
import java.util.*;
// import java.lang.*;
import java.io.*;

//           THIS TEMPLATE MADE BY AKSH BANSAL.

public class Solution {
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

        int t = sc.nextInt();
        StringBuilder output = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr =new int[n];
            for(int i=0;i<n;i++){
                arr[i]  = sc.nextInt();
            }
            output.append(solver(arr, n)).append("\n");
        }

        out.println(output);
        // _______________________________

        // int n = sc.nextInt();
        // out.println(solver());
        // ________________________________
        out.flush();
    }

    public static String solver(int[] arr, int n) {
        for(int i=0;i<n;i++){
            int cur = (int)Math.sqrt(arr[i]);;
            if(cur*cur!=arr[i]){
                return "YES";
            }
        }
        return "NO";
    }
}