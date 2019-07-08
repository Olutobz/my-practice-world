/**
 * <p> Created by Onikoyi Damola Olutoba  06/04/19 </p>
 */

package dietelBook.chapter7;

public class SumArray {

    public static void main(String[] args) {
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;
        for (int value : array) {
            total += value;
        }
        System.out.print("Total of array elements: " + total);

    }
}
