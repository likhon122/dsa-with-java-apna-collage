package Recursion;

public class Fibonacci { // Time complexity O(2^n) Space complexity O(n)

    public static int nthFib(int n){
        // Base case
        if(n == 0 || n == 1) return n;

        // Recursive work
        // Fibonacci of n-1
        int fibFirstLast = nthFib(n-1);
        // Fibonacci of n-2
        int fibSecondLast = nthFib(n-2);

        // Self work
        return fibFirstLast + fibSecondLast;
    }

    static void main(String[] args) {
        System.out.println(nthFib(2));
    }
}
