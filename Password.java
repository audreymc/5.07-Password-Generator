/**
 * To generate random passwords; the user should be able to select the character set and the length
 *
 * @author Audrey McMillion
 * @version 11/27/2017
 */
import java.util.Scanner;
import java.util.Random;
public class Password
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       Random randNum = new Random();
       int passwordInt;
       char passwordChar;
       String answer;
    
    //do while loop to execute the program at least once
    do
    {
       System.out.println("Please choose one of the menu options listed below.");
       System.out.println("Option \t\t\t   Character Sets");
       System.out.println("  [1]  \t\t\t chars in lowercase");
       System.out.println("  [2]  \t\t\t chars in uppercase");
       System.out.println("  [3]  \t\t\t       digits      ");
       System.out.println("  [4]  \t\t\t common punctuation");
       System.out.print("Your choice: ");
       int input1 = in.nextInt();
       
       if(input1<5 && input1 != 0)
       {
        System.out.println();
        System.out.print("Indicate the character length for your password (min. 6): ");
        int input2 = in.nextInt();
        
        System.out.print("Your password: ");
       
        //choice number 1
        if(input1==1)
        {
           for(int i = 1; i<=input2; i++)
           {
              passwordInt = randNum.nextInt(123);
              if(passwordInt >= 97)
              {
                  passwordChar = (char)passwordInt;
                  System.out.print(passwordChar);
              }
              else
                i--;
           }
        }
          
        //choice number 2
        else if(input1==2)
        {
           for(int i = 1; i<=input2; i++)
           {
              passwordInt = randNum.nextInt(123);
              if((passwordInt >= 65 && passwordInt <= 90) || passwordInt >= 97)
              {
                  passwordChar = (char)passwordInt;
                  System.out.print(passwordChar);
              }
              else
                i--;
           }
        }
          
        //choice number 3
        else if(input1==3)
        {
         for(int i = 1; i<=input2; i++)
           {
              passwordInt = randNum.nextInt(123);
              if((passwordInt >= 48 && passwordInt <= 57) || (passwordInt >= 65 && passwordInt <= 90) || passwordInt >= 97)
              {
                  passwordChar = (char)passwordInt;
                  System.out.print(passwordChar);
              }
              else
                i--;
           }  
        }
          
        //choice number 4
        else
        {
           for(int i = 1; i<=input2; i++)
           {
              passwordInt = randNum.nextInt(127);
              if(passwordInt >= 33)
              {
                  passwordChar = (char)passwordInt;
                  System.out.print(passwordChar);
              }
              else
                i--;
           }
        }
        
       }//end of first if statement
        
       else
            System.out.println("Please try again and choose a number between 1 and 4.");
    
       System.out.println();
       System.out.println();
       System.out.print("Do you want to enter generate another password? [Y/N] ");
       answer = in.next();
       System.out.println();
       System.out.println();
    }while(answer.equalsIgnoreCase("Y"));   //end do while loop
    
    System.out.println("The program will exit now.");
   }
}
