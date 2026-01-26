import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter yearW: ");
        int yearW = sc.nextInt();

          double bonus = 0;

     
        if (yearW > 5) {
     bonus = salary * 0.05;
            System.out.println("You are eligible for a bonus.");
            System.out.println("Bonus: " + bonus);
        } else {
            System.out.println("You are not eligible for a bonus.");
            System.out.println("Bonus " + bonus);
        }

    }
}
