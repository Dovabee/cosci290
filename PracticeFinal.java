/*
  Francisco Delgado
  
  Co Sci 290
  
  This is a practice final for the real final on Tuesday
*/

//Question 1

/*
  
Here's an array:

char[] arr = new char[10];

Write code to iterate through the array and print each element. 

*/

public class PracticeFinal {
  
  //start of program
  public static void main(String[] args) {
    
    //declare an array of chars
    char[] arr = new char[10];
    //{0, 0, 0, 0, 0, 0, 0, 0, 0, 0} <== there are 10 values
    //{0, 1, 2, 3, 4, 5, 6, 7, 8, 9} <== there are 10 indexes
    
    //use a for loop to iterate the array
    for(int i = 0; i < 10; i++){
      
      System.out.println(arr[i] + " ");
    }
    
  }//end of class
}//end of main






























