import java.util.Scanner;

public class DeleteLater3 {
  public static void main(String[] args) {
    
    int response;
    //int next = 1;
    
    Scanner input = new Scanner(System.in);
    
    do {
      
      System.out.print ("Please enter 0 or 1 to continue ");
        response = input.nextInt();
      
    } while (response >= 2);
    
    System.out.println("You've ended the loop");
  }
}