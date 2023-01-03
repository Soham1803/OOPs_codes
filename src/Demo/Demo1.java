package Demo;

public class Demo1 {
    int i;
    String s;

    /*Demo1(){
        System.out.println("This is Non-Paramaterised constructor.");
    }*/

    Demo1(int i, String s){
        this.i = i;
        this.s = s;
    }

    public static void main(String[] args) {
        /*Demo1 D = new Demo1();*/
        Demo1 E = new Demo1(53, "Soham");
        System.out.println(E.i);
        System.out.println(E.s);
    }
}
