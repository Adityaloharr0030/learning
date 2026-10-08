package dsa_questions;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter target : ");
        int target=sc.nextInt();


        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();



                int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
//            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
      Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int left=0,right=arr.length-1;
        boolean flag=false;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println("pair found " + arr[left] + " + " + arr[right]+" = "+target);
                flag=true;
                break;
            }
            else if(sum>target){
                right--;
            }  else {
                left++;
            }

//        System.out.println("Array elements:");
//        for (int num : arr) {
//            System.out.print(num + " ");
//
//        }

        }
    }
}
