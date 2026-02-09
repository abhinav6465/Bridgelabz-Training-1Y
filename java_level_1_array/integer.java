import java.util.Scanner;

class integer
 {
    public static void main(String[] args)
	{

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        System.out.println("Enter 5 numbers");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }


        for (int i = 0; i < num.length; i++) {

            if (num[i] > 0) {
                if (num[i] % 2 == 0) {
                    System.out.println(num[i] + " is a positive even number.");
                } 
				else {
                    System.out.println(num[i] + " is a positive odd number.");
                }
            }
			else if (num[i] < 0) {
                System.out.println(num[i] + " is a negative number.");
            } else {
                System.out.println(num[i] + " is zero.");
            }
        }

    
        int first = num[0];
        int last = num[num.length - 1];

       
         if (first == last) {
            System.out.println("First and last are equal.");
        } else if (first > last) {
            System.out.println("First is greater than the last");
        } else {
            System.out.println("First is less than the last");
        }

       
    }
}
