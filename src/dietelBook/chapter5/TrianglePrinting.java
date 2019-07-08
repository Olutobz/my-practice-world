
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter5;

/* Write an application that displays the following patterns separately,
 * one below the other. Use for loops to generate the patterns. All asterisks (*) should be print-
 ed by a single statement of the formSystem.out.print( '*' );which causes the asterisks to print
 side by side. A statement of the formSystem.out.println();can be used to move to the next line.
 A statement of the formSystem.out.print( ' ' );can be used to display a space for the last two
 patterns. There should be no other output statements in the program. [Hint: The last two patterns
 require that each line begin with an appropriate number of blank spaces.]
 (a)         (b)          (c)                 (d)
 *           **********   **********            *
 **          *********     *********           **
 ***         ********       ********          ***
 ****        *******         *******         ****
 *****       ******           ******        *****
 ******      *****             *****       ******
 *******     ****               ****      *******
 ********    ***                 ***     ********
 *********   **                   **    *********
 **********  *                     *   **********
*/
public class TrianglePrinting {
    //method main begins program execution
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println(); //prints a blank line
        } //end outer for
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print('*');
            }
            System.out.println(); //prints a blank line
        }
        System.out.println(); //prints a blank line

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(' ');
            for (int k = 10; k >= i; k--)
                System.out.print('*');
            System.out.println();
        } //end outer for

        System.out.println(); ///prints a blank line

        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--)
                System.out.print(' ');
            for (int k = 1; k <= i; k++)
                System.out.print("*");
            System.out.println(); //prints a blank line
        } //end outer for
        System.out.println();

        //to print them side by side

    } //end method main

}
