package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class question_2dA {

    public static ArrayList<Integer> commonElement(int[] a, int[] b) {

        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {

            if (a[i] == b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First array
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Second array
        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int[] b = new int[m];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        ArrayList<Integer> result = commonElement(a, b);

        System.out.println("Common Elements: " + result);

        sc.close();
    }
}