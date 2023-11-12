/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

import javax.swing.JOptionPane;

/**
 *
 * @author Work
 */
public class Books {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book book1 = new Fiction("Harry potter");
        Book book2 = new NonFiction("Long road to freedom");
        
        JOptionPane.showMessageDialog(null, book1);
        JOptionPane.showMessageDialog(null, book2);
        
        BookArray();
    }
    
    
    public static void BookArray()
    {
        Book[] books = new Book[3];
        
        for(int i =0; i < books.length; i++)
        {
            String title = JOptionPane.showInputDialog("Enter book title: ");
            
            int isFiction = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for Fiction or 2 for non-fiction"));
            while(isFiction != 1 && isFiction != 2)
             isFiction = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for Fiction or 2 for non-fiction"));
            
            Book temp = null;
            if(isFiction == 1)
                temp = new Fiction(title);
            else if(isFiction == 2)
                temp = new NonFiction(title);
            
            books[i] = temp;
        }
        
        for(int i =0; i < books.length; i++)
        {
            if(books[i] instanceof Fiction)
            JOptionPane.showMessageDialog(null, "Fiction book " + books[i]);
            else  JOptionPane.showMessageDialog(null, "Non-Fiction book " + books[i]);
        }
    }
    
    
}
