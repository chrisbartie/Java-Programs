package carpool;

import javax.swing.JOptionPane;


public class Carpool {

   
    public static void main(String[] args) {
      String employeeName;
      String employeeTown;
      
      employeeName = JOptionPane.showInputDialog("Enter Employee Name");
        
      employeeTown = JOptionPane.showInputDialog("Enter Employee Town");      
      
      if(employeeTown.equals("woodstock") || employeeTown.equals("wonderlake"));{
      
        JOptionPane.showMessageDialog(null, employeeName + " is a candidate for carpooling.");
        else JOptionPane.showMessageDialog(null, employeeName + " is not a candidate for carpooling.");
        
      if(employeeTown.equals("wonderlake"));
        System.out.println(employeeName + " is a candidate for carpooling.");
        
      
    }
    
}
