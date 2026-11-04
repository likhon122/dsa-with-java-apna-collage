package OOPS.inheritance;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.breath();
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


// Derived class of Parent Animal class
class Mammal extends Animal{
    int legs;

    void walks(){
        System.out.println("Walks");
    }
}

// Derived class of Parent Animal class
class Bird extends Animal{

    void fly(){
        System.out.println("flys");
    }
}