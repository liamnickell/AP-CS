/**
* Program Name:        Book.java
* Program Purpose:     Book object blueprint
* Date Created:        2/27/2017
* Last Modified:       3/2/2017
*
* @author     Liam Nickell
* @version    1.0.0
*/

public class Book extends ReadingMaterial {

    private String publisher;
    private String author;

    public String getPublisher() { return publisher; }
    public String getAuthor() { return author; }

    public void setPublisher(String publisher) { this.publisher = publisher; }
    public void setAuthor(String author) { this.author = author; }

    /**
    * Method Purpose: Constructor for class that sets all variables to given values, 
    * including the variables of the parent class
    */
    public Book(String title, String isbn, Date publishingDate, String publisher, String author) {
        super(title, isbn, publishingDate);

        this.publisher = publisher;
        this.author = author;
    }

    /**
    * Method Purpose: Returns title, ISBN, publication date, publisher, and author as String
    */
    public String toString() {
        return super.toString() + "Publisher: " + publisher + "\n"
               + "Author: " + author + "\n";
    }
    
}
