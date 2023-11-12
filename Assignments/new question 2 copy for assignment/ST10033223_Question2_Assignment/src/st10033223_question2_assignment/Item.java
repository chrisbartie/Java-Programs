/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10033223_question2_assignment;

/**
 *
 * @author chris
 */
public class Item {
    private String title;
    private boolean available;
    
    public Item(String title){
        this.title = title;
        this.available = true;
    }
    public String getTitle(){
        return title;
    }
    
    public boolean isAvailable(){
        return available;
    }
    
    public void setAvailable(boolean available){
        this.available = available;
    }
}
