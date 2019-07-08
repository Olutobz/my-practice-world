package udacityJava.functionalProgramming;

public class ArraysLoops {
    private static double calculateAverage(double [] temperature) {
        int size = temperature.length; //number of items in the array
        double total = 0;
        for (double i : temperature) {
            total += i;
        }
        double average;
        average = total/size;
        return average;
    }

    /** Searches an array of speed for the smallest value
     *@param speed array of speeds
     * @return double the smallest speed found  */
    private static double search(double [] speed) {
        int size = speed.length;
        double min = speed[0];
        for (int i = 1; i < size ; i++) {
            if (speed[i] < min) {
                min = speed[i];
            }
        }
        return min;
    }

    //Looping over a 2D Arrays
    private static double studentAverage(int [][] grades, int student) {
        int total = 0;
        int subjects = grades.length;
        //using foreach
        for (int[] grade : grades) {
            total += grade[student];
        }
        return total/(double)subjects;
    }

    ///Searches am array of strings and finds the longest string
    private static String findLongestName(String [] names) {
        int size = names.length;
        String longestName = names[0];
        for (int i = 1; i < size; i++) {
            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
        }
        return longestName;
    }

    //method main begins program execution
    public static void main(String[] args) {
        double [] money = {10.4,10.8,9.10};
        System.out.println("The average is: "+calculateAverage(money));

        double[] speed = {78.55,56.4,78.5,78.4,9836.4};
        System.out.println("The lowest speed is: "+search(speed));

        String [] names = {"Toba", "Aanu", "Tomilayo", "Promise", "Nifemi"};
        System.out.println(findLongestName(names));

       /* testing the 2D array
        int[][] studentAverage = {{3,4}, {4,8}};
        int student = 3;
        System.out.println(studentAverage(studentAverage, student)); */

    }

}
