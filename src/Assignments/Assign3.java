package Assignments;

import java.util.Scanner;

class Shape{
    int dimension1;
    double dimension2;

    public double setArea(){

        double area = this.dimension1 * this.dimension2;

        return area;
    }

    public void getInputs(int dimension1, int dimension2){
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

}

class Triangle extends Shape{
    public void getInputs(int base, int height){
        this.dimension1 = base;
        this.dimension2 = height;
    }

    public double setArea(){
        double area = (dimension1*dimension2)/2;

        return area;
    }
}

class Square extends Shape{
    public void getInputs(int side){
        this.dimension1 = side;
    }

    public double setArea(){
        double area = dimension1 * dimension1;

        return area;
    }
}

class Circle extends Shape{
    public void getInputs(double radius){
        this.dimension2 = radius;
    }

    public double setArea(){
        double area = Math.PI * dimension2 * dimension2;

        return area;
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
                System.out.println("Enter the base and height on the triangle");
                int base = sc.nextInt();
                int height = sc.nextInt();
                Triangle obj1 = new Triangle();
                obj1.getInputs(base, height);
                System.out.println("The area of the Triangle is: " + obj1.setArea());
                break;

            case 2:
                System.out.println("Enter the radius of the Circle: ");
                double radius = sc.nextDouble();

                Circle obj3 = new Circle();
                obj3.getInputs(radius);
                System.out.println("The area of the Circle is: "+ obj3.setArea());
                break;

            case 3:
                System.out.println("Enter the side of the Square");
                int side = sc.nextInt();

                Square obj2 = new Square();
                obj2.getInputs(side);
                System.out.println("The area of the Square is: " + obj2.setArea());
                break;

            default:
                System.out.println("Invalid choice!");
        }

    }
}
