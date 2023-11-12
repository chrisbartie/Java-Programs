/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Arrays {

    public static void main(String[] args) {
        double[] values = new double[15];

        final int QUIT = 99999;

        double value;
        int arrayCounter = 0;
        double total = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a value or enter " + QUIT + " to quit: ");
        value = scan.nextDouble();
        scan.nextLine();

        while (value != QUIT && arrayCounter < 15) {
            values[arrayCounter] = value;
            arrayCounter++;
            total += value;

            System.out.println("Enter a value or enter " + QUIT + " to quit: ");
            value = scan.nextDouble();
            scan.nextLine();
        }
        
        if(arrayCounter == 0)
            System.out.println("No number entered");
        else{
            double average = total/arrayCounter;
            
            for(double x: values)
            System.out.println("The distance between the average and number " + x + " is " + Math.abs(x-average));
            
            
                
        }
    }

}
