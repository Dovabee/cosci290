/*
  
  Learn how to transfer values between variables!!!
  
*/
import java.util.Scanner;

public class LearnTemp {
  
  //Start of program
  public static void main(String[] args) {

    // Enter three numbers
    System.out.print("Enter three integers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    int number3 = input.nextInt();

    if (number1 > number2) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
    }

    if (number2 > number3) {
      int temp = number2;
      number2 = number3;
      number3 = temp;
    }

    if (number1 > number2) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
    }

    System.out.println("The sorted numbers are "
      + number1 + " " + number2 + " " + number3);
    
 /*
    Scanner input = new Scanner(System.in);
    
    //declare variables
    int number1;
    int number2;
    int temp;
    int answer;
    
    //1. generate two random single-digit integers
    number1 = (int)(Math.random() * 10);
    number2 = (int)(Math.random() * 10);
    
    //2. If number1 < number2, swap number1 with number2
    if(number1 < number2) {
      temp = number1;
      number1 = number2;
      number2 =temp;
    }
    
    //3. Prompt the student to answer "What is number1 - number2?"
    System.out.println("What is " + number1 + " - " + number2 + "?");
    answer = input.nextInt();
    
    //4. Grade the answer and display the result
    if(number1 - number2 == answer)
      System.out.println("You are correct!");
      else {
        System.out.println("Your answer is wrong.");
        System.out.println(" ");
        System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
      }
  */
      
  }//end of main
}//end of class










































