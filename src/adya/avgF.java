package adya;

import java.util.Scanner;




public class avgF {
    public static String av(int n, int y, int x) {

        System.out.print("enter value");
        int avrege = n + y+ x / 3;
        System.out.printf("the averege of 3 numers: " +avrege);
        return null;
    }
        public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
            System.out.println("enter value: ");
            av(sc.nextInt(), sc.nextInt(), sc.nextInt());

    }

}
