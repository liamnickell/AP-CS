/**
* Program Name:        Date.java
* Program Purpose:     custom Date class to use in ReadingMaterial
* Date Created:        2/27/2017
* Last Modified:       3/2/2017
*
* @author     Liam Nickell
* @version    1.0.0
*/

public class Date {

    private int day; // possible numbers: 1-31
    private int month; // possible numbers: 1-12
    private int year;

    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }

    public void setDay(int day) { this.day = day; }
    public void setMonth(int month) { this.month = month; }
    public void setYear(int year) { this.year = year; }

    /**
    * Method Purpose: Constructor for class that sets all variables to given values
    */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
    * Method Purpose: Returns date as String
    */
    public String toString() {
        return month + "/" + day + "/" + year;
    }

}
