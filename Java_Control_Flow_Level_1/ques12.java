import java.util.Scanner;

public class ques12 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("not valid ");
        }
        else {
            int sumW= 0;
            int i=0;
            while (i <= n) {
                sumW += i;
                i++;
            }
   
        
 
            int sumF = n * (n + 1) / 2;
            System.out.println("Sum by while loop = " + sumW);
            System.out.println("Sum by formula   = " + sumF);

         
            if (sumW == sumF) {
                System.out.println("Both results are equal.");
            } else {
                System.out.println("Results are not equal.");
            }
        }

    }
}
