package petarn_quetion;

import java.util.Scanner;

public class even_odd_abcd {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        int n=a.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++) {
                if (i%2==0) {
                    System.out.print((char) (64 + i) + " ");
                }else System.out.print((char) (96 + i) + " ");
            }
            System.out.println();
        }
    }
}
