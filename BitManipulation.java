public class BitManipulation {

    public static void oddEven(int n){
        int bitmask = 1;
        if((n&bitmask) == 0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd number");
        }
    }

    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask) == 0){
            return 0;
        }else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }

    public static int clearBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     int bitMask = ~(1 << i);
        //     return n & bitMask;
        // }else{
        //     int bitMask = 1 << i;
        //     return n | bitMask;
        // }
        // if(newBit == 0){
        //     return clearBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }
        n = clearBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearIthBits(int n, int i){
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearBitsInRange(int n, int i, int j){
        int a = (~0) << (j+1);
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static boolean isNumberIsPowerOfTwo(int number){
        return (number & (number-1)) == 0;
    }

    public static int countSetBits(int number){
        int count = 0;
        while (number > 0) {
            if((number & 1) != 0){
                count++;
            }
            number = number >> 1;;
        }
        return count;
    }

    public static int fastExpo(int a, int n){
        int ans = 1;
        while (n > 0) {
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static int addOne(int num){
        return -(~num);
    }

    static void main(String[] args) {
//        System.out.println(5&6); // output will be 4 in decimal using binary AND operator
//        System.out.println(5 | 6); // Output will be 7 in decimal using binary OR operator
//        System.out.println(5^6); // Output will be 3 in decimal using binary XOR operator
//        System.out.println(~5); // Output will be 2 in decimal using binary One's Complement
//        System.out.println(6>>1); // Output will be 3 in decimal using binary right shift operator
//        oddEven(1);
//        oddEven(10);

//        System.out.println(1<<2);
//        System.out.println(getIthBit(10,3));
//        System.out.println(setIthBit(10,2));
//        System.out.println(clearBit(10,1));
        // System.out.println(updateIthBit(10, 2, 1));
        // System.out.println(clearIthBits(15, 2));
        // System.out.println((1<<3)-1);
        // System.out.println(clearBitsInRange(10, 2, 6));
        // System.out.println(isNumberIsPowerOfTwo(8));
        // System.out.println(countSetBits(16));
        // System.out.println(fastExpo(3, 5));
        // System.out.println(addOne(0));
    }

}
