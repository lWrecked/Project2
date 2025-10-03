package School.YAluobaidy_Project2;

public class Patient {

    private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String emergencyName;
    private String emergencyPhone;


    //No-arg constructor
    public Patient(){
        firstName = "";
        middleName = "";
        lastName = "";
        streetAddress = "";
        city = "";
        state = "";
        zip = "";
        phoneNumber = "";
        emergencyName = "";
        emergencyPhone = "";
    }

    //Constructor for the name of the patient    
    public Patient(String firstName, String middleName, String lastName){

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

    }

    //Constructor intitializes all attributes of the patient
    public Patient(String firstName, String middleName, String lastName,
                   String streetAddress, String city, String state, 
                   String zip, String phoneNumber, String emergencyName,
                   String emergencyPhone){ 
                    
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
       
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.emergencyName = emergencyName;

        this.emergencyPhone = emergencyPhone;

    }

    //Getter method
    public String getFirstName(){
        return firstName;
    }

    public String getMiddleName(){
        return middleName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getStreetAddress(){
        return streetAddress;
    }

    public String getCity(){
        return city;
    }

    public String getState(){
        return state;
    }

    public String getZip(){
        return zip;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmergencyName(){
        return emergencyName;
    }

    public String getEmergencyPhone(){
        return emergencyPhone;
    }

    //Mutator methods
    public void setFirstname(String firstName){

        this.firstName = firstName;
    }
    
    public void setMiddleName(String middleName){

        this.middleName = middleName;
    }
    
    public void setLastName(String lastName){

        this.lastName = lastName;
    }
    
    public void setStreetAddress(String streetAddress){

        this.streetAddress = streetAddress;
    }
    
    public void setCity(String city){

        this.city = city;
    }

    public void setState(String state){

        this.state = state;
    }

    public void setZip(String zip){

        this.zip = zip;
    }
    
    public void setPhoneNumber(String phoneNumber){

        this.phoneNumber = phoneNumber;
    }
    
    public void setEmergencyName(String emergencyName){

        this.emergencyName = emergencyName;
    }
    
    public void setEmergencyPhone(String emergencyPhone){

        this.emergencyPhone = emergencyPhone;
    }

    //Method which returns a string which is the concatenation of first, middle and last name.
    public String buildFullName(){

        return firstName + " " + middleName + " " + lastName; 
    }
    
    //Method that returns a string which the concatenation of the address, city, state, and zip.
    public String buildAddress(){

        return streetAddress + " " + city + " " + state + " " + zip; 
    }

    //Method that returns a string which is the concatenation of the emergency contact's name and phonenumber
    public String buildEmergencyContact(){
        
        return emergencyName + " " + emergencyPhone; 
    }
    
    @Override
    public String toString(){
        return "  Name: " + buildFullName() + "\n"
        + "  Address: " + buildAddress() + "\n"
        + "  Phone Number: " + phoneNumber + "\n"
        + "  EmergencyContact: " + buildEmergencyContact(); 
    }






}
