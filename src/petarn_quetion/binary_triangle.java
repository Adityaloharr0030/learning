package petarn_quetion;

import java.util.Scanner;

public class binary_triangle {
    public static void main(String[] args) {


            Scanner a = new Scanner(System.in);
            int n = a.nextInt();

            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= i; j++) {
                    if ((i + j) % 2 == 0){
                        System.out.print("1" + "  ");
                }if ((i + j) % 2 == 1){
                        System.out.print("0"+" ");
                    }

                }

                System.out.println();
            }
        }
    }


