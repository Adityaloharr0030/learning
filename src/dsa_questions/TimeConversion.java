package dsa_questions;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String period = s.substring(8);
        int hour = Integer.parseInt(s.substring(0, 2));
        String time = s.substring(2, 8);

        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour = hour + 12;
            }
        }

        System.out.println(String.format("%02d", hour) + time);

        sc.close();
    }
}