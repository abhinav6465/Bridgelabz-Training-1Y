import java.util.Scanner;

public class ques8
 {
    public static void main(String args[])
	{

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countNum: ");
        int countNum = sc.nextInt();

        while (countNum >= 1) {
            System.out.println(countNum);
            countNum--;
        }

        
    }
}
