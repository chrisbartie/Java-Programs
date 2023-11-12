
package countspaces;
//Author - ST10033223

import javax.swing.JOptionPane;


public class CountSpaces {

   
    public static void main(String[] args) {
       //Request a string from the user
       String quote = JOptionPane.showInputDialog("Enter a memorable quote: ");
               
       //Count the number of spaces in the string
       int spaceCounter = 0;
       for(int i=0; i < quote.length(); i++)
       {
       if(quote.charAt(i) == ' ')
           spaceCounter++;
       
       }
       JOptionPane.showMessageDialog(null, "There are " + spaceCounter + " spaces in the quote.");
    }
    
}


