/*
This class displays the cube of a user-input number
 */
import java.util.Scanner;

public class Cubes {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        long num = 0l;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        System.out.println("The cube of that number is: " + (num*num*num));
    }
}
