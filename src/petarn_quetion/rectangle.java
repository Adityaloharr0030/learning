package petarn_quetion;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.println("Enter column  ");
        int n=a.nextInt();
        System.out.println("Enter row ");
        int m=a.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

