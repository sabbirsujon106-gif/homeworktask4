package Task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;
        int number;

        System.out.println("Enter numbers (0 to stop):");

        while (true) {
            number = input.nextInt();

            if (number == 0) {
                break;
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

        input.close();
    }
}