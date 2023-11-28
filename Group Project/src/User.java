import javax.xml.namespace.QName;
import java.util.Scanner;

/****
 ***** Created by Jayne  on 26 11
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class User
{

   //instance variables
   private String name;
   private int age;
   private double weight;
   private double height;
   private boolean smoker;
   private String drinker, gender;
   public User () {

   }//default constructor

   public User(String name, int age, double weight, double height, boolean smoker, String drinker, String gender)
   {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = height;
      this.smoker = smoker;
      this.drinker = drinker;
      this.gender = gender;
   }//alt constructor

   public String getName()
{
   return name;
}

   public void setName(String name)
   {
      this.name = name;
   }

   public int getAge()
   {
      return age;
   }

   public void setAge(int age)
   {
      this.age = age;
   }

   public double getWeight()
   {
      return weight;
   }

   public void setWeight(double weight)
   {
      this.weight = weight;
   }

   public double getHeight()
   {
      return height;
   }

   public void setHeight(double height)
   {
      this.height = height;
   }

   public boolean isSmoker()
   {
      return smoker;
   }

   public void setSmoker(boolean smoker)
   {
      this.smoker = smoker;
   }

   public String getDrinker()
   {
      return drinker;
   }

   public void setDrinker(String drinker)
   {
      this.drinker = drinker;
   }

   public String getGender()
   {
      return gender;
   }

   public void setGender(String gender)
   {
      this.gender = gender;
   }

   protected void userQuestions()
   {
      Scanner keyboard = new Scanner (System.in);
      System.out.println("What is your name?");
      name = keyboard.nextLine();
      System.out.println("What is your age?");
      age = keyboard.nextInt();
      keyboard.nextLine();
      System.out.println("What gender were you born as: ");
      gender = keyboard.nextLine();
      System.out.println("Do you smoke (Y for Yes, N for No): ");
      String answer = keyboard.nextLine();
      if(answer.charAt(0) == 'Y') {
         smoker = true;
      }//if
      System.out.println("Do you drink : ");
      drinker = keyboard.nextLine();
   }//userQuestions

   public void bmiQuestions() {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please enter your weight in KG: ");
      weight = keyboard.nextDouble();
      System.out.println("Please enter your height in cm: ");
      height = keyboard.nextDouble();
   }//bmiQuestions

   public String calculateBMI() {
      double bmi;
      bmi = weight / ((height / 100) * (height / 100));

      if (bmi < 18.5)
      {
         return "Your result suggests you are underweight";

      } else if (bmi < 25)
      {
         return "Your result suggests you are a healthy weight";

      } else if (bmi < 30)
      {
         return "Your result suggests you are overweight";

      } else
      {
         return "Your result suggests you are obese";
      }
   }//calculateBMI


}//class