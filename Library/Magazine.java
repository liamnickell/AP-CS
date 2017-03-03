/**
* Program Name:        Magazine.java
* Program Purpose:     Magazine object blueprint
* Date Created:        2/27/2017
* Last Modified:       3/2/2017
*
* @author     Liam Nickell
* @version    1.0.0
*/

public class Magazine extends ReadingMaterial {

    private String genre;
    private String editor;

    public String getGenre() { return genre; }
    public String getEditor() { return editor; }

    public void setGenre(String genre) { this.genre = genre; }
    public void setEditor(String editor) { this.editor = editor; }

    /**
    * Method Purpose: Constructor for class that sets all variables to given values, 
    * including the variables of the parent class
    */
    public Magazine(String title, String isbn, Date publishingDate, String genre, String editor) {
        super(title, isbn, publishingDate);

        this.genre = genre;
        this.editor = editor;
    }

    /**
    * Method Purpose: Returns title, ISBN, publication date, genre, and editor as String
    */
    public String toString() {
        return super.toString() + "Genre: " + genre + "\n"
               + "Editor: " + editor + "\n";
    }

}
