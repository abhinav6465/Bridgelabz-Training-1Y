import java.util.Scanner;

public class ques12
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number ");
        int number = sc.nextInt();

        System.out.print("Enter power");
        int power = sc.nextInt();

        if (number < 0 || power < 0) {
            System.out.println("invalid");
        } else {
            int result = 1;
            for (int i = 1; i <= power; i++) {
               result*=number;
            }

            System.out.println("the power of result is " +result);
        }

      
    }
}
