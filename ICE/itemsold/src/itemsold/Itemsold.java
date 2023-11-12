/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package itemsold;

/**
 *
 * @author chris
 */
public class Itemsold {

    
       // attributes of ItemSold
    int invoiceNumber;
    String description;
    double price;

    // parameterized constructor
    public Itemsold(int invoiceNumber, String description, double price) {
        this.invoiceNumber = invoiceNumber;
        this.description = description;
        this.price = price;
    }

    // getters of ItemSold
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    // setters of ItemSold
    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


