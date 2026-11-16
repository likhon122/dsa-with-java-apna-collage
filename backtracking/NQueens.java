package backtracking;

import java.util.Arrays;

public class NQueens { // Time complexity O(n!)

    // Check is safe to place each single queen
    static boolean isSafe(char[][] board, int row, int col){
        // Check horizontal up
        for (int i = row-1; i >= 0; i--){
            if(board[i][col] == 'Q') return false;
        }
        // Check diagonal Right
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--,j--){
            if(board[i][j] == 'Q') return false;
        }
        // Check diagonal Left
        for (int i = row -1, j = col+1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q') return false;
        }

        // If not exit any Queen then return true to place safe
        return true;
    }

    // Print possible ways
    static void nQueens(char[][] board, int row){
        // Base case
        if(board.length == row){
           printBoard(board);
            return;
        }

        // Travel every row
        for (int j =0; j < board.length; j++){
            // Self work
            // First check the place is safe to place queen. Check vertical up, diagonal right, diagonal left if safe then place the queen
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                // Recursive work
                nQueens(board,row+1);

                // Backtracking
                // remove previous row queen then add new queen to the row becouse in one row can have one single queen
                board[row][j] = 'x';
            }
        }
    }

    // Calculate Count of the Possible ways to place queens
    static int count = 0;
    static int nQueensCount(char[][] board, int row){
        // Base case
        if(board.length == row){
            count ++;
            return count;
        }

        // Travel every row
        for (int j =0; j < board.length; j++){
            // Self work
            // First check the place is safe to place queen. Check vertical up, diagonal right, diagonal left if safe then place the queen
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                // Recursive work
                nQueensCount(board,row+1);

                // Backtracking
                // remove previous row queen then add new queen to the row becouse in one row can have one single queen
                board[row][j] = 'x';
            }
        }

        return count;
    }

    // Print just first possible solution
    static boolean printFirstNQueen(char[][] board, int row){
        if(row == board.length){
            return true;
        }

        for (int j = 0; j < board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                if (printFirstNQueen(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'x';
            }
        }

        return false;
    }

    // Print board
    static void printBoard(char[][] board){
        System.out.println("============== Safe To place ============");
        for (char[] chars : board) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }


    static void main(String[] args) {
      int n = 4;
      char[][] board = new char[n][n];

      for (char[] chars : board){
          Arrays.fill(chars,'x');
      }

//        System.out.println(nQueensCount(board,0));
        if(printFirstNQueen(board,0)){
            System.out.println("Solution possible");
            printBoard(board);
        }else {
            System.out.println("Solution is not possible.");
        }
    }
}
