
package dogs;

public class Dogs {

    public static void main(String[] args) {
      Dog dog1 = new Dog();
      dog1.Breed = "Akita";
      dog1.Name = "Ginger";
      dog1.ShotStatus = "Up to Date";
      dog1.age = 6;
      
      Dog dog2 = new Dog();
      dog2.Breed = "Bowser";
      dog2.Name = "Retreiver";
      dog2.ShotStatus = "Up to Date";
      dog2.age = 2;
      
        System.out.println("Dog Name: " +dog1.Name + ", dog breed is: " + dog1.Breed + ", shot status: " + dog1.ShotStatus + ", age: " + dog1.age);
        System.out.println("Dog Name: " +dog2.Name + ", dog breed is: " + dog2.Breed + ", shot status: " + dog2.ShotStatus + ", age: " + dog2.age);
        
        System.out.println(dog1.bark());
        System.out.println(dog2.bark());
    }
    
}
