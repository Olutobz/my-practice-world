/**
 * <p> Created by Onikoyi Damola Olutoba  18/03/19 </p>
 */


package dietelBook.chapter6;

public class Scope {
    //field that is accessible to all methods of this class
    private static int x = 1;

    //method main begins program execution
    public static void main(String[] args) {
        int x = 5; //this variable shadows the field x
        System.out.printf("local x in the main is: %d\n", x);
        useLocalVariable(); //useLocalVariable has local x
        useField(); //use field uses class Scope's field x
        useLocalVariable(); //re-initializes local variable
        useField(); //class Scope's field x retains its value
        System.out.printf("\nlocal x in the main is: %d\n", x);

    }

    private static void useLocalVariable() {
        int x = 25; //initialized each time local variable is called
        System.out.printf("\nlocal x on entering method useLocalVariable is %d\n", x);
        ++x;
        System.out.printf("local x before exiting method useLocalVariable is %d\n", x);
    }

    //modify class scope's field x during each call
    private static void useField() {
        System.out.printf("\nfield x on entering method useField is %d\n", x);
        x *= 10;
        System.out.printf("field x before exiting method useField is %d\n", x);
    }

}
