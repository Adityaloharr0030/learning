package dsa;

public class backTraking {
    public static void chengearr(int arr[],int i , int val){
//base kase
        if (i==arr.length){
            printarr(arr);
            return;
        }
        //kam or recurgiom
        arr[i]=val;
        chengearr(arr,i+1,val+1 );
        arr[i]= arr[i]-2;
    }
    public static void printarr(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
public static void findSubset(String str, String ans , int i){
        // base case
    if (i==str.length()){
        if (ans.length()==0){
            System.out.println("null");
        }
        System.out.println(ans      );

        return;
    }
    //coice yes
    findSubset(str, ans+str.charAt(i), i+1);
    // no choice
    findSubset(str, ans, i+1);
}
public static void permantion(String str,String ans){
        //base case
    if (str.length()==0 ){
        System.out.println(ans  );
        return;
    }
    //recursion -0(n)
    for (int i =0;i<str.length();i++){
        char curr = str.charAt(i);
        String Newstr =str.substring(0,i)+str.substring(i+1);
        permantion(Newstr,ans+curr);
    }
}
    public static void main(String[] args) {
//int arr[]=new   int [5];
//chengearr(arr,0,1);
//printarr(arr);
   String str ="abc";
//        findSubset(str,"",0);
        permantion(str,"");

    }
}
