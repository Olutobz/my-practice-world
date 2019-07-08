/**
 * <p> Created by Onikoyi Damola Olutoba  06/04/19 </p>
 */

package dietelBook.chapter7;

//BarChart printing program

public class BarChart {

    public static void main(String[] args) {
        int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };

        System.out.println("Grade Distribution: ");
        for (int i = 0; i < array.length ; i++) {
            // output bar label ( "00-09: ", ..., "90-99: ", "100: " )
            if (i == 10) {
                System.out.printf("%5d: ",100);
            }
            else {
                System.out.printf("%02d-%02d: ", 10*i, 10*i + 9);
            }

            //print bar of asterisks
            for (int j = 0; j < array[i]; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}