package OOPS.abstraction;

public class Abstraction {

    static void main(String[] args) {
        Mustang mustang = new Mustang(); // print -> Animal()-> Horse()-> Mustang()

        Chicken ck = new Chicken();
        ck.eat();
        ck.walk();
        System.out.println(ck.color);

    }
}

abstract class Animal{
    String color;

    Animal(){
        color = "Brown";
        System.out.println("Animal constructor calling");
    }

    void eat(){
        System.out.println("Animal Eat");
    }

    abstract void walk();
}


class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor calling");
    }
    void walk(){
        System.out.println("Horse walking in 4 legs");
    }
}

class Chicken extends Animal{
    @Override
    void walk() {
        System.out.println("Chicken walking in 2 legs");
    }
}


class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor calling");
    }
}



