import java.util.*;
class ques6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int n = sc.nextInt();
		int count =0;
		int temp =n;
		while (temp!=0)
		{
			count++;
			temp = temp/10;
		}
		System.out.println("the number of digit is: "+count);
	}
}