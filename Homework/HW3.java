/*
  Francisco Delgado
  
  Co Sci 290
  
  Homework due March 22
  
  In the book, do problems
    - 2.12 (Physics: finding runway
     length)
    - 2.13 (Financial application:
      compounf value)
    - 2.14 (Health application: computing
      BMI)
*/

//importing Scanner from java.util package
import java.util.Scanner;


//class
public class HW3{
  
  //program execution
  public static void main(String[] args){
       
    //initializing Scanner
    Scanner input = new Scanner(System.in);
    
    //Beginning problem 2.12
    
    //variable declaration
    double length;
    double v;
    double a;
    
    System.out.println(" ");
    
    //prompt user to enter speed and accelaration of airplane
    System.out.println("Enter speed and acceleration: ");
    
    //airplane's take-off speed
    v = input.nextDouble();
    
    //airplane's acceleration
    a = input.nextDouble();
    
    System.out.println(" ");
    
    //formula for minimum runway length
    length = (Math.pow(v, 2) / (2 * a));
    
    System.out.println("The minimum runway length needed for the airplane is "
                       + length + ".");
    
    System.out.println(" ");
    
    //Beginning problem 2.13
    
    //variable declarations
    double monthlySavingAmount;
    double accountValue;
    double firstMonth;
    double secondMonth;
    double thirdMonth;
    double fourthMonth;
    double fifthMonth;
    
    //Prompt user to enter a monthly saving amount
    System.out.print("Enter a monthly saving amount: ");
    monthlySavingAmount = input.nextDouble();
    
    System.out.println(" ");
    
    //account value after first month
    firstMonth = monthlySavingAmount * (1 + 0.00417);
    //account value after second month
    secondMonth = (100 + firstMonth) * (1 + 0.00417);
    //account value after third month
    thirdMonth = (100 + secondMonth) * (1 + 0.00417);
    //account value after fourth month
    fourthMonth = (100 + thirdMonth) * (1 + 0.00417);
    //acccount vallue after fifth month
    fifthMonth = (100 + fourthMonth) * (1 + 0.00417);
    //account value after six months
    accountValue = (100 + fifthMonth) * (1 + 0.00417);
    
    //display the account value after six months
    System.out.println("After the sixth month, the account value is $" +
                       (int)(accountValue * 100) / 100.0);
    
    System.out.println(" ");
    
    /*
      
      MAKE A NEW FILE AND PUT THIS IN THE "NotesAndStuff" FOLDER!!!!
      
      To cast a double into an int (integer), simply multiply number
      by 100 THEN DIVIDE by 100
      
      example: (int)(randomNum * 100) / 100.0
      
      The variable "randomNum" is any number the user has inputted
      -------------------------------------------------------------
      - To raise a number by a power, for example 2 to the power
        of 3 is 8.
       
      - This is how you raise a number by a power in java
      
      System.out.println(Math.pow(2, 3));
      
    */
    
    //Beginning problem 2.14
    
    //variable declarations
    double pounds;
    double inches;
    double BMI;
    double kilograms;
    double meters;
                      
    //prompt user to enter weight in pounds and height in inches
    System.out.println("Enter weight in pounds: ");
      pounds = input.nextDouble();
    System.out.println("Enter height in inches: ");
      inches = input.nextDouble();
    
    //convert pounds to kilograms
    kilograms = 0.45359237 * pounds;
    
    //convert inches to meters
    meters = 0.0254 * inches;
    
    //Formula for Body Mass Index (BMI)
    BMI = kilograms / Math.pow(meters, 2);
    
    //Display results
    System.out.println("BMI is " + BMI);
    
    System.out.println(" ");
    
  }
}






















































































































