//importing Scanner package
import java.util.Scanner;

//Braindead
public class TestMethods{

//Application... START!!
  public static void main(String[] args){
   
    Scanner input = new Scanner(System.in); //Scanner initialized
    String response = "";
    String action = "";
    
    //calling StartingSplashScreen
    StartingSplashScreen();
      
  }//end of main
        
    public static void StartingSplashScreen(){
    
        //splash screen
        System.out.println("  :::====  :::====  :::====  ::: :::= === :::====  :::===== :::====  :::====  \n "
                          + " :::  === :::  === :::  === ::: :::===== :::  === :::      :::  === :::  === \n "
                          + " =======  =======  ======== === ======== ===  === ======   ======== ===  === \n "
                          + " ===  === === ===  ===  === === === ==== ===  === ===      ===  === ===  === \n "
                          + " =======  ===  === ===  === === ===  === =======  ======== ===  === =======  \n ");
    
    }
}