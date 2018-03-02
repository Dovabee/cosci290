//importing Scanner package
import java.util.Scanner;

//Braindead
public class BrainDead{

//Application... START!!
  public static void main(String[] args){
   
    Scanner input = new Scanner(System.in); //Scanner initialized
    String response = "";
    String action = "";
        
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
    
    System.out.println(" ");
    
    //Player gives response to question
    response = input.next();
  
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
      action = input.next();
      
      //1st nested if and else if
      if((action.toLowerCase()).equals("run")){
        System.out.println("You run inside the mansion, find a room for safety, and lock the door. ");
      }
      else if((action.toLowerCase()).equals("call")){
        System.out.println("GREAT... the phone isn't working! RUN ");
      }
      
    }
    else if((response.toLowerCase()).equals("docks")){
      
      System.out.println(" ");
      
      System.out.println("You take out your phone and call an Uber");
      
      System.out.println(" ");
      
      System.out.println("You patiently wait for the Uber to come no matter how long it takes because "
                       + "you don't want to pay the cancellation fee.");
      
       System.out.println("You eventually die of thirst. The end! ");
                        
      
     System.out.println("  ____    ______           ____        _____   __  __  ____    ____    __                                      \n"
                      + " /\\  _`\\ /\\  _  \\  /'\\_/`\\/\\  _`\\     /\\  __`\\/\\ \\/\\ \\/\\  _`\\ /\\  _`\\ /\\ \\                      \n"
                      + " \\ \\ \\L\\_\\ \\ \\L\\ \\/\\      \\ \\ \\L\\_\\   \\ \\ \\/\\ \\ \\ \\ \\ \\ \\ \\L\\_\\ \\ \\L\\ \\ \\ \\        \n"
                      + "  \\ \\ \\L_L\\ \\  __ \\ \\ \\__\\ \\ \\  _\\L    \\ \\ \\ \\ \\ \\ \\ \\ \\ \\  _\\L\\ \\ ,  /\\ \\ \\            \n"
                      + "   \\ \\ \\/, \\ \\ \\/\\ \\ \\ \\_/\\ \\ \\ \\L\\ \\   \\ \\ \\_\\ \\ \\ \\_/ \\ \\ \\L\\ \\ \\ \\\\ \\\\ \\_\\    \n"
                      + "    \\ \\____/\\ \\_\\ \\_\\ \\_\\\\ \\_\\ \\____/    \\ \\_____\\ `\\___/\\ \\____/\\ \\_\\ \\_\\/\\_\\            \n"
                      + "     \\/___/  \\/_/\\/_/\\/_/ \\/_/\\/___/      \\/_____/`\\/__/  \\/___/  \\/_/\\/ /\\/_/                          \n");
    }
    else{
      System.out.println("I don't understand that ");//remember to add loop later
    }
    
    
    
    
  
    }
  }

//splash screen












































































