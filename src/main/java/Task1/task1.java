package Task1;

public class task1 {
    public static void main(String[] args) {

        int p = 800;
        int s = 250;
        int m = 75;

        int k = 0;
        int total = s;

        while (total < p) {
            total = total + m;
            k++;
        }

        System.out.println("Laptop price = " + p + " euros");
        System.out.println("Initial savings = " + s + " euros");
        System.out.println("Weekly savings = " + m + " euros");
        System.out.println("Required weeks (k) = " + k);
        System.out.println("Total savings = " + total + " euros");
    }
}