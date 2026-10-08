package dsa_questions;

import java.util.Scanner;



public class SquearRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = (int) Math.sqrt(b) - (int) Math.sqrt(a - 1);
            System.out.println(count);;
        }

        sc.close();
    }
}
