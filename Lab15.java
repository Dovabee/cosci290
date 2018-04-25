/*

  Francisco Delgado
  
  Co Sci 290
  
  Do two problems (do these problems look familiar?):

  *6.2 (Sum the digits in an integer)

  Write a method that computes the sum of the digits in an integer. Use the following method header:

  public static int sumDigits(int n)

  Max digit size of n is 3.

  For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % operator to extract digits, and the / operator to remove the
                                                      extracted digit. For instance, to extract 4 from 234, use 234 % 10 (= 4). 
                                                      To remove 4 from 234, use 234 / 10 (= 23). 

 
  
  *6.5 (Sort three numbers)

  Write a method with the following header to display three numbers in increasing order:

  public static void displaySortedNumbers( double num1, double num2, double num3)

 

  Plus 2 points if done by the end of class, otherwise, due by 04/26/18 at 1:30PM.
  
*/

//import Scanner from java.util package
import java.util.Scanner;

public class Lab15{
  
  //start of program
  public static void main(String[] args){
    
    //variable declarations
    int num = 0;
    int n = num;
    
    //prompt user to enter an integer (max 3 digits allowed)
    System.out.println("Enter an integer (max of 3 digits allowed): ");
    
    System.out.println("The sum of the digits in the integer is " + sumDigits(n) + ".");
    
    System.out.println(" ");
    
    System.out.println("Enter another integer (max of 3 digits allowed): ");
    
    System.out.println(displaySortedNumbers());
    
  }//end of main
  
  //This method finds the sum of all the digits in a number (max 3 digits).
  public static int sumDigits(int n){
    
    //initializing Scanner for sumDigits method
    Scanner input = new Scanner(System.in);
    
    //variable declarations
    int lastdigit;
    int middledigit;
    int firstdigit;
    int quotient;
    int num = 0;
    int sum = 0;
    
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
    sum = lastdigit + middledigit + firstdigit;
    
    return sum;
    
  }//end of sumDigits
  
  /*
  
    BEGINNING PROBLEM 6.5
    
  */
  
  public static void displaySortedNumbers( double num1, double num2, double num3){
    
    //initializing Scanner for displaySortedNumbers method
    Scanner input = new Scanner(System.in);
    
    //variable declarations
    int Lastdigit;
    int Middledigit;
    int Firstdigit;
    int quotient2;
    int nextnum = 0;
    double order;
    
    nextnum = input.nextInt();
    
    //last digit isolated
    Lastdigit = nextnum % 10;
       
    //middle digit and last digit now == quotient
    quotient2 = nextnum / 10;
    
    //middle digit isolated
    Middledigit = quotient2 % 10;
    
    //first digit isolated
    Firstdigit = quotient2 / 10;
    
    //If num1 is less than both the secondmum and num3, then this if will be executed
    if (num1 < num2 && num1 < num3){
      if (num2 > num3){
        System.out.println(num1 + " " + num3 + " " + num2);
      }else if (num3 > num2){
        System.out.println(num1 + " " + num2 + " " + num3);
      }
        }
    
    //If num2 is less than both the secondmum and num3, then this if will be executed
    if (num2 < num1 && num2 < num3){
      if (num1 > num3){
        System.out.println(num2 + " " + num3 + " " + num1);
      }else if (num3 > num1){
        System.out.println(num2 + " " + num1 + " " + num3);
      }
        }
    
    //If "num3" is less than both the num1 and num2, then this if will be executed
    if (num3 < num1 && num3 < num2){
      if (num1 > num2){
        System.out.println(num3 + " " + num2 + " " + num1);
      }else if (num2 > num1){
        System.out.println(num3 + " " + num1 + " " + num2);
      }
        }
    
  }//end of displaySortedNumbers
  
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

/*
  //This method finds the sum of all the digits in a number (max 3 digits).
  public static int sumDigits(int n){
    
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
*/

/*
  //declare variables
    int num = 0;
    int n = num;
    
    //prompt user to enter an integer (max 3 digits allowed)
    System.out.println("Enter an integer (max of 3 digits allowed): ");
    
    System.out.println("The sum of the digits in number " + num + " is " + sumDigits(n) + ".");
    
    num always ends up being 0. I have no idea how to fix it right now
    
*/








































