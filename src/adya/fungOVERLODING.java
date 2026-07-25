package adya;
import java.util.Scanner;
import java.util.Scanner;

public class fungOVERLODING {
    public static int sum(int a, int b){
        return a+b;

    }
    public static int sum(int a, int b ,int c){
        return a+b+c;
    }
    public static float sum(float a, float b ,float c) {
        return a + b + c;
    }
    public static float sum(float a, float b ) {
        return a + b ;
    }

    public static void main(String[] args) {
        System.out.println( "sum 2 num:" +sum(9,6));
        System.out.println(  "sum for 3 num:" +sum(3,4,7));
    }
}
