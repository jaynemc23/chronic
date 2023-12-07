
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
      System.out.println("Our aim is to solve chronic disease of heart disease, cancer, osteoporosis and obesity.");
      System.out.println();
      System.out.println("Investigating the potential impact of diet and lifestyle quality on the underlying mechanism,s leading not only to disease but also to maintaining health.");
      System.out.println();
      int reStart = 0;
     do
     {
        System.out.println("Lets start by asking a few questions");
        user1.userQuestions();
        user1.bmiQuestions();
        double bmi = user1.calculateBMI();
        System.out.println(df.format(bmi));
        user1.riskAssessment();

        //Users input does not meet chronic disease conditions
        if (user1.getHealthRisks().toArray().length == 0)
        {
           System.out.println(" You are currently a low risk of a chronic disease. Congratulations!");
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
                  user1.setHeartDisease(heartDisease);
                  break;
               case "Obesity":
                  Obesity obesity = new Obesity();
                  obesity.determineRiskCategory();
                  user1.setObesity(obesity);
                  String riskCategory = user1.getObesity().getRiskCategory();
                  System.out.println(riskCategory);
                  break;
//                  user1.PrintWriter("obesityAdvice.txt");

               case "Cancer":
                  Cancer cancer = new Cancer();
                  cancer.amIAtRisk();
                  user1.setCancer(cancer);
                  break;
               case "Osteoporosis":
                  Osteoporosis osteoporosis = new Osteoporosis();
                  osteoporosis.information();

            }
//           System.out.println(user1.getHeartDisease().getHdlCholesterol());


           System.out.println("Enter 9 to view your Chronic Diseases or 0 to exit");
           menuReturn = keyboard.nextInt();
        } while (menuReturn == 9);
        System.out.println("Hope this helped!! Enter 0 to restart ");
        reStart = keyboard.nextInt();
     } while (reStart != 999);
      }//main
}//class