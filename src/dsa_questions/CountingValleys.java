package dsa_questions;

import java.util.Scanner;

public class CountingValleys {

    public static int countValleys(String path) {

        int altitude = 0;
        int valleyCount = 0;

        for (char step : path.toCharArray()) {

            if (step == 'U') {
                altitude++;

                // Hiker has come back to sea level
                // after being below sea level.
                if (altitude == 0) {
                    valleyCount++;
                }

            } else if (step == 'D') {
                altitude--;
            }
        }

        return valleyCount;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input:
        // 8
        // UDDDUDUU
        int steps = scanner.nextInt();
        String path = scanner.next();

        // Validate input
        if (path.length() != steps) {
            System.out.println("Invalid input: steps do not match path length.");
            scanner.close();
            return;
        }

        int result = countValleys(path);

        System.out.println("Number of valleys: " + result);

        scanner.close();
    }
}