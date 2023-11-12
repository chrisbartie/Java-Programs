//write a program in java that asks the user what type of pizza they would like (small, medium or large), 
//and using that, calculate how much they would have to pay. 
//a small pizza costs R50, medium costs R75, large costs R100. display this in an output
package pizzaprice;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PizzaPrice {

    public static void main(String[] args) {
        double price;
        Scanner input = new Scanner(System.in);

        System.out.print("What size pizza would you like? (small, medium, or large)");
        String size = input.nextLine();

        if (size.equals("small")) {
            price = 50.0;
        } else if (size.equals("medium")) {
            price = 75.0;
        } else if (size.equals("large")) {
            price = 100.0;
        } else {
            System.out.println("Invalid size entered. Please enter again.");
            return;
        }

        System.out.println("You ordered a " + size + "size pizza, the cost will be " + price);
    }
}
