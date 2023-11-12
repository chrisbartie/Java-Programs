/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runapplication;

import java.util.Scanner;

/**
 *
 * @author Chris Bartie
 */
//Question 2
public class RunApplication {
    
  
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("Enter the current estate agent name: ");//prompting user to enter the estate agents name
        String agentName = scan.nextLine();
        System.out.print("Enter the property price: R ");//prompting user to enter the price of the property
        double propertyPrice = scan.nextDouble();
        
        EstateAgentSales agent = new EstateAgentSales(agentName, propertyPrice);
        
       agent.printPropertyReport(); 
        scan.close();
    }
    
}
