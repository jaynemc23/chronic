import java.util.Scanner;
/****
 ***** Created by Cormac Mc Ginn on 5 12 23
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class InputHelper
{

   private InputHelper() {
      // private constructor to prevent instantiation
   }

   // Method to validate numerical input
   public static int validateInput(Scanner scanner) {
      while (!scanner.hasNextInt()) {
         System.out.println("Invalid input. Please enter a valid number.");
         scanner.next(); // consume the invalid input
      }
      return scanner.nextInt();
   }

   // Method to validate gender input
   public static char validateGender(Scanner scanner)
   {
      char gender;
      do
      {
         System.out.print("Gender (M/F): ");
         gender = scanner.next().toUpperCase().charAt(0);
         if (gender != 'M' && gender != 'F')
         {
            System.out.println("Invalid input. Please enter 'M' or 'F'.");
         }
      } while (gender != 'M' && gender != 'F');
      return gender;
   }
}//class
