/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10033223_question2_assignment;

/**
 *
 * @author chris
 */
public class Magazine extends Item{
    private String dateBought;
    
    public Magazine(String title, String dateBought){
        super(title);
        this.dateBought = dateBought;
    }
    
    public String getDateBought(){
        return dateBought;
    }
    
    public void setDateBought(String dateBought){
        this.dateBought = dateBought;
    }
    
    @Override
    public String toString(){
         return " Our Magazines: " + "\n Title: " + getTitle() + "\n Date Bought: " + dateBought + "\n Available: " + isAvailable();
    }
    
}
