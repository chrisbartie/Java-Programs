/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itemsold;

/**
 *
 * @author chris
 */
public class Antiques {
    
    public static void main(String[] args) {
        // Creates first object
        System.out.println("Object 1 Information:");
        LampSold lampSold = new LampSold(123,"Old harram",543.56,true,15);
        System.out.println(lampSold.getInvoiceNumber());
        System.out.println(lampSold.getDescription());
        System.out.println(lampSold.getPrice());
        System.out.println(lampSold.isCondition());
        System.out.println(lampSold.getAge());

        // Creates second object
        System.out.println("\nObject 2 Information:");
        LampSold lampSold2 = new LampSold(456,"Statue",100.2,false,0);
        System.out.println(lampSold2.getInvoiceNumber());
        System.out.println(lampSold2.getDescription());
        System.out.println(lampSold2.getPrice());
        System.out.println(lampSold2.isCondition());
        System.out.println(lampSold2.getAge());

    }
}  

