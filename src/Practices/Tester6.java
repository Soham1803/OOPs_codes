package Practices;
//Inheritance.
// Method overriding.

class Parent{
    public void disp1(){
        System.out.println("This is parent class");
    }
}

class Child extends Parent{
    public void disp(){
        System.out.println("This is child class");

    }
}
public class Tester6 {
    public static void main(String args[]){
        Child c = new Child();
        c.disp();
        c.disp1();
    }
}
