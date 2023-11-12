/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;

import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class Animal {

    public static void main(String[] args) {
        // TODO code application logic here
        Animals a = new Dog();
        Animals a1 = new Cat();
        Animals a2 = new Cow();

        JOptionPane.showMessageDialog(null, a.speak());
        JOptionPane.showMessageDialog(null, a1.speak());
        JOptionPane.showMessageDialog(null, a2.speak());

        a.move();
        a1.move();
        a2.move();
    }

}
