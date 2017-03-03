/**
* Program Name:        Textbook.java
* Program Purpose:     Textbook object blueprint
* Date Created:        2/27/2017
* Last Modified:       3/2/2017
*
* @author     Liam Nickell
* @version    1.0.0
*/

public class Textbook extends ReadingMaterial {

    private String subject;
    private int pages;

    public String getSubject() { return subject; }
    public int getPages() { return pages; }

    public void setSubject(String subject) { this.subject = subject; }
    public void setPages(int pages) { this.pages = pages; }

    /**
    * Method Purpose: Constructor for class that sets all variables to given values, 
    * including the variables of the parent class
    */
    public Textbook(String title, String isbn, Date publishingDate, String subject, int pages) {
        super(title, isbn, publishingDate);

        this.subject = subject;
        this.pages = pages;
    }

    /**
    * Method Purpose: Returns title, ISBN, publication date, subject, and pages as String
    */
    public String toString() {
        return super.toString() + "Subject: " + subject + "\n"
               + "Pages: " + pages + "\n";
    }

}
