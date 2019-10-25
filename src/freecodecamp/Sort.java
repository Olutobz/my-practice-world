package freecodecamp;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] x = {-112,45,7,12,36,7,4,120};
        Arrays.sort(x);
        for (int i: x) {
            System.out.print(i + ",");
        }
    }
}
