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
    static void sort(int a[]){
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        arr.add(a[i]);
        Collections.sort(arr);
        for(int i=0;i<a.length;i++)
        a[i]=arr.get(i);
        
    }
    static void sort(long a[]){
        ArrayList<Long> arr=new ArrayList<>();
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
    // static ArrayList<Integer>[] adj;
    // static void getAdj(int n,int q, FastReader sc){
    //     adj = new ArrayList[n+1];
    //     for(int i=1;i<=n;i++){
    //         adj[i] = new ArrayList<>();
    //     }
    //     for(int i=0;i<q;i++){
    //         int a = sc.nextInt();
    //         int b = sc.nextInt();

    //         adj[a].add(b);
    //         adj[b].add(a);
    //     }
    // }
    static PrintWriter out;
    static FastReader sc ;
    public static void main(String[] args) throws IOException {
        sc = new FastReader();
        out = new PrintWriter(System.out);
        // primes();
        // ________________________________

        // int t = sc.nextInt();
        // StringBuilder output = new StringBuilder();

        // while (t-- > 0) {

        //     output.append(solver()).append("\n");
        // }

        // out.println(output);
        // _______________________________

        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<Integer, PriorityQueue<Integer>> arr =new HashMap<>();
        for(int i=0;i<=4000;i++){
            arr.put(i, new PriorityQueue<Integer>((a,b)->b-a));
        }
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.get(x).add(y);
        }
        // out.println();
        solver(arr, n, k);
        // ________________________________
        out.flush();
    }

    public static void solver(HashMap<Integer, PriorityQueue<Integer>> arr, int n, int k) {
        if(arr.size()<k){
            out.println("0 0");
            return ;
        }
        ArrayList<Integer> freq = new ArrayList<>();
        for(Integer key: arr.keySet()){
            freq.add(arr.get(key).size());
        }
        Collections.sort(freq, Collections.reverseOrder());
        int res = freq.get(k-1);

        ArrayList<Integer> ans = new ArrayList<>();
        for(Integer key: arr.keySet()){
            if(arr.get(key).size()>=res){
                int temp = 0;
                for(int i=0;i<res;i++){
                    temp += arr.get(key).poll();
                }
                ans.add(temp);
            }
        }
        Collections.sort(ans, Collections.reverseOrder());
        out.print(res+" ");
        res = 0;
        for(int i=0;i<k;i++){
            res+=ans.get(i);
        }
        out.print(res);
        out.println();

    }
}