/*
  Francisco Delgado
  
  Co Sci 290
  
  Group 5 Quiz #5
*/
import java.util.Scanner;

public class Quiz5{
  
  //start of program execution
  public static void main(String[] args){
    
    Scanner input = new Scanner (System.in);
    int counter = 0;
    
    //Declared variables
    String name = "";
    
    //prompt user to enter their name
    System.out.println("Enter your name: ");
    name = input.next();
    
    for(int i = 0; i < 9;i++){
      
      //testing to find a vowel
      if(name.charAt(i) == 'a'){ //I can use or statements like: if(name.charAt(i) == 'a' || name.charAt(i) == 'i')
        counter++;
        System.out.println("There is one vowel in the name " + name + ".");
      }
    
    }//end of for loop
    
    
    
    
  }//end of main
  
}//end of class


































