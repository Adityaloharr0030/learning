package adya;

import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
/*int [] m={2,4,6,8};
        System.out.println(Arrays.toString(m));
        for (int element:m){
            System.out.println(element);
        }
        int [] w= new int[5];;
        w [0]=100;;
        System.out.println(w[0]);*/
        int[] []c =new int[2][3];
        c[0][0]=101;
        c[0][1]=102;
        c[0][2]=103;
        c[1][0]=201;
        c[1][1]=202;
        c[1][2]=203;
        for(int[] element:c){
            System.out.println(Arrays.toString(element));
            System.out.println(" ");
        }
        System.out.println();
    }
}
