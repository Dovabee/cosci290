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
    System.out.println("to start off with one of 3 jobs! But first tell me your name!");
    
    //Space added here. Will now add spacing for a more aesthetic look.
    System.out.println(" ");
    
    //Player gives name here
    name = input.next();
    
    System.out.println(" ");
    
    System.out.println(name + " huh? That's a pretty strange name. Eh... this is just a demo after all so whatever floats your boat! " + 
                      "Now that we have your strange name you ");
    
    System.out.println("mind telling me which job you would like to start off with? ");
    
    System.out.println("For now you " + 
                       "can choose between: Scavenger, Marksman, and Brawl- oh wait you know what? Let's leave " +
                       "This up to chance! ");
    
    System.out.println(" ");
    
    System.out.println("You'll get a random number from 1-3. Whichever number you get will determine which job you'll " +
                       "begin the game with. ");
    
    System.out.println("1 is for Scavenger, 2 for Marksman, and 3 for Brawler! Are you ready to begin?");
    
    System.out.println(" ");
    
    //Player confirms 1st choice
    PlayerChoice: input.next();
    
    System.out.println(" ");
    
    int job = (1 + (int)(Math.random() * ((3 - 1) + 1)));
    
    //Random number between 1-3
    System.out.println("You got number " + job + "!");
    
    System.out.println(" ");
    
    if(job == 1) {
      System.out.println("Scavenger... Actually there isn't much to scavenge in this world so any of the other two " + 
                        "jobs would've been much MUCH better to have. Good luck!" );
    }
    
    if(job == 2) {
      System.out.println("Marksman... Having a good aim to shoot zombies in the head is great and all, but " +
                        "unfortunately you live in a city where guns are banned. ");
      System.out.println("Should've believed in the constitution!");
    }
    
    if(job == 3) {
      System.out.println("Brawler...  Having experience in close combat should be great when fighting " +
                        "other humans and zombies.");
      System.out.println("Although, due to playing video games for 18 hours a day every day means that " +
                         "muscle atrophy will be quite a problem.");
    
    //Decided to remove this dialogue due to lack of knowledge about muscle building
    //System.out.println("Lack of food = little calories for your muscles so you'll have to make due with your skinny arms. ");
    }
    
    //Decided to remove this bit for a different ending
    /*if(job == 4) {
      System.out.println("You got the hidden number 4! Sadly there isn't a job assigned to number 4 so I'll " +
                        "just give you an instant death. ");
      System.out.println("Don't worry don't worry. You won't have to deal with the struggle of this horrid " +
                        "new world. Goodbye...");
    }*/
    
    System.out.println(" ");
    
    System.out.println("Alright! now that you have your poorly randomly chosen job are you ready to start this game?");
    
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
