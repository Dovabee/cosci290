/*
  Francisco Delgado
  
  Lecture:
    Introduction to methods.
  
  Lab:
    Finish the multiply and division methods
*/

public class Lab13{
  
  //start of program
  public static void main(String[] args){
    
    //declare variables
    int a = 1;
    int b = 3;
    int c = 0;
    int d = -5;
    
    System.out.println("Operations on a and b: ");
    System.out.println("addition = " + add(a, b));
    System.out.println("subtraciton = " + subtract(a, b));
    System.out.println("multiplication = " + multiply(a, b));
    System.out.println("division = " + divide(a, b));
    
    System.out.println(" ");
    
    System.out.println("Operations on c and d: ");
    System.out.println("addition = " + add(c, d));
    System.out.println("subtraciton = " + subtract(c, d));
    System.out.println("multiplication = " + multiply(c, d));
    System.out.println("division = " + divide(c, d));
    
  }//end of main
  
  //this custom method adds two integers
  public static int add(int num1, int num2){
    
    //declare variables
    int sum = 0;
    
    //add num1 and num2 and assign to sum
    sum = num1 + num2;
    
    //return sum of num1 and num2
    return sum;
    
  }//end of add
  
  //this custom method subtracts two integers
  public static int subtract(int num1, int num2){
    
    //declare variables
    int difference = 0;
    
    //subtract num1 by num2 and assign to difference
    difference = num1 - num2;
    
    //return the difference of num1 and num2
    return difference;
    
  }//end of subtract
  
  //this custom method multiplies two integers
  public static int multiply(int num1, int num2){
    
    //declare variables
    int product = 0;
    
    //multiply num1 by num2 and assign to product
    product = num1 * num2;
    
    //return the product of num1 and num2
    return product;
    
  }//end of multiply
  
  //this custom method divides two integers
  public static int divide(int num1, int num2){
    
    //declare variables
    int quotient = 0;
    
    //divide num1 by num2 and assign to quotient
    quotient = num1 / num2;
    
    //return the quotient of num1 and num2
    return quotient;
    
  }//end of quotient
  
}//end of class









/*

There are more methods than just main method

We can just make our own method

we can make a method that does somethin specific

when I say function or method I mean the same thing

int sum = 0; <== I'm declaring it and initializing it right now using "0". Let's not only declare it, but declare it and initialize it with a value of zero.

every function has its own module

FROM HERE ON OUT WE'RE GOING TO START MAKING OUR OWN METHODS!!!
*/














