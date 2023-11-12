/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runapplication;

/**
 *
 * @author Chris Bartie
 */
class EstateAgentSales extends EstateAgent{
    public EstateAgentSales(String estateAgentName, double propertyPrice){
        super(estateAgentName, propertyPrice);
    }
    
    public void printPropertyReport(){ //printPropertyReport as specified in sample screenshot
         System.out.println("\nESTATE AGENT REPORT");
        System.out.println("*****************************");
        System.out.println("ESTATE AGENT NAME: " + getAgentName());
        System.out.println("PROPERTY PRICE: R " + getPropertyPrice());
        System.out.println("AGENT COMMISSION: R " + getAgentCommission());
    }
}
