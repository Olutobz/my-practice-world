package udacityJava.functionalProgramming;

import java.util.Scanner;

public class Blocks {
    private static int countBlocks(int levels) {
        int total = 0;
        for (int i = 1; i <= levels; i++) {
            total = total + (i*i);
        }
        return  total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of levels needed: ");
        int levels = input.nextInt();
        System.out.println(countBlocks(levels));
    }
}
