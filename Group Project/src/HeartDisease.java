import java.util.Arrays;
import java.io.*;
import java.util.Scanner;
/****
 ***** Created by Cormac mc ginn on 19/11/2023
 ***** Opening print
 *****/
public class HeartDisease extends ChronicDiseases{
   Scanner scanner = new Scanner(System.in);
   private double systolicBloodPressure;
   private String totalCholesterol;
   private String hdlCholesterol;
   private String calculateHeartDiseaseRisk;
   private int diastolicBloodPressure;
   private double heartRiskScore, cholesterolLevel;
   private String riskCategory;

   public HeartDisease()
   {
      super();
   }

   public HeartDisease(String name, double systolicBloodPressure, String totalCholesterol, String hdlCholesterol, String calculateHeartDiseaseRisk, int diastolicBloodPressure, String riskCategory, double cholesterolLevel)
   {
      super(name);
      this.systolicBloodPressure = systolicBloodPressure;
      this.totalCholesterol = totalCholesterol;
      this.hdlCholesterol = hdlCholesterol;
      this.calculateHeartDiseaseRisk = calculateHeartDiseaseRisk;
      this.diastolicBloodPressure = diastolicBloodPressure;
      this.riskCategory = riskCategory;
      this.cholesterolLevel = cholesterolLevel;
   }//Constructor

   public HeartDisease(String name)
   {
      super(name);
   }//constructor

   public HeartDisease(Boolean smoker, int age, String gender) {
      super(smoker, age, gender);
   }//constructor
   public double getSystolicBloodPressure()
   {
      return systolicBloodPressure;
   }

   public void setSystolicBloodPressure(double systolicBloodPressure)
   {
      this.systolicBloodPressure = systolicBloodPressure;
   }

   public String getTotalCholesterol()
   {
      return totalCholesterol;
   }

   public void setTotalCholesterol(String totalCholesterol)
   {
      this.totalCholesterol = totalCholesterol;
   }

   public String getHdlCholesterol()
   {
      return hdlCholesterol;
   }

   public void setHdlCholesterol(String hdlCholesterol)
   {
      this.hdlCholesterol = hdlCholesterol;
   }

   public String getCalculateHeartDiseaseRisk()
   {
      return calculateHeartDiseaseRisk;
   }

   public void setCalculateHeartDiseaseRisk(String calculateHeartDiseaseRisk)
   {
      this.calculateHeartDiseaseRisk = calculateHeartDiseaseRisk;
   }
   public int getDiastolicBloodPressure()
   {
      return diastolicBloodPressure;
   }

   public void setDiastolicBloodPressure(int diastolicBloodPressure)
   {
      this.diastolicBloodPressure = diastolicBloodPressure;
   }

   public double getHeartRiskScore()
   {
      return heartRiskScore;
   }

   public void setHeartRiskScore(double heartRiskScore)
   {
      this.heartRiskScore = heartRiskScore;
   }

   public String getRiskCategory()
   {
      return riskCategory;
   }

   public void setRiskCategory(String riskCategory)
   {
      this.riskCategory = riskCategory;
   }
   public double getCholesterolLevel()
   {
      return cholesterolLevel;
   }

   public void setCholesterolLevel(double cholesterolLevel)
   {
      this.cholesterolLevel = cholesterolLevel;
   }

