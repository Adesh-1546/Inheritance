package com.Inheritance.prac;

public class Main_3 {
	
    public static void main(String[] args) {
        // Create an instance of Rectangle with length 3.0 and width 10.0
        Rectangle rectangle = new Rectangle(3.0, 10.0);
        // Call the getArea method on the rectangle instance and store the result in the area variable
        double area = rectangle.getArea();
        // Print the area of the rectangle to the console
        System.out.println("The area of the rectangle is: " + area);
    }

}
