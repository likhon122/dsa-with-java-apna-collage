package OOPS.inheritance;

public class Inheritance {

    public static void main(String[] args) {
        Fish fish = new Fish();

        fish.eat();
    }
    
}


// Parent class/ Base Class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breath(){
        System.out.println("Breaths");
    }
}


// Child/ Derived Class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims..");
    }
}