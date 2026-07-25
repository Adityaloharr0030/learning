package adya;

public class max_sub_arr2 {
    public static void prifix_max(int num[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prifix[]=new int [num.length];
        prifix[0]=num[0];
        for (int  i=1;i<prifix.length;i++){
            prifix[i]=prifix[i-1]+num[i];

        }
        for (int i=0;i<num.length;i++){
            int start =i;
            for (int j=i;j<num.length;j++){
                int end=j;
                currsum=start==0 ? prifix[end]:prifix[end]-prifix[start-1];
                if (maxsum<currsum){
                    maxsum=currsum;
                }

            }
        }
        System.out.println("max sum : "+maxsum);
    }
    public static void main(String[] args) {
        int num[]={1,3,5,-7};
       prifix_max(num);
    }
}
