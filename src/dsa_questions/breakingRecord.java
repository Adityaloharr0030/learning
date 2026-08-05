package dsa_questions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class breakingRecord {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int highest = scores.get(0);
        int lowest = scores.get(0);
        int highestBreaks = 0;
        int lowestBreaks = 0;

        for (int i = 1; i < scores.size(); i++) {
            int score = scores.get(i);

            if (score > highest) {
                highest = score;
                highestBreaks++;
            } else if (score < lowest) {
                lowest = score;
                lowestBreaks++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(highestBreaks);
        result.add(lowestBreaks);
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String[] scoresTemp = bufferedReader.readLine().trim().split("\\s+");
        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            scores.add(Integer.parseInt(scoresTemp[i]));
        }

        List<Integer> result = breakingRecords(scores);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));
            if (i < result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