   protected void heartDiseaseQuestions()
   {

      System.out.println("Enter Heart disease details: ");

      System.out.print("Cholesterol Level: ");
      cholesterolLevel = InputHelper.validateInput(scanner);

      System.out.print("Systolic Blood Pressure: ");
      systolicBloodPressure = InputHelper.validateInput(scanner);

      System.out.print("Diastolic Blood Pressure: ");
      diastolicBloodPressure = InputHelper.validateInput(scanner);

   }//heartDiseaseQuestions
//
//   public static void main(String[] args) {
//      Scanner scanner = new Scanner(System.in);
//      String[] choices = {"No", "Yes", "Exit"};
//      String[] inputs = new String[3];
//      String[] answers = {"", "", ""};
//
//      while (true) {
//         System.out.println("Please select an option:");
//         System.out.println("1. Smoker (Yes/No)");
//         System.out.println("2. Age");
//         System.out.println("3. Systolic Blood Pressure");
//         System.out.println("4. Total Cholesterol");
//         System.out.println("5. HDL Cholesterol");
//         System.out.println("6. Calculate Heart Disease Risk");
//         System.out.println("7. Exit");
//
//         int choice = scanner.nextInt();
//         scanner.nextLine();
//
//         switch (choice) {
//            case 1:
//               inputs[0] = getChoiceInput(scanner, choices);
//               break;
//            case 2:
//               inputs[1] = getNumericInput(scanner, "Age");
//               break;
//            case 3:
//               inputs[2] = getNumericInput(scanner, "Systolic Blood Pressure");
//               break;
//            case 4:
//               inputs[3] = getNumericInput(scanner, "Total Cholesterol");
//               break;
//            case 5:
//               inputs[4] = getNumericInput(scanner, "HDL Cholesterol");
//               break;
//            case 6:
//               if (isValid(inputs)) {
//                  System.out.println("Calculating heart disease risk...");
//                  // Implement the risk calculation logic here
//               } else {
//                  System.out.println("Please enter all the required information before calculating the risk.");
//               }
//               break;
//            case 7:
//               System.out.println("Exiting...");
//               return;
//            default:
//               System.out.println("Invalid choice. Please try again.");
//         }
//      }
//   }

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

   private static boolean isValid(String[] inputs)
   {
      for (String input : inputs)
      {
         if (input.isEmpty())
         {
            return false;
         }
      }
      return true;
   }
   // Method to calculate heart risk score
   public void calculateHeartRiskScore() {
      heartRiskScore = (age * 0.02) + (gender == "M" ? 0 : 5) + (cholesterolLevel * 0.01)
              + (smoker ? 8 : 0) + (systolicBloodPressure * 0.01) + (diastolicBloodPressure * 0.02);
   }//calculateHeartRiskScore

   // Method to determine risk category
   public void determineRiskCategory() {
      if (heartRiskScore < 5) {
         riskCategory = "Low Risk";
      } else if (heartRiskScore < 10) {
         riskCategory = "Moderate Risk";
      } else {
         riskCategory = "High Risk";
      }
   }

   // Method to display person's details, risk score, and risk category
   public void displayDetails() {
      System.out.println("Cholesterol Level: " + cholesterolLevel);
      System.out.println("Systolic Blood Pressure: " + systolicBloodPressure);
      System.out.println("Diastolic Blood Pressure: " + diastolicBloodPressure);
      System.out.println("Heart Risk Score: " + heartRiskScore);
      System.out.println("Risk Category: " + riskCategory);
      System.out.println();
   }
         // Scanner for user input
//         Scanner scanner = new Scanner(System.in);
//
//         // Input data for each person
//         for (int i = 0; i < 10; i++) {
//            try {
//
//
//               // Create a Person object and store it in the array
//               people[i] = new Person (age, gender, cholesterolLevel, isSmoker, systolicBloodPressure, diastolicBloodPressure);
//
//               // Calculate heart risk score and determine risk category
//               people[i].calculateHeartRiskScore();
//               people[i].determineRiskCategory();
//
//            } catch (NumberFormatException e) {
//               // Handle input format exceptions
//               System.out.println("Invalid input. Please enter a valid number.");
//               i--; // Decrement i to re-enter data for the same person
//            }
//         }
//
//         // Display details for each person
//         for (Person person : people) {
//            person.displayDetails();
//         }
//
//         // Save data to a file
//         saveDataToFile(people);
//
//         // Close the scanner
//         scanner.close();
//      }
//
//      // Method to save data to a file
//      private static void saveDataToFile(Person[] people) {
//         try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("people.dat"))) {
//            outputStream.writeObject(people);
//            System.out.println("Data saved to file.");
//         } catch (IOException e) {
//            e.printStackTrace();
//         }
//      }
//   }
}
