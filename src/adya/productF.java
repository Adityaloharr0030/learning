package adya;
import java.util.Scanner;

public class productF {
    public static int multiply(int a, int b) {
        int prod = a * b;
        System.out.println("product of a and b is" + prod);
        return prod;

    }
    public static int factorial(int n){
        int f =1;
        for (int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int bincoeff(int n, int r){
        int fac_n= factorial(n);
        int fac_r= factorial(r);
        int fac_nmr=factorial(n-r);
        int bincoeff = fac_n/(fac_r*fac_nmr);
        return bincoeff;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in)  ;
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//  //  int mul =multiply(a,b);
//        multiply(a,b);

//factorial(4);
     System.out.println(bincoeff(5,2));


    }
}
