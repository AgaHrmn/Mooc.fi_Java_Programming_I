/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aolej
 */
public class Book {
    private String name;
    private int pages;
    private int publicationYear;
    
    public Book(String initName, int initPages, int initYear) {
        this.name = initName;
        this.pages = initPages;
        this.publicationYear = initYear;
    }
    
    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.publicationYear;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public int getYear() {
        return this.publicationYear;
    }
}
