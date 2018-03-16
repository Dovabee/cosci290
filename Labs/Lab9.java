/*
  Francisco Delgado
  
  Co Sci 290
  
  Lab 9
  
  **2.6 (Sum the digits in an integer) Write a program that reads an integer between 0 and 1000 and adds
  all the digits in the integer. For example, if an integer is 932, the sum of all its digits is 14. 
  Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit. 
  For instance, 932 % 10 = 2 and 932 / 10 = 93.
*/

//import Scanner from java.util package
import java.util.Scanner;

//class
public class Lab9{
  
  //Beginning of application
  public static void main(String[] args){
    
    //initializing Scanner
    Scanner input = new Scanner(System.in);
    
    //variable declarations
    int lastdigit;
    int middledigit;
    int firstdigit;
    int quotient;
    int num;
    int sum;
    
    //prompt user to enter a number
    System.out.println("Enter a number between 0 and 1000: ");
      num = input.nextInt();
    
    //For now num == 932
    //Extract all digits from 932 ==> Separate the "9", "3", and "2"
    lastdigit = num % 10; //932 % 10 == 2 -- We have extracted the last digit "2"!
       
    //Now isolate the digit "3" in 932 using division
    quotient = num / 10;  /* 932 / 10 == 93 -- We have 93, but now we use remainder to remove the middle digit "3"
                                                 in 93. Now we divide 93 by 10 to isolate the "3"
                             */
    
    middledigit = quotient % 10; // 93 % 10 == 3 -- We have isolated the middle digit "3"
    
    /* 
      We still have our quotient "93". remainder does nothing so we're just left with division
      Now all that's left is the first digit, which is "9" in 932
      REMEMBER! quotient == 93
    */
    firstdigit = quotient / 10; /* 93 / 20 == 9 -- We have isolated the first digit "9". All that's left to
                                                   to do now is add all the digits together!
    
                                */
    
    //Calculate the total sum of the digits
    sum = firstdigit + middledigit + lastdigit;
    
    System.out.println(" ");
    
    //Display results
    System.out.println("The sum of all the digits is " + sum);
    
    System.out.println(" ");
    
  }
}