package sort;

import java.util.Scanner;

public class binary_serch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tar = sc.nextInt();   // Target element
        int num = sc.nextInt();   // Size of array

        int[] arr = new int[num];

        // Input array elements
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int lo = 0;
        int hi = arr.length - 1;
        int idx = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] > tar) {
                hi = mid - 1;
            } else if (arr[mid] < tar) {
                lo = mid + 1;
            } else {
                idx = mid;
                break;
            }
        }

        System.out.println(idx);
    }
}