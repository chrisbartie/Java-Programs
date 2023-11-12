/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author chris
 */
public class Circle extends Shape {

    public double Radius;

    public Circle(String color, double radius) {
        super(color);

        this.Radius = radius;
    }

    public double calculateArea() {
        return Math.PI * this.Radius * this.Radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * this.Radius;

    }
}
