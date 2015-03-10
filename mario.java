/**
*Ryan Modica
*03/10/2015
*
*Mario, PSET 01, in Java
*LaunchCode Java Class
*MoMenne
*/
import java.util.*;
import java.awt.*;
import java.lang.*;

public class mario {

   public static void main(String[] args) {
   
      //Basic definitions
      int totalSteps = 0;
      int blocks = 1;
      
      //For the while loop
      boolean continuation = true;
      
      //To get the user's input to create the total of Steps
      Scanner scan = new Scanner(System.in);
      
      //Gathers the input
      System.out.print("Height: ");
      totalSteps = scan.nextInt();
   
      //Starts the whole creation of steps
      while(continuation == true) {
         
         //Verifies if the value is outside of the proper condition, it'll ask again
         if(totalSteps < 0 || totalSteps > 24) {
            System.out.print("Height: ");
            totalSteps = scan.nextInt();
            
         //Actual creation of step process   
         } else if(totalSteps > 0 && totalSteps < 24) {
               
            for(int i = 0; i < totalSteps; i++) {
               
               //Creates Spaces
               for(int j = totalSteps; j > blocks; j--) {
                  System.out.print(" ");
               }
               
               //Creates Blocks
               for(int k = -1; k < blocks; k++) {
                  System.out.print("#");
               }
               
               blocks++;
               System.out.print("\n");
            
               //Ceases the loop if this condition becomes true
               if(blocks == totalSteps) {
                  continuation = false;   
               }
            }
         } else {
            System.out.print("Retry: ");
            totalSteps = scan.nextInt();
         }
      }         
   }
}