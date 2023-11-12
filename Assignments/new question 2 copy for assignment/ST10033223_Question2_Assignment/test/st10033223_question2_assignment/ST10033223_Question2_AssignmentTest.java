/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package st10033223_question2_assignment;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author chris
 */
public class ST10033223_Question2_AssignmentTest {
    private BookShop shop;

    @Before
    public void setUp() {
        shop = new BookShop();
    }

    @Test
    public void testAddBook() {
        Book book = new Book("Sample Book", "Author", "Fiction");
        shop.addItem(book);
        List<Item> results = shop.searchByTitle("Sample Book");
        assertTrue(results.size() > 0);
    }

    @Test
    public void testAddMagazine() {
        Magazine magazine = new Magazine("Sample Magazine", "2023-09-10");
        shop.addItem(magazine);
        List<Item> results = shop.searchMagazineByTitle("Sample Magazine");
        assertTrue(results.size() > 0);
    }

    @Test
    public void testSearchByTitle() {
        Book book1 = new Book("Book A", "Author A", "Fiction");
        Book book2 = new Book("Book B", "Author B", "Non-Fiction");
        shop.addItem(book1);
        shop.addItem(book2);

        List<Item> results = shop.searchByTitle("Book A");
        assertEquals(2, results.size());
    }

    @Test
    public void testSearchMagazineByTitle() {
        Magazine magazine1 = new Magazine("Magazine X", "2023-09-10");
        Magazine magazine2 = new Magazine("Magazine Y", "2023-09-15");
        shop.addItem(magazine1);
        shop.addItem(magazine2);

        List<Item> results = shop.searchMagazineByTitle("Magazine X");
        assertEquals(2, results.size());
    }

    @Test
    public void testSortByTitle() {
        Book book1 = new Book("Book Z", "Author Z", "Sci-Fi");
        Book book2 = new Book("Book A", "Author A", "Mystery");
        Book book3 = new Book("Book M", "Author M", "Romance");
        shop.addItem(book1);
        shop.addItem(book2);
        shop.addItem(book3);

        shop.sortByTitle();

        List<Item> results = shop.searchByTitle("Book A");
        assertEquals("Book A", results.get(0).getTitle());
        assertEquals("Book M", results.get(1).getTitle());
        assertEquals("Book Z", results.get(2).getTitle());
    }
}