
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */
package dietelBook.chapter3;

import java.util.Scanner;

public class DateTest {
    //method main begins program execution
    public static void main(String[] args) {
        Date date1 = new Date(21, 03, 1997);
        Scanner input = new Scanner(System.in);
        System.out.print("The initial date is: ");
        date1.displayDate();
        System.out.print("\nEnter day of the month: ");
        int day = input.nextInt();
        date1.setDay(day);
        System.out.print("Enter month of the year: ");
        int month = input.nextInt();
        date1.setMonth(month);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        date1.setYear(year);
        System.out.print("Today's date is: ");
        date1.displayDate();

    } //end method main

} //end class
