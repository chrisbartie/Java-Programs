/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package books;
//Page 562 Activity 1a 

/**
 *
 * @author chris
 */
public class UseBook {

    public static void main(String[] args) {
        Fiction f = new Fiction();
        NonFiction n = new NonFiction();
                
        System.out.println("Fiction book:");
        System.out.println("Title: " + f.getTitle());
        System.out.println("Price: " + f.getPrice());

        System.out.println("\nNonfiction book:");
        System.out.println("Title: " + n.getTitle());
        System.out.println("Price: " + n.getPrice());
    }
}
