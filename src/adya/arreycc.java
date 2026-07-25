package adya;

import java.util.*;

public class arreycc {
    public static int getter_num(int num[]) {
        int largesr = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largesr < num[i]) {
                largesr = num[i];
            }
            if (small > num[i]) {
                small = num[i];
            }
        }
        System.out.println(" small value is " + small);
        return largesr;
    }


    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.println("largest number is : " + getter_num(num));

    }
}
