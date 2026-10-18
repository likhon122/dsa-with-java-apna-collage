
public class SortedMatrix {

    public static boolean stairSearch(int[][] matrix, int key) { // Time complexity is O(n+m) -> n is matrix.length and m is matrix[0].length
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key found at index (" + row + "," + col + ")");
                return true;
            }
            if (matrix[row][col] > key) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        stairSearch(matrix, 15);
    }
}
