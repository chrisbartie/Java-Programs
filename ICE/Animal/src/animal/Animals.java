/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author chris
 */
public abstract class Animals {
    int Position;
    String Terrain;
    boolean CanCommunicate;
    String Sound;
    
    public String speak(){
       if(CanCommunicate);
        return Sound;
        
    }
    public void move(){
        Position = Position + 5;
    }
            
    
}
