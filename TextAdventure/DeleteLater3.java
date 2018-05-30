//This file is only to make edits to the game to be copied when finished.

//importing Scanner package
import java.util.Scanner;

//Braindead
public class DeleteLater3 {

//Application... START!!
  public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in); //Scanner initialized
    String response = "";
    String action = "";
    
    //Gameplay starts
    StartingSplashScreen();
    intro();
    
    System.out.println("You got 2 hours to KILL. What do you want to do?");
    
    //Space added here. Will now add spacing to make the game look more aesthitic
    System.out.println(" ");
    
    System.out.println("Eat breakfast or head to the docks? ");
    response = input.next();
    Scene1(response);
    action = input.next();
    Scene2(action);
    EndingSplashScreen();
      
  }//end of main
        
  //starting splash screen method  
  public static void StartingSplashScreen(){
    
        //splash screen
        System.out.println("  :::====  :::====  :::====  ::: :::= === :::====  :::===== :::====  :::====  \n "
                          + " :::  === :::  === :::  === ::: :::===== :::  === :::      :::  === :::  === \n "
                          + " =======  =======  ======== === ======== ===  === ======   ======== ===  === \n "
                          + " ===  === === ===  ===  === === === ==== ===  === ===      ===  === ===  === \n "
                          + " =======  ===  === ===  === === ===  === =======  ======== ===  === =======  \n ");
    
    }//end of StartingSplashScreen method
  
  //start intro method
  public static void intro(){
    
    //intro
    System.out.println("Last Night you went to a huge mansion party on Catalina Island. You just woke up from raging it the night before. ");
    System.out.println("You remembered you have to catch the boat back home in the morning. It's 8:00 a.m. You got 2 hours to make it ");
    System.out.println("to the docks. You're not worried, the docks are only 5 miles away. You figure a Uber will get you there ");
    System.out.println("in 10 min. You have time. But little did you know Everyone was drugged on the island except you. They are all");
    System.out.println("Branded Zombies with a hunger for your flesh ");
    System.out.println("What do you do? ");
    System.out.println("How will you survive? ");
    
  }//end of intro method
  
  //start of Scene 1 method
  public static void Scene1(String response){
  
    /*
      System.out.println("You got 2 hours to KILL. What do you want to do?");
    
      //Space added here. Will now add spacing to make the game look more aesthitic
      System.out.println(" ");
    
      //Gameplay starts
      System.out.println("Eat breakfast or head to the docks? ");
    
      System.out.println(" ");
    */
    
    //Player gives response to question
    //response = input.next();
  
    if((response.toLowerCase()).equals("breakfast")){
      System.out.println("Let's go downstairs to the kitchen.");
      
      System.out.println(" ");
      
      System.out.println("As you walk to the kitchen, you notice everyone is dead. You freak out " +
                         "and run outside");
      System.out.println("You try and look for help, but you notice there are braindead zombies everywhere! ");
      System.out.println("Time to make a move ");
      
      System.out.println(" ");
    }
    
    else if((response.toLowerCase()).equals("docks")){
      
      System.out.println(" ");
      
      System.out.println("You take out your phone and call an Uber");
      
      System.out.println(" ");
      
      System.out.println("You patiently wait for the Uber to come no matter how long it takes because "
                       + "you don't want to pay the cancellation fee.");
      
      System.out.println("You eventually die of thirst. The end! ");
        
      //GAME OVER!
      EndingSplashScreen();
      System.exit(0);
    }
      else{int x = 0; 
           do { 
             System.out.println(x); 
             x++; 
           } while(x < 10);
           System.out.println("I don't understand that ");//remember to add loop later
          }
      
      
      
      //THIS QUESTION LEADS TO SCENE 2 METHOD
      System.out.println("Run or call for help? ");
    
  }//end of Scene1 method
      
  /*
      Player decides either to run or call for help
      action = input.next();
  */
      
  //start of Scene2 method
  public static void Scene2(String action){
    
      if((action.toLowerCase()).equals("run")){
        System.out.println("You run inside the mansion, find a room for safety, and lock the door. ");
      }
      else if((action.toLowerCase()).equals("call")){
        System.out.println("GREAT... the phone isn't working! RUN ");
      }
      else{
      System.out.println("I don't understand that ");//remember to add loop later
    }
    
}//end of Scene2 method
      
     public static void EndingSplashScreen(){
      
      System.out.println("  ____    ______           ____        _____   __  __  ____    ____    __                                      \n"
                      + " /\\  _`\\ /\\  _  \\  /'\\_/`\\/\\  _`\\     /\\  __`\\/\\ \\/\\ \\/\\  _`\\ /\\  _`\\ /\\ \\                      \n"
                      + " \\ \\ \\L\\_\\ \\ \\L\\ \\/\\      \\ \\ \\L\\_\\   \\ \\ \\/\\ \\ \\ \\ \\ \\ \\ \\L\\_\\ \\ \\L\\ \\ \\ \\        \n"
                      + "  \\ \\ \\L_L\\ \\  __ \\ \\ \\__\\ \\ \\  _\\L    \\ \\ \\ \\ \\ \\ \\ \\ \\ \\  _\\L\\ \\ ,  /\\ \\ \\            \n"
                      + "   \\ \\ \\/, \\ \\ \\/\\ \\ \\ \\_/\\ \\ \\ \\L\\ \\   \\ \\ \\_\\ \\ \\ \\_/ \\ \\ \\L\\ \\ \\ \\\\ \\\\ \\_\\    \n"
                      + "    \\ \\____/\\ \\_\\ \\_\\ \\_\\\\ \\_\\ \\____/    \\ \\_____\\ `\\___/\\ \\____/\\ \\_\\ \\_\\/\\_\\            \n"
                      + "     \\/___/  \\/_/\\/_/\\/_/ \\/_/\\/___/      \\/_____/`\\/__/  \\/___/  \\/_/\\/ /\\/_/                          \n");
     
     }//end of EndingSplashScreen method
      
    
    
  }