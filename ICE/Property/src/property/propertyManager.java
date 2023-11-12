/*
 * change the package name to packagename of your project
 */
package property;

import java.util.ArrayList;
import java.util.Scanner;

public class propertyManager {

    static ArrayList<Property> properties = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        printMainMenu();
        int input = scan.nextInt();
        scan.nextLine();

        while (input != 6) {
            switch (input) {
                case 1:
                    addProperty();
                    break;
                case 2:
                    viewAllProperties();
                    break;
                case 3:
                    viewByPropertyType();
                    break;
                case 4:
                    viewAllWithPriceLessThan();
                    break;
                case 5:
                    viewByLocation();
                    break;
                default:
                    if (input != 6)
                        System.out.println("Wrong input given");
            }

            printMainMenu();
            input = scan.nextInt();
            scan.nextLine();
        }
    }

    public static void printMainMenu() {
        System.out.println("Welcome to prop Manage- select an operation");
        System.out.println("===========================================");
        System.out.println("1) Add a property");
        System.out.println("2) View all properties");
        System.out.println("3) View by property type");
        System.out.println("4) View all property less than");
        System.out.println("5) View properties by location");
        System.out.println("6) Exit");
    }

    public static void addProperty() {
        System.out.print("Enter property location: ");
        String location = scan.nextLine();

        System.out.print("Enter property description: ");
        String description = scan.nextLine();

        System.out.print("Enter property price: ");
        double price = scan.nextDouble();
        scan.nextLine();

        System.out.println("Select property type (0: Apartment, 1: Townhouse, 2: House)");
        int typeIndex = scan.nextInt();
        scan.nextLine();
        Property.PropertyType type = Property.PropertyType.values()[typeIndex];

        properties.add(new Property(location, description, price, type));
        System.out.println("Property added");
    }

    public static void viewAllProperties() {
        System.out.println("List of all properties:");
        for (Property property : properties) {
            System.out.println(property);
        }
    }

    public static void viewByPropertyType() {
        System.out.println("Select property type to view (0. Apartment, 1. Townhouse, 2. House)");
        int typeIndex = scan.nextInt();
        scan.nextLine();
        Property.PropertyType type = Property.PropertyType.values()[typeIndex];

        System.out.println("Properties of type " + type + " ");
        for (Property property : properties) {
            if (property.getType() == type) {
                System.out.println(property);
            }
        }
    }

    public static void viewByLocation() {
        System.out.print("Enter property location: ");
        String location = scan.nextLine();

        System.out.println("Properties at location " + location + ":");
        for (Property property : properties) {
            if (property.getLocation().equalsIgnoreCase(location)) {
                System.out.println(property);
            }
        }
    }

    public static void viewAllWithPriceLessThan() {
        System.out.print("Enter maximum price: ");
        double maxPrice = scan.nextDouble();
        scan.nextLine();

        System.out.println("Properties with price less than $" + maxPrice + ":");
        for (Property property : properties) {
            if (property.getPrice() < maxPrice) {
                System.out.println(property);
            }
        }
    }
}