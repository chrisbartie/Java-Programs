package tuitionfees;
//Author - ST10033223

import javax.swing.JOptionPane;

public class TuitionFees {

    public static void main(String[] args) {
        double Fees2016, increase, Year1, Year2, Year3, Year4, Year5;
        Fees2016 = 2500; //Initial Price
        increase = 0.7; //Price increase rate by the year

        String userYear = JOptionPane.showInputDialog("Please enter the specific year that you would like to view the fees for: "); //User prompt

        Year1 = Fees2016;

        Year2 = (Year1 * increase) + Year1;

        Year3 = (Year2 * increase) + Year2;

        Year4 = (Year3 * increase) + Year3;

        Year5 = (Year4 * increase) + Year4;


        if (userYear.equals("1")) {
            System.out.println("Year 1: R" +Year1);
        }

        if (userYear.equals("2")) {
            System.out.println("Year 2: R" +Year2);
        }

        if (userYear.equals("3")) {
            System.out.println("Year 3: R" +Year3);
        }

        if (userYear.equals("4")) {
            System.out.println("Year 4: R" +Year4);
        }

        if (userYear.equals("5")) {
            System.out.println("Year 5: R" +Year5); //Display the fees for each year selected by the user
        }

    }//END MAIN

}//END PROGRAM
