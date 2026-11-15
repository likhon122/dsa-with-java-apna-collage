package timeComplexity;

public class PowerOfX { // Time complexity O(N) Space complexity O(LogN)

    static int power(int num, int n){
        // Base case
        if(n == 0) return 1;

        // Recursive work
        int halfPowSqr = power(num, n/2) * power(num, n/2);

        // Self work
        if(n % 2 != 0) return num * halfPowSqr;
        return halfPowSqr;
    }

    static void main(String[] args) {
        System.out.println(power(2,10));
    }
}
