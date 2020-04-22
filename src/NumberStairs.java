/*
This class will make staircases from various numbers
 */

public class NumberStairs {
    public static void main (String[] args) {
        /*
        This for loop should print out
        1
        12
        123
        1234
        12345
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        /*
        This loop should print out:
        1
        22
        333
        4444
        55555
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        /*
        For this problem, a for loop was nested inside a while loop
        Two ints were declared and initialized outside the loop, because they needed to be maintain their values
        even when the loop reset.
        The outer while loop keeps track of the counter, and quits once it hits 10.
        The inner for loop prints out the counter and increments it, up until i hits the rows variable
        The outer loop will then enter a new line and increment rows. This means the next for loop that starts will
        have more iterations before quitting. This results in counter being printed out more times than before,
        creating the staircase.
         */
        int counter = 1;
        int rows = 1;
        while (counter <= 10) {
            for (int i = 0; i < rows; i++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
            rows++;
        }
        System.out.println();
        /*
        This loop should create a stair of 1s and 0s
        1
        01
        101
        0101
        10101
         */

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                if (row % 2 == 0) {
                    if (col % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                } else if (row % 2 != 0) {
                    if (col % 2 == 0) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                }
            }
            System.out.println();
        }
    }
}
