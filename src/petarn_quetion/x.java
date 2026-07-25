package petarn_quetion;

import java.util.Scanner;

public class x {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        int n=a.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
                if (i==j||i+j==n-1) {
                    System.out.print("*" + "  ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
