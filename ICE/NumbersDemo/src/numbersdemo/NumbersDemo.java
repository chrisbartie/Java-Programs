/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersdemo;

import javax.swing.JOptionPane;

public class NumbersDemo {

    static int number1;
    static int number2;

    public static void main(String[] args) {
        number1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
    }

    public static void displayTwiceTheNumber() {
        double doubleNum1 = number1*2;
        double doubleNum2 = number2*2;
    }
}
