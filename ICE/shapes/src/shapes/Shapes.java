/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapes;

/**
 *
 * @author chris
 */
public class Shapes {

    
    public static void main(String[] args) {
        
        Shape shape1 = new Circle("Blue", 5);
        Shape shape2 = new Rectangle("Red", 2, 3);
        Shape shape3 = new Sqaure("Green", 4);
        
        printShape(shape1);
        printShape(shape2);
        printShape(shape3);
                
        
    }
    public static void printShape(Shape s)
    {
        if (s instanceof Circle)
        {
            System.out.println("The shape is a circle");
            Circle c = (Circle)s;
        }else if (s instanceof Rectangle)
        {
            System.out.println("The shape is a rectancle");
        }else if (s instanceof Sqaure)
        {
            System.out.println("The shape is a square");
        }
        System.out.println("The shape has an area of " + s.calculateArea() + " and perimeter of "
                + s.calculatePerimeter() + " and the colour of the shape is " + s.Color);
        System.out.println();
    }
    
}
