package Recursion;

public class PrintXToPowerN { // Time complexity O(n) Space complexity O(n)

    static int xToPowerN(int num, int n){
        // Base work
        if(n == 0) return 1;

        // Recursive work
        int pow = xToPowerN(num, n-1);

        // Self work
        return pow * num;
    }

    static void main(String[] args) {
        System.out.println(xToPowerN(2,5));
    }
}
