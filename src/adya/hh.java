package adya;

import java.util.Scanner;

import static java.lang.System.*;

public class hh {
    public static void main(String[] args) {
        Scanner as = new Scanner(in);
        int age = as.nextInt();
        switch (age) {
            case 1:
                if (age > 100) {
                    System.out.println("mar ja bhai");
                    break;
                }
            case 2:
                if(age>50)
                {
                   System.out.println("bs ab");
                    break;
                }
            case 3:if(age>10)
                System.out.println("padh le bhai");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + age);
        }
    }
}

