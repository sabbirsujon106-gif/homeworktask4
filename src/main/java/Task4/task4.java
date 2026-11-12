package Task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        try {
            File file = new File("src/main/java/Task4/duomenys.txt");
            Scanner input = new Scanner(file);

            int n = input.nextInt();

            int previous = input.nextInt();
            int count = 0;

            for (int i = 1; i < n; i++) {
                int current = input.nextInt();

                if (current < previous) {
                    count++;
                }

                previous = current;
            }

            System.out.println(count);

            input.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}