
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter4;

/*prefix increment and postfix increment operators */
public class Increment {

    public static void main(String[] args) {
        int c = 5;

        //demonstrate postfix increment
        System.out.println(c); //prints 5
        System.out.println(c++); //prints 5 then post increment
        System.out.printf("%d\n\n", c); //print 6

        //demonstrate prefix increment
        c = 5;
        System.out.println(c); //prints 5
        System.out.println(++c); //pre increments then prints 6
        System.out.println(c); //prints 6

    } //end method main

} //end class
