import java.sql.SQLOutput;
import java.util.Scanner;
/****
 ***** Created by Everyone on 28 11
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class ChronicDiseases
{
   //OBSEITY
   //variables
   private String gender;
   private double height, weight;
   private int age;
   int[] choices = {1,2,3,4,5,6};
   String[] inputs = new String[5];

   public ChronicDiseases(String gender, double height, double weight, int age)
   {
      this.gender = gender;
      this.height = height;
      this.weight = weight;
      this.age = age;
   }//constructor
   public String getGender()
   {
      return gender;
   }

   public void setGender(String gender)
   {
      this.gender = gender;
   }

   public double getHeight()
   {
      return height;
   }

   public void setHeight(double height)
   {
      this.height = height;
   }

   public double getWeight()
   {
      return weight;
   }

   public void setWeight(double weight)
   {
      this.weight = weight;
   }

   public int getAge()
   {
      return age;
   }

   public void setAge(int age)
   {
      this.age = age;
   }

//   public void exerciseLevel() {
//      System.out.println("How often do you exercise?");
//      System.out.println("If you do not exercise enter in 'None' ");
//      System.out.println("Enter 2 if you engage in exercise one to three days a week.");
//      System.out.println("Enter 3 if you do exercise  three to five times a week.");
//      System.out.println("Enter 4 if you exercise six to seven days a week.");
//      System.out.println("Enter 5 if you exercise six to seven days a week and have a physically active job.");
//
//      exercise = keyboard.nextLine();
//   //   String "none" = keyboard.nextLine() != null;
//      //Switch for exercise results
//      switch(exercise) {
//         case "none":
//            break;
//         case "2":
//            break;
//         case "3":
//            break;
//         case "4":
//            break;
//         case "5":
//            break;
//      }//switch

      //calculate BMR (BASAL METABOLIC RATE CALCULATOR)
//         public void calculateBMRCalories() {
//         if (gender == "male")
//         {
//            double bmrMale = 66 + (6.23 * getWeight()) + (12.7 + getHeight()) - (96.8 * getAge());
//         }//if
//
//         if (gender == "female")
//         {
//            double bmrFemale = 655 + (4.35 * getWeight() + (4.7 * getHeight()) - (4.7 * getAge()));
//         }//if
//
//         // System.out.println("Your daily calorie needs " + cal);
//
//         else if ((inputs!= "female") && (inputs != "male"))
//         {
//            System.out.println("Invalid choice!Enter 1 to return to calculate your BMR or 2 to exit the program");
//
//            else {
//               System.exit(2);
//            }
//         }
//      }//calculateBMR
//      System.out.println("You should never eat less than your BMR, as this is the basic number of calories needed for you body to perform basic functions including digestion and breathing");
//   }
//
//   while (true) {
//   System.out.println("Please select an option below you'd like to improve your health:");
//   System.out.println("1. Lose Weight ");
//   System.out.println("2. Eat Healthier");
//   System.out.println("3. Get Active");
//   System.out.println("4. Sleep Better");
//   System.out.println("5. Drink less alcohol");
//   System.out.println("6. Exit");
//
//   int choice = keyboard.nextInt();
//   keyboard.nextLine();
//
//   switch (choice) {
//      case 1:
//         inputs[1] = ("Lose Weight");
//         break;
//      case 2:
//         inputs[2] = ("Eat healthier");
//         break;
//      case 3:
//         inputs[3] = ("Get Active");
//         break;
//      case 4:
//         inputs[4] = ("Sleep better");
//         break;
//      case 5:
//         inputs[5] = ("Drink less alcohol");
//         break;
//      case 6:
//         inputs[6] = ("Exiting...");
//         break;
//      default:
//         System.out.println("Invalid choice. Please try again.");
//   }//menuchoice

   public void loseWeight()
   {
      System.out.println("DO");
      System.out.println("Look at the labels and select food with orange and green labels, they are healthier");
      System.out.println("Drink less sugary drinks and alcohol, thee are high in calories");
      System.out.println("Try becoming more aware of what you are eating by starting a food diary");
      System.out.println();
      System.out.println("REMEMBER - Be kind to yourself we all have good days and bad ");
   }//loseweight


      public void eatHealthier() {
         loseWeight();
         System.out.println("Try to eat 5 fruit and vegetables everyday");
         System.out.println(" Eat extra fibre with wholegrain foods, brown rice, wholewheat pasta, skin-on potatoes");
         System.out.println("Low salt or reduced salt sauces and foods");
      }//eathealthy

      public void getActive() {
         System.out.println("DO");
         System.out.println("Aim for 150 minute sof exercise per week, which is roughly 20 - 30 minutes a day ");
         System.out.println("Plan ahead, decide the days you want to exercise and stick to it");
         System.out.println("Do an activity you enjoy, exercise classes, boxing, yoga or maybe dance classes");
      }//getactive

   public void sleepBetter()
   {
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

   public void drinkLessAlcohol()
   {
      System.out.println("DO");
      System.out.println();
      System.out.println("Opt for drinks lower in alchol like a light or alchol free beer or wine.");
      System.out.println("Try to make soical plans not inclduing alchol - like a cafe or a walk ");
      System.out.println("Let friend or family member know you are trying to drink less so they can support you");
      System.out.println("Limit how much money you want spend on alcohol and stick to it");
   }//drinkless
}//class