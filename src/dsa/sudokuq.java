package dsa;

public class sudokuq {

    // 1. Added missing isSafe method to check rules of Sudoku
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // Check column
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // Check row
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // Check 3x3 grid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true; // Safe to place
    }

    public static boolean sudokusolver(int sudoku[][], int row, int col) {
        // 2. Base case: If we reach row 9, we have solved the board
        if (row == 9) {
            return true;
        }

        // Calculate next cell's row and column
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // 3. Skip cells that are already filled with a number
        if (sudoku[row][col] != 0) {
            return sudokusolver(sudoku, nextRow, nextCol);
        }

        // 4. Try placing digits (Fixed syntax: digit++)
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;

                if (sudokusolver(sudoku, nextRow, nextCol)) { // Solution exists
                    return true;
                }

                sudoku[row][col] = 0; // Backtracking step
            }
        }

        // 5. Missing return statement: If no digit 1-9 works, return false
        return false;
    }

    // Helper method to print the board nicely
    public static void printBoard(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = {
                {0, 0, 8, 0, 0, 0, 0, 0, 0},
                {4, 9, 0, 1, 5, 7, 0, 0, 2},
                {0, 0, 3, 0, 0, 4, 1, 9, 0},
                {1, 8, 5, 0, 6, 0, 0, 2, 0},
                {0, 0, 0, 0, 2, 0, 0, 6, 0},
                {9, 6, 0, 4, 0, 5, 3, 0, 0},
                {0, 3, 0, 0, 7, 2, 0, 0, 4},
                {0, 4, 9, 0, 3, 0, 0, 5, 7},
                {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };

        // 6. Execute the solver and print results
        if (sudokusolver(sudoku, 0, 0)) {
            System.out.println("Solution exists! Here is the solved board:\n");
            printBoard(sudoku);
        } else {
            System.out.println("No solution exists for this Sudoku board.");
        }
    }
}