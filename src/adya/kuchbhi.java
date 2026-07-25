package adya;

import java.util.Scanner;

public class kuchbhi {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int age = as.nextInt();
        switch (age) {
            case 1:

                System.out.println("mar ja bhai");
                break;

            case 2:


                System.out.println("bs ab");
                break;

            case 3:
                System.out.println("padh le bhai");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + age);
        }
    }
}
