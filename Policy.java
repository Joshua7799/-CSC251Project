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

//arg constructor
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
public void setPolicyNumber(int policy){

policyNumber = policy;

}

public void setProviderName(String provider){

providerName = provider;

}

public void setFirstName(String first){

firstName = first;

}

public void setLastName(String last){

lastName = last;

}

public void setAge (int ageYears){

age = ageYears;

}

public void setSmokingStatus(String smoking){

smokingStatus = smoking;

}

public void setHeight(double heightInches){

height = heightInches;

}

public void setWeight(double weightPounds){

weight = weightPounds;

}

//getters
public int getPolicyNumber(){

return policyNumber;

}

public String getProviderName(){

return providerName;

}

public String getFirstName(){

return firstName;

}

public String getLastName(){

return lastName;

}

public int getAge (){

return age;

}

public String getSmokingStatus(){

return smokingStatus;

}

public double getHeight(){

return height;

}

public double getWeight(){

return weight;

}

//BMI calculation method
public double BMI(){

double bmi;

bmi = (weight * 703)/(height * height);

return bmi;

}

//price calculation
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