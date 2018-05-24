/*
  Francisco Delgado
  
  Co Sci 290
  
  A. Write a program that generates 200 random integers between 0 and 14 and displays the count for each number.
  (Hint: Use an array of 15 integers, say counts, to store the counts for the number of 0s, 1s, . . . , 14s.)

  B. Then let's analyze the data that was randomly generated (make sure to output these):

    Find the number with the max
    Find the number with the min count and display
    Find the average of all the numbers generated

*/

public class DeleteLater {
  
  public static void main(String[] args) {
    
    //declare an array of ints
    int[] counts = new int[15];
    int num = 0;
    //int temp;
    //int number1;
    
    for(int i = 0; i < 200; i++) {
      num = (0 + (int)(Math.random() * ((14 - 0) + 1)));
      System.out.println(num);
      counts[num] = counts[num] + 1;
    }
    
    System.out.println(" ");
    
    
    for(int i = 0; i < 15; i++) {
      System.out.print(counts[i] + " ");
    }
    
    //System.out.println(" ");
    
    //System.out.println("The largest number is " + num + ".");
    
    //This for loop is to find the largest number
    //for(int i = 0; i < 15; i++){
      //if(counts[i] > counts);
      //int temp = num;
      //counter++;
    //}
    
    //System.out.println("The largest number is " + num + ".");
    
    
    /*
      PART B SHOULD BE EASY!!!
      
      REMEMBER THAT YOU CAN USE TEMP TO STORE VARIABLES!!!
      
      If temp1 > temp2, then temp1 will store that variable or something something...
      
      Study and practice this so that you can apply this here!!
    */
    
    /*
      B. Let's analyze the data that was randomly generated (make sure to output these):

      Find the number with the max
      Find the number with the min count and display
      Find the average of all the numbers generated
    */
    
    //declare variables
    //int 
    
  }//end of main
}//end of class

[0],[1],[2],[3],[4],[5],...
15  21  11  13  14  16..























