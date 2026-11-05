package Recursion;

public class PrintSumOfNaturalNumber {

    public static int sumNatural(int n){ // Time complexity O(n) Space complexity O(n)
        // Base Case
        if(n == 1) return 1;

        // Recursive work & self work
        return n + sumNatural(n-1);
    }
    static void main(String[] args) {
        System.out.println(sumNatural(5));
    }
}
