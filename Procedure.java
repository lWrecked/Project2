package School.YAluobaidy_Project2;

public class Procedure {
    //Declaring variables
    private String procedureName;
    private String date;
    private String practitioner; 
    private double charges;

    //No-arg constructor
    public Procedure(){
        
        practitioner = "";
        date = "";
        procedureName = "";
        charges = 0;
    }

    //Two arg constructor for procedure name and date of procedure
    public Procedure(String procedureName, String date){
        
        this.procedureName = procedureName;
        this.date = date;
    }

    //Multi-arg constructor for all variables related to procedure class
    public Procedure(String procedureName, String date, String practitioner,
                     double charges){

        this.procedureName = procedureName;
        this.date = date;
        this.practitioner = practitioner;
        this.charges = charges;
    }

    //Accessor methods
    public String getProcedureName(){

        return procedureName;
    }

    public String getProcedureDate(){

        return date;
    }

    public String getPractitionerName(){

        return practitioner;
    }

    public double getCharges(){

        return charges;
    }

    //Mutator methods
    public void setProcedureName(String procedureName){

        this.procedureName = procedureName;
    }

    public void setProcedureDate(String date){

        this.date = date;
    }

    public void setPractitionerName(String practitioner){

        this.practitioner = practitioner;
    }

    public void setCharges(double charges){

        this.charges = charges;
    } 

    //toString method
    
    @Override
    public String toString(){
        return "\n \t Procedure: " + procedureName + "\n"
        + "\t ProcedureDate: " + date + "\n"
        + "\t Practitioner: " + practitioner + "\n"
        + "\t Charges = " + charges;
    }
}
