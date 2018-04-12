/*
  
  Francisco Delgado
  
  Co Sci 290
  
  Midterm test
  
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
    int lastdigit;
    int middledigit;
    int firstdigit;
    int FiveDigitnumber;
    int temp1;
    int secondlastdigit;
    int temp2;
    int temp3;
    int secondDigit;
    int FIVEdigitnum;
    
    //prompt user to enter a 5 digit integer
    System.out.println("Enter a 5 digit integer: ");
      FiveDigitnumber = input.nextInt();
      
    FIVEdigitnum = FiveDigitnumber;
    
    lastdigit = FiveDigitnumber % 10;
    
    temp1 = FiveDigitnumber / 10;
    
    secondlastdigit = temp1 % 10;
    
    temp2 = FiveDigitnumber = temp1 / 10;
    
    middledigit = temp2 % 10;
    
    temp3 = temp2 / 10;
    
    secondDigit = temp3 % 10;
    
    firstdigit = temp3 / 10;
    
    /*
      
      Check to see if the first digit and last digit is the same, as well
      as the second digit and the second last digit.
      
    */
    if (firstdigit == lastdigit && secondDigit == secondlastdigit){
      System.out.println(FIVEdigitnum + " is a palindrome.");
    }
    else
      System.out.println(FIVEdigitnum + " is not a palindrome.");
      
  }
}










































