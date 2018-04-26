//import Scanner from java package
import java.util.Scanner;

//class
public class DeleteLater2{
  
  //start of application
  public static void main(String[] args){
    
    //initialize Scanner
    Scanner input = new Scanner(System.in);
    
    //variable declarations
    int firstnum;
    int secondnum;
    int thirdnum;
    
    //COMPARE THE INTEGERS WITH EACHOTHER!!
    
    //prompt user to enter three integers
    System.out.println("Enter three integers: ");
      firstnum = input.nextInt();
      secondnum = input.nextInt();
      thirdnum = input.nextInt();
    
    System.out.println(" ");
    
    //If firstnum is less than both the secondmum and thirdnum, then this if will be executed
    if (firstnum < secondnum && firstnum < thirdnum){
      if (secondnum > thirdnum){
        System.out.println(firstnum + " " + thirdnum + " " + secondnum);
      }else if (thirdnum > secondnum){
        System.out.println(firstnum + " " + secondnum + " " + thirdnum);
      }
        }
    
    //If secondnum is less than both the secondmum and thirdnum, then this if will be executed
    if (secondnum < firstnum && secondnum < thirdnum){
      if (firstnum > thirdnum){
        System.out.println(secondnum + " " + thirdnum + " " + firstnum);
      }else if (thirdnum > firstnum){
        System.out.println(secondnum + " " + firstnum + " " + thirdnum);
      }
        }
    
    //If "thirdnum" is less than both the firstnum and secondnum, then this if will be executed
    if (thirdnum < firstnum && thirdnum < secondnum){
      if (firstnum > secondnum){
        System.out.println(thirdnum + " " + secondnum + " " + firstnum);
      }else if (secondnum > firstnum){
        System.out.println(thirdnum + " " + firstnum + " " + secondnum);
      }
        }
    
  }
}