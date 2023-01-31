package Assignments;

import java.util.Scanner;

class Shape{
    public double setArea(int[] dimension){  //triangle

        double area = (dimension[0] * dimension[1])/2;

        return area;
    }

    public double setArea(int side){  //square

        double area = (side * side);

        return area;
    }

    public double setArea(double radius){  //square

        double area = Math.PI * radius * radius;

        return area;
    }

}

class Triangle extends Shape{
    public int[] getInputs(int[] dimensions){
        return dimensions;
    }

}
class Square extends Shape{
    public int getInputs(int side){
        return side;
    }

}
class Circle extends Shape{
    public double getInputs(double radius){

        return radius;
    }
}

public class Assign3 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the shape the area of which you wanna calculate:");
        System.out.println("1. Triangle");
        System.out.println("2. Circle");
        System.out.println("3. Square");

        int choice = sc.nextInt();

        switch (choice){
            case 1:
                int[] TriDimens = new int[2];
                System.out.println("Enter the base and height on the triangle");
                TriDimens[0] = sc.nextInt();
                TriDimens[1] = sc.nextInt();
                Triangle obj1 = new Triangle();
                int[] dimensions = obj1.getInputs(TriDimens);
                System.out.println("The area of the Triangle is: " + obj1.setArea(dimensions));
                break;

            case 2:
                System.out.println("Enter the radius of the Circle: ");
                double radius = sc.nextDouble();

                Circle obj3 = new Circle();

                System.out.println("The area of the Circle is: "+ obj3.setArea(obj3.getInputs(radius)));
                break;

            case 3:
                System.out.println("Enter the side of the Square");
                int side = sc.nextInt();

                Square obj2 = new Square();

                System.out.println("The area of the Square is: " + obj2.setArea(obj2.getInputs(side)));
                break;

            default:
                System.out.println("Invalid choice!");
        }

    }
}
