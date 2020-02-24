package GroceryDiscountPart2;

import java.util.Scanner;

public class GroceryDiscountPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double Discount;
		final double couponDiscount1 = 0.08;
	    final double couponDiscount2 = 0.10;
	    final double couponDiscount3 = 0.12;
	    final double couponDiscount4 = 0.14;
	    double groceryPrice;
	    
	    
	   
	   
	    
	    	
	    System.out.println("Enter cost of groceries or 0 to quit ");
	    while (sc.hasNextDouble()) 
	    { 
	    	
	    groceryPrice = sc.nextDouble();
	    	
	    
	    
	    
	   
	    if( groceryPrice ==0) { break; }
	    
	    
	    if( groceryPrice <10 || groceryPrice >1000 )
	    {System.out.println("Error not in range"); }
	    
	    else if (groceryPrice >210)
	    
	    	{    
	    		Discount = groceryPrice * couponDiscount4;
	    		System.out.println("you win a discount of $" + Discount + "(" + couponDiscount4 * 100 + "% of your purchase)");
	    	}
	    	else if (groceryPrice >150 && groceryPrice <=210)
	    	{
	    		Discount = groceryPrice * couponDiscount3;
	    		System.out.println("you win a discount of $" + Discount + "(" + couponDiscount3 * 100 + "% of your purchase)"); 
	    	}
	    	else if (groceryPrice >60 && groceryPrice <=150)
	    	{
	    		Discount = groceryPrice * couponDiscount2;
	    		System.out.println("you win a discount of $" + Discount + "(" + couponDiscount2 * 100 + "% of your purchase)");
	    	}
	    	else if (groceryPrice >=10 && groceryPrice <=60)
	    	{
	    		Discount = groceryPrice * couponDiscount1;
	    		System.out.println("you win a discount of $" + Discount + "(" + couponDiscount1 * 100 + "% of your purchase)");
	    	}
	        
	    	else 
	    	{
	    		System.out.println("You aren't eligible for a coupon this time ");
	    }
	    }
	    
	    	
	    
	    
	    }
					

	


	

	}
