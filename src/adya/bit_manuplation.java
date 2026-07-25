package adya;

import java.awt.desktop.ScreenSleepEvent;

public class bit_manuplation {
    public static void even_odd(int n) {
        int b = 1;
        if ((n & b) == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }

    public static int get_ithn_bit(int n, int i) {
        int ithbit = 1 << i;
        if ((n & ithbit) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int set_ith_bit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clear_ith_bit9int(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int update_ith_bit(int n, int i, int newbit) {
        if (newbit == 0) {
            return clear_ith_bit9int(n, i);
        } else {
            return set_ith_bit(n, i);
        }
        //OR
//    n =clear_ith_bit9int(n,i);
//        int bitmax =newbit<<i;
//        return n|bitmax;
    }

    public static int clear_i_bits(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static int clear_range_of_bits(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static boolean ispoweoftwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countsetbits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
 public static int FastExpo(int a,int n){
        int ans = 1;
        while (n>0){
            if ((n & 1)!=0){
                ans =   ans*a;
            }
            a=a*a;
            n= n>>1;
        }
        return ans;
 }
    public static void main(String[] args) {
//        even_odd(2);
//        even_odd(5);
//        even_odd(9);
//        System.out.println(get_ithn_bit(10, 3));
        // System.out.println(set_ith_bit(10, 2));
        // System.out.println(clear_ith_bit9int(10, 1));
        // System.out.println(update_ith_bit(10, 2, 1));
        // System.out.println(clear_i_bits(15, 2));
        //System.out.println(clear_range_of_bits(10, 2, 4));
        //  System.out.println(ispoweoftwo(18));
        //  System.out.println(countsetbits(16));
        System.out.println(FastExpo(5,3));
    }
}
