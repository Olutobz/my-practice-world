/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */
package dietelBook.chapter5;

/* Write an application that uses repetition and switch statements to
 print the song “The Twelve Days of Christmas.” One switch statement should
 be used to print the day (“first,” “second,” and so on). A separate switch statement should be used
 to print the remainder of each verse. Visit the website en.wikipedia.org/wiki/The_Twelve_Days_
 of_Christmas_(song)for the lyrics of the song.
*/

public class TwelveDaysOfChristmasSong {
    /* lyrics of the song is shown below as:
     *
     ==>On the first day of christmas my true love sent to me,
     A partridge in a pear tree.
     ==>On the second day of christmas my true love sent to me,
     Two turtle doves,A partridge in a pear tree.
     ==>On the third day of christmas my true love sent to me,
     Three french hens,Two turtle doves, A partridge in a pear tree.
     ==>On the fourth day of christmas my true love sent to me,
     four calling birds,Three french hens,
     Two turtle doves, A partridge in a pear tree.
     ==>On the fifth day of christmas my true love sent to me,
     five gold rings,four calling birds,Three french hens,
     Two turtle doves, A partridge in a pear tree.
     ==>On the sixth day of christmas my true love sent to me,
     six geese a-laying,five gold rings,four calling birds,Three french hens,
     Two turtle doves, A partridge in a pear tree.
     ==>On the seventh day of christmas my true love sent to me,
     seven swans a-swimming,six geese a-laying,five gold rings,four calling birds,
     Three french hens,Two turtle doves, A partridge in a pear tree.
     ==>On the eighth day of christmas my true love sent to me,
     eight maids a-milking,seven swans a-swimming,six geese a-laying,five gold rings,
     four calling birds,Three french hens,Two turtle doves, A partridge in a pear tree.
     ==>On the ninth day of christmas my true love sent to me,
     nine ladies dancing,eight maids a-milking,seven swans a-swimming,six geese a-laying,five gold rings,
     four calling birds,Three french hens,Two turtle doves, A partridge in a pear tree.
     ==>On the tenth day of christmas my true love sent to me,
     ten lords a-leaping,nine ladies dancing,eight maids a-milking,seven swans a-swimming,six geese a-laying,
     five gold rings,four calling birds,Three french hens,Two turtle doves, A partridge in a pear tree.
     ==>On the eleventh day of christmas my true love sent to me,
     eleven pipers piping,ten lords a-leaping,nine ladies dancing,eight maids a-milking,seven swans a-swimming,
     six geese a-laying,five gold rings,four calling birds,Three french hens,Two turtle doves, A partridge in a pear tree.
     ==>On the twelfth day of christmas my true love sent to me, twelve drummers drumming,
     eleven pipers piping,ten lords a-leaping,nine ladies dancing,eight maids a-milking,seven swans a-swimming,
     six geese a-laying,five gold rings,four calling birds,Three french hens,Two turtle doves, A partridge in a pear tree.
     */

    //method main begins program execution
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            String song = "On the ";
            switch (i) {
                case 1:
                    song += "first ";
                    break;
                case 2:
                    song += "second ";
                    break;
                case 3:
                    song += "third ";
                    break;
                case 4:
                    song += "fourth ";
                    break;
                case 5:
                    song += "fifth ";
                    break;
                case 6:
                    song += "sixth ";
                    break;
                case 7:
                    song += "seventh ";
                    break;
                case 8:
                    song += "eighth ";
                    break;
                case 9:
                    song += "ninth ";
                    break;
                case 10:
                    song += "tenth ";
                    break;
                case 11:
                    song += "eleventh ";
                    break;
                case 12:
                    song += "twelfth ";
                    break;
            }
            song += "day of christmas my true love sent to me, ";

            //print remaining parts of the song
            switch (i) {
                case 12:
                    song += "twelve drummers drumming, ";
                case 11:
                    song += "eleven pipers piping, ";
                case 10:
                    song += "ten lords a-leaping , ";
                case 9:
                    song += "nine ladies dancing, ";
                case 8:
                    song += "eight maids a-milking, ";
                case 7:
                    song += "seven swans a-swimming, ";
                case 6:
                    song += "six geese a-laying, ";
                case 5:
                    song += "five gold rings, ";
                case 4:
                    song += "four calling birds, ";
                case 3:
                    song += "three french hens, ";
                case 2:
                    song += "two turtle doves, ";
                case 1:
                    song += "a partridge in a pear tree";
            }
            System.out.println(song);
            System.out.println();

        } //end for
    }
}
