package testcircle;

public class Circle {

    private double radius, diameter, area;

    public Circle() {
        radius = 1;
        diameter = 2 * radius;
        area = Math.PI * Math.pow(radius, 2);
    }

    public void setRadius(double radius) {
        this.radius = radius;
        diameter = 2 * radius;
        area = Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
    
    public double getDiameter()
    {
        return diameter;
    }

    public double getArea() {
        return area;
    }
    
    
}
