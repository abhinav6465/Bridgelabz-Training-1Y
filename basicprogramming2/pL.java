import java.util.Scanner;
class pL
{
 public static void main(String args[])
 {
	  Scanner sc = new Scanner(System.in);
    System.out.println("Enter costPrice");
	int costPrice=sc.nextInt();

    
	
	   
    System.out.println("Enter sellPrice ");
	int sellPrice=sc.nextInt();
       
	   
	   
       
	   
	       
		    int profit = sellPrice-costPrice;
	 
	      System.out.println("Profit is "+profit);
		      
			  int profitprct = (profit*100)/costPrice;
			  	      System.out.println("Profitpercentage  is "+profitprct);
			  
			  
			  
	 
	 
 }

}