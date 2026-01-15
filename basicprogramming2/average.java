import java.util.Scanner;
class average
{
 public static void main(String args[])
 {
	  Scanner sc = new Scanner(System.in);
    System.out.println("Enter phymarks");
	int phyMarks=sc.nextInt();

    
	
	   
    System.out.println("Enter chemMarks ");
	int chemMarks=sc.nextInt();
       
	   
	   System.out.println("Enter mathsMarks ");
	int mathsMarks=sc.nextInt();
       
	   
	       
		    int avg = (phyMarks+chemMarks+mathsMarks)/3;
	 
	      System.out.println("Average is "+avg);
	 
	 
 }

}
