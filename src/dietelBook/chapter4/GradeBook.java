
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter4;

import java.util.Scanner; //program uses class Scanner

public class GradeBook {
    private String courseName; //instance variable or name of course this gradeBook represents

    //constructor initializes course name
    public GradeBook(String name) {
        this.courseName = name;
    } //end constructor

    //method to retrieve course name
    public String getCourseName() {
        return courseName;
    }

    //method to set course name
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    //display a welcome message to grade book user
    public void displayMessage() {
        System.out.printf("Welcome to the grade book for: %s\n\n", getCourseName());
    } //end method displayMessage

    //determine class average based of grades entered by user
    public void determineClassAverage() {
        int total, gradeCounter, grade;
        double average; //number with decimal point for average
        total = 0;
        gradeCounter = 0;

        Scanner input = new Scanner(System.in); //reads input from command window
        System.out.print("Enter grade score or -1 to quit : ");
        grade = input.nextInt();

        //loops any certain number of times
        while (grade != -1) {
            total = total + grade;
            gradeCounter++; //increment counter
            System.out.print("Enter grade score or -1 to quit : ");
            grade = input.nextInt();
        } //end while loop

        //if user enters at least one grade
        if (gradeCounter != 0) {
            average = (double) total / gradeCounter; //integer division yields integer result

            System.out.printf("\nTotal of %d grades is: %d", gradeCounter, total);
            System.out.printf("\nThe class average is: %.2f\n", average);
        } //end if
        else
            System.out.println("No grades were entered");

    } //end method determineClassAverage

} //end class
