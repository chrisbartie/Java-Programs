/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsandwich;

/**
 *
 * @author Work
 */
public class Sandwich {
    private String MainIngredient, BreadType;
    private double Price;
    
    public String getMainIngredient()
    {
        return MainIngredient;
    }
    
    public String getBreadType()
    {
        return BreadType;
    }
    
    public double getPrice()
    {
        return Price;
    }
    
    public void setMainIngredient(String ingredient)
    {
        MainIngredient = ingredient;
    }
    
    public void setBreadType(String breadType)
    {
        BreadType = breadType;
    }
    
    public void setPrice(double price)
    {
        Price = price;
    }
    
}
