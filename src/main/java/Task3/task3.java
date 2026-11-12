package Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        try {
            File file = new File("src/main/java/Task3/data.txt");
            Scanner input = new Scanner(file);

            int n = input.nextInt();
            int negativeCount = 0;

            for (int i = 0; i < n; i++) {
                int temperature = input.nextInt();

                if (temperature < 0) {
                    negativeCount++;
                }
            }

            if (negativeCount == 0) {
                System.out.println("No negative temperatures recorded");
            } else {
                System.out.println("Number of days with negative temperatures: "
                        + negativeCount);
            }

            input.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}