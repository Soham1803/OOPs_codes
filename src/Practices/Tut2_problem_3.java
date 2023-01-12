package Practices;
import java.util.Scanner;

public class Tut2_problem_3 {
    public static void main(String args[]){

        System.out.println("Enter the number: ");
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int rem, sum = 0, mult = 1;

        while(num != 0){
            rem = num % 10;
            num = num / 10;

            sum = sum * 10 + rem;
        }
        System.out.println(sum);
    }
}
