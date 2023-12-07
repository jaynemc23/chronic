import java.util.InputMismatchException;
import java.util.Scanner;
/****
 ***** Created by David Houston on 04 12 2023
 ***** Osteoporosis class
 *****/

public class Osteoporosis
{
   Scanner scan = new Scanner(System.in);
   String FullName;
   int age;
   String gender;
   int weight;
   boolean alcoholExcessiveDrinking = true;

   boolean smoker = true;

   public String getFullName()
   {
      return FullName;
   }

   public void setFullName(String fullName)
   {
      FullName = fullName;
   }

   public int getAge()
   {
      return age;
   }

   public void setAge(int age)
   {
      this.age = age;
   }

   public String getGender()
   {
      return gender;
   }

   public void setGender(String gender)
   {
      this.gender = gender;
   }

   public int getWeight()
   {
      return weight;
   }

   public void setWeight(int weight)
   {
      this.weight = weight;
   }

   public boolean isAlcoholExcessiveDrinking()
   {
      return alcoholExcessiveDrinking;
   }

   public void setAlcoholExcessiveDrinking(boolean alcoholExcessiveDrinking)
   {
      this.alcoholExcessiveDrinking = alcoholExcessiveDrinking;
   }

   public boolean isSmoker()
   {
      return smoker;
   }

   public void setSmoker(boolean smoker)
   {
      this.smoker = smoker;
   }

   public Osteoporosis()
   {
   }//constructor

   public Osteoporosis(String fullName, int age, String gender, int weight, boolean alcoholExcessiveDrinking, boolean smoker)
   {
      FullName = fullName;
      this.age = age;
      this.gender = gender;
      this.weight = weight;
      this.alcoholExcessiveDrinking = alcoholExcessiveDrinking;
      this.smoker = smoker;
   }

   public static void information()
   {

      System.out.println("-----Welcome to the Brittle Bone Disease (Osteoporosis) Information and Prevention Program!-----");
      System.out.println("--osteoporosis (also known as Brittle bone disease) , is a condition characterized by weakened bones.--");
      System.out.println("--Causes include aging, hormonal changes, lack of exercise, and inadequate intake of calcium and vitamin D, and poor diet.--");
      System.out.println("--Prevention involves a healthy lifestyle with proper nutrition, exercise (where applicable), and sufficient exposure to sunlight (with appropriate sunscreen protection.)--");
      System.out.println("--Cures may include medications and lifestyle changes, to include no smoking!! and safe alcohol intake .--");
   }
   // call invoke the information method

   public void osteoporosisQuestions()
   {
      try
      {
         information();

         System.out.println("Please enter you daily calcium intake (mg)");
         double calciumIntake = scan.nextDouble();
         System.out.println("Please enter you daily vit D intake (IU)");
         double vitdIntakeIntake = scan.nextDouble();
         scan.nextLine();
         System.out.println("Do you eat a well-balanced diet, rich in calcium and vitD(Y/Yes, N/No");
         String diet = scan.next().toLowerCase();
         System.out.println("Would you get regular exposure to sunlight? (Y/Yes, N/N0)");
         String sunlight = scan.nextLine();
         scan.nextLine();

         double[] calciumRecommendations = {1000, 1200};  // Recommended calcium intake for age groups 0-50 and 51+ years old
         double[] vitaminDRecommendations = {600, 800};   //Recommended daily dosage for age groups 0-50 and 51+ years old

         if (calciumIntake >= 1000 && sunlight.equals("yes") && diet.equals("yes"))
         {
            System.out.println("Excellent news, you are at low risk of suffering from osteoporosis. Keep up the good work!");

            double vitdIntake = 0;

            if (vitdIntake >= vitaminDRecommendations[0] && vitdIntake <= vitaminDRecommendations[1])
            {
               System.out.println("Great news as you have sufficient amount of Vit D , continue as normal,as your low-risk at the present time");

            }

         } else
         {
            System.out.println("You need to change your lifestyle, as you are at risk of developing osteoporosis.");
         }


      } catch (InputMismatchException e)
      {
         System.out.println("Input mismatch. Please enter valid data types.");

      }
      // Close the scanner in the finally block to ensure it is closed even if an exception occurs
      scan.close();
      System.out.println("Input mismatch. Please enter valid data types.");

   }

}