/**
 * <p> Created by Onikoyi Damola Olutoba  06/04/19 </p>
 */

package dietelBook.chapter7;

public class EnhancedForTest {

    public static void main(String[] args) {
        int[] array = {45, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        for (int number : array)
            total += number;
        System.out.printf("The total of array elements: %d\n", total);
    }
}
