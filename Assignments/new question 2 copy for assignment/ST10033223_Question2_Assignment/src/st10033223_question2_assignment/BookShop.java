/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10033223_question2_assignment;

/**
 *
 * @author chris
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookShop {
        private List<Item> catalog;

    public BookShop() {
        catalog = new ArrayList<>();
    }

    public void addItem(Item item) {
        catalog.add(item);
    }

    public List<Item> searchByTitle(String title) {
        List<Item> results = new ArrayList<>();
        for (Item item : catalog) {
            if (item.getTitle().equalsIgnoreCase(title) && item.isAvailable()) {
                results.add(item);
            }
        }
        return results;
    }

    public List<Item> searchMagazineByTitle(String title) {
        List<Item> results = new ArrayList<>();
        for (Item item : catalog) {
            if (item instanceof Magazine && item.getTitle().equalsIgnoreCase(title) && item.isAvailable()) {
                results.add(item);
            }
        }
        return results;
    }

    public void sortByTitle() {
        Collections.sort(catalog, new Comparator<Item>() {
            @Override
            public int compare(Item item1, Item item2) {
                if (item1 instanceof Book && item2 instanceof Magazine) {
                    return -1; // Books come before magazines
                } else if (item1 instanceof Magazine && item2 instanceof Book) {
                    return 1; // Magazines come after books
                } else {
                    return item1.getTitle().compareToIgnoreCase(item2.getTitle());
                }
            }
        });

        System.out.println("Our items sorted by title: ");
        for (Item item : catalog) {
            System.out.println(item);
        }
    }

    public void displayCatalog() {
        System.out.println("Our Catalog: ");
        for (Item item : catalog) {
            System.out.println(item);
        }
    }
}