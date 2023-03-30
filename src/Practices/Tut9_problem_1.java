package Practices;

import java.util.Scanner;


public class Tut9_problem_1 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double num1, denom1, num2, denom2;
        System.out.println("Enter the numerator and the denominator of the first fraction: ");
        num1 = sc.nextDouble();
        denom1 = sc.nextDouble();

        System.out.println("Enter the numerator and the denominator of the second fraction: ");
        num2 = sc.nextDouble();
        denom2 = sc.nextDouble();

        System.out.println("The outputs of the program are: ");
        System.out.println("SUM: " + String.format("%.2f",(num1/denom1)+(num2/denom2)));
        System.out.println("DIFFERENCE: " + String.format("%.2f", (num1/denom1)-(num2/denom2)) );
        System.out.println("PRODUCT: " + String.format("%.2f", (num1/denom1)*(num2/denom2)));
        System.out.println("Division: " +  String.format("%.2f", (num1/denom1)/(num2/denom2)));
    }
}
