
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;
/****
 ***** Created by jayne mc laughlin on 19/11/2023
 ***** Opening print
 *****/
public class Main
{


   public static void main(String[] args) throws FileNotFoundException
   {
      Obesity ob = new Obesity();
      ob.printToFile();

      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("00.00");

      User user1 = new User();

      //Introduction and User questions
      System.out.println("\t\t\t\t\t\t\t\t\t   Welcome ");
      System.out.println("------------------------------------------------------------------------------------------------");
      System.out.println("\tThis program's aim is to provide advice with Chronic Disease's focusing on: ");
      System.out.println();
      System.out.println("\t\t * Heart Disease");
      System.out.println("\t\t * Cancer");
      System.out.println("\t\t * Osteoporosis ");
      System.out.println("\t\t * Obesity");
      System.out.println();
      System.out.println("Investigating the potential impact of diet and lifestyle quality on the underlying mechanism's leading not only to disease but also to maintaining health.");
      System.out.println("------------------------------------------------------------------------------------------------");
      System.out.println();
      int reStart = 0;
     do
     {
        System.out.println("Lets start by asking a few questions");
        user1.userQuestions();
        user1.bmiQuestions();
        System.out.println();
        double bmi = user1.calculateBMI();
        System.out.println("Your input has been calculated and you BMI is = " + df.format(bmi));
        System.out.println();
        user1.riskAssessment();

        //Users input does not meet chronic disease conditions
        if (user1.getHealthRisks().toArray().length == 0)
        {
           System.out.println(" You are currently a low risk of a chronic disease. Congratulations!");
           System.exit(2);
        }//if
        else
        {
           System.out.println("You are at risk of : ");
        }//else

        int menuReturn;
        do
        {
           //loop to count how many chronic diseases they qualify for
           for (int index = 0; index < user1.getHealthRisks().toArray().length; index++)
           {
              System.out.println((index + 1) + ") " + user1.getHealthRisks().get(index));
           }

           System.out.println("Enter a number of the Chronic Disease you would like to learn more about: ");
           int userInput = keyboard.nextInt();

           String ChronicDisease = user1.getHealthRisks().get(userInput - 1);

            switch (ChronicDisease) {
               case "Heart Disease":
                  HeartDisease heartDisease = new HeartDisease("Heart Disease ");
                  heartDisease.heartDiseaseQuestions();
                  System.out.println();
                  heartDisease.calculateHeartRiskScore();
                  heartDisease.determineRiskCategory();
                  System.out.println();
                  heartDisease.displayDetails();
                  user1.setHeartDisease(heartDisease);
                  System.out.println(user1.getHeartDisease().getCalculateHeartDiseaseRisk());
                  break;

               case "Obesity":
                  Obesity obesity = new Obesity();
                  obesity.determineRiskCategory(user1.calculateBMI());
                  obesity.calculateBMRCalories(user1.getWeight(), user1.getHeight(), user1.getAge(), user1.getGender());
                  user1.setObesity(obesity);
                  System.out.println(user1.getObesity().getRiskCategory());
                  obesity.obesityAdvice();

                  break;

               case "Cancer":
                  Cancer cancer = new Cancer();
                  cancer.amIAtRisk();
                  user1.setCancer(cancer);
                  break;

               case "Osteoporosis":
                  Osteoporosis osteoporosis = new Osteoporosis();
                  osteoporosis.osteoporosisQuestions();
                  user1.setOsteoporosis(osteoporosis);


            }

           System.out.println("Enter 9 to view your Chronic Diseases or 0 to exit");
           menuReturn = keyboard.nextInt();
        } while (menuReturn == 9);
        System.out.println("Hope this helped!! Enter 0 to restart ");
        reStart = keyboard.nextInt();
     } while (reStart != 999);
      }//main
}//class