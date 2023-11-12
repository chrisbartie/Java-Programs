/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trytoparsedouble;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class TryToParseDouble {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        String userInput = scanner.nextLine();

        try {
            double number = Double.parseDouble(userInput);
            System.out.println("Entered double value: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Could not parse a double value.");
            System.out.println("Setting the number to 0.");
            double number = 0.0;
            System.out.println("Number: " + number);
        }
    }
}
    

