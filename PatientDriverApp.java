package School.YAluobaidy_Project2;

import java.util.Scanner;


public class PatientDriverApp {
   public static void main(String[] args) {
        //Declaring Variables
        String firstName;
        String middleName;
        String lastName;
        String streetAddress;
        String city;
        String state;
        String zip;
        String phoneNumber;
        String emergencyName;
        String emergencyPhone;

        //Declaring and instantiating scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //Prompting for information
        System.out.println("Enter first name");
        firstName = keyboard.nextLine();
        
        System.out.println("Enter middle name: ");
        middleName = keyboard.nextLine();

        System.out.println("Enter last name: ");
        lastName = keyboard.nextLine();

        System.out.println("Enter street address: ");
        streetAddress = keyboard.nextLine();

        System.out.println("Enter city: ");
        city = keyboard.nextLine();

        System.out.println("Enter state: ");
        state = keyboard.nextLine();

        System.out.println("Enter ZIP code: ");
        zip = keyboard.nextLine();

        System.out.println("Enter phone number: ");
        phoneNumber = keyboard.nextLine();

        System.out.println("Enter emergency contact name: ");
        emergencyName = keyboard.nextLine();

        System.out.println("Enter emergency contact phone number: ");
        emergencyPhone = keyboard.nextLine();

        //Initialize patient with given information
        Patient patient = new Patient(firstName, middleName, lastName,
                                        streetAddress, city, state, zip,
                                        phoneNumber, emergencyName, emergencyPhone);
        
        Procedure spinalSurgery = new Procedure("Spinal Surgery", "10/21/2025", "Dr. Brooks", 10000.53);
        Procedure discAlignment = new Procedure("Disc Alignment", "12/15/2025", "Dr. Elric", 5000.32 );
        Procedure cataractSurgery = new Procedure("Cataract Surgery", "2/7/2026", "Dr. Makunouchi", -1593.40);

        //Patient output
        System.out.println("\nPatient Information: ");
        displayPatient(patient);
        
        displayProcedure(spinalSurgery);
        displayProcedure(discAlignment);
        displayProcedure(cataractSurgery);
        
        double total = calculateTotalCharges(spinalSurgery, discAlignment, cataractSurgery);

        System.out.printf(" \n Total Charges: %,.2f", total);
        System.out.println("\n Student Name: Yousif Aluobaidy\n"+
                            " MC#: 21226711"+
                            "\n" + " Due Date: 10/3/2025");

        

   } 
   
   //Display patient method, displays all information related to patient.
   public static void displayPatient(Patient patient){
        
        System.out.println(patient.toString());
   }

   //Display procedure, displays information relating to the procedure
   public static void displayProcedure(Procedure procedure){
    
        System.out.println(procedure.toString());
   }

   public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3){
        return procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
        
   }
}
