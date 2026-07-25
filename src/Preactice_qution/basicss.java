package Preactice_qution;

import java.util.Scanner;

public class basicss {
    public static void main(String[] args) {
//        // Write a program to print "Hello, World!" in Java.
//        System.out.println(" hellow , world");
//        // Write a program to take a number as input and print its square.
//        System.out.println("enter the number u want's square : ");
        Scanner sc = new Scanner(System.in);
      //  int n = sc.nextInt();
//        n = n * n;
//
//        System.out.println("sq is " + n);
//        //   Write a program to swap two numbers without using a third variable.
//        int a = 10;
//        int b = 2;
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("a is "+a+" b is "+b);
//       // Write a program to check whether a number is even or odd.
//        System.out.println("ether the number : ");
//        int num=sc.nextInt();
//
//        if (num%2==0){
//            System.out.println("even number :"+num);
//        }else {
//            System.out.println("odd number :"+num);
//        }
      //  Write a program to calculate the simple interest.
        System.out.println("we are calculating intrest");
        System.out.println("enter the principle, rate, year : ");
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double y=sc.nextDouble();
        double si=(p*r*y)/100;
        System.out.println("the intrest is : "+si);

    }
}

