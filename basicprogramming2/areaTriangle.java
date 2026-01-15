import java.util.Scanner;
class areaTriangle
{
 public static void main(String args[])
 {
	  Scanner sc = new Scanner(System.in);
    System.out.println("Enter base");
	double base=sc.nextDouble();

    
	
	   
    System.out.println("Enter height");
	double height=sc.nextDouble();
       
	   
	   
       
	   
	       
		    double areaTriangleCM = (base*height)/2;
			double areaFoot = areaTriangleCM/30.48;
			double areaInches = areaTriangleCM/2.54;
	 
	      System.out.println("area in Cm is "+areaTriangleCM);
		       System.out.println("area in Foot is "+areaFoot);
		              System.out.println("area in Inches is "+areaInches);
		      
			
			  	     
			  
			  
	} 
	 
 }
