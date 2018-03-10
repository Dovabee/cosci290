/*
  Francisco Delgado
  CoSci 290
*/

import java.util.Scanner;

//GameDriver
public class GameDriver{
  
  //Application... START!!
  public static void main(String[] args){
    
    //Variables
    Scanner input = new Scanner(System.in); //Scanner initialized 
    String response = "";
    String response2 = "";
    String name = "";
    String yes = "";
    String PlayerChoice1 = "";
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
    System.out.println("to start off with a job! But first you mind telling me your name?");
    
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
    PlayerChoice1: input.next();
    
    System.out.println(" ");
    
    //Generating random number between 1-3
    //remember to change the 1 to a 3 again! (1 + (int)(Math.random() * ((1 - 1) + 1))) ==> (1 + (int)(Math.random() * ((3 - 1) + 1)))
    int job = (1 + (int)(Math.random() * ((1 - 1) + 1)));
    
    //display results of random number generator
    System.out.println("You got number " + job + "!");
    
    System.out.println(" ");
    
    if(job == 1 ){
      System.out.println("Scavenger... Actually there isn't much to scavenge in this horrid new world so " +
                         "you'll have to rely on yourself. Good luck!");
      
    System.out.println(" ");
    
    System.out.println("Alright! now that you have your poorly chosen job are you ready to start this game?");
    
    System.out.println(" ");
    
      //Player confirms 2nd choice
      PlayerChoice2: input.next();
    
    System.out.println(" ");
    
    System.out.println("Oh whoah whoah whoah wait a minute there speedy Gonzales! I just have to ask you a few more questions... "
                      + "for something.");
    
    System.out.println("What are those questions you ask? Well let me tell you! In this game I decided to add hunger to this game. "
                      + "Would  you like to start off with some food? ");
      
    System.out.println(" ");
    
    //Player gives response. Player will recieve twinkies no matter the response given
      PlayerChoice3: input.next();
      
    System.out.println(" ");
      
    System.out.println("Hmm alright here are some twinkies for you. Now what do you say? ");
      
    System.out.println(" ");
      
      response = input.next();
      
    System.out.println(" ");
    
    System.out.println("There you go! :D ");
      
    System.out.println(" ");
      
    System.out.println("Now that I've given you a few hours headstart with some food I decided that I want to make you play the random numbers game again, ");
      
    System.out.println("but this time the number you roll will depend on which limb you're going to lose! "
                       + "Doesn't that sound fun? ");
      
    System.out.println(" ");
      
      //Player gives response
      PlayerChoice4: input.next();
      
    System.out.println(" ");
    
    System.out.println("Oh Don't be such a Debbie Downer! Whenever your ready just give the word and we'll get "
                      + "this little number generator to do its thing. ");
      
    System.out.println(" ");
      
      response2 = input.next();
      
    System.out.println(" ");
      
    System.out.println("Let's see what unlucky number you've chanced upon... ");
      
    System.out.println(" ");
      
      //Generating random number between 1-4
      int randomnum = (1 + (int)(Math.random() * ((4 - 1) + 1)));
      
      //display results of random number number generator
      System.out.println("It seems you've landed on unlucky number" + randomnum + " ! ");
      
      System.out.println(" ");
      
      if(randomnum == 1 ){
        System.out.println("There goes your left arm. Thankfully you have a spare to use. ");
        System.out.println(" ");
          
      }if(randomnum == 2 ){
        System.out.println("Say goodbye to your right arm. Here's hoping you're a lefty! ");
        System.out.println(" ");
          
      }if(randomnum == 3 ){
        System.out.println("No more left leg. Luckily there's a wooden crutch laying around that you can use. ");
        System.out.println(" ");
          
      }if(randomnum == 4 ){
        System.out.println("You aren't going to be sprinting anytime soon without your right leg. "
                          + "It's a good thing the zombies are pretty slow eh? ");
        System.out.println(" ");
        
      }
    
    System.out.println("Okay then! Let's finally start this g- GAME DEMO IS NOW OVER. FULL GAME WILL BE RELEASED " +
                      "NEXT SPRING.");
    
    System.out.println("PRE ORDER NOW FOR THE HIDDEN 4TH JOB (PSYCHO), UNLOCK THE TRUE ENDING, 40% MORE STORY, " +
                       "STARTING RESOURCES, AND POWERFUL WEAPONS.");
    
    System.out.println(" ");
    
    }
    
    //Player has lost game because of losing game of chance to random number generator line 76-83.
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
      System.out.println("         ________    _____      _____  ___________            \n "
                      + "       /  _____/   /  _  \\    /     \\ \\_   _____/         \n "
                      + "      /   \\  ___  /  /_\\  \\  /  \\ /  \\ |    __)_        \n "
                      + "      \\    \\_\\  \\/    |    \\/    Y    \\|        \\     \n "
                      + "       \\______  /\\____|__  /\\____|__  /_______  /         \n "
                      + "              \\/         \\/         \\/        \\/         \n "
                      + "      ____________   _________________________  ._.          \n "
                      + "      \\_____  \\   \\ /   /\\_   _____/\\______   \\ | |    \n "
                      + "       /   |   \\   Y   /  |    __)_  |       _/ | |         \n "
                      + "      /    |    \\     /   |        \\ |    |   \\  \\|      \n "
                      + "      \\_______  /\\___/   /_______  / |____|_  /  __        \n "
                      + "              \\/                 \\/         \\/   \\/      \n ");
                      
  }
}
                       
   //Player chooses job here
   //job = input.next();  <== removed prompt for user input due to lack of knowledge of "if-else" statements with words if there are any             
   //"(Just say yes there are no other choices right now :(  )");  <== removed added dialogue from line 65
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           