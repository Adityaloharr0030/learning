package Array_quetions;


public class change_arr {
    public static void change(int[] arr){
       /* int x[]=arr;
        for(int i=0;i<arr.length;i++){
            x[i]=arr[i];*/
        arr[2]=50;
        }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(arr[2]);
      //  arr[2]=50;
       change(arr);
        System.out.println(arr[2]);
    }
}
