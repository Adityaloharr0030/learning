package sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubble_sort {

    public static void main(String[] args) {
//        int[] arr={5,400,80,100};
//        int n=arr.length;
//        for (int i=0;i<n-1;i++){
//            int swap=0;
//        for (int j=0;j<n-1-i;j++){
//            if(arr[j]>arr[j+1]){
//                int temp=arr[j];
//                arr[j]=arr[j+1];
//                arr[j+1]=temp;
//                swap++;
//            }
//
//        }
//if (swap==0)
//{
//    System.out.printf("allredy ");
//}break;
//    }
//        System.out.println(Arrays.toString(arr)+" ");




        // reverse sort
        int[] arr={5,400,80,100};
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            int swap=0;
            for (int j=0;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }

            }
            if (swap==0)
            {
                System.out.printf("allredy ");
                break;
            };
        }
        System.out.println(Arrays.toString(arr)+" ");
}
}