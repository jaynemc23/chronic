import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

/****
 ***** Created by Jayne Mc Laughlin on 28 11 2023
 ***** Obesity Class
 *****/
public class Obesity extends ChronicDiseases
{
   Scanner keyboard = new Scanner(System.in);
   PrintWriter myOutFile;
   String myFileName = "obesityAdvice.txt";
   private String riskCategory;

   public Obesity()
   {

   }//constructor

   public Obesity(String name)
   {
      super(name);
   }//constructor

   public PrintWriter getMyOutFile()
   {
      return myOutFile;
   }

   public void setMyOutFile(PrintWriter myOutFile)
   {
      this.myOutFile = myOutFile;
   }

   public String getMyFileName()
   {
      return myFileName;
   }

   public void setMyFileName(String myFileName)
   {
      this.myFileName = myFileName;
   }

   public String getRiskCategory()
   {
      return riskCategory;
   }

   public void setRiskCategory(String riskCategory)
   {
      this.riskCategory = riskCategory;
   }

      // Method to determine risk category
      public void determineRiskCategory (double bmi) {
      if (bmi < 18.5)
      {
         riskCategory = "Low Risk";
      } else if (bmi < 25)
      {
         riskCategory = "Moderate Risk";
      } else if (bmi < 30)
      {
         riskCategory = "Moderate - High Risk";
      } else
      {
         riskCategory = "High Risk";
      }
   }//determineRiskCategory

//   calculate BMR (BASAL METABOLIC RATE CALCULATOR)
        public void calculateBMRCalories(double weight, double height, int age, String gender) {
         if (gender == "male")
         {
            double bmrMale = 66 + (6.23 * weight) + (12.7 + height) - (96.8 * age);
         }//if

         if (gender == "female")
         {
            double bmrFemale = 655 + (4.35 * weight + (4.7 * height) - (4.7 * age));
         }//if

         // System.out.println("Your daily calorie needs " + cal);

         else
         {
            System.out.println("Invalid choice!Enter 1 to return to calculate your BMR or 2 to exit the program");

               System.exit(2);
         }
      }//calculateBMR
//      System.out.print("You should never eat less than your BMR, as this is the basic number of calories needed for you body to perform basic functions including digestion and breathing");

   public void printToFile() {
      try {
         myOutFile = new PrintWriter("obesityAdvice.txt");
      }//try
      catch (FileNotFoundException error) {
         System.out.println("Unable to access information");
      }//catch

      try {
         myOutFile.println("I am a print line");
         myOutFile.print("I am a print line");
         myOutFile.close();
      }//try
      catch (Exception error) {
         System.out.println(error.getMessage());
      }//catch
   }
   protected void obesityAdvice()
   {
      int userSelection = 0;
//       while loop
      while (userSelection == 0) {
//      read in a value of the users choice
      int choice = adviceMenu();
//      use switch statement to present the correct choice
      switch (choice)
      {
         case 1:
            loseWeight();
            break;
         case 2:
            eatHealthier();
            break;
         case 3:
            getActive();
            break;
         case 4:
            sleepBetter();
            break;
         default:
            System.out.println("Invalid choice. Please try again.");
         }//switch
         System.out.println("Enter 0 to return to the menu, otherwise enter 9 to exit");
       userSelection = keyboard.nextInt();
       keyboard.nextLine(); //flush buffer
      }//while

   }//obesityAdvice

      //display menu options
      public int adviceMenu()
      {
         System.out.println("****************************************************");
         System.out.println("Please select an option for advice on the following:");
         System.out.println("1. Lose Weight ");
         System.out.println("2. Eat Healthier");
         System.out.println("3. Get Active");
         System.out.println("4. Sleep Better");
         System.out.println("5. Drink Less Alcohol");
         System.out.println("7. Exit");

         //read value
         int choice = keyboard.nextInt();
          keyboard.nextLine();
          return choice;
      }

      public void loseWeight() {
         System.out.println("DO");
         System.out.println("Look at the labels and select food with orange and green labels, they are healthier");
         System.out.println("Drink less sugary drinks and alcohol that are high in calories");
         System.out.println("Try becoming more aware of what you are eating by starting a food diary");
         System.out.println();
         System.out.println("REMEMBER - Be kind to yourself we all have good days and bad ");
      }//loseweight


      public void eatHealthier () {
         System.out.println("Try to eat 5 fruit and vegetables everyday");
         System.out.println(" Eat extra fibre with wholegrain foods, brown rice, wholewheat pasta, skin-on potatoes");
         System.out.println("Low salt or reduced salt sauces and foods");
      }//eathealthy

      public void getActive () {
         System.out.println("DO");
         System.out.println("Aim for 150 minute of exercise per week, which is roughly 20 - 30 minutes a day ");
         System.out.println("Plan ahead, decide the days you want to exercise and stick to it");
         System.out.println("Do an activity you enjoy, exercise classes, boxing, yoga or maybe dance classes");
      }//getactive

      public void sleepBetter () {
         System.out.println("DO");
         System.out.println();
         System.out.println("Stick to a sleep schedule, go to bed at the same time each day including weekends");
         System.out.println("Write down any worries or thoughts before bed");
         System.out.println("Implementing exercise during the day will help ");
         System.out.println();
         System.out.println("DON'T");
         System.out.println();
         System.out.println("Do not use digital screens 1 hour before bed ");
         System.out.println("Do not drink caffeinated drinks 1 hour before bed");
         System.out.println("Do not eat large meals before bed");
      }//sleepbetter

      public void drinkLessAlcohol ()
      {
         System.out.println("DO");
         System.out.println();
         System.out.println("Opt for drinks lower in alcohol like a light or alcohol free beer or wine.");
         System.out.println("Try to make social plans not including alcohol - like a cafe or a walk ");
         System.out.println("Let friend or family member know you are trying to drink less so they can support you");
         System.out.println("Limit how much money you want spend on alcohol and stick to it");
      }//drinkless

      //using switch to enter correct method from user input

}//class