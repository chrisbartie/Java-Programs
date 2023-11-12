package donor1;

public class BloodData1 
{
private String bloodType;

   private char rhFactor;

   

    public BloodData1()// Default constructor 

    {

        bloodType = "O";

        rhFactor = '+';

    }

    public BloodData1(String type, char factor) // Overloaded constructor 

    {

        bloodType = type;

        rhFactor = factor;

    }

   

   

    public void setBloodType(String type) //Setting bloodType to the  value 

    {

    this.bloodType = type;

    }

   

    public String getBloodType()

    {

    return bloodType;

    }

   

    public void setrhFactor(char factor) //Setting the rhFactor to a character type

    {

    this.rhFactor = factor;

    }

    public char getrhFactor()

    {

    return rhFactor;

    }

   

   

   

}

 

 
