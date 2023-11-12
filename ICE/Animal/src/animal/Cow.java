/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author chris
 */
public class Cow extends Animals {

    public Cow() {
        CanCommunicate = true;
        Terrain = "Land";
        Position = 1;
        Sound = "Moo";
    }

    @Override
    public String speak() {
        if (CanCommunicate);
        return Sound;
        
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
