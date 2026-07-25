package sort;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
//        int[] arr ={2,5,6,3,4,125,-8};
//        int n = arr.length;
//
//        for (int i=0;i<n-1;i++){
//            int min=Integer.MAX_VALUE;
//            int mindx=-1;
//            for (int j=i;j<n;j++){
//                if (arr[j]<min){
//                    min=arr[j];
//                    mindx=j;
//                }
//            }
//            int temp=arr[i];
//            arr[i]=arr[mindx];
//            arr[mindx]=temp;
//
//        }
//        System.out.println(Arrays.toString(arr)+" ");
        int[] arr ={2,5,6,3,4,125,-8};
        int n = arr.length;

        for (int i=arr.length;i>=0;i--){
            int min=Integer.MIN_VALUE;
            int mindx=-1;
            for (int j=i;j<n;j++){
                if (arr[j]< min){
                    min=arr[j];
                    mindx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;

        }
        System.out.println(Arrays.toString(arr)+" ");
    }
}
