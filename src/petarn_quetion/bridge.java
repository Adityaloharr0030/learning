package petarn_quetion;

/*
import java.util.Scanner;

public class bridge {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1;i<=n*2;i++) {
            System.out.print("* ");

        }
        //lines
            for (int i1=1;i1<=n;i1++){
                //left
                for (int j=n;j>=i1;j--){
                    System.out.print("* ");
                }
                //space
                for (int k=1;k<=(2*i1-1);k++){
                    System.out.print(" ");
                }
                for (int u=n;u>=i1;u--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

}
*/
import java.util.Scanner;

public class bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Top row
        for (int i = 1; i <= n * 2+1; i++) {
            System.out.print("* ");
        }
        System.out.println(); // ✅ FIX 1

        // Pattern
        for (int i = 1; i <= n; i++) {

            // Left stars
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }

            // Spaces
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("  "); // ✅ FIX 2 (double space)
            }

            // Right stars
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
