
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter5;

public class MysteryExercises {
    //main method begins program execution
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++)
                System.out.print('@');

            System.out.println();
        } // end outer for
        System.out.println("\n");

        int i, j, k;

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 3; j++) {
                for (k = 1; k <= 4; k++)
                    System.out.print('*');
                System.out.println();
            } // end inner for
            System.out.println();
        } // end outer for


    } //end method main

}
