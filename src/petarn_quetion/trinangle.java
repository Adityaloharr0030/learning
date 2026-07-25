package petarn_quetion;

import java.util.Scanner;

public class trinangle {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        int n=a.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        // Prints 5 empty lines
        System.out.print("\n".repeat(0));

        for (int i=1;i<=n;i++){
            for (int j=i;j<=n;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
