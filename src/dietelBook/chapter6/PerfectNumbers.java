/**
 * <p> Created by Onikoyi Damola Olutoba  18/03/19 </p>
 */


package dietelBook.chapter6;

import java.util.Scanner;

public class PerfectNumbers {
    /* An integer number is said to be a perfect number if its factors, including
     * 1 (but not the number itself), sum to the number */
    private static void isPerfect(int number) {
        int sum = 0;
        System.out.print("Factors of " + number + " are ");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println();
        if (sum == number) {
            System.out.println("==>" + number + " is a perfect number");
        } else System.out.println(number + " is not a perfect number");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer you want to check: ");
        int number = input.nextInt();
        isPerfect(number);
        System.out.println();
        for (int i = 1; i <= 1000; i++) {
            isPerfect(i);
            System.out.println();
        }
        //testing for numbers much larger than 1000
        for (int i = 1000; i <= 9999; i++) {
            isPerfect(i);
        }
    }
}