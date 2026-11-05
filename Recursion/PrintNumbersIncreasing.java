package Recursion;

public class PrintNumbersIncreasing {

    public static void printNumInc(int num){
        if(num < 0){
            return;
        }
        printNumInc(num-1);
        System.out.print(num + " ");
    }

    static void main(String[] args) {
        printNumInc(10);
    }
}
