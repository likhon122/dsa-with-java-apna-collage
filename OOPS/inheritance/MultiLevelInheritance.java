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
class Animal3{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breath(){
        System.out.println("Breaths");
    }
}


// Derived class of Parent Animal class
class Mammal3 extends Animal3{
    int legs;
}

// Derived class of derived class Mammal
class Dog extends Mammal3{
    String bread;
}