/*
  Francisco Delgado
  
  Final
  
  Co Sci 290
  
  A. Write a program that generates 300 random integers between 0 and 14 and displays the count for each number.
  (Hint: Use an array of 15 integers, say counts, to store the counts for the number of 0s, 1s, . . . , 14s.)

  B. Then let's analyze the data that was randomly generated (make sure to output these):

    Find the total counts for even numbers (zero is an even number)
    Find the total counts for odd numbers 

*/

public class Final {
  
  public static void main(String[] args) {
    
    //declare an array of ints
    int[] counts = new int[15];
    int num = 0;
    
    //This for loop will generate a random number between 0-14
    for(int i = 0; i < 300; i++) {
      num = (0 + (int)(Math.random() * ((14 - 0) + 1)));
      System.out.println(num);
      counts[num] = counts[num] + 1;
    }
    
    System.out.println(" ");
    
    //find out what this does later
    for(int i = 0; i < 15; i++) {
      System.out.print(counts[i] + " ");
    }
    
    System.out.println(" ");
    System.out.print("The even numbers are: ");
    
    if(counts[0] % 2 == 0){
      System.out.print(counts[0] + " ");
    }
    if(counts[1] % 2 == 0){
      System.out.print(counts[1] + " ");
    }
    if(counts[2] % 2 == 0){
      System.out.print(counts[2] + " ");
    }
    if(counts[3] % 2 == 0){
      System.out.print(counts[3] + " ");
    }
    if(counts[4] % 2 == 0){
      System.out.print(counts[4] + " ");
    }
    if(counts[5] % 2 == 0){
      System.out.print(counts[5] + " ");
    }
    if(counts[6] % 2 == 0){
      System.out.print(counts[6] + " ");
    }
    if(counts[7] % 2 == 0){
      System.out.print(counts[7] + " ");
    }
    if(counts[8] % 2 == 0){
      System.out.print(counts[8] + " ");
    }
    if(counts[9] % 2 == 0){
      System.out.print(counts[9] + " ");
    }
    if(counts[10] % 2 == 0){
      System.out.print(counts[10] + " ");
    }
    if(counts[11] % 2 == 0){
      System.out.print(counts[11] + " ");
    }
    if(counts[12] % 2 == 0){
      System.out.print(counts[12] + " ");
    }
    if(counts[13] % 2 == 0){
      System.out.print(counts[13] + " ");
    }
    if(counts[14] % 2 == 0){
      System.out.print(counts[14] + " ");
    }
    
    System.out.println(" ");
    System.out.print("The odd numbers are: ");
    
    if(counts[0] % 2 != 0){
      System.out.print(counts[0] + " ");
    }
    if(counts[1] % 2 != 0){
      System.out.print(counts[1] + " ");
    }
    if(counts[2] % 2 != 0){
      System.out.print(counts[2] + " ");
    }
    if(counts[3] % 2 != 0){
      System.out.print(counts[3] + " ");
    }
    if(counts[4] % 2 != 0){
      System.out.print(counts[4] + " ");
    }
    if(counts[5] % 2 != 0){
      System.out.print(counts[5] + " ");
    }
    if(counts[6] % 2 != 0){
      System.out.print(counts[6] + " ");
    }
    if(counts[7] % 2 != 0){
      System.out.print(counts[7] + " ");
    }
    if(counts[8] % 2 != 0){
      System.out.print(counts[8] + " ");
    }
    if(counts[9] % 2 != 0){
      System.out.print(counts[9] + " ");
    }
    if(counts[10] % 2 != 0){
      System.out.print(counts[10] + " ");
    }
    if(counts[11] % 2 != 0){
      System.out.print(counts[11] + " ");
    }
    if(counts[12] % 2 != 0){
      System.out.print(counts[12] + " ");
    }
    if(counts[13] % 2 != 0){
      System.out.print(counts[13] + " ");
    }
    if(counts[14] % 2 != 0){
      System.out.print(counts[14] + " ");
    }
    
    System.out.println(" ");
    
    //System.out.println("These are the even numbers: " + counts[0]);
  }//end of class
}//end of main
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    