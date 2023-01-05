package Practices;

class Student1{
    private int rollNo;
    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
}

public class Tester1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setRollNo(59);

        System.out.println("The roll no of the student is "+s1.getRollNo()+".");
    }
}
