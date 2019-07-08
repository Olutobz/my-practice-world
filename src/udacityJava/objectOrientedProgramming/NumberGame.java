package udacityJava.objectOrientedProgramming;

import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //generates a pseudo-random number from 1 to 100
        int randomNumber = 1 + (int) (Math.random() * 100);
        boolean hasWon = false;
        System.out.println("I have randomly chosen a number between between 1 and 100.\n" +
                "Try to guess it.");

        for (int i = 10; i > 0 ; i--) {
            System.out.println("you have " + i + " guess(es) left. Choose again");
            System.out.print("Enter guess number: ");
            int guess = input.nextInt();

            //checking for when user gets the correct guess
            if (randomNumber < guess) {
                System.out.println("it is smaller than " + guess + " choose again.");
            }
            else if (randomNumber > guess) {
                System.out.println("It's greater than " + guess + " choose again.");
            }
            else {
                hasWon = true;
                break;
            }
        }
        if (hasWon) {
            System.out.println("CORRECT... YOU WIN!!!");
        }
        else {
            System.out.println("GAME OVER... YOU LOSE!!!");
            System.out.println("The number was: " + randomNumber);
        }
    }
}
