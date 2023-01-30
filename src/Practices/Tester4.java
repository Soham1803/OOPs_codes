package Practices;

import java.awt.print.PrinterAbortException;

class Bike{
    int Speed = 90;
    void run(){
        System.out.println("running");
    }
}
class Splendor extends Bike{
    int speed = 120;
    void run(){
        System.out.println("running safely");
    }
}


public class Tester4 {
    public static void main(String args[]){
      Bike b = new Splendor();
      b.run();
        System.out.println("running safely with "+b.Speed+"KM");
    }
}
