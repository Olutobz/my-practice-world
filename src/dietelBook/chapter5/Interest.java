
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter5;

public class Interest {
    //main method begins program execution
    public static void main(String[] args) {
        double amount; //amount on deposit at the end of nth year
        double total = 0; //sum of amount deposit for nth year
        double principal = 1000.0; //initial amount invested
        double rate = 0.05; //interest rate

        // repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%
        for (int i = 1; i <= 5; i++) {
            //display headers
            System.out.printf("%s %23s\n", "year", "Amount On Deposit");
            //calculates amount on deposit for each year in 10 years
            for (int year = 1; year <= 10; year++) {
                amount = principal * Math.pow(1.0 + rate, year);
                total += amount;

                //display the year and amount
                System.out.printf("%4d %,14.2f\n", year, amount);
            } //end inner for loop
            System.out.printf("The sum of the deposited amount after 10 years: $%,.2f\n\n\n", total);
            rate += 0.01; //increase the rate by 1%
        } //end outer for

    } //end method main

} //end class
