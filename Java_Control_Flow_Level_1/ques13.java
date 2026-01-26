import java.util.Scanner;

public class ques13
 {
    public static void main(String args[]) 
	{

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("not valid ");
        }
        else {
             int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;

            }
   
        
 
            int sumF = n * (n + 1) / 2;
            System.out.println("Sum by for loop = " + sumFor);
            System.out.println("Sum by formula   = " + sumF);

         
            if (sumFor == sumF) {
                System.out.println("Both results are correct and equal.");
            } else {
                System.out.println("Results are not equal.");
            }
        }

    }
}
