package Practices;

import java.util.Scanner;

public class Tut6_problelm_1 {

    public static void main(String args[]){
        double x, u;
        int t;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of: ");

        System.out.println("x: ");
        x = sc.nextDouble();
        System.out.println("u: ");
        u = sc.nextDouble();
        System.out.println("t: ");
        t = sc.nextInt();

        double g = 9.78033;

        double disp = x + u*t + g*t*t/2;

        System.out.println("The resultant displacement is " + disp + " units");

    }


}
