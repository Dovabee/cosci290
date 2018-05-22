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

public class DeleteLater2{
  
  //program execution
  public static void main(String[] args){
  
  Scanner input = new Scanner (System.in);
    
    //Declared variables
    int num;
    int counter = 0;
    
    //prompt user to enter an integer
    System.out.println("Enter an integer: ");
    num = input.nextInt();
    
    for(int factor = 2; num % factor != 0; factor++){
      
      if(factor % num == 2){
        counter++;
      }
      
        System.out.println(factor + " ");
      
    }//end of for loop
    
    
    
    
  }//end of main
}//end of class