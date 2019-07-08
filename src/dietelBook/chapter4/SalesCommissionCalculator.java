
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter4;

import java.util.Scanner; //program uses class scanner

/*Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
 *displays that salesperson’s earnings. There’s no limit to the number of items that can be sold. */

public class SalesCommissionCalculator {
    private double item1; //first item sold
    private double item2; //second item sold
    private double item3; //third item sold
    private double item4; //fourth item sold
    private double total; //total of items sold
    private double amountReceived; //salespeople receive $200 per week plus 9% of their gross sales for that week

    //constructor initializes variables
    public SalesCommissionCalculator(double item1, double item2, double item3,
                                     double item4, double total, double amountReceived) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.total = item1 + item2 + item3 + item4;
        this.amountReceived = 200 + (0.09 * this.total);
    } //end constructor

    //method to calculate items value and salary earned
    public void calculate() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter value of item1: ");
        item1 = input.nextDouble(); //reads input from command prompt
        System.out.print("Enter value of item2: ");
        item2 = input.nextDouble();
        System.out.print("Enter value of item3: ");
        item3 = input.nextDouble();
        System.out.print("Enter value of item4: ");
        item4 = input.nextDouble();
        total = item1 + item2 + item3 + item4;
        amountReceived = 200 + (0.09 * total);
        System.out.printf("\nSalesperson's week salary will be: $%.2f\n", amountReceived);

    } //end method calculate

    //method to retrieve item1
    public double getItem1() {
        return item1;
    }

    //method to set item1
    public void setItem1(double item1) {
        this.item1 = item1;
    }

    //method to retrieve item2
    public double getItem2() {
        return item2;
    }

    //method to set item2
    public void setItem2(double item2) {
        this.item2 = item2;
    }

    //method to retrieve item3
    public double getItem3() {
        return item3;
    }

    //method to set item3
    public void setItem3(double item3) {
        this.item3 = item3;
    }

    //method to retrieve item4
    public double getItem4() {
        return item4;
    }

    //method to set item4
    public void setItem4(double item4) {
        this.item4 = item4;
    }

    //method to retrieve total of the teams
    public double getTotal() {
        return total;
    }

    //method to set total
    public void setTotal(double total) {
        this.total = total;
    }

    //method to retrieve amount received
    public double getAmountReceived() {
        return amountReceived;
    }

    //method to set amount received
    public void setAmountReceived(double amountReceived) {
        this.amountReceived = amountReceived;
    }

    //main method begins program execution
    public static void main(String[] args) {
        //create SalesCommissionCalculator object
        SalesCommissionCalculator salesPerson1 = new SalesCommissionCalculator(239.99, 129.75,
                99.95, 350.89, 0, 0);
        System.out.printf("Initial value of item1: %.2f\n" +
                "Initial value of item2: %.2f\n", salesPerson1.getItem1(), salesPerson1.getItem2());
        System.out.printf("Initial value of item3: %.2f\n" +
                "Initial value of item4: %.2f\n", salesPerson1.getItem3(), salesPerson1.getItem4());
        System.out.printf("\nSalesperson's last week salary will be: $%.2f\n", salesPerson1.getAmountReceived());
        salesPerson1.calculate();

    } //end method main

} //end class
