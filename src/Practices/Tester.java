package Practices;

class Student{
    static int roll_no;
    static String name;
}

public class Tester {

    public static void main(String args[]){
        /*Student s1 = new Student();
        Student s2 = new Student();
*/
        /*s2.roll_no = 44;
        s2.name = "Soham";*/

        System.out.println("The name of first student is "+Student.name+" and roll no is "+Student.roll_no+".");
        /*System.out.println("The name of second student is "+s2.name+" and roll no is "+s2.roll_no+".");*/
    }
}
