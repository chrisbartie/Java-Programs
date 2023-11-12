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
public abstract class Book {
    
    protected String Title;
    protected double Price;
    
    public Book(String title)
    {
        this.Title = title;
    }
    
    public String getTitle()
    {
        return this.Title;
    }
    
    public double getPrice()
    {
        return this.Price;
    }
    
    public abstract void setPrice(double price);
    
    public String toString()
    {
        return "Title: " + Title + ", price: " + Price;
    }
}
