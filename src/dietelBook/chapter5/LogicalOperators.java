
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter5;

public class LogicalOperators {

    //method main begins program execution
    public static void main(String[] args) {
        //create truth table for  && (conditional AND) operator
        System.out.printf("%s\n%s: %b \n%s: %b \n%s: %b \n%s: %b\n\n",
                "Conditional AND (&&)", "false && false", (false),
                "false && true", (false), "true && false", (false),
                "true && true", (true));

        //create truth table for !! (conditional OR) operator
        System.out.printf("%s\n%s: %b \n%s: %b \n%s: %b \n%S: %b\n\n",
                "Conditional OR (||)", "false || false", (false),
                "false || true", (true), "true || false", (true),
                "true || true", (true));

        //create truth table for  logical AND (&) operator
        System.out.printf("%s\n%s: %b \n%s: %b \n%s: %b \n%s: %b\n\n",
                "Boolean Logical AND (&)", "false & false", (false),
                "false & true", (false), "true & false", (false),
                "true & true", (true));

        //create truth table for boolean logical inclusive OR (|) operator
        System.out.printf("%s\n%s: %b \n%s: %b \n%s: %b \n%s: %b\n",
                "Boolean Logical Inclusive OR (|)", "false | false", (false),
                "false | true", (true), "true | false", (true),
                "true | true", (true));

        //create truth table for boolean logical exclusive OR (^) operator
        System.out.printf("%s\n%s: %b \n%s: %b \n%s: %b \n%s: %b\n\n",
                "Boolean logical Exclusive OR (^)", "false ^ false", (false),
                "false ^ true", (true), "true ^ false", (true),
                "true ^ true", (false));

        //create truth table for logical negation (!) Operator
        System.out.printf("%s\n%s: %b \n%s: %b\n\n",
                "Logical NOT (!)", "!false", (true), "!true", (false));

    } //end method main

} //end class LogicalOperators
