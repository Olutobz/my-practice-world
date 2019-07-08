/**
 * <p> Created by Onikoyi Damola Olutoba  06/04/19 </p>
 */


package dietelBook.chapter7;

public class InitArray {

    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10; // declare constant
        int[] array = new int[ARRAY_LENGTH];

        //displays column headers
        System.out.printf("%s%8s\n", "Index", "Value");

        //output each array element's value
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            array[i] = 2 + 2 * i;
            System.out.printf("%5d%8d\n", i, array[i]);
        }
    }
}
