package dsa_questions;

import java.math.BigInteger;
import java.util.Scanner;

public class LongFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        BigInteger factorial = BigInteger.ONE;

        for (int i = 2; i <= a; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorial);
        sc.close();
    }
}
