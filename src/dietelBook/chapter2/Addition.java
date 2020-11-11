
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter2;

import java.util.Scanner; //program uses class Scanner

// Addition program that displays the sum of two numbers collected from user
public class Addition {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num1, //first number to add
//                num2, //second number to add
//                sum; //addition of first and second number
//
//        System.out.print("Enter first number: "); //prompt
//        num1 = input.nextInt(); //reads first input from user
//        System.out.print("Enter second number: "); //prompt
//        num2 = input.nextInt(); //reads second input from user
//        sum = num1 + num2; //total of both numbers
//
//        System.out.printf("%s %d\n", "sum is", sum); //output the aggregate numbers
//    } // end method main

    public static int convertStrings(String str1, String str2) {
        //checks if strings are in their lower case form before executing
        if (str1.toLowerCase().equals(str2.toLowerCase())) {
            if (str1.length() == str2.length()) {
                for (int i = 0; i < str1.length() ; i++) {
                    if (str1.charAt(i) == str2.charAt(i))
                        return 1;
                    else if (str1.charAt(i) != str2.charAt(i))
                        return 0;
                }
            }
        }
        return 0;
    }

    public  static int solution(int totalMoney, int totalDamage, Integer[] costs, Integer[] damages) {
        // Your solution goes here.

        return 0;
    }

    public static void main(String[] args) {
        // Read from stdin, solve the problem, write answer to stdout.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the strings to convert: ");
        String S = in.next();
        String T = in.next();
        System.out.print(convertStrings(S, T));
    }

}// end class
