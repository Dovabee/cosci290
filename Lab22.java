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
    //int temp;
    //int number1;
    
    for(int i = 0; i < 200; i++) {
      num = (0 + (int)(Math.random() * ((14 - 0) + 1)));
      System.out.println(num);
      counts[num] = counts[num] + 1;
    }
    
    System.out.println(" ");
    
    //find out what this does later
    for(int i = 0; i < 15; i++) {
      System.out.print(counts[i] + " ");
    }
    
    //This for loop finds the largest element in the "counts" array.
    int max = counts[0];
    for(int i = 1; i < counts.length; i++) {
      if(counts[i] > max) {
        max = counts[i];
      }
    }//end of for loop
    
    System.out.println(" ");
    System.out.println("The largest number is " + max + ".");
    
    //variable min is currently holding the index with the largest value.
    int min = counts[0];
    //declaring variable
    int indexOfMax = 0;
    
    //this for loop finds the smallest element in the "counts" array.
    for(int i = 1; i < counts.length; i++){
      if(counts[i] < min){
        min = counts[i];
        indexOfMax = i;
      }
    }//end of for loop
    
    System.out.println(" ");
    System.out.println("The smallest number is " + min + ".");
    System.out.println(" ");
    
    //declaring variable
    //int sum = 0;
    int average = 0;
    
    //for(int i = 0; i < 15; i++){
    //  sum = counts[i];
    //  average = sum / 15;
    //}
    
    //This code works, but I'm trying to find out how to do a loop!
    average = (counts[0] + counts[1] + counts[2] + counts[3] + counts[4] + counts[5] + counts[6] + counts[7] + counts[8]
               + counts[9] + counts[10] + counts[11] + counts[12] + counts[13] + counts[14]) / 15;
    
    System.out.println("The average of all the numbers is " + average + " when rounded out.");
    
    //this for loop finds the average of all the elements in the "counts" array.
    //for(int i = 0; i < 15; i++) {
      
    //}
    
    /*
      
      To find the average you first need to add all the numbers together, and divide by 2.
      
    */
    
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
    
  }//end of main
}//end of class





































