/*
  Author:
  
  The purpose of this program is to take in user input
  and do basic math operatons.
  
  To-do: 
  1. Below every single comment line, write the appropriate java code.
  2. Make sure your program is free of errors and runs.
  2. Answer the following questions:
     a. What is the name of this class? 
     Answer: Lab6
     
     b. What is the name of this file? 
     Answer: Lab6.java
     
     c. What is the difference between a class name and a file name? 
     Answer: A file name must end with .java and a class name is only whatever comes after public class.
     
     d. What is the difference between importing Scanner and instantiating Scanner? 
     Answer: importing a scanner means that you take a package from java while instantiating a Scanner allows for user input
     
   Sample output of running this program:
   
   Please enter in a whole number.
   3
   The sum of 3 and 5 is 8
  
*/

//import Scanner for usage
import java.util.Scanner;

public class Lab6{

  //entry point of app
  public static void main(String[] args){
    
    //instantiate the Scanner object for usage, call it input
    Scanner input = new Scanner (System.in);

      
    //declare a variable that is type int and call this variable num
    int num;

    
    //declare a variable that is type int and call this variable sum
    int sum;

    
    //prompt the user with this message "Please enter in a whole number."
    System.out.println("Please enter a whole number");

      
    /*
      using Scanner, which is called input, get the int from user input, 
      then assign it to the num variable
    */
    num = input.nextInt();

    
    //add num to 5 and assign this to sum
    sum = num + 5;

    
    //prompt the user with the sum
    System.out.println("The sum of " + num + " and 5 is " + sum);
    
    
  }
  
}