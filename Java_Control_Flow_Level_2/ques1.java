import java.util.Scanner;

public class ques1
 {
    public static void main(String[] args)
	{

        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter numb ");
        int numb = sc.nextInt();

        if (numb <= 0) {
            System.out.println("invalid");
        }
		else {
            
            for (int i = 1; i <= numb; i++)				{
                if (i % 2 == 0) {
                    System.out.println(i + " is even ");
                } else {
                    System.out.println(i + " is  odd");
                }
            }
        }

        
    }
}