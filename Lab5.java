/*
  Francisco Delgado
  Co Sci 290
  
  Lab 5
  - fix the logic and make this code check if each character is a letter
*/

import java.util.Scanner;
public class Lab5{

  public static void main(String[] args){
    //instantiate the Scanner object
    Scanner input = new Scanner(System.in);
    
    int nameLength = 0;
    String answer = "";
    boolean flag = true; 
    
    //example of a while loop
    while(nameLength < 2){
      
      System.out.println("What is your name?");
    
      //get answer from console
      answer = input.next();
      
      //check if name contains only letter
      while(flag){
        //use a for-loop because we know how many letters it has
        for(int index = 0; index < answer.length(); index++){

          System.out.println(answer.charAt(index));

          //check if the character is a letter
          if(!Character.isLetter(answer.charAt(index))){ //if it's not a letter
            flag = true; //character is not a letter
            System.out.println("Please enter in a name that only has letters");
            answer = input.next();
            break; //gets out of current loop
          }
          else{ //the character is a letter
            flag = false;
          }
        }//end of for-loop

      } //end of while-loop
      
      //check if name is less than 2 characters
      if(answer.length() < 2){
      System.out.println("Please enter in a name that is at least "
                        + "two letters long");
      }
      
      nameLength = answer.length();
      
      if(answer.length() > 2 && !flag){
        break; //get out of the loop to stop asking
      }
      
    } //end while loop
    

        

    
  } //end of main method
} //end of class