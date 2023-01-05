package Practices;

class Student{
    int roll_no;
    String name;
}

public class Tester {

    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();

        s1.roll_no  = 32;
        s1.name = "Rohan";

        s2.roll_no = 44;
        s2.name = "Soham";

        System.out.println("The name of first student is "+s1.name+" and roll no is "+s1.roll_no+".");
        System.out.println("The name of second student is "+s2.name+" and roll no is "+s2.roll_no+".");
    }
}
