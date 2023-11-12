/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package placeanorder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class PlaceAnOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer, Double> itemPrices = new HashMap<>();
        itemPrices.put(111, 0.89);
        itemPrices.put(222, 1.47);
        itemPrices.put(333, 2.43);
        itemPrices.put(444, 5.99);

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the item number: ");
            int itemNumber = Integer.parseInt(scanner.nextLine());

            if (itemNumber < 1 || itemNumber > 9999) {
                throw new OrderException(OrderMessages.INVALID_ITEM_NUMBER);
            }

            System.out.print("Enter the quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            if (quantity < 1 || quantity > 12) {
                throw new OrderException(OrderMessages.INVALID_QUANTITY);
            }

            if (!itemPrices.containsKey(itemNumber)) {
                throw new OrderException(OrderMessages.INVALID_ITEM);
            }

            double price = itemPrices.get(itemNumber);
            double totalAmountDue = price * quantity;

            System.out.println("Total amount due: $" + totalAmountDue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } catch (OrderException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

