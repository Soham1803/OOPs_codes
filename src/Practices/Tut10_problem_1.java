package Practices;

/*Write a program to handle the custom exception when the number entered by user through keyboard is odd.
Use throw and throws keywords. Exception name is OddNumberException.
If the number is odd print message "Number is Odd" else print "Number is Even".*/

import java.util.Scanner;

public class Tut10_problem_1 {

    public static void main(String[] args) throws OddNumberException{
        int num;
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        boolean flag = false;
        try{
            if(num % 2 != 0){
                throw new OddNumberException();
            }
        }catch(OddNumberException e){
            System.out.println("Number is odd!");
            flag = true;
        }

        if(!flag)  System.out.println("Number is even!");
    }
}
