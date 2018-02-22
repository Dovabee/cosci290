/*
  Francisco Delgado
  CoSci 290
*/

import java.util.Scanner;

//GameDriver
public class GameDriver {
  
  //Application... START!!
  public static void main(String[] args) {
    
    //Variables
    Scanner input = new Scanner(System.in); //Scanner initialized 
    String name = "";
    String PlayerChoice = "";
    String PlayerChoice2 = "";
    String PlayerChoice3 = "";
    String PlayerChoice4 = "";
    //String job = "";
    
    //Splash screen
    System.out.println(" __________            ___.   .__              \n"
                    +  " \\____    /____   _____\\_ |__ |__| ____      \n"
                    +  "   /     //  _ \\ /     \\| __ \\|  |/ __ \\   \n"
                    +  "  /     /(  <_> )  Y Y  \\ \\_\\ \\  \\  ___/  \n"
                    +  " /_______ \\____/|__|_|  /___  /__|\\___  >    \n"
                    +  "         \\/           \\/    \\/        \\/   \n"
                    +  "    _____       .___                    __                         \n"
                    +  "   /  _  \\    __| _/__  __ ____   _____/  |_ __ _________   ____  \n"
                    +  "  /  /_\\  \\  / __ |\\  \\/ // __ \\ /    \\   __\\  |  \\_  __ \\_/ __ \\ \n"
                    +  " /    |    \\/ /_/ | \\   /\\  ___/|   |  \\  | |  |  /|  | \\/\\  ___/     \n"
                    +  " \\____|__  /\\____ |  \\_/  \\___  >___|  /__| |____/ |__|    \\___  >     \n"
                    +  "         \\/      \\/           \\/     \\/                        \\/      \n");
    
    //Story summary 
    System.out.println("The world has been taken over by zombies! Probably because of the government and their " +
                       "experimentations... who knows? You're just a civilian.");
    System.out.println("You're in your house watching the news seeing everything taking place.");
    System.out.println("Luckily because you have played many games about zombies and survival you will be given the power ");
    System.out.println("to start off with a job! But first tell me your name!");
    
    //Space added here. Will now add spacing for a more aesthetic look.
    System.out.println(" ");
    
    //Player gives name here
    name = input.next();
    
    System.out.println(" ");
    
    System.out.println(name + " huh? That's a pretty strange name. Eh... this is just a demo after all so whatever floats your boat! " + 
                      "Now that we have your strange name you ");
    
    System.out.println("mind telling me which job you would like to start off with? Oh wait... ");
    
    System.out.println("You can only choose Scavenger... lol... oops? :D");
    
    System.out.println(" ");
    
    System.out.println("You'll get a random number from 1-3. If you roll a 1 then you get to keep playing, but " +
                       "if you roll a 2 or 3 then it's game over.");
    
    System.out.println("Are you ready to begin? ");
    
    System.out.println(" ");
    
    //Player confirms 1st choice
    PlayerChoice: input.next();
    
    System.out.println(" ");
    
    //Generating random number between 1-3
    int job = (1 + (int)(Math.random() * ((3 - 1) + 1)));
    
    //This will display random number
    System.out.println("You got number " + job + "!");
    
    System.out.println(" ");
    
    if(job == 1 ) {
      System.out.println("Scavenger... Actually there isn't much to scavenge in this horrid new world so " +
                         "you'll have to rely on yourself. Good luck!");
      
    System.out.println(" ");
    
    System.out.println("Alright! now that you have your poorly chosen job are you ready to start this game?");
    
    System.out.println(" ");
    
    //Player confirms 2nd choice
    PlayerChoice2: input.next();
    
    System.out.println(" ");
    
    System.out.println("Are you sure? ");
    
    System.out.println(" ");
    
    //Player confirms 3rd choice
    PlayerChoice3: input.next();
    
    System.out.println(" ");
    
    System.out.println("Really really sure?? ");
    
    System.out.println(" ");
    
    //Player confirms 4th and final choice
    PlayerChoice4: input.next();
    
    System.out.println(" ");
    
    System.out.println("Okay then! Let's finally start this g- GAME DEMO IS NOW OVER. FULL GAME WILL BE RELEASED " +
                      "NEXT SPRING.");
    
    System.out.println("PRE ORDER NOW FOR THE HIDDEN 4TH JOB (PSYCHO), UNLOCK THE TRUE ENDING, 40% MORE STORY, " +
                       "STARTING RESOURCES, AND POWERFUL WEAPONS.");
    
    System.out.println(" ");
    }
    
    //Player has lost
    else {
      System.out.println("Ooh that's too bad. Game Over! ");
      
      System.out.println(" ");
    }
    
    //Decided to remove this bit for a different ending
    /*if(job == 4) {
      System.out.println("You got the hidden number 4! Sadly there isn't a job assigned to number 4 so I'll " +
                        "just give you an instant death. ");
      System.out.println("Don't worry don't worry. You won't have to deal with the struggle of this " +
                        "new world. Goodbye...");
    }*/
    
    //Game over
    System.out.println("  ############            #                  #               #         #########   \n "
                      + " #                      # #                # #             # #        #           \n "
                      + " #                     #   #              #   #           #   #       #           \n "
                      + " #                    #     #            #     #         #     #      #           \n "
                      + " #      #######      #       #          #       #       #       #     #########   \n "
                      + " #         #  #     ###########        #         #     #         #    #           \n "
                      + " #         #  #    #           #      #           #   #           #   #           \n "
                      + " #         #  #   #             #    #             # #             #  #           \n "
                      + " ###########     #               #  #               #               # #########   \n "
                      + "                                                                                  \n "
                      + " ############  #               #   #########  ##########     ##                   \n "
                      + " #          #   #             #    #          #        #     ##                   \n "
                      + " #          #    #           #     #          #        #     ##                   \n "
                      + " #          #     #         #      #          #       #      ##                   \n "
                      + " #          #      #       #       #########  ########       ##                   \n "
                      + " #          #       #     #        #          #       #      ##                   \n "
                      + " #          #        #   #         #          #        #                          \n "
                      + " #          #         # #          #          #         #    ##                   \n "
                      + " ############          #           #########  #          #   ##                   \n ");
                      
  }
}
                       
   //Player chooses job here
   //job = input.next();  <== removed prompt for user input due to lack of knowledge of "if-else" statements with words if there are any             
   //"(Just say yes there are no other choices right now :(  )");  <== removed added dialogue from line 65