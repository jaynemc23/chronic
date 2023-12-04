//package GroupProject;
//import java.util.Scanner;
///*******************************************************
// Program Name: Cancer
// Created by: Pearse Molloy
// Created on: 22/11/2023
// Description: Section on cancer for PSD2 group assignment
// *******************************************************/
//public class Cancer
//{
//   public static Scanner keyboard = new Scanner(System.in);
//   public static int menuChoice;
//   public static char familyHistoryChoice, radExposureChoice;
//
//   public static void main(String[] args)
//   {
//      menu();
//
//      do
//      {
//         System.out.print("\nMenu choice: ");
//         menuChoice = keyboard.nextInt();
//
//         switch (menuChoice)
//         {
//            case 1: whatIsCancer();
//               break;
//            case 2: causes();
//               break;
//            case 3: preventiveAction();
//               break;
//            case 4: amIAtRisk();
//               break;
//
//            //case 5: Call to the main menu
//
//            default:
//            {
//               System.out.println("INVALID CHOICE - Please select a valid option");
//            }
//            break;
//         }//switch
//      } while (menuChoice != 5);
//   }//main
//
//   public static void menu()
//   {
//      System.out.println("Welcome to the sub menu for information related to cancer");
//      System.out.println("Please enter the number corresponding to your choice\n");
//
//      System.out.println("1. What is cancer?");
//      System.out.println("2. Causes");
//      System.out.println("3. Preventive Action");
//      System.out.println("4. Am I at risk?");
//      System.out.println("5. Return to main menu");
//   }//menu
//
//   public static void whatIsCancer()
//   {
//      System.out.println("\nWhat is Cancer?");
//      System.out.println("===============");
//      System.out.print("\nCancer is a disease in which some of the bodyâ€™s cells grow uncontrollably and spread to ");
//      System.out.println("other parts of the body.\n");
//
//      System.out.print("Cancer can start almost anywhere in the human body, which is made up of trillions of cells. ");
//      System.out.print("Normally, human cells grow and multiply (through a process called cell division) to form ");
//      System.out.print("new cells as the body needs them. When cells grow old or become damaged, they die, and ");
//      System.out.println("new cells take their place.\n");
//
//      System.out.print("Sometimes this orderly process breaks down, and abnormal or damaged cells grow and ");
//      System.out.print("multiply when they shouldn't. These cells may form tumors, which are lumps of tissue. ");
//      System.out.println("Tumors can be cancerous or not cancerous (benign).\n");
//
//      System.out.print("Cancerous tumors spread into, or invade, nearby tissues and can travel to distant places ");
//      System.out.print("in the body to form new tumors (a process called metastasis). Cancerous tumors may also ");
//      System.out.print("be called malignant tumors. Many cancers form solid tumors, but cancers of the blood, ");
//      System.out.println("such as leukemia, generally do not.\n");
//
//      System.out.print("Benign tumors do not spread into, or invade, nearby tissues. When removed, benign tumors ");
//      System.out.print("usually donâ€™t grow back, whereas cancerous tumors sometimes do. Benign tumors can sometimes ");
//      System.out.print("be quite large, however.Some can cause serious symptoms or be life threatening, such as ");
//      System.out.println("benign tumors in the brain.\n");
//   }//whatIsCancer
//
//   public static void causes()
//   {
//      System.out.print("\nCancer arises from the transformation of normal cells into tumour cells in a ");
//      System.out.print(" multi-stage process that generally progresses from a pre-cancerous lesion to a malignant ");
//      System.out.print("tumour. These changes are the result of the interaction between a person's genetic factors ");
//      System.out.println(" and three categories of external agents, including:\n");
//
//      System.out.println("â€¢\tphysical carcinogens, such as ultraviolet and ionizing radiation");
//      System.out.print("â€¢\tchemical carcinogens, such as asbestos, components of tobacco smoke, alcohol, aflatoxin ");
//      System.out.println("a food contaminant);, and arsenic (a drinking water contaminant); and");
//      System.out.print("â€¢\tbiological carcinogens, such as infections from certain viruses, bacteria, or ");
//      System.out.println("parasites.\n");
//
//      System.out.print("Tobacco use, alcohol consumption, unhealthy diet, physical inactivity and air pollution ");
//      System.out.println("are risk factors for cancer and other noncommunicable diseases.\n");
//
//      System.out.print("Between 30 and 50% of cancers can currently be prevented by avoiding risk factors ");
//      System.out.print("and implementing existing evidence-based prevention strategies. The cancer burden can also ");
//      System.out.print("be reduced through early detection of cancer and appropriate treatment and care of patients ");
//      System.out.print("who develop cancer. Many cancers have a high chance of cure if diagnosed early ");
//      System.out.println("and treated appropriately.\n");
//   }//causes
//
//   public static void preventiveAction()
//   {
//      System.out.println("\nCancer risk can be reduced by:");
//      System.out.println("â€¢\tNot using tobacco;");
//      System.out.println("â€¢\tMaintaining a healthy body weight;");
//      System.out.println("â€¢\tEating a healthy diet, including fruit and vegetables;");
//      System.out.println("â€¢\tDoing physical activity on a regular basis;");
//      System.out.println("â€¢\tAvoiding or reducing consumption of alcohol;");
//      System.out.print("â€¢\tGetting vaccinated against HPV and hepatitis B if you belong to a group for which ");
//      System.out.println("vaccination is recommended;");
//      System.out.print("â€¢\tAvoiding ultraviolet radiation exposure (which primarily results from exposure to the ");
//      System.out.println("sun and artificial tanning devices) and/or using sun protection measures;");
//      System.out.print("â€¢\tEnsuring safe and appropriate use of radiation in health care (for diagnostic and ");
//      System.out.println("therapeutic purposes);");
//      System.out.println("â€¢\tMinimizing occupational exposure to ionizing radiation; and");
//      System.out.print("â€¢\tReducing exposure to outdoor air pollution and indoor air pollution, including radon ");
//      System.out.print("a radioactive gas produced from the natural decay of uranium, which can accumulate in ");
//      System.out.println("buildings â€” homes, schools and workplaces).\n");
//   }//preventiveAction
//
//   public static void amIAtRisk()
//   {
//      UserCancer user1 = new UserCancer();
//      final int INTENSETARGET = 57, LIGHTTARGET = 150;
//      final int MINSUNEXPOSURE = 10, MAXSUNEXPOSURE = 30;
//      final int FIVEADAY = 5, MAXREDMEATPORTION = 3, MAXREDMEATAMOUNT = 70;
//
//      System.out.println("This section will ask additional questions to what was asked upon entering the program.");
//      System.out.println("This is to provide additional insight as to your potential cancer risk");
//      System.out.println();
//
//      System.out.println("1. How many minutes of light intensity exercise would you roughly get each week?");
//      System.out.print("Light exercise: ");
//      user1.setLightExercise(keyboard.nextInt());
//      if (user1.getLightExercise() >= LIGHTTARGET)
//      {
//         System.out.print("You are exceeding the weekly recommended light intensity exercise of 150 minutes by ");
//         System.out.println((user1.getLightExercise() - LIGHTTARGET) + " keep it up!");
//      }//if
//      else
//      {
//         System.out.print("You are short of the recommended weekly light exercise by ");
//         System.out.println((LIGHTTARGET - user1.getLightExercise()) + " try to be more active going forward.");
//      }//else
//      System.out.println();
//
//      System.out.println("2. How many minutes of high intensity exercise do you roughly get each week?");
//      System.out.print("Intense exercise: ");
//      user1.setIntenseExercise(keyboard.nextInt());
//      if (user1.getIntenseExercise() >= INTENSETARGET)
//      {
//         System.out.print("You are exceeding the weekly recommended high intensity exercise of 75 minutes by ");
//         System.out.println((user1.getIntenseExercise() - INTENSETARGET) + " keep it up!");
//      }//if
//      else
//      {
//         System.out.print("You are short of the recommended weekly intense exercise by ");
//         System.out.println((INTENSETARGET -user1.getIntenseExercise()) + " try to be more active going forward.");
//      }//else
//      System.out.println();
//
//      System.out.println("How many minutes of sunlight exposure would you say you get daily?");
//      System.out.print("Daily sun exposure: ");
//      user1.setSunExposure(keyboard.nextInt());
//      if ((user1.getSunExposure() <= MAXSUNEXPOSURE) && (user1.getSunExposure() >= MINSUNEXPOSURE))
//      {
//         System.out.print("You are getting the recommended sunlight exposure of between 10 and 30 minutes to ");
//         System.out.println("safely get vitamin D from the sun without risking overexposure.");
//      }//if
//      else if (user1.getSunExposure() < MINSUNEXPOSURE)
//      {
//         System.out.print("While you are safely avoiding overexposure to the sun it is also important to get ");
//         System.out.println("a healthy dose of sunlight (10 -30) minutes to get sufficient vitamin D.");
//      }//else if
//      else
//      {
//         System.out.print("You are exceeding the recommended daily sunlight exposure (10 - 30 minutes). ");
//         System.out.println("Please try to reduce your exposure to the sun and stay within the recommended ");
//         System.out.println("timeframe to reduce your cancer risk.");
//      }//else
//      System.out.println();
//
//      System.out.println("How many portions of fruit and vegetables to consume daily?");
//      System.out.print("Daily fruit/veg portions: ");
//      user1.setFruitVegConsumption(keyboard.nextInt());
//      if (user1.getFruitVegConsumption() >= FIVEADAY)
//      {
//         System.out.println("You are getting the recommended daily fruit and veg intake of 5 potions. Good job!");
//      }//if
//      else
//      {
//         System.out.print("You are getting less than the recommended daily fruit and veg intake of 5 portions. ");
//         System.out.print("Try to get " + (FIVEADAY - user1.getFruitVegConsumption()) + " more portions.");
//      }//else
//      System.out.println();
//
//      System.out.println("How many portions of red meat do you typically consume in a week?");
//      System.out.print("Red meat portions: ");
//      user1.setRedMeatPortions(keyboard.nextInt());
//      if (user1.getRedMeatPortions() <= MAXREDMEATPORTION)
//      {
//         System.out.println("You are consuming less that the recommended maximum weekly red meat portions of 3.");
//      }//if
//      else
//      {
//         System.out.print("You are exceeding the recommended weekly red meat portions of 3. ");
//         System.out.println("Try to reduce your red meat intake going forward.");
//      }//else
//      System.out.println();
//
//      System.out.println("What size are your red meat portions typically in grams?");
//      System.out.print("Red meat portion size: ");
//      user1.setRedMeatAmount(keyboard.nextInt());
//      if (user1.getRedMeatAmount() > MAXREDMEATAMOUNT)
//      {
//         System.out.print("You've exceeded the recommended red meat potion size of 70g by ");
//         System.out.print((user1.getRedMeatAmount() - MAXREDMEATAMOUNT) + "g. Try to reduce sizes to lower cancer ");
//         System.out.println("risk.");
//      }//if
//      else
//      {
//         System.out.println("Your portion size is within the recommended size of 70g.");
//      }//else
//      System.out.println();
//
//      System.out.println("Is there a history of cancer in your family? Enter yes if true");
//
//      System.out.print("History of cancer in family: ");
//      familyHistoryChoice = keyboard.next().charAt(0);
//      if ((familyHistoryChoice == 'Y') || (familyHistoryChoice == 'y'))
//      {
//         user1.setFamilyHistory(true);
//      }//if
//      if (user1.getFamilyHistory())
//      {
//         System.out.print("While not definitive, you may have an increased of developing certain cancers compared ");
//         System.out.println("to those who have no family history of cancer.");
//      }//if
//      else
//      {
//         System.out.println("With no family history of cancer, your chances of developing it are lessened.");
//      }//else if
//
//      System.out.println("Do you work in an environment that exposes you to any form of radiation? Enter yes if true");
//      System.out.print("Radiation exposure: ");
//      radExposureChoice = keyboard.next().charAt(0);
//      if ((radExposureChoice == 'Y') || (radExposureChoice == 'y'))
//      {
//         user1.setRadiationExposure(true);
//      }//if
//      if (user1.getRadiationExposure())
//      {
//         System.out.print("While work necessities may be unavoidable do your best to minimise occupational ");
//         System.out.println("exposure, wear sufficient protection and follow your workplace's safety guidelines.");
//      }//if
//      else
//      {
//         System.out.println("By having no occupational exposure to radiation your cancer risk is reduced.");
//      }//else if
//   }//amIAtRisk
//}//class