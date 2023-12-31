import javax.xml.namespace.QName;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/****
 ***** Created by Jayne on 26 11 2023
 *****
 *****/
public class User
{
   //instance variables
   private String name;
   private int age;
    double weight;
    double height;
    boolean smoker, drinker;
   private String gender;
   private ArrayList<String> healthRisks = new ArrayList<String>();
   private HeartDisease heartDisease = new HeartDisease();
   private Obesity obesity = new Obesity();
   private Cancer cancer = new Cancer();
   private Osteoporosis osteoporosis = new Osteoporosis();

   public User () throws FileNotFoundException
   {

   }//default constructor

   public User(String name, int age, double weight, double height, boolean smoker, boolean drinker, String gender) throws FileNotFoundException
   {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = height;
      this.smoker = smoker;
      this.drinker = drinker;
      this.gender = gender;
   }//alt constructor
   public HeartDisease getHeartDisease()
   {
      return heartDisease;
   }

   public void setHeartDisease(HeartDisease heartDisease)
   {
      this.heartDisease = heartDisease;
   }

   public Obesity getObesity()
   {
      return obesity;
   }

   public void setObesity(Obesity obesity)
   {
      this.obesity = obesity;
   }
   public String getName()
{
   return name;
}
   public Cancer getCancer()
   {
      return cancer;
   }

   public void setCancer(Cancer cancer)
   {
      this.cancer = cancer;
   }
   public Osteoporosis getOsteoporosis()
   {
      return osteoporosis;
   }

   public void setOsteoporosis(Osteoporosis osteoporosis)
   {
      this.osteoporosis = osteoporosis;
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

   public boolean getDrinker()
   {
      return drinker;
   }

   public void setDrinker(boolean drinker)
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
   public ArrayList<String> getHealthRisks()
   {
      return healthRisks;
   }

   public void setHealthRisks(ArrayList<String> healthRisks)
   {
      this.healthRisks = healthRisks;
   }
   protected void userQuestions()
   {           ///ENTER TRY & CATCH HERE
      Scanner keyboard = new Scanner (System.in);
      System.out.println("What is your name?");
      name = keyboard.nextLine();
      System.out.println("What is your age?");
      age = keyboard.nextInt();
      keyboard.nextLine();
      System.out.println("What gender were you born as ('F' for female, and 'M' for male: ");
      String input = keyboard.nextLine();
      if(input.toUpperCase().charAt(0) == 'F') {
         gender = "female";
      }//if
      else
         gender = "male";
      System.out.println("Do you smoke (Y for Yes, N for No): ");
      String isSmoker = keyboard.nextLine();
      if(isSmoker.toUpperCase().charAt(0) == 'Y') {
         smoker = true;
      }//if
      System.out.println("Do you drink (Y for Yes, N for No): ");
      String answer2 = keyboard.nextLine();
      if(answer2.toUpperCase().charAt(0) == 'Y') {
         drinker = true;
      }//if
   }//userQuestions

   public void bmiQuestions() {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please enter your weight in KG: ");
      weight = keyboard.nextDouble();
      System.out.println("Please enter your height in cm: ");
      height = keyboard.nextDouble();
   }//bmiQuestions

   public double calculateBMI() {
      double bmi = 0;
      bmi = weight / ((height / 100) * (height / 100));
      return bmi;
   }//calculateBMI

   public void riskAssessment() {
      if (calculateBMI() > 30) {
         healthRisks.add("Obesity");
      }
      if ((smoker && gender =="female" || gender == "male") || (calculateBMI() > 30 && smoker && drinker)) {
         healthRisks.add("Cancer");
      }
      if (calculateBMI() > 30 && smoker && drinker && gender == "female") {
         healthRisks.add("Osteoporosis");
      }
      if (calculateBMI() < 18.5 && smoker && drinker && gender == "female" || (age>= 50)|| (calculateBMI() < 18.5)) {
         healthRisks.add("Osteoporosis");
      }
      if (calculateBMI() > 30 && smoker && drinker && age >= 45 || (smoker) ||(calculateBMI() > 30 && smoker)) {
         healthRisks.add("Heart Disease");
      }
       else if (calculateBMI() < 25 && age < 30) {
         System.out.println(" You are currently a low risk of a chronic disease. Congratulations!");
      }
   }//riskAssessment


}//class