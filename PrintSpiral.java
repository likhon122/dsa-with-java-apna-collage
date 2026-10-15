
public class PrintSpiral {

    public static void printSpiral(int[][] metrics) {
        int startRow = 0;
        int endRow = metrics.length - 1;
        int startCol = 0;
        int endingCol = metrics[0].length - 1;

        while (startRow <= endRow && startCol <= endingCol) {
            // Print start row
            for (int i = startCol; i <= endingCol; i++) {
                System.out.print(metrics[startRow][i] + " ");
            }
            startRow++; // Increase the start row

            // Print End column
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(metrics[i][endingCol] + " ");
            }
            endingCol--; // Decrease the end row

            // Print end Row
            for (int i = endingCol; i >= startCol; i--) {
                System.out.print(metrics[endRow][i] + " ");
            }
            endRow--; // Decrease the end Row

            // Print Start Column
            for (int i = endRow; i >= startRow; i--) {
                System.out.print(metrics[i][startCol] + " ");
            }
            startCol++;
        }
    }

    public static void printSpiral2ForPractice(int[][] metrics) {
        int startRow = 0;
        int endRow = metrics.length - 1;
        int startCol = 0;
        int endColumn = metrics[0].length - 1;

        while(startRow <= endRow && startCol <= endColumn){
            // Print start Row
            for(int i = startCol; i <= endColumn; i++){
                System.out.print(metrics[startRow][i] + " ");
            }
            startRow++; // Increase the start row

            // Print End Column
            for(int i = startRow; i <= endRow; i++){
                System.out.print(metrics[i][endColumn] + " ");
            }
            endColumn--; // Decrease The end Row

            // Print End Row
            for (int i = endColumn; i >= startCol; i--){
                System.out.print(metrics[endRow][i] +  " ");
            }
            endRow--; // Decrease the endRow

            // Print Start Column
            for (int i = endRow; i >= startRow; i--){
                System.out.print(metrics[i][startCol] + " ");
            }
            startCol++; // Increase the StartCol
        }
    }

    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter the value of N -> Row: ");
        // int n = input.nextInt();

        // System.out.println();
        // System.out.print("Enter the value of M -> Column: ");
        // int m = input.nextInt();
        int[][] metrics = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };
        // System.out.print("Enter the values of the metrics for row wise: ");

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         metrics[i][j] = input.nextInt();
        //     }
        // }
        printSpiral2ForPractice(metrics);
        // for (int i = 0; i < metrics.length; i++) {
        //     for (int j = 0; j < metrics[0].length; j++) {
        //         System.out.print(metrics[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}
