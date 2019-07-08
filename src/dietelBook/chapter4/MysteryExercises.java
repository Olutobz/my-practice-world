
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter4;

public class MysteryExercises {
    //method main begins program execution
    public static void main(String[] args) {
        //mystery exercise
        int row = 10;
        int column;
        while (row >= 1) {
            column = 1;
            while (column <= 10) {
                System.out.print(row % 2 == 1 ? "<" : ">");
                ++column;
            } // end inner while
            --row;
            System.out.println();
        } // end outer while
        System.out.println();

        int count = 1;
        while (count <= 10) {
            System.out.println(count % 2 == 1 ? "****" : "++++++++");
            ++count;
        }


    } //end method main
} //end class MysteryExercises
