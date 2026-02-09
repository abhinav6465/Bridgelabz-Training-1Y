import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter a  number ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("invalid");
			return;
        }
		//int result = 0;
		String arr[] = new String[num];
		for(int i = 0;i <= num ; i++){
                if (i % 3 == 0 && i % 5 == 0) {
                   System.out.println("FIzzBuzz");
                } 
				else if (i % 3 == 0) {
                     System.out.println("Buzz");
                }
				else if (i % 5 == 0) {
                  System.out.println("FIzz");
                }
				else {
                  System.out.println("invalid");
                }
            }
        }
}
