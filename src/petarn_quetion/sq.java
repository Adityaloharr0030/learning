package petarn_quetion;

import java.util.Scanner;

public class sq {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        int n=a.nextInt();
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i-1;j++) {
                System.out.print(" "+" ");
            }
            for (int k=1;k<=n;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
