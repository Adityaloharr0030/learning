package dsa;

public class grideq {
    public static int grideWays(int i,int j, int n,int m){
        //base case
        if (i==n-1 && j ==m-1){
            return 1;
        }else if (i==n || j ==n){
            return 0;
        }
        int w1= grideWays(i+1, j, n, m);
        int w2=grideWays(i, j+1, n, m);
        return w1+w2;
    }

    public static void main(String[] args) {
        int n=10, m=10;
        System.out.println(grideWays(0,0,n,m));
    }
}
//time complexcity is exponetial
