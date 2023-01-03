package Demo;

public class Demo {
    int rollNo;
    String name;

    public void StudentInfo(int i, String s){
        System.out.println("The name of student is: "+s);
        System.out.println("The roll no of the student is :"+i);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.rollNo = 32;
        obj.name = "Soham";

        obj.StudentInfo(obj.rollNo, obj.name);
    }
}
