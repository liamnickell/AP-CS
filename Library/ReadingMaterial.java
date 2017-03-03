/**
* Program Name:        ReadingMaterial.java
* Program Purpose:     ReadingMaterial object blueprint
* Date Created:        2/27/2017
* Last Modified:       3/2/2017
*
* @author     Liam Nickell
* @version    1.0.0
*/

public class ReadingMaterial {

    private String title;
    private String isbn;
    private Date publicationDate;

    public String getTitle() { return title; }
    public String getIsbn() { return isbn; }
    public Date getPublicationDate() { return publicationDate; }

    public void setTitle(String title) { this.title = title; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public void setPublicationDate(Date publicationDate) { this.publicationDate = publicationDate; }

    /**
    * Method Purpose: Constructor for class that sets all variables to given values
    */
    public ReadingMaterial(String title, String isbn, Date publicationDate) {
        this.title = title;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
    }

    /**
    * Method Purpose: Returns title, ISBN, and publication date as String
    */
    public String toString() {
        return "Title: " + title + "\n"
               + "ISBN: " + isbn + "\n" 
               + "Publication Date: " + publicationDate + "\n";
    }

    /**
    * Method Purpose: Returns true if titles of reading materials being 
    * compared are the same, false otherwise
    */
    public boolean equals(Object obj) {
        ReadingMaterial rm = (ReadingMaterial) obj;
        return rm.getTitle().equals(title);
    }

}
