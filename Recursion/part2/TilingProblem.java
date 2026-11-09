package Recursion.part2;

public class TilingProblem { // Time complexity O(2^n) Space complexity O(n)

    static int tilingProblem(int n) {
        // Base case
        if (n == 0 || n == 1)
            return 1;

        // recursive work
        // Vertical Choice takes space 1
        int verticalTotalChoice = tilingProblem(n - 1);

        // Horizontal choice takes space 2
        int horizontalTotalChoice = tilingProblem(n - 2);

        // Self work
        return verticalTotalChoice + horizontalTotalChoice;
    }

    static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
