package Practices;

import java.util.Scanner;

class PalindromeCheck{
    String s;
    long num;
    public PalindromeCheck(String s){
        this.s = s;
    }

    public PalindromeCheck(long num){
        this.num = num;
    }

    public boolean isPalindromeS(){
        int i = 0, j = this.s.length() - 1;

        while(this.s.charAt(i) == this.s.charAt(j)){
            if(i == j) return true;
            i++;
            j--;
        }
        return false;
    }

    public boolean isPalindromeNum(){
        long rem, quo;
        long num1 = this.num;
        int noOfDigits = (int)Math.log10(num1);

        while(num1 > 0){
            rem = num1 % 10;
            quo = num1 / (long) Math.pow((double)10, (double)noOfDigits);
            if(rem != quo) return false;
            num1 = (num1 % (long) Math.pow((double)10, (double)noOfDigits)) / 10;
        }
        return true;
    }

}

public class Tut3_problem_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Enter any string to check whether it is palindrome or not: ");
        String string = sc.next();
        PalindromeCheck obj = new PalindromeCheck(string);
        boolean checkS = obj.isPalindromeS();

        if(checkS){
            System.out.println("Yes, the given string is Palindrome.");
        }else{
            System.out.println("No, the given string is not Palindrome.");
        }
        */
        System.out.println("Enter any number to check whether it is palindrome or not: ");
        long num = sc.nextLong();
        PalindromeCheck objNum = new PalindromeCheck(num);
        boolean checkN = objNum.isPalindromeNum();

        if(checkN){
            System.out.println("Yes, the given number is Palindrome.");
        }else{
            System.out.println("No, the given number is not Palindrome.");
        }
    }
}
