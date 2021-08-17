/**
 * @(#)Drinks.java
 *
 *
 * @author 
 * @version 1.00 2019/8/9
 */

import java.util.Scanner;
public class Drinks extends Product {


    private String sugar;
    
    public Drinks() {
    }
    
    public Drinks(String productname,String productid,double productprice,int stockquantity,String sugar){
    	super(productname,productid, productprice, stockquantity);
    	this.sugar=sugar;
    	
    }
    
    
    public String getSugar()
    {
    	
    	return sugar;
    	
    }
    
    
    public String toString()
    {
    	
    	return String.format("%-20s\t\t\t%-20s",super.toString(),sugar);
    	
    	
    }
    
    
    
    
      public static void displaydrink(Drinks drink)
    {
    	
    	
    	System.out.println("Product name\t\t Product code \t\t\t\t Product Price\t\t Stock quantity\t\t sugar contents");
    	  System.out.println(drink.toString());
    
    	
    	
    }
    
    
    
      public static String typeofdrink()
    {
    	Scanner s=new Scanner(System.in);
    	
    		System.out.println("Please enter your choice(number) for sugar content of drink,-1 to exit ");
    			System.out.println("1.Most sugar");
    			System.out.println("2.More sugar");
      
    			System.out.println("3.Medium sugar");
    			System.out.println("4.normal sugar");
    			System.out.println("5.less sugar");
    	
    		int choice=s.nextInt();
    	     while(choice!=-1)
    	     {
    	     	
    	     	
    	     	   if(choice==1)
    	          {
    	          	
    	          	return "Most sugar";
    	          	
    	          }
    	          
    	             else if(choice==2)
    	          {
    	          		return "More sugar";
    	          	
    	          	
    	          }
    	          
    	              else if(choice==3)
    	          {
    	          	
    	          		return "Medium sugar";
    	          	
    	          }
    	          
    	          
    	              else if(choice==4)
    	          {
    	          	
    	          		return "normal sugar";
    	          	
    	          }
    	          
    	          
    	              else if(choice==5)
    	          {
    	          	
    	          		return "less sugar";
    	          	
    	          }
    	          
    	           else
    	          {
    	          	System.out.println("You have keyed in invalid inputs");
    	           
    	          	
    	          }
    	
    	     	
    	     	System.out.println("Please enter your choice(number) for sugar content of drink,-1 to exit ");
    			System.out.println("1.Most sugar");
    			System.out.println("2.More sugar");
      
    			System.out.println("3.Medium sugar");
    			System.out.println("4.normal sugar");
    			System.out.println("5.less sugar");
    	
    		 choice=s.nextInt();
    	     	
    	     	
    	     	
    	     } 	
    	     	
    	     	
    	       
    	 
    	
    	
    	return "";
    	
    	
    	
    	    
    	
    	
    	
    	
    	
    	
    }
    
    
    
    
    
    
    
}