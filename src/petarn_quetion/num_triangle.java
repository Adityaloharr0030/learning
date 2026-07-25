package petarn_quetion;

import java.util.Scanner;

public class num_triangle {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        int n=a.nextInt();
        int u=1;
        for (int i=1;i<=n;i++){

            for (int j=1;j<=i;j++) {

                System.out.print(u  +" ");
                u++;
            }

            System.out.println();
        }
    }
}
