/*
This class prompts user for input, and outputs all even numbers up to that bound and the sum of those odd numbers
and all even numbers up to that bound and the sum of those even numbers
 */

import java.util.Scanner;

public class AddEvenOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        String evenNum = "";            //Stores even counter values to print later
        String oddNum = "";             //Stores odd counter values to print later
        int sumEven = 0;
        int sumOdd = 0;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                evenNum += i + " ";
                sumEven += i;
            } else if (i % 2 != 0) {
                oddNum += i + " ";
                sumOdd += i;
            }
        }
        System.out.println("Even numbers: ");
        System.out.println(evenNum);
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Odd numbers: ");
        System.out.println(oddNum);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}
