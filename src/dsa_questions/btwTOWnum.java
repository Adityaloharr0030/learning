package dsa_questions;

import java.util.List;

public class btwTOWnum {
    public static int getTotalx(List<Integer> a, List<Integer> b) {
        int count = 0;
        //find maxim number in a
        int max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) > max) {
                max = a.get(i);
            }
        }
        //find minimum  nuber in b
        int min = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            if (b.get(i) < min) {
                min = b.get(i);
            }
        }
        //check every number from max to min
        for (int i = max; i < min; i++) {
            boolean valid = true;
            //condition 1: every ele from max to min
            for (int j = 0; j < a.size(); j++) {
                if (i % a.get(j) != 0) {
                    valid = false;
                    break;
                }
            }
            //condition 2 : i shoulde diivide every ele in b
            if (valid) {
                for (int j = 0; j < b.size(); j++) {
                    if (b.get(j) % i != 0) {
                        valid = false;
                        break;
                    }
                }
            }
            if (valid) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(2, 4);
        List<Integer> b = List.of(16, 32, 96);

        System.out.println(getTotalx(a, b));
    }
}
