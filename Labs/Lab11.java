/*
  Francisco Delgado
  
  Co Sci 290
  
  Do this problem from the book:

  3.12 (Palindrome number) Write a program that prompts the user to enter
  a three-digit integer and determines whether it is a palindrome number.
  A number is a palindrome if it reads the same from right to left and from left to right.
  
*/

//import Scanner from java package
import java.util.Scanner;

//class
public class Lab11{
  
  //entry point of application
  public static void main(String[] args){
    
    //initialize Scanner
    Scanner input = new Scanner(System.in);
    
    //variable declarations
    int ThreeDigitInt;
    int lastdigit;
    int middledigit;
    int firstdigit;
    int ThreeDigitNum;
    int quotient;
    
    //prompt user to enter a 3 digit integer
    System.out.println("Enter a 3 digit integer: ");
      ThreeDigitNum = input.nextInt();
    
    lastdigit = ThreeDigitNum % 10;
    
    quotient = ThreeDigitNum / 10;
    
    middledigit = quotient % 10;
    
    firstdigit = quotient / 10;
    
    //Check to see if the first digit and last digit is the same
    if (firstdigit == lastdigit){
      System.out.println(ThreeDigitNum + " is a palindrome.");
    }
    else
      System.out.println(ThreeDigitNum + " is not a palindrome.");
      
  }
}
//I collaborated with Cesar










































