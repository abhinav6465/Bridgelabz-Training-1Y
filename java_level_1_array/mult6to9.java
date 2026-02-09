import java.util.Scanner;

class mult6to9
{
    public static void main(String[] args) 
	{

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] table = new int[4];
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            table[index] = num * i;
            index++;
        }

     
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + table[index]);
            index++;
        }

        
    }
}
