/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

/**
 *
 * @author Work
 */
public class NonFiction extends Book {

    public NonFiction(String title)
    {
        super(title);
        setPrice(37.99);
    }
    
    @Override
    public void setPrice(double price) {
         this.Price = price;
    }
}
