package dsa_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> grades = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            grades.add(sc.nextInt());
        }

        for (int grade : gradingStudents(grades)) {
            System.out.println(grade);
        }
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<Integer>();

        for (int grade : grades) {
            roundedGrades.add(roundGrade(grade));
        }

        return roundedGrades;
    }

    private static int roundGrade(int grade) {
        if (grade < 38) {
            return grade;
        }

        int nextMultiple = ((grade / 5) + 1) * 5;
        return nextMultiple - grade < 3 ? nextMultiple : grade;
    }
}
