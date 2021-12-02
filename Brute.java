import java.util.*;
import java.io.*;

//           THIS TEMPLATE MADE BY AKSH BANSAL.

public class Brute {
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
        if(y%2==1){
            return x*temp*temp;
        }
        else{
            return temp*temp;
        }
    }
    static int log(long n){
        int res = 0;
        while(n>0){
            res++;
            n/=2;
        }
        return res;
    }

    static int mod = (int)1e9+7;
    static PrintWriter out;
    static FastReader sc ;
    public static void main(String[] args) throws IOException {
        sc = new FastReader();
        out = new PrintWriter(System.out);
        // primes();
        // ________________________________


        String s = sc.nextLine();
        String t = sc.nextLine();
            solver(s,t);
        // ________________________________
        out.flush();
    }

    public static void solver(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n = arr1.length;
        char[] res = new char[n];
        int start = 0, end = n-1;
        int p1 = 0;
        int p2 = (n+1)/2;
        int pp1 = (n+1)/2-1;
        int pp2 = n-1;
        for(int i=0;start<=end;i++){
            char c1 = arr1[p1];
            char c2 = arr2[pp2];
            // System.out.println( p1+" "+pp1+" "+p2+" "+pp2);
            if(c1>=c2){
                res[end--] = arr1[pp1];
                pp1--;
                // System.out.println( start+" "+end);
                if(start>end)break;
                res[end--] = arr2[p2++];
            }
            else{
                res[start++] = c1;
                // System.out.println( start+" "+end);
                if(start>end)break;
                res[start++] = c2;
                p1++;
                pp2--;
            }
        }
        for(char e: res){
            out.print(e);
        }
        out.println();
    }
}
