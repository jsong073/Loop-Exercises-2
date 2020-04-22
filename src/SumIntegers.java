/*
This class will sum all integers between 100 and 200 that are divisible by 9
 */

public class SumIntegers {
    public static void main (String[] args) {
        int sum = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
