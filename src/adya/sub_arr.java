package adya;

public class sub_arr {
    public static void printsubarr(int num[]) {
        int ts=0;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                int sum=0;
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " ");
                    sum+=num[k];

                }
                ts++;
                System.out.println("sum = "+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts+" total sub arry");
    }

    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        printsubarr(num);
    }
}
