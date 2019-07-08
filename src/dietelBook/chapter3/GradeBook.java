
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter3;

//// GradeBook class with a constructor to initialize the course name.
public class GradeBook {
    private String courseName; //course name for this gradeBook
    private String instructorName; //instance variable that stores the name of gradeBook instructor

    //constructor initializes GradeBook with string argument
    public GradeBook(String name, String instructorName) //constructor name is class name
    {
        courseName = name; //initialize course name
        this.instructorName = instructorName;
    } //end constructor

    //method to set the course name
    public void setCourseName(String name, String instructorName) {
        courseName = name; //stores the course name
        this.instructorName = instructorName;
    } // end method setCourseName
    //method to retrieve the course name

    public String getCourseName() {
        return courseName;
    } // end method getCourseName

    // method to display message to the gradeBook user
    public void displayMessage() {
        // calls method getCourseName to get the name this GradeBook course represents
        System.out.printf("Welcome to the grade book for %s!\n", getCourseName());
        System.out.printf("This course is represented by: %s!\n", getInstructorName());
    } //end method displayMessage

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    } //end method setInstructorName

    public String getInstructorName() {
        return instructorName;
    } //end method gerInstructorName

} // end class