public class OptimizedPowerIterative { // Time complexity O(logN) Space complexity O(1)

    static int power(int num, int n){
        int result =1;
        while (n > 0){
            // If odd number then add extra one power
           if(n % 2 != 0) result *= num;
           // make power of num every time
           num *= num;

           // Divide 2 and make time complexity O(longN)
           n /=2;
        }
        return result;
    }

    static void main(String[] args) {
        System.out.println(power(2,10));
    }
}
