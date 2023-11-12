/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itemsold;

/**
 *
 * @author chris
 */
public class LampSold extends Itemsold {
    
    // attributes of Itemsold
    boolean condition;
    int age;

    
    public LampSold(int invoiceNumber, String description, double price, boolean condition, int age) {
        super(invoiceNumber, description, price);
        this.condition = condition;
        this.age = age;
    }

    // getters of LampSold
    public boolean isCondition() {
        return condition;
    }

    public int getAge() {
        return age;
    }

    // setters of LampSold
    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public void setAge(int age) {
        this.age = age;
    }

}


