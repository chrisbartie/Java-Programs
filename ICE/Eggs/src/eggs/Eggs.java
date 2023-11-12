/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggs;

import javax.swing.JOptionPane;

/**
 *
 * @author Work
 */
public class Eggs {

    static final double PRICE_PER_DOZEN = 3.25;
    static final double PRICE_PER_SINGLE = 0.45;
    static final int EGGS_IN_A_DOZEN = 12;
    static int numberOfEggs;
    static int numberOfDozens;
    static int numberOfSingles;
    static double totalPriceDozens;
    static double totalPriceSingles;
    static double grandTotal;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        numberOfEggs = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of eggs: "));
       
        calculateTotals();
        
        System.out.println("You ordered " + numberOfEggs + " eggs. That's " + numberOfDozens + " dozens at "
                + "$" + PRICE_PER_DOZEN + " per dozen and " + numberOfSingles + " loose eggs at "
                + PRICE_PER_SINGLE + " cents, for a total of $" + grandTotal);
    }

    public static void calculateTotals() {
        numberOfDozens = numberOfEggs / EGGS_IN_A_DOZEN;
        numberOfSingles = numberOfEggs % EGGS_IN_A_DOZEN;

        totalPriceDozens = numberOfDozens * PRICE_PER_DOZEN;
        totalPriceSingles = numberOfSingles * PRICE_PER_SINGLE;
        grandTotal = totalPriceDozens + totalPriceSingles;
    }

}
