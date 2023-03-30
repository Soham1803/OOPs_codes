package Practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tut8_problem_1 {

    public static void main(String args[]){

        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

    // Create two arrayLists ,add the String elements in arrayList using add().
        System.out.println("Enter the no. of Strings to be added in the 1st list: ");
        int length1 = sc.nextInt();
        for (int i = 0; i < length1; i++) {
            String s = sc.next();
            arr1.add(s);
        }

        System.out.println("Enter the no. of Strings to be added in the 2nd list: ");
        int length2 = sc.nextInt();
        for (int i = 0; i < length2; i++) {
            String s = sc.next();
            arr2.add(s);
        }


        System.out.println(arr1);
        System.out.println(arr2);

    // Add one arraylist into the other from index 1 using appropriate method.
        arr1.addAll(1, arr2);

    // Print the two added list.
        System.out.println(arr1);

    // Print the index of "Are".
        System.out.println(arr1.indexOf("Are"));

    // Remove the 4th element from arraylist1.
        arr1.remove(4);
        System.out.println(arr1);

    // Replace 4 element of arraylist2 as "U".
        arr2.set(4, "U");
        System.out.println(arr2);
    }
}
