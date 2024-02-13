import java.util.Scanner;

public class Project_joshua_torres{

   public static void main(String[] args){
   
   //variables
   int policyNum;
   String provider;
   String first;
   String last;
   int ageYears;
   String smoking;
   double heightInches;
   double weightPounds;
   
   //scanner for input
   Scanner keyboard = new Scanner(System.in);
   
   //asks for input, assigns it to the appropriate variable for all info
   System.out.print("Please enter the Policy Number: ");
   policyNum = keyboard.nextInt();
   
   System.out.print("Please enter the Provider Name: ");
   keyboard.nextLine();
   provider = keyboard.nextLine();
   
   System.out.print("Please enter the Policyholder’s First Name: ");
   first = keyboard.next();
   
   System.out.print("Please enter the Policyholder’s Last Name: ");
   last = keyboard.next();
   
   System.out.print("Please enter the Policyholder’s Age: ");
   ageYears = keyboard.nextInt();
   
   System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
   smoking = keyboard.next();
   
   System.out.print("Please enter the Policyholder’s Height (in inches): ");
   heightInches = keyboard.nextDouble();
   
   System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
   weightPounds = keyboard.nextDouble();
   
   //creates class using the info
   Policy policy = new Policy(policyNum, provider, first, last, ageYears, smoking, heightInches, weightPounds);
   
   //displays all info
   System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
   System.out.println("Provider Name: " + policy.getProviderName());
   System.out.println("Policyholder’s First Name: " + policy.getFirstName());
   System.out.println("Policyholder’s Last Name: " + policy.getLastName());
   System.out.println("Policyholder’s Age: " + policy.getAge());
   System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
   System.out.println("Policyholder’s Height: " + policy.getHeight() + " inches");
   System.out.println("Policyholder’s Weight: " + policy.getWeight() + " pounds");
   System.out.printf("Policyholder’s BMI: $%.2f", policy.BMI());
   System.out.printf("\nPolicy Price: $%.2f", policy.price());

   }
   
}