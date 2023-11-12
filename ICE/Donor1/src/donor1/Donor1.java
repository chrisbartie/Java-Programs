package donor1;

public class Donor1 {

  
    public static void main(String[] args)
    {
       BloodData1 test1 = new BloodData1();

        System.out.println("Blood Type: " + test1.getBloodType());

        System.out.println("RH Factor: " + test1.getrhFactor());

       

        BloodData1 test2 = new BloodData1();

        test2.setBloodType("A");

        test2.setrhFactor('-');

        System.out.println();

        System.out.println("Blood Type: " + test2.getBloodType());

        System.out.println("RH Factor: " + test2.getrhFactor());

        System.out.println();

       

        BloodData1 test3 = new BloodData1("B", '+');

        System.out.println("Blood Type: " + test3.getBloodType());

        System.out.println("RH Factor: " + test3.getrhFactor());

        System.out.println();

       

       

       

       

    }

   

}
     
 
    
    

