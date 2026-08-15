package dsa_questions;


import java.util.Scanner;

public class CatAndMouse {
    static String catAndMouse(int x, int y, int z) {
        int disA = Math.abs(x - z);
        int disB = Math.abs(y - z);

        if (disA < disB)
            return "Cat A";

        if (disA > disB)
            return "Cat B";

        return "Mouse C";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            System.out.println(catAndMouse(x, y, z));
        }


    }
}
