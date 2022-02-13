import java.util.*;

class Console{
    static String log = "__";
    public static void log(long[][] arr){
        System.out.println(log);
        for(var e: arr){
            for(var l: e){
                System.out.print(l+" ");
            }
            System.out.println( );
        }
        System.out.println(log);
    }
    public static void log(String[][] arr){
        System.out.println(log);
        for(var e: arr){
            for(var l: e){
                System.out.print(l+" ");
            }
            System.out.println( );
        }
        System.out.println(log);
    }
    public static void log(char[][] arr){
        System.out.println(log);
        for(var e: arr){
            for(var l: e){
                System.out.print(l+" ");
            }
            System.out.println( );
        }
        System.out.println(log);
    }
    public static void log(int[][] arr){
        System.out.println(log);
        for(var e: arr){
            for(var l: e){
                System.out.print(l+" ");
            }
            System.out.println( );
        }
        System.out.println(log);
    }
    public static void log(double[][] arr){
        System.out.println(log);
        for(var e: arr){
            for(var l: e){
                System.out.print(l+" ");
            }
            System.out.println( );
        }
        System.out.println(log);
    }
    public static void log(boolean[][] arr){
        System.out.println(log);
        for(var e: arr){
            for(var l: e){
                System.out.print(l+" ");
            }
            System.out.println( );
        }
        System.out.println(log);
    }
    public static void log(boolean[] arr){
        System.out.print(log+" [");
        for(var e: arr){
            System.out.print(e+" ");
        }
        System.out.println("]");
    }
    public static void log(int[] arr){
        System.out.print(log+" [");
        for(var e: arr){
            System.out.print(e+" ");
        }
        System.out.println("]");
    }
    public static void log(long[] arr){
        System.out.print(log+" [");
        for(var e: arr){
            System.out.print(e+" ");
        }
        System.out.println("]");
    }
    public static void log(String[] arr){
        System.out.print(log+" [");
        for(var e: arr){
            System.out.print(e+" ");
        }
        System.out.println("]");
    }
    public static void log(char[] arr){
        System.out.print(log+" [");
        for(var e: arr){
            System.out.print(e+" ");
        }
        System.out.println("]");
    }
    public static void log(double[] arr){
        System.out.print(log+" [");
        for(var e: arr){
            System.out.print(e+" ");
        }
        System.out.println("]");
    }
    public static void log(Object... arr){
        System.out.print(log+" ");
        for(var e: arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
