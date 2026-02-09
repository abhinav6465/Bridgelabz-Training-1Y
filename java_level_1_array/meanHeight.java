import java.util.Scanner;

public class meanHeight {
    public static void main(String[] args) {

        double[] heights = new double[11];
        double sum = 0.0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        // c. Find the sum of all elements in the array
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // d. Calculate and display the mean height
        double mean = sum / 11;
        System.out.println("\nMean height of the football team = " + mean);

        sc.close();
    }
}
