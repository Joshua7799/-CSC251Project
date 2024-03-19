public class Policy{

//Variables
private int policyNumber;
private String providerName;
private String firstName;
private String lastName;
private int age;
private String smokingStatus;
private double height;
private double weight;

//no-arg constructor
public Policy(){

policyNumber = 0;
providerName = "empty";
firstName = "empty";
lastName = "empty";
age = 0;
smokingStatus = "empty";
height = 0.0;
weight = 0.0;

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
public Policy(int policy, String provider, String first, String last, int ageYears, String smoking, double heightInches, double weightPounds){

policyNumber = policy;
providerName = provider;
firstName = first;
lastName = last;
age = ageYears;
smokingStatus = smoking;
height = heightInches;
weight = weightPounds;

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

/**
the setter for the first name
@param first: the new first name
*/
public void setFirstName(String first){

firstName = first;

}

/**
the setter for the new last name
@param last: the new last name
*/
public void setLastName(String last){

lastName = last;

}

/**
the setter for the new age
@param ageYears: the new age in years
*/
public void setAge (int ageYears){

age = ageYears;

}

/**
setter for the smoking status
@param smoking: the updated smoking status
*/
public void setSmokingStatus(String smoking){

smokingStatus = smoking;

}

/**
the setter for a new height
@param heightInches: the new height in inches
*/
public void setHeight(double heightInches){

height = heightInches;

}

/**
the settter for new weight
@param weightPounds: the new weight in pounds
*/
public void setWeight(double weightPounds){

weight = weightPounds;

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
getter method for the first name
@return firstName: the persons first name
*/
public String getFirstName(){

return firstName;

}

/**
getter method for the last name
@return lastName: the persons last name
*/
public String getLastName(){

return lastName;

}

/**
getter method for the persons age
@return age: the persons age
*/
public int getAge (){

return age;

}

/**
getter method for the smoking status
@return smokingStatus: the smoking status
*/
public String getSmokingStatus(){

return smokingStatus;

}

/**
getter method for the persons height
@return height: the persons height
*/
public double getHeight(){

return height;

}

/**
getter method for the persons weight
@return weight: the persons weight
*/
public double getWeight(){

return weight;

}

/**
Method for BMI calculation
@return bmi: the bmi of the person
*/
public double BMI(){

double bmi;

bmi = (weight * 703)/(height * height);

return bmi;

}

/**
method for price calculation output
@return price: the price
*/
public double price(){

double price = 600;

if(getAge() > 50){

   price = price + 75; 

}

if(getSmokingStatus().equals("smoker")){

   price = price + 100;

}

if(BMI() > 35){

   price = price + ((BMI() - 35) * 20);

}

return price;

}

}