
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter4;

import java.util.Scanner; //program uses class scanner

/*Develop a Java application that determines the gross pay for each of three employees */

public class SalaryCalculator {
    private int hoursWorked; //The company pays straight time for the first 40 hours worked by each employee
    private int hourlyRates; //values of each hour to determine payment
    private int excessTime; //pays a half for all hours worked in excess of 40
    private int grossPay;  //salary to be earned

    //constructor initializes variables
    public SalaryCalculator(int hoursWorked, int excessTime) {
        this.hoursWorked = hoursWorked;
        this.excessTime = excessTime;
    } //end constructor

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyRates() {
        return hourlyRates;
    }

    public void setHourlyRates(int hourlyRates) {
        this.hourlyRates = hourlyRates;
    }

    public int getExcessTime() {
        return excessTime;
    }

    public void setExcessTime(int excessTime) {
        this.excessTime = excessTime;
    }

    public int getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(int grossPay) {
        this.grossPay = grossPay;
    }

    //method to get salary earned by each employee
    public void determineSalary() {
        Scanner input = new Scanner(System.in); //creates scanner object
        System.out.println(); //outputs a blank line
        System.out.print("Enter employee hours worked: ");
        hoursWorked = input.nextInt();
        System.out.print("Enter employee hours worked in excess (if null press 0): ");
        excessTime = input.nextInt();
        if (hoursWorked == 40 && excessTime > 0) {
            grossPay = (500) + (excessTime / 2) * 200;
            System.out.printf("Salary earned for %d  hours worked and %d excess hours worked will be: $%d",
                    hoursWorked, excessTime, grossPay);
        } //end if statement
        else if (hoursWorked == 40 && excessTime == 0) {
            grossPay = 500;
            System.out.printf("Salary earned for %d  hours worked and %d excess hours worked will be: $%d",
                    hoursWorked, excessTime, grossPay);
        } //end else if
        else if (hoursWorked != 40 && excessTime > 0) {
            grossPay = (excessTime / 2) * 200;
            System.out.printf("Salary earned for %d  hours worked and %d excess hours worked will be: $%d",
                    hoursWorked, excessTime, grossPay);
        } //end else if

        else System.out.println("No salary will be issued to this employee");

        System.out.println("\nThis is for the employee entered above!!!");

    } //end method determineSalary

    //method main begins program execution
    public static void main(String[] args) {
        //create SalaryCalculator objects for 3 employees
        SalaryCalculator employee1 = new SalaryCalculator(34, 8);
        SalaryCalculator employee2 = new SalaryCalculator(54, 12);
        SalaryCalculator employee3 = new SalaryCalculator(12, 10);
        System.out.printf("The initial hours worked for employee1 and hourly rates are: %d & %d\n",
                employee1.getHoursWorked(), employee1.getExcessTime());
        System.out.printf("The initial hours worked for employee1 and hourly rates are: %d & %d\n",
                employee2.getHoursWorked(), employee2.getExcessTime());
        System.out.printf("The initial hours worked for employee1 and hourly rates are: %d & %d\n",
                employee3.getHoursWorked(), employee3.getExcessTime());
        employee1.determineSalary();
        employee2.determineSalary();
        employee3.determineSalary();

    } //end main method

} //end class
