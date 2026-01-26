import java.util.Scanner;

public class ques6
 {
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amar age ");
        int amarAge = sc.nextInt();

        System.out.print("Enter Akbar age");
        int akbarAge = sc.nextInt();

        System.out.print("Enter Anthony age: ");
        int anthonyAge = sc.nextInt();

     // height
        System.out.print("Enter Amar height: ");
        int amarHeight = sc.nextInt();

        System.out.print("Enter Akbar height: ");
        int akbarHeight = sc.nextInt();

        System.out.print("Enter Anthony height: ");
        int anthonyHeight = sc.nextInt();
          //youngest
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Amar is  youngest .");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Akbar is  youngest ");
        } else {
            System.out.println("Anthony is  youngest ");
        }

        //  tallest
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Amar is tallest");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Akbar is tallest ");
        } else {
            System.out.println("Anthony is  tallest ");
        }

    
    }
}
