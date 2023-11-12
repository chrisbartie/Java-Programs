/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10033223_question2_assignment;

/**
 *
 * @author chris
 */
public class Book extends Item{
    private String author;
    private String genre;
    
    public Book(String title, String author, String genre){
        super(title);
        this.author = author;
        this.genre = genre;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public void setGenre(String genre){
        this.genre = genre;
    }
    
    @Override
    public String toString(){
        return " Title: " + getTitle() + "\n Author: " + author + "\n Genre: " + genre + "\n Available: " + isAvailable();
    }
}
