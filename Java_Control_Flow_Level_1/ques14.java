import java.util.Scanner;

public class ques14 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive numb ");
        int numb = sc.nextInt();

        if (numb < 0) {
            System.out.println(" invalid ");
        } else {

            int factorial = 1;
            int i = 1;

            while (i <= numb) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial of number is "+factorial);
        }

        
    }
}
