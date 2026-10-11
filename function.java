
public class function {

    public static int calculateFactorial(int f) {
        int fact = 1;
        for (int i = f; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

    public static void calculateBinomialCoefficient(int n, int r) {
        int nFact = calculateFactorial(n);
        int rFact = calculateFactorial(r);
        int nmrFact = calculateFactorial(n - r);
        float binomialCoefficient = nFact / (rFact * nmrFact);
        System.out.println(binomialCoefficient);
    }

    public static void checkPrimeNumber(int n) {
        if (n <= 1) {
            System.out.println("This " + n + " is not a prime number");
            return;
        }
        if (n <= 2) {
            System.out.println("This " + n + " is a prime number");
        }
        double sqrtOfN = Math.sqrt(n);
        boolean isPrime = true;
        for (int i = 2; i <= sqrtOfN; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (!isPrime) {
            System.out.println("This " + n + " is not a prime number");
        } else {
            System.out.println("This " + n + " is a prime number");
        }

    }

    public static void binaryToDecimal(int binary) {
        int temp = binary;
        int base = 1;
        int lastDigit = binary % 10;
        int decimal = 0;
        while (binary != 0) {
            decimal += lastDigit * base;
            binary /= 10;
            base *= 2;
        }

        System.out.println("This " + temp + " binary number decimal value is " + decimal);
    }

    public static void decimalToBinary(int decimal) {
        int base = 1;
        int binary = 0;
        int temp = decimal;
        while (decimal != 0) {
            binary += (decimal % 2) * base;
            base *= 10;
            decimal /= 2;
        }
        System.out.println("Binary of " + temp + " is " + binary);
    }

    public static void main(String[] args) {
        // calculateBinomialCoefficient(5, 2);
        // checkPrimeNumber(3);
        // binaryToDecimal(11);
        decimalToBinary(1001);
    }
}
