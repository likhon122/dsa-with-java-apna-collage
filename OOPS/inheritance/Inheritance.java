package OOPS.inheritance;

public class Inheritance {

    public static void main(String[] args) {
        Fish fish = new Fish();

        fish.eat();
    }
    
}


// Parent class/ Base Class
class Animal2{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breath(){
        System.out.println("Breaths");
    }
}


// Child/ Derived Class
class Fish2 extends Animal2{
    int fins;
    void swim(){
        System.out.println("Swims..");
    }
}