package testcircle;

public class TestCircle {

    public static void main(String[] args) {
       Circle c1 = new Circle();
       Circle c2 = new Circle();
       Circle c3 = new Circle();
       
       c1.setRadius(5);
       c2.setRadius(20);
       
       displayCircle(c1);
       displayCircle(c2);
       displayCircle(c3);
       
       
       
    }
    
    public static void displayCircle(Circle c){
        System.out.println("Circle with radius " + c.getRadius() + " has diameter " + c.getArea());
    }
}
