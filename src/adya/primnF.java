package adya;

import java.util.Scanner;

public class primnF {
    //    public static boolean isprime(int n){
//         boolean isprime =true;
//         if(n==2){
//             return true;
//         }
//        for (int i=2;i<=n-1;i++){
//            if(n%i==0){
//                isprime=false;
//                break;
//            }
//        }
//        return isprime;
//
//    }
    public static boolean isprime(int n) {
        if (n == 2) {
            return true;

        }
        for (int i = 2; i <= Math.sqrt(n) - 1; i++) {

            if (n % i == 0) {
                return false;

            }
        }
    return true;
}

    public  static void primereg(int n){
        for (int i=2; i<=n;i++){
            if(isprime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        primereg(n);
    }
    }