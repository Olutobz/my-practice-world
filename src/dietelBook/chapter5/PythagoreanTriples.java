
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter5;

/*A right triangle can have sides whose lengths are all integers. The set
 of three integer values for the lengths of the sides of a right triangle is called a Pythagorean triple.
 The lengths of the three sides must satisfy the relationship that the sum of the squares of two of the
 sides is equal to the square of the hypotenuse. Write an application that displays a table of the
 Pythagorean triples for side1,side2 and the hypotenuse, all no larger than 500. Use a triple-nested
 for loop that tries all possibilities. This method is an example of “brute-force” computing. You’ll
 learn in more advanced computer science courses that for many interesting problems there’s no
 known algorithmic approach other than using sheer brute force.
*/

public class PythagoreanTriples {
    //method main begins program execution
    public static void main(String[] args) {
        //Initialization phase
        int a, b, c; //represents sides of the right triangle
        for (a = 1; a <= 500; a++) {
            for (b = 1; b <= 500; b++) {
                for (c = 1; c <= 500; c++) {
                    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                        System.out.printf("%d %d %d\n", a, b, c);
                    }
                }
            }
        }
    }

}
