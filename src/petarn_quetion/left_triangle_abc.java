package petarn_quetion;

import java.util.Scanner;

public class left_triangle_abc {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        int n=a.nextInt();
        int o=1;
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i-1;j++) {
                System.out.print(" "+" ");
            }
            for (int k=i;k<=n;k++){
                System.out.print((char)(96+o)+" ");
                o++;
            }
            System.out.println();
        }
    }
}
