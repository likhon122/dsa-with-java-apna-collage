package OOPS.inheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();

        dobby.legs = 4;
        System.out.println(dobby.legs);
        dobby.eat();
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


// Derived class of Parent Animal class
class Mammal extends Animal{
    int legs;
}

// Derived class of derived class Mammal
class Dog extends Mammal{
    String bread;
}