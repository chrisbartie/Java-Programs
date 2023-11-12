package inchconversion;

import javax.swing.JOptionPane;

public class InchConversion {

    static final double FEET = 12;
    static final double YARD = 36;

    public static void main(String[] args) {

        String userInput = JOptionPane.showInputDialog("Input the amount of inches");
        int intUserInput = Integer.parseInt(userInput);

        double inchToFeet = intUserInput / FEET;
        double inchToYard = intUserInput / YARD;

        System.out.println("Your conversion from inches to feet is " + inchToFeet);
        System.out.println("Your conversion from inches to yards is " + inchToYard);

    }

}
