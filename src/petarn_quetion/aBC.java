package petarn_quetion;

import java.util.Scanner;

public class aBC {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        int n=a.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++) {
                System.out.print((char)( 64+j)+" ");
            }
            System.out.println();
        }
        System.out.println("\n".repeat(2));

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++) {
                System.out.print((char)( 96+j)+" ");
            }
            System.out.println();
        }
    }
}
