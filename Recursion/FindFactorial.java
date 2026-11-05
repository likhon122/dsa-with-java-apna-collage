package Recursion;

public class FindFactorial {

    public static int findFac(int num) { // Time complexity O(n) Space complexity O(n)
        // Base case
        if (num == 0) {
            return 1;
        }

        // Recursive work
        int smallFac = findFac(num - 1);

        // Self work
        return num * smallFac;

    }
    static void main(String[] args) {
        System.out.println(findFac(5));
    }
}
