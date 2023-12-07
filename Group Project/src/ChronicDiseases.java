import java.sql.SQLOutput;
import java.util.Scanner;
/****
 ***** Created by Everyone on 28 11
 *****
 *****/
public class ChronicDiseases
{
   //variables
    String name;
    int age;
   int weight;
   int height;
   String gender;
   protected boolean smoker;
   protected boolean drinker;

   String[] inputs = new String[5];

   public ChronicDiseases () {

   }//constructor

   public ChronicDiseases(String name)
   {
      this.name = name;

   }//constructor

   public ChronicDiseases(int age, int weight, int height, String gender)
   {
      this.age = age;
      this.weight = weight;
      this.height = height;
      this.gender = gender;

   }

   public ChronicDiseases(Boolean smoker, int age, String gender)
   {
      this.smoker = smoker;
      this.age = age;
      this.gender = gender;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
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

}//class