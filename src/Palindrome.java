/*
This class will prompt user for input and tell them if the number is a palindrome
1. Ask user for input
2. Turn integer into a String
3. Create a for loop and a counter, one for counting from the front, the other from the back
4. At each iteration of the loop, compare the value of the front position with the value from the back position using
    .equals and charAt()
    a. If they are not the same, isPalindrome increments by 1.
5. IF isPalindrome is greater than 1 THEN
    Print "it's not a palindrome"
   ELSE
    Print "it's a palindrome"
   ENDIF
 */
import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Integer num = new Integer(0);
        String palindrome = "";
        int isPalindrome = 0;
        int counter = 0;

        System.out.print("Enter a number and I will tell you if it's a palindrome: ");
        num = input.nextInt();
        palindrome = num.toString();
        counter = palindrome.length() - 1;

        for (int i = 0; i < palindrome.length()/2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(counter)) {
                isPalindrome += 1;
            }
            counter--;
        }

        if (isPalindrome > 0) {
            System.out.println("It's not a palindrome.");
        } else {
            System.out.println("It's a palindrome.");
        }
        System.out.println("Goodbye.");
        input.close();
    }
}
