package dsa_questions;

import java.util.Scanner;

public class migrateryBirds {
    public static void main(String[] args) {

        int[] count = new int[6];

        int[] arr = {1, 1, 5, 4, 4, 4, 3, 3};

        // Count frequency
        for (int bird : arr) {
            count[bird]++;
        }

        int max = 0;
        int answer = 0;

        // Find highest frequency
        for (int i = 1; i <= 5; i++) {
            if (count[i] > max) {
                max = count[i];
                answer = i;
            }
        }

        System.out.println(answer);
    }
}