package Practices;

// Write a program to calculate the  factorial of the number using both iterative and recurrsive approach.
public class Tut7_problem_1 {

    public static void main(String args[]){
        System.out.println(facByIter(6));

        System.out.println(facByRec(6));
    }

    static int facByIter(int n){
        int fac = 1;

        for (int i = 0; i < n; i++) {
            fac = fac * (n - i);
        }

        return fac;
    }

    static int facByRec(int n){
        int fac = n;

        if(n == 1) return 1;

        fac = fac * facByRec(n - 1);

        return fac;
    }

}
