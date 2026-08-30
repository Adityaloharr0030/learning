package dsa_questions;

import java.util.Scanner;

public class SavePrisoner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  n  m s");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int s=sc.nextInt();
       //
        // answer = (s + m - 2) % n + 1

        System.out.println( solution(n,m,s));
    }

    public static int solution(int n, int m, int s){
        return (s + m - 2) % n + 1;
    }
}
