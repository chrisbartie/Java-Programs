/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cameraprices;

/**
 *
 * @author Chris Bartie
 */
//Question 1
public class CameraPrices {

    public static void main(String[] args) {
        String[] manufacturer = {"CANON", "SONY", "NIKON"}; //single array
        double[][] prices = {{10500.00, 8500.00}, {9500.00, 7200.00}, {12000.00, 8000.00}}; //two dimensional array
        double greatDifference = 0;
        String manufacGreatDiff = "";

        System.out.println("---------------------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY REPORT");
        System.out.println("---------------------------------------------------------");
        System.out.println("\tMIRRORLESS\tDSLR"); //tabbing the headings in

        for (int i = 0; i < manufacturer.length; i++) {
            String manufacturers = manufacturer[i];
            double mirrorlessCost = prices[i][0];
            double dslrCost = prices[i][1];
            double difference = mirrorlessCost - dslrCost;
            String formatMirrorless = String.format("%.2f", mirrorlessCost); //(Stackoverflow, 2015)
            String formatDslr = String.format("%.2f", dslrCost); //(Stackoverflow, 2015)

            System.out.print(manufacturers + "\tR " + formatMirrorless + "\tR " + formatDslr);
            System.out.println();

            if (difference > greatDifference) {
                greatDifference = difference;
                manufacGreatDiff = manufacturers;
            }
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY RESULTS");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < manufacturer.length; i++) {
            String manufacturers = manufacturer[i];
            double mirrorlessCost = prices[i][0];
            double dslrCost = prices[i][1];
            double difference = mirrorlessCost - dslrCost;
            String formatDiff = String.format("%.2f", difference); //(Stackoverflow, 2015)

            System.out.print(manufacturers + "\tR " + formatDiff); //(Stackoverflow, 2015)
//if statement to check if the difference of the manufacturers prices are greater than or equal to 2500 and if so, displays the ***
            if (difference >= 2500) {
                System.out.println(" ***");
            } else {
                System.out.println();
            }

        }
        System.out.println("\nCAMERA WITH THE MOST DIFFERENCE: " + manufacGreatDiff);
        System.out.println("---------------------------------------------------------");
    }
}//end of program

/*Reference List:
stackOverflow. 2015. How to print a float with 2 decimal places in Java?, 6 April 2015. [Online]. Available at: https://stackoverflow.com/questions/2538787/how-to-print-a-float-with-2-decimal-places-in-java [Accessed 9 October 2023]. 
*/
