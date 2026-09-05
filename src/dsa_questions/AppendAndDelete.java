package dsa_questions;
import java.util.*;
public class AppendAndDelete {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int k = sc.nextInt();

            long[] freq = new long[k];

            // Empty prefix sum = 0
            freq[0] = 1;

            long prefixSum = 0;
            long answer = 0;

            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();

                prefixSum += value;

                long remainder = prefixSum % k;

                // Handle negative values
                if (remainder < 0) {
                    remainder += k;
                }

                // Every previous prefix with same remainder
                // creates one valid subarray
                answer += freq[(int) remainder];

                freq[(int) remainder]++;
            }

            System.out.println(answer);

            sc.close();
        }
    }

