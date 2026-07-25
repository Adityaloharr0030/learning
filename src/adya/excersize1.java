package adya;

import java.util.Scanner;
import java.math.MathContext;

public class excersize1 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.printf("Enter sub1 marks");
        float sub1 = ad.nextFloat();
        System.out.printf("Enter su2 marks");
        float sub2 = ad.nextFloat();
        System.out.printf("Enter sub3 marks");
        float sub3 = ad.nextFloat();
        float obtendm = sub1 + sub2 + sub3;
        System.out.println("total marks obtend student is" + obtendm);
        System.out.println("Enter total marks");
        int totalm = ad.nextInt();
        float percent = (obtendm / totalm) * 100;
        System.out.println("the sudent got" + percent);


    }
}
