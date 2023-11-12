/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author chris
 */
public class Rectangle extends Shape {
    public double Width, Height;
    
    public Rectangle(String color, double width, double height)
    {
        super(color);
        
        this.Width = width;
        this.Height = height;
    }
    
    public double calculateArea()
    {
        return this.Width*this.Height;
    }
    public double calculatePerimeter()
    {
        return 2*this.Width+2*this.Height;
    }
            
            
    
}
