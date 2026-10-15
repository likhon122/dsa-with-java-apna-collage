public class DiagonalSum {

    public static void diagonalSum(int[][] matrix){

        // Time complexity is O(n^2)
//        int sum = 0;
//        for(int i = 0; i<matrix.length; i++){
//            for(int j = 0; j< matrics.length; j++){
//                if(i == j){
//                    sum+=matrix[i][j];
//                }else if(i+j == matrix.length-1){
//                    sum+= matrix[i][j];
//                }
//            }
//        }

        // Time complexity is O(n)
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++){
            // Add when every pair is similar
            sum+= matrix[i][i];
            // Calculate j = matrics.length -1 -i
            int j = n-1-i;
            // Calculate the sum without the odd diagonal like 3X3 matrix
            if(i != j){
                sum+= matrix[i][j];
            }
        }

        System.out.println("Total diagonal Sum: " + sum);

    }

    static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        diagonalSum(matrix);

    }
}
