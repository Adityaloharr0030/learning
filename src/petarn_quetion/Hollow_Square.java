package petarn_quetion;

import java.util.Scanner;

public class Hollow_Square {
    public static void main(String[] args) {

            Scanner a= new Scanner(System.in);
            int n=a.nextInt();
            for (int i=1;i<=n;i++){
                for (int j=1;j<=n;j++) {
                   if (i==1 || i==n|| j==1||j==n){
                       System.out.print("*"+" ");
                   }else {
                       System.out.print("  ");
                   }
                }
                System.out.println();
            }
    }
}
