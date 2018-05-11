/*

  *THIS IS ADAM'S CODE. TESTING TO SEE HOW SWITCH WORKED.*
  
*/
import java.util.Scanner;

public class DeleteLater {
  
  public static void main(String[] args) {
    
    Scanner reader = new Scanner (System.in);
    
    System.out.println("Please enter your name: ");
    
    String input = reader.nextLine();
    char [] letters = input.toCharArray();
    
    int count = 0;
    
    for(char c : letters) {//start of for loop
      switch (c){//start of switch
          case 'A':
          case 'a':
          case 'E':
          case 'e':
          case 'I':
          case 'i':
          case 'O':
          case 'o':
          case 'U':
          case 'u':
            count++;
          break;
        default:
      }//end of switch
      
    }// end of for loop
    
    System.out.println("Your name " + input + " has " + count + " vowels.");
    
  }
}











