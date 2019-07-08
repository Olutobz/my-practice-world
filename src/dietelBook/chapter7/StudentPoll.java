/**
 * <p> Created by Onikoyi Damola Olutoba  06/04/19 </p>
 */


package dietelBook.chapter7;

//poll analysis program
public class StudentPoll {

    public static void main(String[] args) {
        System.out.println("What's your rating for this cafeteria quality of foods? \n" +
                "->Rate 1 if food is awful\n" +
                "->Rate 5 if the food is excellent\n");
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,
                2, 3, 3, 2, 14};
        int[] frequency = new int[6]; //array of frequency counters

        // for each answer, select responses element and use that value
        // as frequency index to determine element to increment
        for (int i = 0; i < responses.length; i++) {
            try {
                //determines which frequency of the element to increment
                ++frequency[responses[i]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf("responses[%d] = %d\n\n", i, responses[i]);
            }
        }

        //display column headers
        System.out.printf("%s%10s\n", "Rating", "Frequency");
        //output each array's element value
        for (int i = 1; i < frequency.length; i++) {
            System.out.printf("%6d%10d\n", i, frequency[i]);
        }
    }
}
