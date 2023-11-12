/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package badsubscriptcaught2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class BadSubscriptCaught2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String[] names = {"John", "Luke", "Roberts", "Matthew", "Louis", "Cynthia", "Alvarez", "Brandon"};
        
        System.out.println("Enter a number greater than zero and less than " + names.length + ": ");
       try{ 
        int index = scan.nextInt();
        
        System.out.println(names[index]);
       }catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println("Invalid index given");
       }catch(InputMismatchException e)
       {
           System.out.println("Index is an integer");
       }
    }
    
}
