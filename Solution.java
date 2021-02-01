// codeforces D

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


    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        // ________________________________
 
        int t = sc.nextInt();
        StringBuilder output = new StringBuilder();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.nextLine();
            solver(n,s, out);
            out.println();
            // output.append().append("\n");
        }
 
        out.println(output);
        // _______________________________
 
        // int n = sc.nextInt();
        // out.println(solver());
        // ________________________________
        out.flush();
    }
 
    public static void solver(int len, String s, PrintWriter out) {
        StringBuilder str = new StringBuilder(s);
        for(int i=0;i<len;i++){
            boolean[] check = new boolean[len];
            str = new StringBuilder(s);

            int res = 1;
            int cur = i;
            while(cur>=0 && cur<len){
                if(str.charAt(cur)=='L'){
                    str.replace(cur,cur,"R");
                    if(cur-1<0){
                        cur = -1;
                    }
                    else if(!check[cur-1]){
                        res++;
                        check[cur-1] = true;
                    }
                    cur--;
                }
                else{
                    str.replace(cur,cur,"L");
                    if(cur+1>len-1){
                        cur = -1;
                    }
                    else if(!check[cur+1]){
                        res++;
                        check[cur+1] = true;
                    }
                    cur++;
                }
            }
            out.print(res+" ");
        }
    }
}