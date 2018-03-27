public class JavaLessonThree{
  
  public static void main(String[] args){
    
    /*
      This will always give a value BETWEEN AND INCLUDING the minimum number you chose
      and maximum number you chose
      
      Generating random number between 30 and 20
      
      int randomNum = (20 + (int)(Math.random() * ((30 - 20) + 1)));
      Original formula ==> (min + (int)(Math.random() * ((max - min) + 1)))
      --------------------------------------------------------------------------------
      
      ________________________________________________________________________________
      This will always give a value BETWEEN 0 and the maximum number
      So if you used (int) (Math.random() * 10) the random numbers will always be
      -- 0-9 and NOT 0-10 --
    */
    
    /*
      generating number bewtween 0-9
      int randomNumber = (int) (Math.random() * 10);
      display random number ==> System.out.println(randomNumber);
    */
    
    int randomNumber = (int) (Math.random() * 50);
    
    /*
      
      Relational Operators:
      Java has 6 relational operators
      
      >  : Greater Than
      <  : Less Than
      == : Equal To
      != : Not Equal To
      >= : Greater Than Or Equal To
      <= : Less Than Or Equal To
      
    */
    
    if (randomNumber < 25)
    {
      System.out.println("The random number is less than 25");
    }
    else if (randomNumber > 40)
    {
      System.out.println("The random number is greater than 40");
    }
    
    System.out.println("the random number is " + randomNumber);
    
  }
}














































