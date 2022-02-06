import java.util.*;

class Console{
    public static void log(int[] arr){
        System.out.print("[LOG] {");
        for(var e: arr){
            System.out.print(e+" ");
        }
        System.out.println("}");
    }
    public static void log(long[] arr){
        System.out.print("[LOG] {");
        for(var e: arr){
            System.out.print(e+" ");
        }
        System.out.println("}");
    }
    public static void log(String[] arr){
        System.out.print("[LOG] {");
        for(var e: arr){
            System.out.print(e+" ");
        }
        System.out.println("}");
    }
    public static void log(double[] arr){
        System.out.print("[LOG] {");
        for(var e: arr){
            System.out.print(e+" ");
        }
        System.out.println("}");
    }
    public static void log(Object... arr){
        System.out.print("[LOG] ");
        for(var e: arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
