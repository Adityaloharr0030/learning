package dsa_questions;

import java.util.ArrayList;
import java.util.Collections;

public class selseByMatch {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        Collections.addAll(ar, 10, 20, 20, 10, 10, 30, 50, 10, 20);

        Collections.sort(ar);

        int pairs = 0;

        for (int i = 0; i < ar.size() - 1; i++) {

            if (ar.get(i).equals(ar.get(i + 1))) {
                pairs++;
                i++;
            }
        }

        System.out.println(pairs);

    }
}
