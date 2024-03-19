import java.util.Scanner;
import java.util.*; 
import java.io.*;

public class Project_joshua_torres{

   public static void main(String[] args){
   
   File file = new File("PolicyInformation.txt"); //The file   
   
   Scanner fileReader = new Scanner(file); //scanner for the file input
   
   //variables
   int policyNum;
   String provider;
   String first;
   String last;
   int ageYears;
   String smoking;
   double heightInches;
   double weightPounds;
   
   ArrayList<Policy> list = new ArrayList<Policy>(); //array list for the file info
   
   while(fileReader.hasNext()){
      policyNum = fileReader.nextInt();
      fileReader.nextLine();
      
      provider = fileReader.nextLine();
   
      first = fileReader.next();
   
      last = fileReader.next();
   
      ageYears = fileReader.nextInt();

      smoking = fileReader.next();
   
      heightInches = fileReader.nextDouble();   

      weightPounds = fileReader.nextDouble();
   
      //creates class using the info
      Policy policy = new Policy(policyNum, provider, first, last, ageYears, smoking, heightInches, weightPounds);
   
      list.add(policy);
   }
   
   fileReader.close();
   
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