package Practices;

public class Tut5_problem_2 {

    public static void main(String args[]){

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        if(num1 % num2 == 0){
            System.out.println("The first argument is divisible by the second.");
        }else {
            if (num2 % num1 == 0) {
                System.out.println("The second argument is divisible by the first.");
            } else {
                System.out.println("Both are not divisible by each other.");
            }
        }
    }
}
