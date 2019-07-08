
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */
package dietelBook.chapter2;

//write an application that calculates the squares and cubes of the numbers from 0 to 10 and
//prints the resulting values in table format
public class Tables {
    public static void main(String[] args) {
        System.out.printf("%s %10s %10s", "Number", "Square", "Cube");
        int number, square, cube;
        //print number from 0-10, squares and cubes it
        for (number = 0; number <= 10; number++) {
            square = number * number;
            cube = number * number * number;
            System.out.printf("\n%d %10d %12d\n", number, square, cube);
        } //end for

    } //end method main

} //end class
