package OOPS.abstraction;

public class StaticKeyword {
    static void main(String[] args) {
        Student s1 = new Student();
        s1.school = "Taragunia Secondary School";
        s1.setName("  Hello ");
        System.out.println(Student.school);
//        Student s2 = new Student();
//        System.out.println(s2.school); // Print Taragunia Secondary School
    }
}


class Student{
    String name;
    int roll;
    static String school;

    void setName(String school){
//        this.name = name;
        this.school = school;
    }

    String getName(){
        return this.name;
    }

    static int getPercentage(int phy, int che, int math){
        return (phy + che + math) / 3;
    }
}
