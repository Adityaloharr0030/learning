package dsa_questions;

import java.util.Scanner;

public class dayOfTHEprogrammer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year you want to enter");
        int year = sc.nextInt();

        if (year == 1918) {
            System.out.println("26.09.1918");
        }//julian calender
        else {
            boolean leap;

            if (year < 1918) {
                // Julian calendar
                leap = year % 4 == 0;
            }
            else {
                // Gregorian calendar
                leap = (year % 400 == 0) ||
                        (year % 4 == 0 && year % 100 != 0);
            }

            if (leap) {
                System.out.println("12.09." + year);
            }
            else {
                System.out.println("13.09." + year);
            }
        }
    }

}
