package Practices;

import java.util.Arrays;
import java.util.Scanner;

public class Tut5_problem_1 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of an Array: ");
        int length = sc.nextInt();
        int[] arre = new int[length];

        System.out.println("Enter the elements in the array: ");

        for (int i = 0; i < length; i++) {
            arre[i] = sc.nextInt();
        }


        for(int i = 0; i < length; i++){
            boolean prime = true;
            if(arre[i] == 1){
                arre[i] = 2;
                continue;
            }

            for (int j = 2; j <= arre[i]/2; j++) {
                if(arre[i] % j == 0){
                    prime = false;
                    break;
                }
            }

            if(!prime){
                arre[i] =  nextPrime(arre[i]);
            }
        }

        System.out.println(Arrays.toString(arre));
    }

    static int nextPrime(int n){
        n++;
        for (int i = 2; i <= n/2; i++) {
            if(n % i == 0){
                n++;
                i = 2;
            }else continue;
        }
        return n;
    }


}
