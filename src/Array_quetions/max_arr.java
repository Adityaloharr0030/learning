package Array_quetions;

public class max_arr {
    public static void main(String[] args) {
        int [] arr = {1,50,3,10,5};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];

        }
        System.out.println("max number is :"+max);
    }
}
