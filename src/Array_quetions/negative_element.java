package Array_quetions;

public class negative_element {
    public static void main(String[] args) {
        int arr[]= {1,2,-3,4,-5};
        for (int ele: arr){
            if (ele<0){
                System.out.println(ele);
            }
        }
    }
}