/*
  Francisco Delgado
  
  Lab 18
  
  Co Sci 290
  
  5.10 (Find numbers divisible by 5 and 6)
  Write a program that displays all the num-
  bers from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are
  separated by exactly one space
  ------------------------------------------------------------------------------------------------
  5.16 (Find the factors of an integer)
  Write a program that reads an integer and displays all its smallest factors in increasing order.
  For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3 , 5 
*/
import java.util.Scanner;

public class Lab18{
  
  //program execution
  public static void main(String[] args){
  
  Scanner input = new Scanner (System.in);
    
    /*
    
      BEGINNING PROBLEM 5.10
      
    */
    
    int counter = 0;
    
    for(int i = 100; i <= 1000;i+=10){
      
      if(i % 5 == 0 || i % 6 == 0){
        counter ++;
        System.out.print(i + " ");
      }
      
      if(counter % 10 == 0){
        System.out.println();
      }
      
    }//end of for loop
    
    //END OF PROBLEM 5.10
    System.out.println(" ");
    System.out.println("End of problem 5.10 ");
    
    /*
    
      BEGINNING PROBLEM 5.16
    
    */
    
    
    
    //Declared variables
    //final int NumOfPrimes = 11;
    //final int PrimesPerLine = 10;
    //int count = 0; //count the number of prime numbers
    //int number = 2; //
    /*
    int number;
    int FirstFactor;
    
    //prompt user to enter an integer
    System.out.println("Enter an integer: ");
    number = input.nextInt();
    
    //example: find the factors of 4
    while(number % 2 == 0){
      
      FirstFactor = number / 2;
      
      System.out.println("The factors of this numbers are: " + FirstFactor + " " + number);
    
    }
    */
    
    //Declared variable
    int factor = 2;
    
    
    
    
  }//end of main
}//end of class































































