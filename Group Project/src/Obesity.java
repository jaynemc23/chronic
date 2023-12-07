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
   private double bmi;
   private String riskCategory;

   public Obesity()
   {

   }//constructor

   public Obesity(String name, int age, int weight, int height, String gender)
   {
      super(name);
      this.age = age;
      this.weight = weight;
      this.height = height;
      this.gender = gender;
   }//constructor

   public int getAge()
   {
      return age;
   }

   public void setAge(int age)
   {
      this.age = age;
   }

   public int getWeight()
   {
      return weight;
   }

   public void setWeight(int weight)
   {
      this.weight = weight;
   }

   public int getHeight()
   {
      return height;
   }

   public void setHeight(int height)
   {
      this.height = height;
   }

   public String getGender()
   {
      return gender;
   }

   public void setGender(String gender)
   {
      this.gender = gender;
   }

   public double getBmi()
   {
      return bmi;
   }

   public void setBmi(double bmi)
   {
      this.bmi = bmi;
   }

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
//   public double calculateBMI()
//   {
//      double bmi = 0;
//      bmi = weight / ((height / 100) * (height / 100));
//      return bmi;
//   }
      // Method to determine risk category

      public void determineRiskCategory () {
      if (this.bmi < 18.5)
      {
         riskCategory = "Low Risk";
      } else if (this.bmi < 25)
      {
         riskCategory = "Moderate Risk";
      } else if (this.bmi < 30)
      {
         riskCategory = "Moderate - High Risk";
      } else
      {
         riskCategory = "High Risk";
      }
   }//determineRiskCategory

//   calculate BMR (BASAL METABOLIC RATE CALCULATOR)
        public void calculateBMRCalories() {
         if (gender == "male")
         {
            double bmrMale = 66 + (6.23 * getWeight()) + (12.7 + getHeight()) - (96.8 * getAge());
         }//if

         if (gender == "female")
         {
            double bmrFemale = 655 + (4.35 * getWeight() + (4.7 * getHeight()) - (4.7 * getAge()));
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

//   public void loseWeight() {
//      System.out.println("DO");
//      System.out.println("Look at the labels and select food with orange and green labels, they are healthier");
//      System.out.println("Drink less sugary drinks and alcohol, thee are high in calories");
//      System.out.println("Try becoming more aware of what you are eating by starting a food diary");
//      System.out.println();
//      System.out.println("REMEMBER - Be kind to yourself we all have good days and bad ");
//   }//loseweight
//
//
//   public void eatHealthier() {
//      loseWeight();
//      System.out.println("Try to eat 5 fruit and vegetables everyday");
//      System.out.println(" Eat extra fibre with wholegrain foods, brown rice, wholewheat pasta, skin-on potatoes");
//      System.out.println("Low salt or reduced salt sauces and foods");
//   }//eathealthy
//
//   public void getActive() {
//      System.out.println("DO");
//      System.out.println("Aim for 150 minute sof exercise per week, which is roughly 20 - 30 minutes a day ");
//      System.out.println("Plan ahead, decide the days you want to exercise and stick to it");
//      System.out.println("Do an activity you enjoy, exercise classes, boxing, yoga or maybe dance classes");
//   }//getactive
//
//   public void sleepBetter()
//   {
//      System.out.println("DO");
//      System.out.println();
//      System.out.println("Stick to a sleep schedule, go to bed at the same time each day including weekends");
//      System.out.println("Write down any worries or thoughts before bed");
//      System.out.println("Implementing exercise during the day will help ");
//      System.out.println();
//      System.out.println("DON'T");
//      System.out.println();
//      System.out.println("Do not use digital screens 1 hour before bed ");
//      System.out.println("Do not drink caffeinated drinks 1 hour before bed");
//      System.out.println("Do not eat large meals before bed");
//   }//sleepbetter
//
//   public void drinkLessAlcohol()
//   {
//      System.out.println("DO");
//      System.out.println();
//      System.out.println("Opt for drinks lower in alcohol like a light or alcohol free beer or wine.");
//      System.out.println("Try to make social plans not including alcohol - like a cafe or a walk ");
//      System.out.println("Let friend or family member know you are trying to drink less so they can support you");
//      System.out.println("Limit how much money you want spend on alcohol and stick to it");
//   }//drinkless

}//class