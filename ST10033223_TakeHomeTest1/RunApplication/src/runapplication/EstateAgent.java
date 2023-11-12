/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runapplication;

/**
 *
 * @author Chris Bartie
 */
abstract class EstateAgent implements iEstateAgent {
    private String estateAgentName;
    private double propertyPrice;
    
    public EstateAgent(String estateAgentName, double propertyPrice){
        this.estateAgentName = estateAgentName;
        this.propertyPrice = propertyPrice;
    }
    //implementing methods from iEstateAgent interface
    @Override
    public String getAgentName(){
        return estateAgentName;
    }
     @Override
    public double getPropertyPrice(){
        return propertyPrice;
    }
     @Override
    public double getAgentCommission(){
        return propertyPrice * 0.2; //agents commission is 20% of the sale
    }
    
}
