/*
  Francisco Delgado
  Co Sci 290
  
  Lab - comment every single line of code
  
  inputs: Please enter in a whole number...
            3
            Please enter in another whole number...
            3
  
  Output: Let's do some basic math!
          Here are the numbers you chose.
          Operand1: 3 and Operand2: 3
          6
          9
          1
          0
          
          This is a program that displays the results of the sum, product, quotient, and differences
          of the inputs.
  
*/

//This imports the Scanner file from the java folder
import java.util.Scanner;

//Practice1 <== class name defined.
public class Practice1{//This is a class block that groups the code in-between braces
  
  //This is the main method. This program is executed because of the main method
  public static void main(String[] args){
    
    //To perform inputs you need to use the Scanner class
    Scanner input = new Scanner(System.in);
    
    //This line declares that it will store an integer
    int operand1;
    
    //This line declares that it will store another integer
    int operand2;
    
    //"Please enter in a whole number..." <== this string will be displayed in the commond prompt when the program is executed
    System.out.println("Please enter in a whole number...");
    
    //input.nextInt(); <== This statement will read input from the user. Whatever is inputted will be assigned to ==> operand1
    operand1 = input.nextInt();
    
    //String will be displayed in the command prompt when the program is executed
    System.out.println("Please enter in another whole number...");
    
    //Whatever is inputted from the user will be assigned to ==> operand2
    operand2 = input.nextInt();
    
    //String will be displayed in the command prompt. The plus sign (+) is a string concatenation that combines the two strings
    System.out.println("Let's do some basic math! \n "
                       + "Here are the numbers you chose.");
    
    //Strings are concatenated with variables to be displayed in the command prompt when the program is executed
    System.out.println("Operand1: " + operand1 + " and Operand2: " + operand2);
    
    //The results will display the sum of two operands
    System.out.println(operand1 + operand2);
    
    //The results will display the product of the two operands
    System.out.println(operand1 * operand2);
    
    //the results will display the quotient of the two operands
    System.out.println(operand1 / operand2);
    
    //The results will display the difference of the two operands
    System.out.println(operand1 - operand2);
  }
}


















