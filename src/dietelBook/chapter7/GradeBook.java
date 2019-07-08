/**
 * <p> Created by Onikoyi Damola Olutoba  06/04/19 </p>
 */


package dietelBook.chapter7;

public class GradeBook {

    private String courseName; //name of course this gradeBook represents
    private int[] grades; //array of student grades

    //constructor initializes the courseName and grades array
    private GradeBook(String name, int[] gradesArray) {
        courseName = name;
        grades = gradesArray;
    }

    //method gets name of course
    private String getCourseName() {
        return courseName;
    }

    //displays welcome message to grade book user
    private void displayMessage() {
        System.out.printf("Welcome to the grade book for \n%s!\n\n", getCourseName());
    }

    //find the minimum grade
    private int getMinimum() {
        int lowGrade = grades[0]; //assumes grade[0] is the lowest
        //loop through the grade arrays
        for (int value : grades) {
            //if grade is lower than lowGrade, assign it to lowGrade
            if (value < lowGrade) {
                lowGrade = value; //newest minimum
            }
        }
        return lowGrade; //return the lowest grade found
    }

    //find the maximum grade
    private int getMaximum() {
        int highGrade = grades[0]; //assumes grade[0] is the largest
        for (int value : grades) {
            if (value > highGrade) {
                highGrade = value; //new highest grade
            }
        }
        return highGrade; //returns the highest of the grades found
    }

    //determine the average for grade test
    private double getAverage() {
        int total = 0;
        for (int grade : grades) {
            total += grade; //adds grades to total
        }
        //return average of the scores
        return (double) total / grades.length;
    }

    //output bar chart displaying grade distribution
    private void barCharts() {
        System.out.println();
        System.out.println("Grade Distribution: ");

        //stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11];

        //for each grade, increment the appropriate frequency
        for (int grade : grades) {
            ++frequency[grade / 10];
        }

        //for each grade frequency, print bar in chart
        for (int i = 0; i < frequency.length; i++) {
            // output bar label ( "00-09: ", ..., "90-99: ", "100: " )
            if (i == 10) {
                System.out.printf("%5d: ", 100);
            } else
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            //print bar of asterisks
            for (int j = 0; j < frequency[i]; j++) {
                System.out.print('*');
                System.out.println();
            }
        }
    }

    //output the contents of grade arrays
    private void outputGrades() {
        System.out.println("The grades are: ");
        //output each student grade
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d: %3d\n", student + 1, grades[student]);
        }
    }

    //performs various operations on the data
    private void processGrades() {
        outputGrades(); //output grades array
        System.out.printf("\nClass average is: %.2f\n", getAverage());
        System.out.printf("Lowest grade is: %d\nHighest grade is: %d\n", getMinimum(), getMaximum());
        barCharts();
    }

    //method main begins program execution
    public static void main(String[] args) {
        //array of student grades
        int[] gradesArray = {87, 45, 78, 63, 78, 94, 78, 52, 86, 96};
        GradeBook myGradeBook = new GradeBook("CSC 202 Introduction to java programming", gradesArray);
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
    }
}
