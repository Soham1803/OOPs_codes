package Assignments;

public class Assignment4 {

    public static void main(String args[]){

        try{
            System.out.println("Infinity is: "+134/0);
        }catch(ArithmeticException e){
            System.out.println("You shouldn't divide a number by zero.");
        }

        int[] arre = new int[10];

        try{
            System.out.println(arre[10]);
        }catch(IndexOutOfBoundsException e){
            System.out.println("OOPs!!!Array Index 7 out of bounds for length 6.");
        }

        String string = null;
        try{
            System.out.println(string.charAt(5));
        }catch(NullPointerException e){
            System.out.println("Null Pointer Exception arises!!");
        }

        System.out.println("Rest of the code.");
    }
}
