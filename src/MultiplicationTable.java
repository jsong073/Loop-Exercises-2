/*
This class prompts user for input and displays the multiplication table for that number up to 10
 */

import java.util.Scanner;

public class MultiplicationTable {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println("" + i + " x " + num + " = " + (num*i));
        }
        System.out.println("Goodbye.");
        input.close();
    }
}
