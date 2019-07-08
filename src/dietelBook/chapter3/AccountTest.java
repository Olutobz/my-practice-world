package dietelBook.chapter3;
import java.util.Scanner;

public class AccountTest {
    //main method begins program execution
    public static void main(String[] args) {
        Account account1 = new Account(50503.02); //create account object
        Account account2 = new Account(4270.89); //create account object

        //display initial balance of each object
        System.out.printf("Account1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("Account2 balance: $%.2f\n", account2.getBalance());
        System.out.println(); //outputs a blank line

        //program uses class scanner to collect input from user
        Scanner input = new Scanner(System.in);

        //validates credit and gives account details
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount; //deposit amount read from user
        depositAmount = input.nextDouble();
        System.out.printf("\nAdding %.2f to account1 balance\n", depositAmount );
        account1.credit(depositAmount); //adds new amount to account1 balance
        System.out.printf("\nAccount1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("Account2 balance: $%.2f\n", account2.getBalance());

        System.out.print("\nEnter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("\nAdding %.2f to account2 balance\n", depositAmount);
        account2.credit(depositAmount);
        System.out.printf("\nAccount1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("Account2 balance: $%.2f\n\n", account2.getBalance());

        System.out.println("Thank you for banking with us!!!\n\n\n");

        //validates withdrawal and gives account details
        double debitAmount;
        System.out.print("Enter amount to withdraw from account1: ");
        debitAmount = input.nextDouble();
        System.out.printf("\nSubtract %.2f from account1 balance\n", debitAmount );
        account1.debit(debitAmount);
        System.out.printf("\nAccount1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("Account2 balance: $%.2f\n", account2.getBalance());

        System.out.print("Enter amount to withdraw from account2: ");
        debitAmount = input.nextDouble();
        System.out.printf("\nSubtract %.2f from account2 balance\n", debitAmount);
        account2.debit(debitAmount);
        System.out.printf("\nAccount1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("Account2 balance: $%.2f\n", account2.getBalance());

        System.out.println("Thank you for banking with us!!!\n\n");

    } //end method main
} //end class
