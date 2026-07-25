package Preactice_qution;

import java.util.Scanner;

public class Opretion_n_Cantrol {
    public static void main(String[] args) {
        System.out.println("enter the number : ");
        //Write a program to find the largest of three numbers using if-else.
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int a=sc.nextInt();
//        int b= sc.nextInt();
//        int c=sc.nextInt();
//        if (a>b||a>c){
//            System.out.println("a is largest number ");
//        } else if (b>c) {
//            System.out.println("b is largest number");
//        }else {
//            System.out.println("c is largest number");
//        }
        //Write a program to check whether a year is a leap year.
//        int year=sc.nextInt();
//        if (year%400==0||(year%4==0&&year%100==0)){
//            System.out.println("the year is leap year : "+year);
//        }else {
//            System.out.println("the year is not leap year : "+year);
//        }
        //Write a program to display the multiplication table of a number using for loop.
//        int table = sc.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(+table + "X" + i + "=" + table * i);
//        }
//Write a program to print the reverse of a number using while loop.
//        int i=10;
//        while ( i>=1){
//            System.out.println(i);
//            i--;
//        }
       // Write a program to find the sum of natural numbers up to n
       int sum=0;
        for (int i=1;i<=10;i++){
            sum= sum+i;

        }
        System.out.println( sum);
    }
}
