
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter4;

public class GradeBookTest {
    public static void main(String[] args) {
        GradeBook myGradeBook = new GradeBook("Introduction to Java Programming!!!"); //create GradeBook object

        myGradeBook.displayMessage(); //display welcome message
        myGradeBook.determineClassAverage(); //find average of 10 grades

    } //end method main

} //end class
