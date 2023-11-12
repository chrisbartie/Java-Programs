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
public class TestSandwich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sandwich s1 = new Sandwich();
        
        s1.setBreadType("Normal");
        s1.setMainIngredient("Ham");
        s1.setPrice(17);
        
        Sandwich s2 = new Sandwich();
        
        s2.setBreadType("Ciabatta");
        s2.setMainIngredient("Tuna");
        s2.setPrice(20);
        
        displaySandwichInfo(s1);
        displaySandwichInfo(s2);        
    }
    
    public static void displaySandwichInfo(Sandwich s)
    {
        System.out.println("Bread type: " + s.getBreadType() + ", Main ingredient: " + s.getMainIngredient() 
                + ", Price: R" + s.getPrice());
    }
    
}
