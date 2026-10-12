
public class SubArrays {

    public static void printSubArrays(int[] arr) {
        // First loop go to end
        for (int i = 0; i < arr.length; i++) {
            // Print the first pair every time
            System.out.print("[" + arr[i] + "]" + " ");
            // Second loop for iterate the sub array elements
            for (int j = i + 1; j < arr.length; j++) {
                // Print the first third bracket for starting the sub array
                System.out.print("[");
                // Iterate first means i to j elements and print the all elements
                for (int k = i; k <= j; k++) {
                    // Print the all elements
                    System.out.print(arr[k]);
                    // Just for the comma logic
                    if (k != j) {
                        System.out.print(',');
                    }
                }
                // Print the last array bracket for finished sub array printing
                System.out.print("] ");
            }
            // Next line for every pair of the sub array
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        printSubArrays(arr);
    }

}
