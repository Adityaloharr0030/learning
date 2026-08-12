package dsa_questions;

import java.util.Scanner;

public class PageCount {
    public static int page(int n, int p) {

        // Turns from front
        int front = p / 2;

        // Turns from back
        int back = (n / 2) - (p / 2);

        // Minimum turns
        return Math.min(front, back);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();

        System.out.println(page(n, p));
    }
}
