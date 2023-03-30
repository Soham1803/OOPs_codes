package Practices;

import java.util.Vector;

import java.util.HashSet;

import java.util.Set;
import javax.swing.*;



public class Exam {


   /* public static void main(String args[]) {


// Creating an empty Vector

        Vector<String> vec_tor = new Vector<String>(3);

// Use add() method to add elements into the Vector vec_tor.add("Welcome");
        vec_tor.add("Welcome");
        vec_tor.add("To");
        vec_tor.add("VIT");

        vec_tor.add("ENGG");
        System.out.println("The size is: " + vec_tor.size());
        System.out.println("The capacity is: " + vec_tor.capacity());

        vec_tor.add("College");

        System.out.println("The size is: " + vec_tor.size());

        System.out.println("The capacity is: " + vec_tor.capacity());

    }*/



       /* public static void main(String[] args) { //Creating HashSet object

            Set<String> food = new HashSet<String>();

            food.add("Pasta"); // Adding elements to the HashSet

            food.add("pasta");

            food.add("Sandwich");

            food.add("Sandwlch");

//System.out.print(food);
            System.out.println(food);

        }*/

    public static void main(String[] args) {
        JFrame f=new JFrame();

        JButton b=new JButton("click");
        b.setBounds(0,0,100, 40);

        f.add(b);//adding button in JFrame

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }


}