/*

  Francisco Delgado
  
  Co Sci 290
  
  Do two problems (do these problems look familiar?):

  *6.2 (Sum the digits in an integer)

  Write a method that computes the sum of the digits in an integer. Use the following method header:

  public static int sumDigits(int n)

  Max digit size of n is 3.

  For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % operator to extract digits, and the / operator to remove the extracted digit. For instance, to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10 (= 23). 

 
  
  *6.5 (Sort three numbers)

  Write a method with the following header to display three numbers in increasing order:

  public static void displaySortedNumbers( double num1, double num2, double num3)

 

  Plus 2 points if done by the end of class, otherwise, due by 04/26/18 at 1:30PM.
  
*/

//import Scanner from java.util package
import java.util.Scanner;

//class
public class Lab15{
  
  //start of program execution
  public static int sumDigits(int n){
    
    //initializing Scanner
    Scanner input = new Scanner(System.in);
    
    //variable declarations
    int lastdigit;
    int middledigit;
    int firstdigit;
    int quotient;
    int num;
    int sum;
    
    //prompt user to enter an integer. Max number of digits possible to input is 3.
    System.out.println("Enter a number between 0 and 1000: ");
      num = input.nextInt();
    
    //last digit isolated
    lastdigit = num % 10; 
       
    //middle digit and last digit now == quotient
    quotient = num / 10;
    
    //middle digit isolated
    middledigit = quotient % 10;
    
    //first digit isolated
    firstdigit = quotient / 10;
    
    //Calculate the total sum of the digits
    sum = firstdigit + middledigit + lastdigit;
    
    System.out.println(" ");
    
    //Display results
    System.out.println("The sum of all the digits is " + sum);
    
    System.out.println(" ");
    
    
    
  }
}

/*

  USING A DIFFERENT METHOD

  //import Scanner from java.util package
import java.util.Scanner;

//class
public class Lab9{
  
  //start of program execution
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
    
    //prompt user to enter an integer. Max number of digits possible to input is 3.
    System.out.println("Enter a number between 0 and 1000: ");
      num = input.nextInt();
    
    //last digit isolated
    lastdigit = num % 10; 
       
    //middle digit and last digit now == quotient
    quotient = num / 10;
    
    //middle digit isolated
    middledigit = quotient % 10;
    
    //first digit isolated
    firstdigit = quotient / 10;
    
    //Calculate the total sum of the digits
    sum = firstdigit + middledigit + lastdigit;
    
    System.out.println(" ");
    
    //Display results
    System.out.println("The sum of all the digits is " + sum);
    
    System.out.println(" ");
    
    
    
  }
}
*/








































