public class Policy{

//Variables
private int policyNumber;
private String providerName;
private double price = 600;

//no-arg constructor
public Policy(){

policyNumber = 0;
providerName = "empty";

}

/**
arg constructor
@param policy: the policy number
@param provider: the provider
@param first: the first name
@param last: the last name
@param ageYears: the persons age
@param smoking: the smoking status
@param heightInches: the persons height
@param weightPounds: the persons weight
*/
public Policy(int policy, String provider){

policyNumber = policy;
providerName = provider;

}

//setters
/**
setter for policy number
@param policy: the new policy number
*/
public void setPolicyNumber(int policy){

policyNumber = policy;

}

/**
the setter for the provider name
@param provider: the new provider
*/
public void setProviderName(String provider){

providerName = provider;

}

//getters
/**
getter method for policy number
@return policyNumber: the policy number
*/
public int getPolicyNumber(){

return policyNumber;

}

/**
getter method for provider name
@return providerName: the provider name
*/
public String getProviderName(){

return providerName;

}

/**
method for price calculation output
@return price: the price
*/
public double price(){

if(getAge() > 50){

   price = price + 75; 

}

if(getSmokingStatus().equals("smoker")){

   price = price + 100;

}

if(BMI() > 35){

   price = price + ((BMI() - 35) * 20);

}

return price

}

/**
toString method
@return all the info for toString
*/
@Override
public String toString(){
   
return "\n\nPolicy Number: " + policyNumber + "\nProvider Name: " + providerName + policyHolder.toString() + String.format("\nPolicy Price: $" + "%,.2f",price);
   
}

}