package OOPS;

public class Constructors {
    public static void main(String[] args) {
        // Student s1 = new Student("Likhon", 100);
        // System.out.println(s1);
        Student s1 = new Student();
        s1.name = "Likhon";
        s1.roll = 100;
        s1.password = "1234";
        s1.marks[0] = 50;
        s1.marks[1] = 60;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // Copy the s1 object using copy constructor
        
        // This is print null...
        // System.out.println( s2.password); 
        
        // Do not change the s2 name it change the s1 name just
        s1.name = "Islam";
        System.out.println(s2.name);

        // Change the s1 mark but this mark is effect in s2 also in Shallow copy
        s1.marks[2] = 100; 

        // Print s2 marks
        for(int i = 0; i<3; i++){
            System.out.println(s2.marks[i]);
        }



    }
}

class Student{
    String name;
    int roll;
    String password;
    int[] marks = new int[3];
    // Student(String name, int roll){
    //     this.name = name;
    //     this.roll = roll;
    // }

    // Non-Parameterized Constructor
    Student(){
        // System.out.println("Constructor is called...");
    }

    // Shallow copy constructor
    // Student(Student s1){
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // Deep Copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i =0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    // Parameterized Constructor
    Student(String name){
        this.name = name;
    }
    
    // Parameterized Constructor
    Student(int roll){
        this.roll = roll;
    }
}
