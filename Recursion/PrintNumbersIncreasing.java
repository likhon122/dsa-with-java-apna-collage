package Recursion;

public class PrintNumbersDecreasing {

    public static void printNumDec(int num){

        if(num > 10){
            return;
        }
        System.out.print(num + " ");
        printNumDec(num+1);

    }

    static void main(String[] args) {
        printNumDec(0);
    }
}
