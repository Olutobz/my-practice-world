package dietelBook.chapter6;


/**
 * <p> Created by Onikoyi Damola Olutoba  18/03/19 </p>
 */

import java.util.Random;

/* Write statements that will display a random number from each of the following sets:
 a) 2, 4, 6, 8, 10.
 b) 3, 5, 7, 9, 11.
 c) 6, 10, 14, 18, 22.
*/

public class RandomNumbers {
    //program uses class Random
    private static Random randomNumber = new Random();

    //generates a random even number from 2 and not greater than 10
    private static int randomEvenRange10() {
        int number = 2 + randomNumber.nextInt(10);
        if (number % 2 == 0) {
            return number;
        } else
            return 4;
    }

    //generates a random odd number from 3 and not greater than 11
    private static int randomOddRange11() {
        int number = 3 + randomNumber.nextInt(9);
        if (number % 2 == 1) {
            return number;
        } else return 3;
    }

    //generates a random number from 6, difference of 4 and not greater than 22
    private static int randomNums() {
        int number = 6 + randomNumber.nextInt(17);
        if (number == 6)
            return number;
        else if (number == 10)
            return number;
        else if (number == 14)
            return number;
        else if (number == 18)
            return number;
        else if (number == 22)
            return number;
        else
            return 22;
    }

    public static void main(String[] args) {
        System.out.printf("%s%d\n%s%d\n%s%d\n", "Any random number from 2,4,6,8,10 is: ", randomEvenRange10(),
                "Any random number from 3,5,7,9,11 is: ", randomOddRange11(),
                "Any random number from 6,10,14,18,22 is: ", randomNums());
    }
}
