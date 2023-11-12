package ascendinganddescending;

import javax.swing.JOptionPane;

public class AscendingAndDescending {

    public static void main(String[] args) {
        String strOne, strTwo, strThree;
        int intOne, intTwo, intThree;

        strOne = JOptionPane.showInputDialog("enter first number ");
        strTwo = JOptionPane.showInputDialog("enter second number ");
        strThree = JOptionPane.showInputDialog("enter third number ");

        intOne = Integer.parseInt(strOne);
        intTwo = Integer.parseInt(strTwo);
        intThree = Integer.parseInt(strThree);

        if (intOne >= intTwo) {
            if (intTwo >= intThree) {
                System.out.print(" In order " + intThree + " " + intTwo + " " + intOne);
            } else if (intThree >= intOne) {
                System.out.print(" In order " + intTwo + " " + intOne + " " + intThree);
            } else if (intOne >= intThree) {
                System.out.print(" In order " + intTwo + " " + intThree + " " + intOne);
            }
        } else {
            if (intThree >= intTwo) {
                System.out.print(" In order " + intOne + " " + intTwo + " " + intThree);
            } else if (intThree >= intOne) {
                System.out.print(" In order " + intOne + " " + intThree + " " + intTwo);
            } else if (intOne >= intThree) {
                System.out.print(" In order " + intThree + " " + intOne + " " + intTwo);
            }
        }//StackOverFlow, 2023

        if (intTwo >= intOne) {
            if (intThree >= intTwo) {
                System.out.print(" In order " + intThree + " " + intTwo + " " + intOne);
            } else if (intOne >= intThree) {
                System.out.print(" In order " + intTwo + " " + intOne + " " + intThree);
            } else if (intThree >= intOne) {
                System.out.print(" In order " + intTwo + " " + intThree + " " + intOne);
            }
        } else {
            if (intTwo >= intThree) {
                System.out.print(" In order " + intOne + " " + intTwo + " " + intThree);
            } else if (intOne >= intThree) {
                System.out.print(" In order " + intOne + " " + intThree + " " + intTwo);
            } else if (intThree >= intOne) {
                System.out.print(" In order " + intThree + " " + intOne + " " + intTwo);
            }
        }//StackOverFlow, 2023

    }
}
