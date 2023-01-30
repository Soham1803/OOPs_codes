package Practices;
// Method overloading.
class Demo5{
    public void disp(int a, int b){
        System.out.println("The value of a is "+a+" and value of b is "+b+".");

    }
    public void disp(double a, double b){
        System.out.println("The value of a is "+a+" and value of b is "+b+".");
    }
}
public class Tester5 {
    public static void main(String args[]){
        Demo5 d = new Demo5();
        d.disp(5, 6);
        d.disp(1.3, 3.4);
    }
}
