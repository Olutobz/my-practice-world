
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */
package dietelBook.chapter3;

public class Date {
    private int day;
    private int month;
    private int year;

    //constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    } //end constructor

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year); //display how date should appear
    } //end method displayDate

} //end class
