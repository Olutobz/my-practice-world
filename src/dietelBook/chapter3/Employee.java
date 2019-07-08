package dietelBook.chapter3;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    //constructor
    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

    } //end constructor

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0 )
            salary = 0.0;
        this.salary = salary;
    }
    public static class Date {

    } //end class
} //end class
