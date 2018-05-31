/*
  
  Big props to Cesar for finding out about do while loops!!!
  
*/

/*
Francisco Delgado

Cosci 290

Text Adventure project
*/

//importing Scanner package
import java.util.Scanner;

//Braindead
public class CesarsCode{

//Application... START!!
  public static void main(String[] args){
   
    Scanner input = new Scanner(System.in); //Scanner initialized
    
    //declared variables
    String response = "";
    boolean good = false;
    
    //Gameplay starts
    StartingSplashScreen();
    intro();
    
    
    System.out.println("You got 2 hours to KILL. What do you want to do?");
    
    //Space added here. Will now add spacing to make the game look more aesthitic
    System.out.println(" ");
    
    System.out.println("Eat breakfast or head to the docks? ");
    
    do
    {
   
      response = input.next();
     
      if((response.toLowerCase()).equals("breakfast")){
      good = true;

       System.out.println("Let's go downstairs to the kitchen.");
      
      System.out.println(" ");
      
      System.out.println("As you walk to the kitchen, you notice everyone is dead. You freak out " +
                         "and run outside");
      System.out.println("You try and look for help, but you notice there are braindead zombies everywhere! ");
      System.out.println("Time to make a move ");
      
      System.out.println(" ");
    }
    
    else if((response.toLowerCase()).equals("docks")){
     good = true;
 
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
      else{
      System.out.println("I don't understand that ");//remember to add loop later
    }
      
     }
     while (!good);
 
      
      //TRANSITION TO SCENE 2
    
    System.out.println("Run or call for help? ");
    good = false;
    do
    {
    response = input.next();
     
    if((response.toLowerCase()).equals("run")){
       good = true;  
      System.out.println("You run to the main entrance of the mansion. ");
      }
      else if((response.toLowerCase()).equals("call")){
        good = true;
        System.out.println("You pick up the phone, but it explodes in your face... It's fatal... You die. ");
        
        //GAME OVER!
      EndingSplashScreen();
      System.exit(0);
      }
      else{
      System.out.println("I don't understand that ");//remember to add loop later
    }
     }
     while (!good);
      
    System.out.println(" ");
    
    //TRANSITION TO SCENE 3
    
    
    System.out.println("You see two paths. One leading upstairs, another leading downstairs. " +
                       "downstairs, you hear a faint growling sound... ");
    System.out.println("Which path will you take? Downstairs or upstairs? ");
    
    good = false;
    do
    {
      response = input.next();
      
      if((response.toLowerCase()).equals("upstairs")){
       good = true;  
      System.out.println("Upstairs you enter an office room. ");
      }
      else if((response.toLowerCase()).equals("downstairs")){//find out how to make user input two words later if possible.
        good = true;
        System.out.println("You go downstairs, around the corner a zombie attacks and bites you! ");
        System.out.println("Your infected now. You slowly succumb to the infection and become... a BrainDead zombie. ");
        
        //GAME OVER!
      EndingSplashScreen();
      System.exit(0);
      }
      else{
      System.out.println("I don't understand that. Please enter downstairs or upstairs ");//remember to add loop later
    }
    }
     while (!good);
    
    System.out.println(" ");
    
    //TRANSITION TO SCENE 4
    
    System.out.println("Inside the office room you find and pick up a hatchet. Suddenly, two zombies enter the "
                       + "room and slowly make their way towards you.");
    System.out.println("Do you fight or flee? ");
    
     good = false;
    do
    {
      response = input.next();
      
      if((response.toLowerCase()).equals("fight")){
       good = true;  
      System.out.println("With newfound bravery thanks to your recently aquired weapon, you attempt "
                         + "to fight the zombies. ");
        System.out.println("They quickly overpower and devour you. ");
        //GAME OVER!
      EndingSplashScreen();
      System.exit(0);
      }
      else if((response.toLowerCase()).equals("flee")){//find out how to make user input two words later if possible.
        good = true;
        System.out.println("You run past the zombies and lock the door behind you. ");
      }
      else{
      System.out.println("I don't understand that ");//remember to add loop later
    }
      }
     while (!good);
    
    System.out.println(" ");
    
    //TRANSITION TO SCENE 5
    
    System.out.println("Leaving the previous room behind you enter a hallway to discover one side "
                       + "leading to the window.");
    System.out.println("And the other leading to a dead end filled with zombies making their way to you. ");
    System.out.println("With time running out, and the boat getting closer, you break the window with your hatchet "
                      + "and jump out landing on the roof below. ");
    System.out.println("On the roof you can see the docks and the boat coming in, and you see zombies all along the road.");
    System.out.println("Off to the right and below you notice an open garage with two cars inside. You make a run for it "
                       + "and check to see if both cars are locked. ");
    System.out.println("Inside the garage, mounted on the wall, you see a lock box. You bust the lock and break open "
                       + "the box and find the keys. ");
    System.out.println("You use the keys to open and start one of the cars. You drive down the main road dodging some "
                       + "zombies along the way. ");
    System.out.println("You make it to the docks and see the boat at the end. You have to make a run for it. "
                       + "You successfully run around a few zombies and make it to the boat.");
    System.out.println("You see the captain and tell him to leave this island. He complies and the boat soon "
                       + "leaves shortly. ");
    System.out.println("YOU WIN!");
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

/*
good = false;
    do
    {
      
    }
     while (!good);
     
   USE THIS CODE TO PERFORM DO WHILE LOOPS
 */