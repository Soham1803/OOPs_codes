package Practices;
import java.util.Scanner;

public class Tut2_problem_2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int num = scan.nextInt();
        int check = num;
        int rem, quo, sum = 0, multiplier =1;

        int noOfDigits = (int)Math.log10(num) + 1;

        while(num != 0){
            multiplier = 1;
            rem = num % 10;
            num = num / 10;

            sum += Math.pow(rem, noOfDigits);
        }

        if(sum == check){
            System.out.println("The number is Armstrong.");
        }else{
            System.out.println("The number is not Armstrong.");
        }
    }
}
