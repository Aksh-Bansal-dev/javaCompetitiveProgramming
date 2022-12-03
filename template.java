import java.util.*;
import java.io.*;
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
    static void sort(int a[]){ // int -> long
        ArrayList<Integer> arr=new ArrayList<>(); // Integer -> Long
        for(int i=0;i<a.length;i++)
        arr.add(a[i]);
        Collections.sort(arr);
        for(int i=0;i<a.length;i++)
        a[i]=arr.get(i);
    }
    private static long gcd(long a, long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
    private static long pow(long x,long y){
        if(y==0)return 1;
        long temp = pow(x, y/2);
        if(y%2==1) return (((x*temp)%mod)*temp)%mod;
        else return (temp*temp)%mod;
    }
    static int log(long n){
        if(n<=1)return 0;
        long temp = n;
        int res = 0;
        while(n>1){
            res++;
            n/=2;
        }
        return (1l<<res)==temp?res:res+1;
    }

    static int mod = (int)1e9+7;
    static int INF = Integer.MAX_VALUE;
    static PrintWriter out;
    static FastReader sc ;
    public static void main(String[] args) throws IOException {
        sc = new FastReader();
        out = new PrintWriter(System.out);
        // primes();
        // ================================ //
        int test = sc.nextInt();
        for(int tt=1;tt<=test;tt++){
            // out.print( "Case #"+tt+": ");
            solver();
        }
        out.flush();
    }

    public static void solver() {

    }
}
