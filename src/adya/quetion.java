package adya;

public class quetion {
    public static int trap_water(int hight[]) {
//        given n non-nagative integer representing an elevation map
//        where the width of each bar is 1, complute how much water it can
//        after rainin  haight=[4,2,0,6,3,2,5]
  int n=hight.length;
    int leftmax[]=new int [hight.length];
    leftmax[0]=hight[0];
    for (int i=1; i<hight.length;i++) {
        leftmax[i] = Math.max(hight[i], leftmax[i - 1]);

    }
    int rightmax[]= new int[n];
    rightmax[n-1]=hight[n-1];
    for (int i=n-2;i>=0;i--){
        rightmax[i]=Math.max(hight[i], rightmax[i+1]);
    }
    int trappwater=0;
    for (int i=0;i<n;i++){
        int waterlevel=Math.min(leftmax[i],rightmax[i]);
        trappwater += waterlevel-hight[i];


    }
    return trappwater;
    }

    public static void main(String[] args) {
        int hight[]={4,2,0,6,3,2,5};
        System.out.println(trap_water(hight));

    }
}
