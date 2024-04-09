public class PolicyHolder{

//Variables
private String firstName;
private String lastName;
private int age;
private String smokingStatus;
private double height;
private double weight;
private double bmi;

public PolicyHolder(){

   firstName = "empty";
   lastName = "empty";
   age = 0;
   smokingStatus = "empty";
   height = 0.0;
   weight = 0.0;

}

public PolicyHolder(String first, String last, int ageYears, String smoking, double heightInches, double weightPounds){

   firstName = first;
   lastName = last;
   age = ageYears;
   smokingStatus = smoking;
   height = heightInches;
   weight = weightPounds;

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

bmi = (weight * 703)/(height * height);

return bmi;

}

/**
toString method
@return all the info for toString
*/
@Override
public String toString(){
   
return  "\nPolicyholder’s First Name: " + firstName + "\nPolicyholder’s Last Name: " + lastName + "\nPolicyholder’s Age: " + age + "\nPolicyholder’s Smoking Status: " + smokingStatus + "\nPolicyholder’s Height: " + height + "\nPolicyholder’s Weight: " + weight + String.format("\nPolicyholder’s BMI: " + "%,.2f",bmi);

}

}