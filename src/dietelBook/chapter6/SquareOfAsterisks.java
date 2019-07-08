/**
 * <p> Created by Onikoyi Damola Olutoba  18/03/19 </p>
 */


package dietelBook.chapter6;

import java.util.Scanner;

public class SquareOfAsterisks {
    private static void squareOfAsterisks(int noOfSides) {
        for (int i = 1; i <= noOfSides; i++) {
            for (int j = 1; j <= noOfSides; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void squareOfChar(int noOfSides, char fillCharacter) {
        for (int i = 1; i <= noOfSides; i++) {
            for (int j = 1; j <= noOfSides; j++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of asterisks to print: ");
        int number = input.nextInt();
        squareOfAsterisks(number);
        System.out.print("\nEnter the number of square sides of character to print: ");
        int charNumber = input.nextInt();
        System.out.print("Enter the character to print: ");
        char fill = input.next().charAt(0);
        squareOfChar(charNumber, fill);

    }
}
