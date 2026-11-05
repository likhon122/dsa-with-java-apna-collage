package Recursion;

public class XToPowerNOptimized { // Time complexity O(logN) Space complexity O(LogN)

    static int optimizedPower(int num, int n){
        // Base case
        if(n == 0) return 1;

        // Recursive work
        int halfPow = optimizedPower(num, n/2);
        int halfPowSqr = halfPow * halfPow;

        // Self work
        if(n % 2 != 0) return num * halfPowSqr;
        return halfPowSqr;
    }

    static void main(String[] args) {
        System.out.println(optimizedPower(2,10));
    }
}
