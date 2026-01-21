import java.util.Scanner;
class conversionHeight
{
 public static void main(String args[])
 {
	  Scanner sc = new Scanner(System.in);
    System.out.println("Enter heightinCM");
	int heightinCM=sc.nextInt();

    
	
	   
          double heightinFoot = heightinCM/30.48;
	        double heightinInches = heightinCM/2.54;
	   
       
	   
	       
		   
	 
	      System.out.println("Height in foot is "+heightinFoot);
		      
			  
	      System.out.println("Height in inches is "+heightinInches);
			  
			  
	 
	 
 }

}