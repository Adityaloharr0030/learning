package dsa_questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ElectrionShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int i = 0;
        int j = drives.length - 1;
        int max = -1;
        while (i < keyboards.length && j >= 0) {
            int total = keyboards[i] + drives[j];
            if (total > b) {
                // too expensive reduce driver price
                j--;
            } else {
                // valid = save ans
                max = Math.max(max, total);
                // increase keybored price to try for a  large total
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] keyboards = new int[n];
        int[] drives = new int[m];

        for (int i = 0; i < n; i++) {
            keyboards[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            drives[i] = sc.nextInt();
        }

        System.out.println(getMoneySpent(keyboards, drives, b));

        sc.close();
    }

}
