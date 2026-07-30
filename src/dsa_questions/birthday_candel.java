package dsa_questions;

public class birthday_candel {
    public static void main(String[] args) {
        int n=4;
        int count =0;
        int [] arr={3,2,1,3};
        int max=Integer.MIN_VALUE;
        for (int ele : arr) {
            if (ele > max) {
                max = ele;
                count = 1;
            } else if (ele == max) {
                count++;
            }
        }
        System.out.println(count);
       // System.out.println(max);
    }
}
