/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scannerdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class ScannerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scan.nextInt();
            scan.nextLine();

            System.out.println("You entered the number " + number);
        } catch (InputMismatchException e) {
            System.out.println("The value must be a number");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
