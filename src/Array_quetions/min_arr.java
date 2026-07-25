package Array_quetions;

public class min_arr {
    public static void main(String[] args) {
        int [] arr = {1,-50,-5,10,5};
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) min = arr[i];
        }
        System.out.println("minimum number is :"+min);
    }
}
