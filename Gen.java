import java.util.*;
import java.io.*;

public class Gen {
    static int rand(long a,long b){
        return (int)(Math.random()*(b-a)+a);
    }
    static public String randString(int n) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = n;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
          .limit(targetStringLength)
          .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
          .toString();

        return generatedString;
    }   
    public static void main(String[] args) throws IOException {
        int n = rand(1,10);
        System.out.println( randString(n));
        System.out.println( randString(n));
    }
}
