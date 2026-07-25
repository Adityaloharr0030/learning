package adya;

public class newbin {
    public class binaryF {

        public static void bintodec(int binnum) {
            int mynum = binnum;
            int pow = 0;
            int decnum = 0;
            while (binnum > 0) {
                int lastdigit = binnum % 10;
                decnum = decnum + (lastdigit * (int) Math.pow(2, pow));
                pow++;
                binnum = binnum / 10;
            }
            System.out.println("decimal of " + mynum + " = " + decnum);
        }

        public static void dectibin(int n) {
            int mynum = n;
            int pow = 0;
            int bin = 0;
            while (n > 0) {
                int rem = n % 2; // Fixed: was '2 % n', should be 'n % 2'
                bin = bin + (rem * (int) Math.pow(10, pow)); // Fixed: incorrect syntax
                pow++;
                n = n / 2;
            }
            System.out.println("binary form of " + mynum + " = " + bin);
        }

        public static void main(String[] args) {

            {
                dectibin(12);
                bintodec(1100);
            }
        }}}


