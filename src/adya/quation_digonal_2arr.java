package adya;

public class quation_digonal_2arr {
    public static int sumOfdigonal(int matrix[][]) {
        int sum = 0;
//    for(int i=0; i<matrix.length; i++   ){
//        for (int j=0;j<matrix[0].length;j--) {
//            if (i==j){
//                sum+=matrix[i][i];
//
//            }else if (i+j == matrix.length-1){
//                sum+=matrix[i][j];
//            }
//
//        }
//    }
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];

            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }

    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.printf("found key(" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println(" key not found!");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
//        sumOfdigonal(matrix);
//        System.out.println(" sum of diagonal :" + sumOfdigonal(matrix));
        int key = 14;
        staircaseSearch(matrix, key);
    }
}
