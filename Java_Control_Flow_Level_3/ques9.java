 import java.util.Scanner;
class ques9
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("enter a number: ");
		int num  = input.nextInt();
		int sum=0;
		int i =0;
		while(i<=num/2)
		{
			i++;
			if (num%i==0){
				sum+=i;
			}
		}
		System.out.println("the sum of factor "+sum);	
		if (sum>num)
		{
			System.out.println("Abundant_number");
		}
		else
		{
			System.out.println(" not Abundant_number");
		}
		
	}
}