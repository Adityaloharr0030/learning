package dsa_questions;

import java.io.*;
import java.util.*;

class Result {

    public static void bonAppetit(List<Integer> bill, int k, int b) {

        int total = 0;

        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                total += bill.get(i);
            }
        }

        int annaShare = total / 2;

        if (b == annaShare) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - annaShare);
        }
    }
}

public class restorent {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String[] first = br.readLine().split(" ");

        int n = Integer.parseInt(first[0]);
        int k = Integer.parseInt(first[1]);

        String[] items = br.readLine().split(" ");

        List<Integer> bill = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            bill.add(Integer.parseInt(items[i]));
        }

        int b = Integer.parseInt(br.readLine());

        Result.bonAppetit(bill, k, b);

        br.close();
    }
}
