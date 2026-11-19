package backtracking;

public class SudokuSolver {

    static boolean isSafe(int[][] sudoku, int digit, int row, int col){

        // Check exist in row
        for (int i = 0; i <= 8; i++){
            if(sudoku[row][i] == digit) return false;
        }

        // Check exist in column
        for (int i = 0; i <= 8; i++){
            if(sudoku[i][col] == digit) return false;
        }

        // Check exist in the grid
        int sr = (row / 3) * 3;
        int sc = (col/3) * 3;

        for (int i = sr; i < sr + 3; i++){
            for (int j = sc; j < sc + 3; j++){
                if(sudoku[i][j] == digit) return false;
            }
        }

        return true;
    }

    static boolean sudokuSolver(int[][] sudoku, int row, int col){
        // Base case
        if(row == 9){
            return true;
        }

        // Find next row and next column
        int nextRow = row, nextColumn = col + 1;
        if(nextColumn == 9){
            nextRow = row + 1;
            nextColumn = 0;
        }

        // If the sudoku index already have value then call for next index
        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku,nextRow,nextColumn);
        }

        for (int digit = 1; digit <= 9; digit++){
            // Check digit is safe to place
            if(isSafe(sudoku,digit,row,col)){
                // If safe then place it
                sudoku[row][col] = digit;
                // Call for next index
                if(sudokuSolver(sudoku,nextRow,nextColumn)){ // Solution exist
                    return true;
                }
                // If solution is not exist with the digit then backtrack and try for other digits
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    static void printSudoku(int[][] sudoku){
        for (int[] ints : sudoku) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        int[][] sudoku = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if(sudokuSolver(sudoku,0,0)){
            System.out.println("Solution Exist");
            printSudoku(sudoku);
        }else {
            System.out.println("Solution Does not exist");
        }

    }
}
