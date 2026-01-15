import java.util.Scanner;
class university
{
 public static void main(String args[])
 {
	  Scanner sc = new Scanner(System.in);
    System.out.println("Enter fees");
	int fees=sc.nextInt();

    
	
	   
    System.out.println("Enter disPercentage ");
	int  disPercentage=sc.nextInt();
       
	   
	   
       
	   
	       
		    int discfees = fees-(fees*disPercentage)/100;
	 
	      System.out.println("discounted fees is "+discfees);
		      
			  
			  
			  
	 
	 
 }

}