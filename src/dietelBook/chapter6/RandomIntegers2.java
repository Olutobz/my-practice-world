/**
 * <p> Created by Onikoyi Damola Olutoba  18/03/19 </p>
 */

package dietelBook.chapter6;

import java.util.Random;

/* Write statements that assign random integers to the variable n in the following ranges:
a) 1 ≤ n ≤ 2.
b) 1 ≤ n ≤ 100.
c) 0 ≤ n ≤ 9.
d) 1000 ≤ n ≤ 1112.
e) –1 ≤ n ≤ 1.
f)–3 ≤ n ≤ 11.
*/

public class RandomIntegers2 {
    private static Random randomNumbers = new Random();

    //generating random numbers in the range of 1 to 2
    private static int randomOfRange2() {
        return (1 + randomNumbers.nextInt(2));
    }

    //generating random numbers in the range of 1 to 100
    private static int randomOfRange100() {
        return (1 + randomNumbers.nextInt(100));
    }

    //generating random numbers in the range of 0 to 9
    private static int randomOfRange9() {
        return randomNumbers.nextInt(10);
    } //generating random numbers in the range of 1000 to 1112

    private static int randomOfRange1112() {
        return (1000 + randomNumbers.nextInt(113));
    }

    //generating random numbers in the range of -1 to 1
    private static int randomOfRange1() {
        return (-1 + randomNumbers.nextInt(3));
    }

    //generating random numbers in the range of -3 to 11
    private static int randomOfRange11() {
        return (-3 + randomNumbers.nextInt(15));
    }

    //method main begins program execution
    public static void main(String[] args) {
        System.out.printf("%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n", "A random number n in the range \"1 ≤ n ≤ 2\" is: ", randomOfRange2(),
                "A random number n in the range \"1 ≤ n ≤ 100\" is: ", randomOfRange100(),
                "A random number n in the \"0 ≤ n ≤ 9\" is: ", randomOfRange9(),
                "A random number n in the range \"1000 ≤ n ≤ 1112\" is: ", randomOfRange1112(),
                "A random number n in the range \"–1 ≤ n ≤ 1\" is: ", randomOfRange1(),
                "A random number in the range \"–3 ≤ n ≤ 11\" is: ", randomOfRange11());
    }
}