import java.util.Scanner;

public class ques13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("invalid");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            int i = 100;

            while (i >= 1) {
                if (i % number == 0) {
                    System.out.println(i);
                }
                i--;
            }
        }

        sc.close();
    }
}
