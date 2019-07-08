
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter4;

import java.util.Scanner; //program uses class scanner

/* Develop a Java application that determines whether any of several
department-store customers has exceeded the credit limit on a charge account */

public class CreditLimitCalculator {
    private String accountNumber; //Account number of the customer
    private int beginningBalance; //balance at the beginning of the month
    private int newBalance; //Available balance after debit/credit
    private int charges; //total of all items charged by the customer this month
    private int credits; //total of all credits applied to the customer’s account this month
    private int creditLimit; //allowed credit limit

    //constructor initializes variables
    private CreditLimitCalculator(String accountNumber, int beginningBalance, int newBalance,
                                  int charges, int credits, int creditLimit) {
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.newBalance = newBalance;
        this.charges = charges;
        this.credits = credits;
        this.creditLimit = creditLimit;
    } //end constructor

    //method to retrieve account number of customer
    public String getAccountNumber() {
        return accountNumber;
    }

    //method to set account number of customer
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //method to retrieve beginning month balance of customer
    private int getBeginningBalance() {
        return beginningBalance;
    }

    //method to set beginning month balance of customer
    public void setBeginningBalance(int beginningBalance) {
        this.beginningBalance = beginningBalance;
    }

    //method to retrieve new balance
    public int getNewBalance() {
        return newBalance;
    }

    //method to set new balance of customer
    public void setNewBalance(int newBalance) {
        newBalance = getBeginningBalance() + getCharges() - getCredits();
        this.newBalance = newBalance;
    }

    //method to retrieve charges on customer's balance
    private int getCharges() {
        return charges;
    }

    //method to set balance on customer's balance
    public void setCharges(int charges) {
        this.charges = charges;
    }

    //method to retrieve credit
    private int getCredits() {
        return credits;
    }

    //method to set limit on customer's balance
    public void setCredits(int credits) {
        this.credits = credits;
    }

    //method to retrieve credit limit on customer's account
    public int getCreditLimit() {
        return creditLimit;
    }

    //method to set credit limit on customer's balance
    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    private void calculate() {
        Scanner input = new Scanner(System.in); //reads input from command window
        System.out.print("Enter customer account number: ");
        accountNumber = input.nextLine();
        System.out.print("Enter customer's beginning balance: ");
        beginningBalance = input.nextInt();
        System.out.print("Enter total number of items charged for: ");
        charges = input.nextInt();
        System.out.print("Enter customer's credit amount: ");
        credits = input.nextInt();

        newBalance = beginningBalance + charges - credits; //determines new balance of the customer

        //checks if new balance exceeds customer's credit limit
        if (newBalance >= creditLimit)
            System.out.printf("\nThe customer's new balance is: $%d\n", newBalance);
        else
            System.out.print("\"Credit limit exceeded\"");

    } //end method calculate

    //main method begins program execution
    public static void main(String[] args) {
        CreditLimitCalculator calculator1 = new CreditLimitCalculator("0176157734",
                554255, 55422, 6842, 1254, 1000000);

        //object calculator uses method calculate
        System.out.printf("The Initial account balance of customer is: %s\n" +
                        "The initial beginning balance of customer is: $%d\n" +
                        "The initial new balance of customer is: $%d\n",
                calculator1.accountNumber, calculator1.beginningBalance, calculator1.newBalance);

        System.out.printf("The initial charges on customer is: $%d\n" +
                        "The initial credit limit of customer is: $%d\n\n\n",
                calculator1.charges, calculator1.creditLimit);

        calculator1.calculate();

    } //end method main

} //end class
