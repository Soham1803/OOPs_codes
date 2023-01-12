package Practices;

import java.util.Scanner;

public class Tut2_problem_1 {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = scan.nextInt();

        if(num % 2 == 0){
            System.out.println("The given number is Even.");
        }else{
            System.out.println("The given number is not Even its odd.");
        }

    }


}
