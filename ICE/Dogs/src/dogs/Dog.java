package dogs;

public class Dog {
    
    String Name, Breed;
    int age;
    String ShotStatus;
    
    public String bark()
    {
        return "Dog " + Name + " says Woof";
    }
    public void giveDogAShot()
    {
        ShotStatus = "Up to Date";
    }
    }


