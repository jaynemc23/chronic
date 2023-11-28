
import java.sql.SQLOutput;
import java.util.Scanner;
/****
 ***** Created by jayne mc laughlin on 19/11/2023
 ***** Opening print
 *****/
public class Main
{


      public static void main(String[] args)
   {
       Scanner keyboard = new Scanner (System.in);

       User user1 = new User();

      System.out.println("\t\t\t\t\t\t\t\t\t   Welcome ");
      System.out.println("------------------------------------------------------------------------------------------------");
      System.out.println("Our aim is to solve chronic disease of heart disease, cancer, osteoporosis and obesity.");
      System.out.println();
      System.out.println("Investigating the potential impact of diet and lifestyle quality on the underlying mechanism,s leading not only to disease but also to maintaining health.");
      System.out.println();
      System.out.println();
      System.out.println("Lets start by asking a few questions");
      user1.userQuestions();
      user1.bmiQuestions();
      String bmi = user1.calculateBMI();
      System.out.println(bmi);









      //This loop is to control results of questions asked above and exit
     // do () {





      }//main
}//class