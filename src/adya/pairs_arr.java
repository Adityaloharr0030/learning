package adya;

public class pairs_arr {
    public static void pairses(int num[]){
        int tp=0;
        for (int i=0;i<num.length;i++){
            int curt=num[i];
            for (int j=i+1;j<num.length;j++){
                System.out.print("("+curt+","+num[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairse" +tp);

    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        pairses(num);
    }
}
