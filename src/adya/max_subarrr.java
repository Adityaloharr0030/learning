package adya;
import javax.swing.*;
import java.util.*;
public class max_subarrr {
    public static void max_sub(int num[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += num[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }

        }
        System.out.println(" max sum = " +maxsum);
    }

    public static void main(String[] args) {
        int num[] = {-2,4,7,-5,9};
        max_sub(num);
    }
}