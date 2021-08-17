/**
 * @(#)Product.java
 *
 *
 * @author 
 * @version 1.00 2019/7/19
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Product {
	
	
	
	private String productname;
	private String productid;
	private double productprice;
	private int stockquantity;
	//private static int record=6;
	private static int idno=3;
	private static int bidno=3;
	private char idcaps;
	
    
    public Product() {
    	
    	 	this.productname="";
    		this.productid="";
		this.productprice=0.00;
		this.stockquantity=0;
			//record++;
    }
    
    public Product(String productname,String productid,double productprice,int stockquantity) {
    	
    	this.productname=productname;
    	this.productid=productid;
	 this.productprice=productprice;
	this.stockquantity=stockquantity;
	
    	
    	
    }
    
    
    
        public Product(String productname,double productprice,char caps,int stockquantity) {
    	
    	this.productname=productname;
    	//this.productid=productid;
	 this.productprice=productprice;
	this.stockquantity=stockquantity;
    
    	
    	
    	if(caps=='F')
    		
    		{
    			
    			idno++;
    			    this.idcaps=caps;
    	productid=Character.toString(idcaps)+String.format("%-04d",idno);
    			
    			
    	}
    	
    	
          else if(caps=='D')
           {
          		bidno++;
          		
          		this.idcaps=caps;
          		productid=Character.toString(idcaps)+String.format("%-04d",bidno);
          }
          
          
          
           
    	}
    	

    

    
   

   
   
   
     	public double getProductprice(){
    	
    	return productprice;
    	} 
    	
    	 public String getProductid(){
    	
    	return productid;
    	} 
    
      	 public String getProductname(){
    	
    	return productname;
    	} 
    
          /* public static int getRecord()
           {
           	  return record;
           	
           } */
    
    
    
    
      	 public int getStockquantity(){
    	
    	return stockquantity;
    	} 
    
    public char getIdcaps()
    {
    	
    	return idcaps;
    	
    }
    
    
    public void setProductprice(double productprice)
    {
    	
    	this.productprice=productprice;
    }
    
    
    	 public void setProductname(String productname){
    	
    	this.productname=productname;
    	} 
    		
    		public void setProductid(String productid)
    		{
    			
    			this.productid=productid;
    		}
    		
    		
    		public void setStockquantity(int stockquantity)
    		{
    			
    			this.stockquantity=stockquantity;
    		}
    
    
    //end of getter setter
    
     ///add methods>>>>
     
     
     ///>>>>>
              
               	               
               	  
                        
    
    
    /////////////////////////////////
		    
		    public void productavailability(int found,Product[]goods)
		    	{
		    	
		    
						     		   
						       if(found>=0)
						       	{
						       	  //System.out.println("Product name\t\t Product code \t\t\t\t Product Price\t\t Stock quantity");
						       	   	System.out.println("the stock still have\t"+goods[found].stockquantity+"\t unit/units");
						       }
		        
		        
		    	}
		    
		   
		    
		   
		    
		   
		    	
		   
		    
		    
		    
		    
		    
		    
		    
		    
		  
		    
		    
		    
		    
		     public  void editproduct(int j,Product[]goods)
		     	{
		    	  	    	
                             boolean result=true;
						     		             
						     		          testing t=new testing();   
//						    if(edit.equalsIgnoreCase("yes"))
						    	//{
						    	
											    	Scanner s = new Scanner(System.in);
											    	//s.nextLine();
											    	System.out.println("Edit the price or name? cancel to exit");
											    	String choice=s.nextLine();
											  while(choice.equalsIgnoreCase("cancel")==false)
											  	{
											    		 	
											    	if(choice.equalsIgnoreCase("name"))
											    		{
											    		
											    		  System.out.println("please enter the name you would like to have?");
											    		
											    	    goods[j].productname=s.nextLine();
											    	    checkletter(goods[j].productname);
											    	    while(checkletter(goods[j].productname)==false)
											    	    {
												    	    	 System.out.println("please enter the name you would like to have?");
												    		
												    	    goods[j].productname=s.nextLine();
												    	    checkletter(goods[j].productname);
											    	    }
											          
											    		System.out.println("the new name is\t\t"+goods[j].productname);
											    	      t.displayproduct();
											    		
											    		
											    		}
											    	    
											    		else if(choice.equalsIgnoreCase("price"))
											    			{
											    	
											    	
											    	/*
											    		  System.out.println("please enter the price you would like to have?");
											    	
											    	    goods[j].productprice=s.nextDouble();
											    	    //checkdigit(goods[j].productprice);*/
											          do
											           {
											           	
											           	           try
											           	       
											                       {
										               	                        	 System.out.println("please enter the price you would like to have?");
										               	                        goods[j].productprice=s.nextDouble();
										               	                        if( goods[j].productprice>0)
										               	                        {
										               	                        	result=false;
										               	                        	
										               	                        }
										               	                       else
										               	                       {
										               	                       	System.out.println("Your input is negative value");
										               	                       	
										               	                       }
										               	                        	
								               	                        }
											           	
											           	            catch(Exception e)
											           	            {
											           	            	System.out.println("Your inputs contain non digits");
											           	            	s.nextLine();
											           	            	//System.out.println("Enter your new product price");
										               	                        //goods[j].productprice=s.nextDouble();
											           	            	
											           	            	
											           	            }
											           	
											           	
											           	
											           	
											           	
											           	
											           	
											           } while(result);
											           	
											           	
											           	
											           	
											           	
											           	
											           	
											           	
											           	
											           	
											           	
											           	
											    		System.out.println("the new price is\t\t"+goods[j].productname);
											    	      t.displayproduct();
											    		}
											    	
											    	else if(choice.equalsIgnoreCase("name")==false &&choice.equalsIgnoreCase("price")==false)
											    		{
											    		
											    		 System.out.println("Invalid inputs");
											    		 
											    		 	//System.out.println("Edit the price or name? cancel to exit");
											              //choice=s.nextLine();
											               }
											               
											               s.nextLine();
											               System.out.println("Edit the price or name? cancel to exit");
										                  choice=s.nextLine();
											    		 	
											    		 }
						    		 
						    	//}
						    	       /*
						    else if(edit.equalsIgnoreCase("cancel")==false) 
						    	       	{
							    		 System.out.println("invalid inputs ");
									            }
									         */   
					            
					            
					            
					       
		    }
		    
		      
		      ////////////////////////////////////////
		      public String toString()
		      	{
		                return String.format("%-20s \t\t\t%-20s \t\t%.2f\t\t\t\t%-8d ",productname,productid,productprice,stockquantity);
		                 }
		        
		        
		        
		  /////////////////////////////////////
		        public static boolean checkletter(String option)
		        	{
		        	               
		        	
		                              Scanner s=new Scanner(System.in);
						        	
						        	for(int i=0;i<option.length();i++)
						        		{
						        		
										        		if(Character.isDigit(option.charAt(i)))
										        			{
										        				
										        			  System.out.println("inputs contain non character ");
										        			  		        		
										        			   
										        			 	      		return false;
										        			
										        		     }
						        		
								           	
								
						            }
						             return true;
		        	
		        	
		        }
		        
		        
         /////////////////////////////////////////
        
        public  int typeofproduct(Product[]goods,int option)
			  {
			  	   //String id=super.getProductid();
			  	      
			  	      
			  	  
			        	//for(int i=0;i<goods.length;i++)
			        	//{
			        		
			        		
							        if(goods[option].productid.charAt(0)=='F')
							        	{
							        		
							        		
							        	
							        			System.out.println(goods[option].productname);
							        		return 1;
							        		
							        		
							        		
							        		
							        	}
							        	
							     else if(goods[option].productid.charAt(0)=='D')
							        	{
							        		
							        		
							        	
							        			System.out.println(goods[option].productname);
							        		return 2;
							        		
							        		
							        		
							        		
							        	}
			        		
			        		
			        		
			        		
			        		
			        		
			        	//}
        
        	
        	
        	
        	   return 0;
        	
        	
        	
        }
        
     
        public static boolean checkdigit(String option)
		        	{
		        	
		        	
		                             
						        	for(int i=0;i<option.length();i++)
						        		{
						        		
										        		if(Character.isDigit(option.charAt(i))==false)
										        			{
										        			  System.out.println("inputs contain non digits ");
										        			  		        		
										        			         
										        			 	      		return false;
										        			
										        		     }
						        		
								           	
								
						            }
						             return true;
		        	
		        	
		        }
		        
		        
		        
		       
		        	
		       

        
              
}