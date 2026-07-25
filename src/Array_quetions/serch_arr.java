package Array_quetions;

import java.util.Scanner;

public class serch_arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int serch=sc.nextInt();
        boolean found = false;
        int arr[] = {12,55,88,101,60};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==serch){
                System.out.print("the number is in array at arrays index:"+i);
                found=true;
                break;}
        }
            if (!found)System.out.println("the number is not in array!!!");

    }
}