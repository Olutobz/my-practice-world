
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */
package dietelBook.chapter3;

public class EmployeeTest {
    //main method begins program execution
    public static void main(String[] args) {
        Employee employee1 = new Employee("Olutoba", "Onikoyi", 5000); //create employee object
        Employee employee2 = new Employee("Abisola", "Okunlola", 4000); //create employee object

        double yearlySalary1, yearlySalary2;

        yearlySalary1 = employee1.getSalary() * 12; //multiplies monthly salary to get annual salary
        yearlySalary2 = employee2.getSalary() * 12; //multiplies monthly salary to get annual salary

        System.out.println("Yearly salary for employee1 is: " + yearlySalary1);
        System.out.println("Yearly salary for employee2 is: " + yearlySalary2);

        double raise1, raise2;
        raise1 = ((0.1 * employee1.getSalary()) * 12) + yearlySalary1;
        raise2 = ((0.1 * employee2.getSalary()) * 12) + yearlySalary2;

        System.out.println("\nYearly salary for employee1 including 10% raise is: " + raise1);
        System.out.println("Yearly salary for employee2 including 10% raise is: " + raise2);

    } //end method main
} //end class
