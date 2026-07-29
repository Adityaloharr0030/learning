package dsa_questions;

import java.util.ArrayList;
import java.util.Arrays;

public class MiniMaxSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );

        long minSum = Long.MAX_VALUE;
        long maxSum = Long.MIN_VALUE;

        for (int i = 0; i < arr.size(); i++) {
            long sum = 0;

            for (int j = 0; j < arr.size(); j++) {
                if (i == j) {
                    continue;
                }

                sum += arr.get(j);
            }

            if (sum < minSum) {
                minSum = sum;
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println(minSum + " " + maxSum);
    }
}