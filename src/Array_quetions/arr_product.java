package Array_quetions;

public class arr_product {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int product = 1;
        for (int element : arr) {
            product *= element;

        }
        System.out.printf("the product of sum is : %5d", product);
    }
}
