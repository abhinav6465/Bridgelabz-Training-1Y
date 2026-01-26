import java.util.Scanner;
public class ques11 
 {
    public static void main(String args[])
	{

        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter a number  ");
         double number = sc.nextDouble();

           double t = 0.0;
      
       

        while (number != 0  && number > 0) {
            t += number;

            System.out.println("Enter a number ");
            number = sc.nextDouble();
        }

        System.out.println("Total = " +t);

     
    }
}


