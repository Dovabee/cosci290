import java.util.Scanner; 

public class Zombie {
  
  public static void main(String[] args) {
    
    int numberOfStudents = 29;
    double avgGPA = 3.78;
    String name = "";
    String job = "";
    String alone = "";
    
    boolean gameOver = false; //or true
    int age = 0;
    
    // Create a Scanner object
    Scanner input = new Scanner (System.in);
    
    //Make the user answer 3 question pertaining to the start of zombie game
    
    //What is your name?
    System.out.println("What is your name?");
      
    name = input.next();
    
    //Starting profession
    System.out.println("What is your job?");
    
    job = input.next();
    
    //Are you alone?
                       
    System.out.println("Are you alone?");
    
    alone = input.next();
    
    
    
   
      
    
  }
}