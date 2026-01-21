import java.util.Scanner;
class volofearth
{
 public static void main(String args[])
 {
	  Scanner sc = new Scanner(System.in);
    System.out.println("Enter radofearth");
	double radofearth=sc.nextDouble();

    
	
         double pi = 3.14;
       
	   
	   
       
	   
	   double volkm3 = (4/3)*pi*radofearth*radofearth*radofearth;
	   double volm3 = volkm3/4.168;
	 
	      System.out.println("Volume of earth in km3 is "+volkm3);
		  System.out.println("Volume of earth in m3 is "+volm3);
		  
		      
			  
			  
			  
	 
	 
 }

}