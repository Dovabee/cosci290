/*
Francisco Delgado

Co Sci 290

Lab 8

Do problems 2.1 and 2.2 in the book.

2.1

(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree
in a double value from the console,then converts it to Fahrenheit and displays the result.
The formula for the conversion is as follows: fahrenheit = (9 / 5) * celsius + 32 Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.

2.2

(Compute the volume of a cylinder) Write a program that reads in the
radius and length of a cylinder and computes the area and volume using
the following formulas: area = radius * radius * p volume = area * length

Grade Notes:
10/10
*/

import java.util.Scanner;

//class
public class Lab8{

//main method
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
  //Variable declarations
  double Fahrenheit;
  double Celsius;
  double radius;
  double length;
  double PI;
  double area;
  double volume;
  
  //Problem 2.1
  System.out.print("Enter a degree for celsius: ");
  
  	//prompt user to input a value for Celsius
  	Celsius = input.nextDouble();
  
  //formula to convert Celsius to Fahrenheit
  	Fahrenheit = (9.0 / 5) * Celsius + 32;
  
  System.out.println(" ");
  
  //display results of converting Celsius to Fahrenheit
  System.out.println(Celsius + " degrees Celsius is " + Fahrenheit + " degrees Fahrenheit.");
  
  System.out.println(" ");
  
  //Problem 2.2
  
  System.out.println("Enter the radius and length of a cylinder: ");
  
  	//value of pi
  	PI = 3.14159;
  	
  	//prompt user to input value for radius and length
  	radius = input.nextDouble();
    length = input.nextDouble();
    
    System.out.println(" ");
  	
    //formula for area and volume
  	area = radius * radius * PI;
  	volume = area * length;
  	
  	//display results of computing for the area and volume of a cylinder
  	System.out.println("The area of the cylinder is " + area);
  	System.out.println("The volume of the cylinder is " + volume);
  
  
  
}
}