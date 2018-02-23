//importing Scanner package
import java.util.Scanner;

//Braindead
public class BrainDead{

//Application... START!!
  public static void main(String[] args){
   
    Scanner input = new Scanner(System.in); //Scanner initialized
        
        //splash screen
        System.out.println("  :::====  :::====  :::====  ::: :::= === :::====  :::===== :::====  :::====  \n "
                          + " :::  === :::  === :::  === ::: :::===== :::  === :::      :::  === :::  === \n "
                          + " =======  =======  ======== === ======== ===  === ======   ======== ===  === \n "
                          + " ===  === === ===  ===  === === === ==== ===  === ===      ===  === ===  === \n "
                          + " =======  ===  === ===  === === ===  === =======  ======== ===  === =======  \n ");
    
    
    //Finish intro later
    System.out.println("You got 2 hours to KILL. What do you want to do?");
    
    //Space added here. Will now add spacing to make the game look more aesthitic
    System.out.println(" ");
    
    //Gameplay starts
    System.out.println("Eat breakfast or head to the docks? ");
    
    //Player gives response to question
    String response = input.next();
  
    if((response.toLowerCase()).equals("breakfast")){
      System.out.println("Let's go downstairs to the kitchen.");
      
      System.out.println(" ");
      
      System.out.println("As you walk to the kitchen, you notice everyone is dead. You freak out " +
                         "and run outside");
      System.out.println("You try and look for help, but you notice there are braindead zombies everywhere! ");
      System.out.println("Time to make a move ");
      
      System.out.println(" ");
      
      System.out.println("Run or call for help? ");
      
      //Player decides either to run or call for help
      String action = input.next();
      
      //1st nested if and else if
      if((action.toLowerCase()).equals("run")){
        System.out.println("You run inside the mansion, find a room for safety, and lock the door. ");
      }
      else if((action.toLowerCase()).equals("call")){
        System.out.println("GREAT... the phone isn't working! RUN ");
      }
      
    }
    else if((response.toLowerCase()).equals("docks")){
      System.out.println("Call an Uber");
    }
    else{
      System.out.println("I don't understand that ");
    }
    
    
  
    }
  }










































































