/*
  Francisco Delgado
  
  Lab 21
  
  Co Sci 290
  
  Do problems from the book:

  7.7  
 -----
  7.12  (Reverse an array) The reverse method in Section 7.7 reverses an array by copying it to a new array.
        Rewrite the method that reverses the array passed in the argument and returns this array.
        Write a test program that prompts the user to enter ten numbers, invokes the method to reverse the numbers, and displays the numbers.
------------------------------------------------------------------------------------------------------------------------------------------------
  7.15  (Eliminate duplicates) Write a method that returns a new array by eliminating
        the duplicate values in the array using the following method header:

  public static int[] eliminateDuplicates(int[] list)

  Write a test program that reads in ten integers, invokes the method, and displays the results.

*/
import java.util.Scanner;
  
public class Lab21{
  
  //entry point of program
  public static void main(String[] args){
    
    //initializing Scanner for user input
    Scanner input = new Scanner (System.in);
    
    /*
      BEGINNING PROBLEM 7.7
      ---------------------
      (Count single digits) Write a program that generates 100 random integers between 0 and 9 and displays the count for each number.
      (Hint: Use an array of ten integers, say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
    */
    
    //This will always give a value BETWEEN AND INCLUDING the minimum number you chose
    //and maximum number you chose
    //(int) (Math.random() * 10)
    
    //declare an array for 7.7
    int[] counts = new int[10];
    int num = 0;
      //10 values
      //index values will be from 0-9. 10 total indexes
      
     //find out what this does later. You can change the conditional from "i < 100" to "i <10" in the first for loop.
    
    /*
    for(int i = 0; i < 100; i++) {
      num = (int)(Math.random() * 10) + 0;
      System.out.println(num);
      counts[num] = counts[num] + 1;
    }
    
    //find out what this does later
    for(int i = 0; i < 10; i++) {
      System.out.print(counts[i] + " ");
    }
    
    System.out.println(" ");
    */
    
    /*
        BEGINNING PROBLEM 7.12
        ----------------------
        (Reverse an array) The reverse method in Section 7.7 reverses an array by copying it to a new array.
        Rewrite the method that reverses the array passed in the argument and returns this array.
        Write a test program that prompts the user to enter ten numbers, invokes the method to reverse the numbers, and displays the numbers.
    */
    
    ReverseArray();
    
    //starting ReverseArray method
    public static int ReverseArray(){
      
      //declare variables
      int firstnum;
      int secondnum;
      int thirdnum;
      int fourthnum;
      int fifthnum;
      int sixthnum;
      int seventhnum;
      int eigthnum;
      int ninthnum;
      int tenthnum;
        
      //prompt user to enter 10 numbers
      System.out.println("Enter 10 numbers: ");
      firstnum = input.nextInt();
      secondnum = input.nextInt();
      thirdnum = input.nextInt();
      fourthnum = input.nextInt();
      fifthnum = input.nextInt();
      sixthnum = input.nextInt();
      seventhnum = input.nextInt();
      eigthnum = input.nextInt();
      ninthnum = input.nextInt();
      tenthnum = input.nextInt();
      
      //declare an array
      int[] number = new int[10]
        
        number[0] = firstnum;
        number[1] = secondnum;
        number[2] = thirdnum;
        number[3] = fourthnum;
        number[4] = fifthnum;
        number[5] = sixthnum;
        number[6] = seventhnum;
        number[7] = eigthnum;
        number[8] = ninthnum;
        number[9] = tenthnum;
      
      System.out.println()
        System.out.print(numbers[i] + " ");
        
    }//end of ReverseArray method
    
  }//end of class
}//end of main






















































