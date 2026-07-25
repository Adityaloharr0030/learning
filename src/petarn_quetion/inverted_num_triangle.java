package petarn_quetion;

import java.util.Scanner;

public class inverted_num_triangle {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        int n=a.nextInt();
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
