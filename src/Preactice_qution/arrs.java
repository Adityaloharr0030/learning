package Preactice_qution;

import java.sql.SQLOutput;
import java.util.Scanner;

public class arrs {
    public static void main(String[] args) {
//        //Write a program to find the maximum and minimum elements in an array.
//        int num[] ={10, 20, 6, 80,99};
//        int max=num[0];
//        int min =num[0];
//        for (int i=1;i<num.length;i++){
//            if (num[i]>max){
//             max=num[i];
//            } else if (num[i]<min) {
//                min=num[i];
//            }
//        }
//        System.out.println("max number is : "+max);
//        System.out.println("min number is : "+min);
        //Write a program to reverse an array.
//        int rev[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        System.out.println("og arr");
//        for (int i = 0; i < rev.length; i++) {
//            System.out.print(rev[i] + " ");
//        }
//        int start = 0;
//        int end = rev.length - 1;
//        System.out.println();
//        while (start < end) {
//            int temp = rev[start];
//            rev[start] = rev[end];
//            rev[end] = temp;
//            start++;
//            end--;
//        }
//        System.out.println("\nrevers arr");
//        for (int i = 0; i < rev.length; i++) {
//            System.out.print(rev[i] + " ");
//
//        }

//        //Write a program to search an element in an array using linear search.
//        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number u want to search");
//        int key =sc.nextInt();
//        boolean found=false;
//        int pos=-1;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==key){
//                found=true;
//                pos=i;
//                break;
//            }
//        }
//        if (found){
//            System.out.println("Element "+key+" found at index "+pos);
//        }else {
//            System.out.println("element "+key+" not found in the arrey.");
//        }
        //Write a program to implement binary search
//        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number u want to search");
//        int key =sc.nextInt();
//
//        int low=0;
//        int high=arr.length-1;
//        boolean found=false;
//        int pos=-1;
//
//
//
//        while (low<=high){
//            int mid= (low+high)/2;
//            if (arr[mid]==key){
//                found=true;
//                pos=mid;
//                break;
//            } else if (arr[mid]<key) {
//                low=mid+1; // search in right half
//            }else {
//                high=mid-1;//search for left half
//            }
//
//        }
//        if (found){
//            System.out.println("Element "+key+" found at index "+pos);
//        }else {
//            System.out.println("element "+key+" not found in the arrey.");
//        }
   //Write a program to add two matrices.
        int a[][]={
                {24,56,77},
                {55,66,99},
                {23,45,68}
        };
        int b[][]={
                {90,20,23},
                {50,34,50},
                {30,49,12}
        };
        int sum[][]= new int[3][3];
        for (int i =0;i<3;i++){
            for (int j=0;j<3;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("the result of matrix after addition");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
