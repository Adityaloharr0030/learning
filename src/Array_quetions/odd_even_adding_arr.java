package Array_quetions;

public class odd_even_adding_arr {
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50,60,70,80,90,100};
                for ( int i = 0; i < arr.length; i++ ) {
                    if (arr[i]%2==0){
                        arr[i]+=10;
                    }else{arr[i]*=2;}
                    System.out.print(arr[i]+" ");
                }

    }
}
