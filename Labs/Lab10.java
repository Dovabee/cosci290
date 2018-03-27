/*
  Francisco Delgado
  
  Co Sci 290
  
  Do the problem in the book: 

  *3.8 (Sort three integers) Write a program that prompts the user to enter
  three integers and display the integers in non-decreasing order.

  HINT: You'll be using if-elseif-else for this problem. 
  
  
  Put numbers in order from smallest to largest
  input: 7 5 10
  
  we want output to be: 5 7 10
  
*/

//import Scanner from java package
import java.util.Scanner;

//class
public class Lab10{
  
  //start of application
  public static void main(String[] args){
    
    //initialize Scanner
    Scanner input = new Scanner(System.in);
    
    //variable declarations
    int firstnum;
    int secondnum;
    int thirdnum;
    
    //COMPARE THE INTEGERS WITH EACHOTHER!!
    
    //prompt user to enter three integers
    System.out.println("Enter three integers: ");
      firstnum = input.nextInt();
      secondnum = input.nextInt();
      thirdnum = input.nextInt();
    
    System.out.println(" ");
    
    //If firstnum is less than both the secondmum and thirdnum, then this if will be executed
    if (firstnum < secondnum && firstnum < thirdnum){
      if (secondnum > thirdnum){
        System.out.println(firstnum + " " + thirdnum + " " + secondnum);
      }else if (thirdnum > secondnum){
        System.out.println(firstnum + " " + secondnum + " " + thirdnum);
      }
        }
    
    //If secondnum is less than both the secondmum and thirdnum, then this if will be executed
    if (secondnum < firstnum && secondnum < thirdnum){
      if (firstnum > thirdnum){
        System.out.println(secondnum + " " + thirdnum + " " + firstnum);
      }else if (thirdnum > firstnum){
        System.out.println(secondnum + " " + firstnum + " " + thirdnum);
      }
        }
    
    //If "thirdnum" is less than both the firstnum and secondnum, then this if will be executed
    if (thirdnum < firstnum && thirdnum < secondnum){
      if (firstnum > secondnum){
        System.out.println(thirdnum + " " + secondnum + " " + firstnum);
      }else if (secondnum > firstnum){
        System.out.println(thirdnum + " " + firstnum + " " + secondnum);
      }
        }
    
  }
}

/*
  ADD THIS TO THE "NotesAndStuff" FOLDER
  
  How to nest ifs:
  
  if (firstnum < secondnum){
      System.out.println(firstnum);
    }else if (firstnum < thirdnum){
        System.out.println(thirdnum);
    }
    
    if (secondnum < firstnum){
      if (secondnum < thirdnum){
        System.out.println(secondnum);
      }
    }
    
    if (thirdnum < firstnum){
      if (thirdnum < secondnum){
        System.out.println(thirdnum);
      }
    }
  
*/

/*
  MAKE SURE TO CORRECT COMMENTS AND ADD TO THE "NotesAndStuff" FOLDER
  
  if (firstnum < secondnum && firstnum < thirdnum){
      //I don't need to display "firstnum" here because the conditions are already met
      //the second if will make sure to display firstnum
      if (secondnum > thirdnum){
        System.out.println(firstnum + " " + thirdnum + " " + secondnum);
      }else if (thirdnum > secondnum){
        System.out.println(firstnum + " " + secondnum + " " + thirdnum);
      }
        }
    if (secondnum < firstnum && secondnum < thirdnum){
      //I don't need to display "firstnum" here because the conditions are already met
      //the second if will make sure to display firstnum
      if (firstnum > thirdnum){
        System.out.println(secondnum + " " + thirdnum + " " + firstnum);
      }else if (thirdnum > firstnum){
        System.out.println(secondnum + " " + firstnum + " " + thirdnum);
      }
        }
    if (thirdnum < firstnum && thirdnum < secondnum){
      //I don't need to display "firstnum" here because the conditions are already met
      //the second if will make sure to display firstnum
      if (firstnum > secondnum){
        System.out.println(thirdnum + " " + secondnum + " " + firstnum);
      }else if (secondnum > firstnum){
        System.out.println(thirdnum + " " + firstnum + " " + secondnum);
      }
        }
*/

/*
  
  Do this problem from the book:

  3.12 (Palindrome number) Write a program that prompts the user to enter
  a three-digit integer and determines whether it is a palindrome number.
  A number is a palindrome if it reads the same from right to left and from left to right.
  
*/




































