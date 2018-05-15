/*
  Francisco Delgado
  
  Lab 20
  
  Co Sci 290
  
  Create an array of Strings with the size 5. Assign each index with five Strings of your choice.
  Use a for-loop to iterate through the loop and print each element. 
*/

public class Lab20{
  
  //Start of program
  public static void main(String[] args){
    
    String[] words = new String[5];
      //{0, 0, 0, 0, 0} <== there are 5 values
      // 0  1  2  3  4  <== the starting index is zero. The max index is 4
      
      //assign a value inside this array called words
      words[0] = "cat";
      words[1] = "dog";
      words[2] = "bird";
      words[3] = "squirrel";
      words[4] = "rat";
    
    //use for loop to iterate the array
    for(int i = 0; i < 5; i++){
      
      System.out.println(words[i] + " ");
    }
    
  }//end of class
}//end of main