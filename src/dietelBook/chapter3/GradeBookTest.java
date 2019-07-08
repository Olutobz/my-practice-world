
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter3;

import java.util.Scanner;

//// GradeBook constructor used to specify the course name at the
// time each GradeBook object is created.
public class GradeBookTest {
    //main method begins program execution
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //create grade book object
        GradeBook myGradeBook1 = new GradeBook("Cs101 Introduction to Java programming!",
                "Engr Ikoyi Olutoba");
        GradeBook myGradeBook2 = new GradeBook("Cs102 Data structures in java",
                "Engr Ikoyi Damola");

        System.out.printf("GradeBook1 course name is: %s\nThis course is represented by: %s\n\n",
                myGradeBook1.getCourseName(), myGradeBook1.getInstructorName());
        System.out.printf("GradeBook2 course name is: %s\nThis course is represented by: %s\n",
                myGradeBook2.getCourseName(), myGradeBook2.getInstructorName());
    } //end method main
} //end class
