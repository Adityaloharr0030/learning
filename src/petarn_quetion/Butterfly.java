package petarn_quetion;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        int n=a.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++) {
                System.out.print("*"+" ");
            }
            for (int t=1;t<=n;t++){
                System.out.print(" ");
            }
            for (int l=1;l<=n;l++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i=1;i<=n;i++){
            for (int j=i;j<=n;j++) {
                System.out.print("*"+" ");
            }

            System.out.println();
        }

    }
}
