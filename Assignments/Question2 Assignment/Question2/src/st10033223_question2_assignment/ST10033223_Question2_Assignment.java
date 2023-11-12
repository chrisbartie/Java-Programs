/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10033223_question2_assignment;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class ST10033223_Question2_Assignment {

    public static void main(String[] args) {
        BookShop shop = new BookShop();
        Scanner scanner = new Scanner(System.in);

        boolean close = false;

        while (!close) {
            System.out.println("----------------------------------------");
            System.out.println("Book Shop");
            System.out.println("1: Add a book");
            System.out.println("2: Add a magazine");
            System.out.println("3: Search for a book (Title)");
            System.out.println("4: Search for a magazine (Title)");
            System.out.println("5: Sort our items by Title");
            System.out.println("6: Display our catalog");
            System.out.println("7: Close Program");
            System.out.println("Enter the option you would like (1-7): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addBook(shop, scanner);
                    break;
                case 2:
                    addMagazine(shop, scanner);
                    break;
                case 3:
                    searchByTitle(shop, scanner);
                    break;
                case 4:
                    searchMagazineByTitle(shop, scanner);
                    break;
                case 5:
                    shop.sortByTitle();
                    System.out.println("Our items sorted by title: ");
                    break;
                case 6:
                    shop.displayCatalog();
                    break;
                case 7:
                    close = true;
                    System.out.println("Closing the program");
                    break;
                default:
                    System.out.println("Please only enter a number from 1 to 7");
            }
        }
        scanner.close();
    }

    private static void addBook(BookShop shop, Scanner scanner) {
        System.out.println("Enter the title of the book you are adding: ");
        String title = scanner.nextLine();
        System.out.println("Enter the author of that book: ");
        String author = scanner.nextLine();
        System.out.println("Enter the genre of that book: ");
        String genre = scanner.nextLine();

        Book book = new Book(title, author, genre);
        shop.addItem(book);
        System.out.println("Thank you for adding the book to our shop!");
    }

    private static void addMagazine(BookShop shop, Scanner scanner) {
        System.out.println("Enter the title of the magazine you are adding: ");
        String title = scanner.nextLine();
        System.out.println("Enter the date you bought the magazine: ");
        String dateBought = scanner.nextLine();
        Magazine magazine = new Magazine(title, dateBought);
        shop.addItem(magazine);
        System.out.println("Thank you for adding the magazine to our shop!");
    }

    private static void searchMagazineByTitle(BookShop shop, Scanner scanner) {
        System.out.print("Enter the magazine title to search: ");
        String title = scanner.nextLine();
        shop.searchMagazineByTitle(title);
    }

    private static void searchByTitle(BookShop shop, Scanner scanner) {
        System.out.println("Enter the title of the item you would like: ");
        String searchTitle = scanner.nextLine();
        shop.searchByTitle(searchTitle);
    }
}