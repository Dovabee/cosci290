/*
  Francisco Delgado
  Co Sci 290
  
  Demo on the String class
*/

import java.util.Scanner;
public class TestStrings{
  
  //main method
  public static void main(String[] args){
    
    //instantiate the Scanner object
    Scanner input = new Scanner(System.in);
    
    
    
    //ask the user a question
    System.out.println("Are you rich? Yes or No?");
    
   
    //answer = answer.toLowerCase();
    
    /*
      Impose some rules on user input
      name.length() = gives a int of how many characters the String is long
      
    */
    
    //example of a while loop
    
    int nameLength = 0;
    String answer = "";
    boolean flag = false;
    
    /*
      Using Pseudocode write your logic
      
      while the user gives a name that is less than 2 characters{
      
        check if input is < two characters
          and keep prompting
        else{
          the input is > than 1 character
          now check if each character is a letters
          
          for each character in input{
             if the char is not a letter{
                get out of the loop
            }
          }
        
        }
      }
    
    */
    
    //example of a while loop
    while(nameLength() < 2 || !flag){
      
      System.out.println("What is your name?");
 
    //get answer from console
    answer = input.next();
    
      //check if name is less than 2 characters
      if(answer.length() < 2 && flag){
      System.out.println("Please enter in a name that is at least"
                        + "two characters long and no numbers");
    }
    else{ //name is at least 2 characters
      
      //check if name contains letters
      
      //for example, go through each letters in the name "Lo!gan"
      //name.charAt(0) to look at the character in index 0
      
      //use a for-loop because we know how many letters it has
      for(int index = 0; index < answer.length(); index++){
        
        System.out.println(ansewr.charAt(index));
        
        //check if the character is a letter or number
        if(!Character.isLetter(answer.charAt(index))){ //if it is not a letter
          flag = true;
          break; //gets out of current loop
        }
        
      }
      
    }
      
      
      nameLength = answer.length();
  } //end of while loop
    
    /*
      When you want code to run at least once, use a do while loop
      
      do{
        
        the body with code.
        
      }
      
      
    */
    
     /*
      Examples below is to test for specific response
      
      answer.toLowerCase() = makes all letters lowercase
      answer.toUpperCase() - makes all letters uppercase
      answer.equals("some other string") - checks if two Strings are
        exactly the same
      answer.equalsIgnoreCase("no") - checks if two Strings are equal regardless of case
      
    */
    
    
    //check if answer is specifically Yes or No
    if(answer.equalsIgnoreCase("No")){ //"no" != "No" != NO
      System.out.println("That sucks!");
  }
  else{
    System.out.println("Cool.");
  }
  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}