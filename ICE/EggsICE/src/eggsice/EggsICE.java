package eggsice;

import javax.swing.JOptionPane;

public class EggsICE {

    public static void main(String[] args) {

        final double DOZENEGG = 3.25;
        final double INDIVEGG = 0.45;
        final int DOZEN = 12;
        String strEggs = JOptionPane.showInputDialog("input amount of eggs");

        int intEggs = Integer.parseInt(strEggs);

        double dozenAmount = intEggs / DOZEN;
        double looseEggs = intEggs % DOZEN;
        double dozenPrice = dozenAmount * DOZENEGG;
        double LoosePrice = looseEggs * INDIVEGG;
        double total = dozenPrice + LoosePrice;

        System.out.println("you ordered " + intEggs + " eggs." + "thats " + dozenAmount + " at $3.25 per dozen and " + looseEggs + " at 45 cents each for a total of $" + total);
    }

    public static void calculateTotals(){
        
    }
}
