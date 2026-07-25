package dsa;

public class RecursionBacics {
    public static void printdec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printdec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    //calculating factors
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnml = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    //print nth number
    public static int calsSum(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = calsSum(n - 1);
        int sn = n + snm1;
        return sn;
    }

    // calculating fibonacho nth
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    // check given array is sorted or not.
    public static boolean issortd(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return issortd(arr, i + 1);
    }

    // waf to find first occurence of an element in an array
    public static int first0ccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;

        }
        return first0ccurence(arr, key, i + 1);
    }

    //waf to find the last occurence of an element in an array
    public static int last0ccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = last0ccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;

        }
        return isFound;
    }

    // to print X^n
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xnm1 = power(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }

    // print x^n in o(logn)
    public static int optimizePower(int x, int n) {
        if (n == 0) {
            return 1;

        }
        int halfPower = optimizePower(x, n / 2);
        int halfPowersq = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowersq = x * halfPowersq;
        }
        return halfPowersq;
    }

    //tilling problem
    //given a "2Xn" board and tilles of size "2x1", count the num of way
    //to tile the given board using the 2x1 tile.
    //(a till either be placed horizontally or vertically.)
    public static int tillProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        //kaam
        //verticall choice
        int fnm1 = tillProblem(n - 1);
        //horizontal choice
        int fnm2 = tillProblem(n - 2);
        int totWays = fnm1 + fnm2;
        return totWays;
    }

    // remove duplicates in a string "adityalohar"
    public static void removedublicates(String str, int idx, StringBuilder newstr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        //kaam
        char curchar = str.charAt(idx);
        if (map[curchar - 'a'] == true) {
            removedublicates(str, idx + 1, newstr, map);
        } else {
            map[curchar - 'a'] = true;
            removedublicates(str, idx + 1, newstr.append(curchar), map);
        }
    }

    //friends pairing problem
    // given n friends , each can remain sigle or can be paired up with some other friend. each friend can be paire only once . find out the total number of ways in which friends can remain sigle or can be paired up.
    public static int frindsPairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        //choice
        //sigle
//    int fnm1 = frindsPairs(n-1);
//        int fnm2 = frindsPairs(n-2);
//        int pairWaya =(n-1)*fnm2;
//        int totWays = fnm1 +pairWaya;
//        return totWays;
        //or
        return frindsPairs(n - 1) + (n - 1) * frindsPairs(n - 2);
    }

    //binary stringe problem
    //print all binary stringe of size N without consecutive ones
    public static void printBinStringe(int n, int lastplace, String str) {
        // base cASE
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinStringe(n - 1, 0, str + "0");
        if (lastplace == 0) {
            printBinStringe(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        int n = 26;
        //  printdec(n);
        //printInc(n);
        //System.out.print( "\n"+fact(n));
        // System.out.println(calsSum(n));
        // System.out.println(fib(34));
//        int arr[]= {1,2,8,4};
//        System.out.println(issortd(arr,0));
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        // System.out.println(first0ccurence(arr, 5, 0));
        // System.out.println(last0ccurence(arr,5,0));
        //   System.out.println(power(2, 5));
        // System.out.println(optimizePower(10, 2));
        // System.out.println(tillProblem(9));
        String str = "adityalohar";
        // removedublicates(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(frindsPairs(3));
        printBinStringe(9, 0, "");
    }
}
