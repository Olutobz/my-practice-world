

/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter3;

//Account class with a constructor to initialize the
//balance of type double
public class Account {
    private double balance; //instance variable that stores the balance

    //constructor
    public Account(double initialBalance) {
        //validates initialize balance is greater than 0.0, if otherwise
        // balance equals default value
        if (initialBalance > 0.0)
            balance = initialBalance;
    } //end constructor

    //add an amount to the balance
    public void credit(double amount) {
        balance = balance + amount; //add amount to balance
    } //end method credit

    //returns the account balance
    public double getBalance() {
        return balance;
    } //end method getBalance

    //debits (withdraws) an amount from the balance
    public void debit(double amount) {
        if (balance > amount) //checks if debit is not greater than available balance
            balance = balance - amount;
        if (amount > balance)
            System.out.println("Debit amount exceeded account balance");
    } //end method debit

} //end class
