package Practices;

/*Calculate and return the sum of all the even numbers present in the numbers array passed to the
method calculateSumOfEvenNumbers. Implement the logic inside calculateSumOfEvenNumbers() method.
Test the functionalities using the main() method of the Tester class.*/

import java.util.Scanner;

public class Tut10_problem_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of an array: ");
        int length = sc.nextInt();

        int[] arre = new int[length];

        for (int i = 0; i < length; i++) {
            arre[i] = sc.nextInt();
        }

        int evenSum = calculateSumOfEvenNumbers(arre);

        System.out.println("The sum of all the even numbers in the given array is: "+evenSum);
    }

    static int calculateSumOfEvenNumbers(int[] nums){
        int count = 0;

        for(int i: nums){
            count += i % 2 == 0 ? i: 0;
        }

        return count;
    }
}
