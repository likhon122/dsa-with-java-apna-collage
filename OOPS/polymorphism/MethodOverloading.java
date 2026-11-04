package OOPS.polymorphism;

public class MethodOverloading {

    static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(10, 1));
        System.out.println(cal.sum(1,2,3));
    }
}


class Calculator{
    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    float sum (float a, float b){
        return a + b;
    }
}
