/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scannerdemo1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class ScannerDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        boolean isNumberFlag = false;

        while (!isNumberFlag) {

            try {
                System.out.print("Enter a number: ");
                int number = scan.nextInt();
                scan.nextLine();
                isNumberFlag = true;
                System.out.println("You entered the number " + number);

                int number2 = number/0;
            } catch (InputMismatchException e) {
                System.out.println("The value must be a number");
                scan.nextLine();

            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }//try, catch block

    }
}//end class
