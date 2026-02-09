import java.util.Scanner;

class age {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        int[] age = new int[10];

        
        System.out.println("Enter age of 10 students");
        for (int i = 0; i < age.length; i++) {
            age[i] = sc.nextInt();
        }

        
        for (int i = 0; i < age.length; i++) {
            
            if (age[i] >= 18) {
                System.out.println("The student with the age " + age[i] + " can vote.");
            } 
			else if (age[i] < 18) {
                System.out.println("The student with the age " + age[i] + " cannot vote.");
            }
			  else{
                System.out.println("Invalid age");
              }

        }
    }
}
