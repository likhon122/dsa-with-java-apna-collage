package OOPS.polymorphism;

public class MethodOverriding {

    static void main(String[] args) {
        Deer deer = new Deer();
        deer.eat();


    }
}



class Animal{
    void eat(){
        System.out.println("Eat anything");
    }
}

class Deer extends Animal{
    @Override
    void eat() {
        System.out.println("Eat Grass");
    }
}