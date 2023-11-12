package paintarea;

import java.util.Scanner;

public class PaintArea {

    public static void main(String[] args) {
        int paintPerSquare = 350;
        double length, width, height;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length: ");
        length = sc.nextDouble();
        System.out.println("Enter width: ");
        width = sc.nextDouble();
        System.out.println("Enter height: ");
        height = sc.nextDouble();

        double area = computeArea(length, width, height);
        double price = computeGallons(area);

        System.out.println("The price to paint the room is $" + price);
    }

    public static double computeArea(double length, double width, double height) {

        double area = width * height;
        System.out.println("The area of the wall is: " + area);
        return area;

    }

    private static double computeGallons(double area) {

        double gallonsNeeded = area / 100;
        System.out.println("You will need: " + gallonsNeeded + " gallons");
        double price = gallonsNeeded * 32;
        //System.out.println("Price: " +price);
        return price;
    }

}
