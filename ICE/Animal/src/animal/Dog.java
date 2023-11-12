/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author chris
 */
public class Dog extends Animals{

    public Dog()
    {
        CanCommunicate = true;
        Terrain = "Land";
        Position = 1;
        Sound = "Bark";
    }
    
    @Override
    public String speak() {
           if(CanCommunicate);
        return Sound;
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
