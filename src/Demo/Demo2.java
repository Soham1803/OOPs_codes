package Demo;

public class Demo2 {
    private int i;
    private String s;
    public int getI(){
        return i;
    }
    public void setI(int i){
        this.i = i;
    }
}

class Tester{
    public static void main(String[] args) {
        Demo2 obj = new Demo2();
        System.out.println(obj.getI());
        obj.setI(44);
        System.out.println(obj.getI());
    }
}
