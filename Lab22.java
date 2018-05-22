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

public class Lab22 {
  
  public static void main(String[] args) {
    
    //declare an array of ints
    int[] counts = new int[15];
    int num = 0;
    
    
    for(int i = 0; i < 200; i++) {
      num = (0 + (int)(Math.random() * ((14 - 0) + 1)));
      System.out.println(num);
      counts[num] = counts[num] + 1;
    }
    
    //find out what this does later
    for(int i = 0; i < 10; i++) {
      System.out.print(counts[i] + " ");
    }
    
    System.out.println(" ");
    
    
    
  }//end of main
}//end of class





































