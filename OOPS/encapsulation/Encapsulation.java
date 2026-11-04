package OOPS.encapsulation;

public class Encapsulation {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);
    }
    
    
}



class Pen {

    String color;
    int tip;

    public void setColor(String newColor){
        color = newColor;
    }

    public void setTip(int newTip){
        tip = newTip;
    }
}


class BankAccount{
    protected String name;
    private String password;
    private double balance;
    
    public void setPassword(String newPassword){
        password = newPassword;
    }

    public double getBalance(){
        return balance;
    }

    public String getPassword(){
        return password;
    }
}












