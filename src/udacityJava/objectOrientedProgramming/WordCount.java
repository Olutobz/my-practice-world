package udacityJava.objectOrientedProgramming;

import java.io.File;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) throws Exception {
        File file = new File("text.txt");
        Scanner input = new Scanner(file);
        int words = 0;

        while (input.hasNextLine()) {
            String line = input.nextLine();
            words += line.split(" ").length;

        }
        System.out.println("The file contains " + words + " words");
    }
}
