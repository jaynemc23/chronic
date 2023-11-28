import java.util.Arrays;
import java.util.Scanner;

public class HeartDisease {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String[] choices = {"No", "Yes", "Exit"};
      String[] inputs = new String[3];
      String[] answers = {"", "", ""};

      while (true) {
         System.out.println("Please select an option:");
         System.out.println("1. Smoker (Yes/No)");
         System.out.println("2. Age");
         System.out.println("3. Systolic Blood Pressure");
         System.out.println("4. Total Cholesterol");
         System.out.println("5. HDL Cholesterol");
         System.out.println("6. Calculate Heart Disease Risk");
         System.out.println("7. Exit");

         int choice = scanner.nextInt();
         scanner.nextLine();

         switch (choice) {
            case 1:
               inputs[0] = getChoiceInput(scanner, choices);
               break;
            case 2:
               inputs[1] = getNumericInput(scanner, "Age");
               break;
            case 3:
               inputs[2] = getNumericInput(scanner, "Systolic Blood Pressure");
               break;
            case 4:
               inputs[3] = getNumericInput(scanner, "Total Cholesterol");
               break;
            case 5:
               inputs[4] = getNumericInput(scanner, "HDL Cholesterol");
               break;
            case 6:
               if (isValid(inputs)) {
                  System.out.println("Calculating heart disease risk...");
                  // Implement the risk calculation logic here
               } else {
                  System.out.println("Please enter all the required information before calculating the risk.");
               }
               break;
            case 7:
               System.out.println("Exiting...");
               return;
            default:
               System.out.println("Invalid choice. Please try again.");
         }
      }
   }

   private static String getChoiceInput(Scanner scanner, String[] choices) {
      String input = scanner.nextLine();
      if (isValidChoice(input, choices)) {
         return input;
      } else {
         System.out.println("Invalid choice. Please enter Yes, No, or Exit.");
         return "";
      }
   }

   private static String getNumericInput(Scanner scanner, String inputName) {
      String input = scanner.nextLine();
      if (isValidNumber(input)) {
         return input;
      } else {
         System.out.println("Invalid input. Please enter a numeric value for " + inputName + ".");
         return "";
      }
   }

   private static boolean isValidChoice(String input, String[] choices) {
      return Arrays.asList(choices).contains(input);
   }

   private static boolean isValidNumber(String input) {
      try {
         Double.parseDouble(input);
         return true;
      } catch (NumberFormatException e) {
         return false;
      }
   }

   private static boolean isValid(String[] inputs) {
      for (String input : inputs) {
         if (input.isEmpty()) {
            return false;
         }
      }
      return true;
   }
}