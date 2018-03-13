/*
  Francisco Delgado
  
  Co Sci 290
  
  HW2.java due: Mar. 13
  
  Group 1 To-do:
  
    1. In the book, do problems
      - 1.3(Display pattern)
      - 1.5(Compute Expression)
      - 1.6(Summation series)
      - 1.8(Area and perimeter of a circle)

*/

//importing scanner package from java
import java.util.Scanner;

//class
public class HW2{
  
  //main method. Start of program execution
  public static void main(String[] args){
    
    //variable declarations for 1.3, 1.5, 1.6, and 1.8
    double quotient = (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5);
    double summation = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;
    double radius = 5.5;
    double PI = 3.14159;
    double perimeter = 2 * radius * PI;
    double area = radius * radius * PI;
    
    System.out.println(" ");
    
    //problem 1.3
    System.out.println("Problem 1.3");
    
    System.out.println(" ");
    
    //Displaying pattern
    System.out.println("      J      A    V     V    A    \n"
                     + "      J     A A    V   V    A A   \n"
                     + "  J   J    AAAAA    V V    AAAAA  \n"
                     + "   J J    A     A    V    A     A \n");
    
    System.out.println(" ");
    
    //problem 1.5
    System.out.println("Problem 1.5 ");
    
    System.out.println(" ");
    
    System.out.println("The expression (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5) = "
                      + quotient);
    
    System.out.println(" ");
    
    //problem 1.6
    System.out.println("Problem 1.6 ");
    
    System.out.println(" ");
    
    System.out.println("The sum of 1 + 2 + 3... + 9 = " + summation);
    
    System.out.println(" ");
    
    //problem 1.8
    System.out.println("Problem 1.8 ");
    
    System.out.println(" ");
    
    //compute perimeter
    System.out.println("The perimeter of a circle with a radius of 5.5 is "
                      + perimeter);
    
    System.out.println(" ");
    
    //compute area
    System.out.println("And the area of a circle with a radius of 5.5 is "
                      + area);
    
    System.out.println(" ");
    
  }
}





































