/**
 * <p> Created by Onikoyi Damola Olutoba  06/04/19 </p>
 */
package dietelBook.chapter7;

public class PassArray {
    //multiply each element of an array by 2
    private static void modifyArray(int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            array2[i] *= 2;
        }
    }

    //multiply argument by 2
    private static void modifyElement(int element) {
        element *= 2;
        System.out.printf("Value of element in modifyElement: %d\n", element);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("->Effects of passing reference to entire array \n" +
                "The values of the original array are: ");

        //output original array elements
        for (int original : array) {
            System.out.printf("%3d", original);
        }

        modifyArray(array); //pass array reference
        System.out.println("\nThe values of the modified array are: ");

        //print the modified array elements
        for (int value : array) {
            System.out.printf("  %d", value);
        }

        System.out.printf("\n\n->Effects of passing array element value \n" +
                "array[3] before modifyElement: %d\n", array[3]);

        modifyElement(array[3]); //attempt to modify array[3]
        System.out.printf("array[3] after modifyElement: %d\n", array[3]);
    }
}
