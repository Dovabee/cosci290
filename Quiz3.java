/*
  Francisco Delgado
  
  Co Sci 290
  
  Group 1 Quiz#3b
*/

//importing scanner package from java
import java.util.Scanner;

//class
public class Quiz3{
  
  //Start of program execution
  public static void main(String[] args){
    
    //begginning problem 1.9
    
    /*
    
      Formula for area:
      ------------------
      
      - area == width * height
      
      Formula for perimeter:
      -----------------------
      
      - perimeter == (2.0 * width) + (2.0 * height)
    
    */
    
    //variable declarations for problem 1.9
        double width = 4.5;
       double height = 7.9;
    
    //compute area
    double area = (4.5 * 7.9);
    
    //compute perimeter
    double perimeter = (2.0 * 4.5) + (2.0 * 7.9);
    
    //display results
    System.out.println("The area of a rectangle with a width of " + width + " and a height of " + height + 
                      " is " + area);
    
    System.out.println(" ");
    
    System.out.println("The perimeter of a rectangle with a width of " + width + " and a height of " + height + 
                      " is " + perimeter);
    
    System.out.println(" ");
    
    //Beginning problem 1.10
    
    /*
      converting kilometers to miles:
      -------------------------------
      
      - 1 mile == 1.6 kilometers
      
      - to convert kilometers to miles divide kilometers by 1.6
      
      - 14 / 1.6 == 8.75
      
      converting 45 minutes and 30 seconds to hours:
      -----------------------------------------------
      
      - divide number of seconds by 60 to convert seconds to minutes. Add this result
        to 45 minutes. Now you have 45.5 minutes
      
      - divide total number of minutes (45.5) by 60 again to get hours
      
      - 45 / 60 == 0.758333333
      
      Formula for average speed:
      --------------------------
      
      - Speed == distance / time
       
    */
    
    //variable declarations for problem 1.10
    double distance = 8.75;
        double time = 0.75833;;
    
    //compute formula for average speed in miles
    double avgspeed = (8.75 / 0.75833);
    
    
    System.out.println("The average speed in miles per hour of a runner that runs 14 kilometers in 45 minutes " + 
                      "is about " + (Math.ceil(avgspeed)) + "mph when rounded up." );
    
    System.out.println(" ");
    
  }
}






















