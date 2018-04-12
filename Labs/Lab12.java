/*
	Francisco Delgado
	Lab 12
	Directions:
	1. This application has bugs. Edit my code so that the program compiles and runs.
	2. Comment every line of code.
	3. Add code and/or modify the code so that the following output is achieved:
	Sample output with odd number:
	------------------------------------------------------
  This program will check if a number is even or odd...
	Please enter in a whole number...
	3
	The number 3 is odd...
	Sample output with even number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	2
	The number 2 is even...
	-------------------------------------------------------
	NOTE: Preserve the indentation of the code. 
	Clean java code has:
	 proper indentation
	 variable declaration at the beginning of the program
	 class name starts with a capital
	 comments that explains the logic
*/
//importing Scanner from java.util package
import java.util.Scanner;

//class
public class Lab12{

	//start of program execution
  public static void main(String[] args){

		//initialize Scanner
    Scanner input = new Scanner(System.in);
		
    //variables
    int num;

		//prompt user to enter a whole number
    System.out.println("This program will check if a number"
			+  " is even or odd...");
		System.out.println("Please enter in a whole number...");
		  num = input.nextInt();
		
    /*
      Any even number divided by 2 will always give an even quotient.
      Every other number that isn't even when divided by 2 will
      result in an odd number
    */
    if(num % 2 == 0){
			System.out.println("The number " + num + " is even...");
		}
    else
      System.out.println("The number " + num + " is odd...");
	}
	}
















