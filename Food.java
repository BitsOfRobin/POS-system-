/**
 * @(#)Food.java
 *
 *
 * @author 
 * @version 1.00 2019/8/5
 */
  import java.util.Scanner;

public class Food extends Product {

    private String category;
    private int portion;

    public Food() {
    }
    
    public Food(String productname,String productid,double productprice,int stockquantity,int portion){
    	super( productname, productid, productprice, stockquantity);
    	this.portion=portion;
    	
    }
    
    
  
     public Food(String productname,String productid,double productprice,int stockquantity,String category){
    	super( productname,productid, productprice, stockquantity);
    	this.category=category;
    	
    }
    	
    	
 
    public int getPortion()
    {
    	
    	return portion;
    	
    }
    
    public String getCategory()
    {
    	
    	return category;
    	
    }
    
    
    public String toString()
    {
    	
    	return String.format("%-20s\t\t\t%-20s",super.toString(),category);
    	
    	
    }
    
    /*
    public static void cuisine(Product[]goods,int option)
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("The food you have chosen is\t"+goods[option].getProductname());
        System.out.println("How many portions or number of person's meal you would like to have?");
         
         int portions=s.nextInt();
         Food f=new Food(goods[option].getProductname(),goods[option].getProductid(),goods[option].getProductprice(),goods[option].getStockquantity(),portions);
         	System.out.println("Product name\t\t Product code \t\t\t\t Product Price\t\t Stock quantity\t\t portions");
         	
         	 //System.out.print(goods[option].toString());
         System.out.println(f.toString());
    
    
    
    
    
    	
    	
    	
    }*/
    
    public static void displayfood(Food food )
    {
    	
    	
    	System.out.println("Product name\t\t Product code \t\t\t\t Product Price\t\t Stock quantity\t\t category");
    	  System.out.println(food.toString());
    
    	
    	
    }
    
    
    public static String typeoffood()
    {
    	Scanner s=new Scanner(System.in);
    	
    		System.out.println("Please enter your choice(number) for category of food,-1 to exit ");
    			System.out.println("1.Western Cuisine");
    			System.out.println("2.Chinese Cuisine");
      
    			System.out.println("3.Asian Cuisine");
    			System.out.println("4.Mid-east Cuisine");
    			System.out.println("5.Fusion Cuisine");
    	
    		int choice=s.nextInt();
    	   while(choice!=-1)
    	      {
    	             	 if(choice==1)
    	          {
    	          	
    	          	return "Western Cuisine";
    	          	
    	          }
    	          
    	             else if(choice==2)
    	          {
    	          		return "Chinese  Cuisine";
    	          	
    	          	
    	          }
    	          
    	              else if(choice==3)
    	          {
    	          	
    	          		return "Asian Cuisine";
    	          	
    	          }
    	          
    	          
    	              else if(choice==4)
    	          {
    	          	
    	          		return "Mid-east Cuisine";
    	          	
    	          }
    	          
    	          
    	              else if(choice==5)
    	          {
    	          	
    	          		return "Fusion Cuisine";
    	          	
    	          }
    	          else
    	          {
    	          	System.out.println("You have keyed in invalid inputs");
    	           
    	          	
    	          }
    	
    	         	System.out.println("Please enter your choice(number) for category of food,-1 to exit ");
    			System.out.println("1.Western Cuisine");
    			System.out.println("2.Chinese Cuisine");
      
    			System.out.println("3.Asian Cuisine");
    			System.out.println("4.Mid-east Cuisine");
    			System.out.println("5.Fusion Cuisine");
    	
    		 choice=s.nextInt();
    	
    	    }
    	         
    	
    	
    	return "";
    	
    	
    	
    	    
    	
    	
    	
    	
    	
    	
    }
      
    
    
}