/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demorunners;

import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class DemoRunners {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Runner r1 = new Machine();
        Runner r2 = new Athlete();
        Runner r3 = new PoliticalCandidate();

        JOptionPane.showMessageDialog(null, r1.run());
        JOptionPane.showMessageDialog(null, r2.run());
        JOptionPane.showMessageDialog(null, r3.run());

    }

}
