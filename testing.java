/**
 *
 * @(#)testing.java
 *
 *
 * @author
 * @version 1.00 2019/7/19
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class testing {

    public testing() {
    }


     static int record=6;


     static Product[] goods=new Product[99];







    public static void main(String[]args){



     //Product[] product={

    	goods[0]=new Food("Tiramisu","F1",15.00,50,"Western Cuisine");
    		goods[1]=new Food("fish and chips","F2",17.00,40,"western cuisine");
    		goods[2]=new Food("Basbousa","F3",16.00,30,"mid-east cuisine");
    		goods[3]=new Drinks("Fracpacino","D1",14.50,80,"most sugar");
    		goods[4]=new Drinks("Green tea latte","D2",13.50,90,"more sugar");
    		goods[5]=new Drinks("Avocado shake","D3",16.50,100,"normal sugar");
    //};
    	/*
    	type[0]=new Food("Cake");
        	type[1]=new Food("Western Cuisine");
        	type[2]=new Food("Chinese Cuisine");
        	type[3]=new Food("Asian Cuisine");
    	 	type[4]=new Food("Mid-east Cuisine");
    	  	type[5]=new Food("Fusion Cuisine");

    */



     // goods=Arrays.copyOf(product,record);

      Product test=new Product();
      //testing driver=new testing();
  Scanner s = new Scanner(System.in);


    	///start of add product



                int choice=0;

                  boolean result=true;
    			System.out.println("\n\n1.Search the product");
    			System.out.println("2.add the product");
    			System.out.println("3.edit the product");
    			System.out.println("4.display the product");
    			System.out.println("5.check  the product availability");
    				System.out.println("6.add stock");
    		
                                                                       do    
								               	                        {

								               	                        	         try
												               	                        {
																               	               System.out.println("Please enter your choice for operation about product,-1 to exit ");
    		                                                                                   choice=s.nextInt();
    			
														               	                        result=false;
												               	                        }
								               	                                  catch(Exception e)
								               	                                  {



																               	                        	 	System.out.println("your input is non digit");
																               	                        	 	//System.out.println("Enter your new product price");
														               	                        s.nextLine();





								               	                                  }



								               	                        } while(result);

    		
    	while(choice!=-1)

    	{
    		  //System.out.println(record);
    		if(choice==1)
    		{


										s.nextLine();
						 System.out.println("Enter the name of product,cancel to exit");
			            String searchname=s.nextLine();



						 int foundproduct=searchproduct( searchname);




												    //end of search methods

	           }

    		else if(choice==2)
    		{                             
    			                           /*
						    				s.nextLine();


						    		 System.out.println("add product? yes to enter, cancel to exit");
							   String add=s.nextLine();


							       while(add.equalsIgnoreCase("cancel")==false){


							       	if(add.equalsIgnoreCase("yes")){*/

							           //System.out.println("search the record ? yes to enter,  cancel to exit");
							              //String repeat=s.nextLine();

						    	         //if(repeat.equalsIgnoreCase("yes")){




						    	         	 	addproduct();
						    	         	 	 //int foundproduct=searchproduct(searchvalue,goods);

						    	             //}


						    	         	  // else if(repeat.equalsIgnoreCase("cancel")==false) {



						    	         	// int foundproduct=searchproduct(goods,record);

						    	         	// driver.addproduct(foundproduct,goods,record);

								               //}
						    	         	//}
							              //else
							              //{

							              	//System.out.println("invalid inputs");

							              //}


									   		   //System.out.println("add product?  yes to enter,enter cancel to exit");
								//add=s.nextLine();

							  	    //}






    		}

    		else if(choice==3)
    		{

					    	//edit method

                            /*
						    s.nextLine();

						   System.out.println("Edit the record? yes to enter, enter cancel to exit");
						   String edit=s.nextLine();

					    boolean truth=test.checkletter(edit);


						       while(edit.equalsIgnoreCase("cancel")==false)

						       	{*/



						       	 //int foundproduct;
						       	 /*
						       	if(edit.equalsIgnoreCase("yes")){
                                     
						            System.out.println("search the record ? yes to enter, enter cancel to exit");
						             String repeat=s.nextLine();
						             boolean real=test.checkletter(repeat);
					    	         if(repeat.equalsIgnoreCase("yes"))
					    	         	{*/
					    	         	s.nextLine();
					    	         		 System.out.println("Enter the name of product,cancel to exit");
			                               String searchname=s.nextLine();
			                               Product.checkletter(searchname);
					    	         	   int foundproduct=searchproduct(searchname);
					    	         	 if(foundproduct>=0)
					    	         	 	{

					    	         	 	  test.editproduct(foundproduct,goods);
					    	         	 	  //goods[foundproduct].getCategory()=Food.typeoffood();
					    	         	    }


					    	         //}


						            	/*
							               else if(repeat.equalsIgnoreCase("cancel")==false)
							               	 {
												     	 foundproduct=Product.searchproduct(repeat);
												   if(foundproduct>=0){

					    	         	 	  test.editproduct(edit,foundproduct, product);
					    	                             }
											}*/


						       	   // }




                                     /*
								    System.out.println("Edit the record?  yes to enter,enter cancel to exit");
									edit=s.nextLine();
										 Product.checkletter(edit);
                                     */
						        //}


						    //end of edit method

    		}
    		else if(choice==4)
    		{
		    			  //display methods


			    displayproduct();
		    	//end of display methods

    		}


    		else if(choice==5)
    		{
							    	 s.nextLine();
							    	// start of productavailability
                                       /*
							    	 System.out.println("check item availability?  yes to enter,enter cancel to exit");
								   String itemavailable=s.nextLine();



								       while(itemavailable.equalsIgnoreCase("cancel")==false){


								       	if(itemavailable.equalsIgnoreCase("yes")){
                                              */
								           //System.out.println("search the record ? yes to enter, enter cancel to exit");
								             //String repeat=s.nextLine();
								             	 //System.out.println("Enter the name of product,cancel to exit");
			                                       // String searchname=s.nextLine();
								              //int foundproduct=searchproduct(searchname);
							    	         //if(repeat.equalsIgnoreCase("yes")){


							    	         	System.out.println("Enter the name of product,cancel to exit");
			                                       String searchname=s.nextLine();
								                 int foundproduct=searchproduct(searchname);
							    	         	 //foundproduct =searchproduct(searchname);
							    	         	  test.productavailability(foundproduct,goods);

							    	         //}





								       	    //}






										      /*       //test.editproduct(edit,foundproduct);
										    System.out.println("check item availability?  yes to enter,enter cancel to exit");
										 itemavailable=s.nextLine();
												 //truth=test.checkletter(edit);

								        }*/

							    	// end of stockavailability



    		}
    	
    	
    		else if(choice==6)
    			
    		{      /*
    			 s.nextLine();
                   	System.out.println("Any stock to add??,cancel to exit");
		        	String response=s.nextLine();
		        	while(response.equalsIgnoreCase("cancel")==false)
		        	{
		        		
		        		if(response.equalsIgnoreCase("yes"))
		        		{
		        			*/
		        			 addstock();
		        			
		        			/*
		        		}
		        		
		        		
		        		 else
					       {

							System.out.println("invalid inputs");

						    }
		        		
		        		
		        		
                   	System.out.println("Any stock return??,cancel to exit");
		             response=s.nextLine();
		        		
		        		
		        	}*/
		        	

    		}
    		
    		else
    		{
    			
    			
    				System.out.println("your choice is invalid");
    			
    		}

    			System.out.println("\n\n1.Search the product");
    			System.out.println("2.add the product");
    			System.out.println("3.edit the product");
    			System.out.println("4.display the product");
    			System.out.println("5.check  the product availability");
    				System.out.println("6.return stock");
    		                                                          do   
								               	                        {

								               	                        	         try
												               	                        {
																               	               System.out.println("Please enter your choice for operation about product,-1 to exit ");
    		                                                                                    choice=s.nextInt();
    			
														               	                        result=false;
												               	                        }
								               	                                  catch(Exception e)
								               	                                  {



																               	                        	 	System.out.println("your input is non digit");
																               	                        	 	//System.out.println("Enter your new product price");
														               	                        s.nextLine();





								               	                                  }



								               	                        } while(result);
    	
    	
    	
    	}







    }
































    //static int record=6;
    static int idno=4;
    static int bidno=4;
     public static void addproduct()
               	{
               			//int record=6;

               		ArrayList<Product>item=new ArrayList<Product>(record);


                         /*
               		 	 item.add(goods[0]);
               		 	 item.add(goods[1]);
               		 	  item.add(goods[2]);
               		 	   item.add(goods[3]);
               		 	    item.add(goods[4]);
               		 	     item.add(goods[5]);
                            */
                             for(int i=0;i<record;i++)
                             {
                             	
                             	
                             	item.add(goods[i]);
                             }



               		Scanner s=new Scanner(System.in);
               		/*
               	                    if(found>=0)
               	                     	{
               	                            System.out.println("The record is present");
               	                         }
               	                     */
	                                 int newstockquantity=0;
               	                      double newprice=0.00;
               	                          System.out.println("add new food or drinks (cancel to exit)");
               	                          String caps=s.nextLine();
               	                          while(caps.equalsIgnoreCase("cancel")==false)
               	                          	{
               	                              	if(caps.equalsIgnoreCase("food"))
               	                              		{

								               	                         //ArrayList<Product>item=new ArrayList<Product>(record);
								               	                        //record++;



								               	                   System.out.println("Enter your new product name");

								               	              String newname=s.nextLine();

						               	                   while(Product.checkletter(newname)==false)
											    	    {
												    	    	 System.out.println("Enter your new product name");

												    	    newname=s.nextLine();
												    	    Product.checkletter(newname);
											    	    }
						               	              int found=searchproduct(newname);

						               	                     	while(found>=0){



						               	                     		System.out.println("Product is present in the record");
						               	                     	      System.out.println("Enter your new product name");

																	    	    newname=s.nextLine();

						               	                     	     while(Product.checkletter(newname)==false)
																    	    {

						               	                               System.out.println("Enter your new product name");

																	    	    newname=s.nextLine();
																	    	    Product.checkletter(newname);
																    	    }

						               	                     		       found=searchproduct(newname);
						               	                     		 }





						               	                        boolean result=true;
						               	                        //double newprice;
						               	                       do
								               	                        {

								               	                        	 try
												               	                        {
																               	                        	 	System.out.println("Enter your new product price");
														               	                        newprice=s.nextDouble();
														               	                        if(newprice<0)
														               	                        {
														               	                           System.out.println("Your input is negative value");
														               	                        	
														               	                        }
														               	                        else
														               	                        {
														               	                        		result=false;
														               	                        }
														               	                        
												               	                        }
								               	                                  catch(Exception e)
								               	                                  {



																               	                        	 	System.out.println("your input is non digit");
																               	                        	 	//System.out.println("Enter your new product price");
														               	                        s.nextLine();





								               	                                  }



								               	                        } while(result);
                                                                 
                                                                 boolean negative=true;
						               	                         do
						               	                          {



						               	                          	try
								               	                        {
										               	                        	System.out.println("Enter your new product stockquntity");
										               	                        newstockquantity=s.nextInt();
										               	                        if(newstockquantity<0)
										               	                        {
										               	                        	System.out.println("Your input is negative value");
										               	                        	 
										               	                        	
										               	                        }
										               	                        else
										               	                        {
										               	                        	negative=false;
										               	                        	
										               	                        }
										               	                       


								               	                        }
								               	                        catch(Exception e)
								               	                        {
								               	                        			System.out.println("your input is non digit");
								               	                        		s.nextLine();

								               	                        }







						               	                          } while(negative);

						               	                      	 //goods[record-1]=new Product(newname,newprice,"F",newstockquantity );
						               	                      	    record++;
						               	                      	    item.ensureCapacity(record);
						               	                      	      //s.nextLine();
						               	                      	       String category=Food.typeoffood();
						               	                      	      	//Product.checkletter(category);
						               	                      	      	 //int idno=4;
						               	                      	      	String alpha="F";
						               	                      	      	String id=alpha+idno;
						               	                      	      	//Product[] addfood=new Product[record];
						               	                      	      		goods[record-1]=new Food(newname,id,newprice,newstockquantity,category);
						               	                      	         //addfood.toString();
						               	                      	         item.add(goods[record-1]);
						               	                      	      goods = item.toArray(goods);
						               	                      	        //displayproduct();
						               	                      	         idno++;
			               	                      }



			               	                      else if(caps.equalsIgnoreCase("drinks"))
			               	                      	{





								               	                   System.out.println("Enter your new product name");

								               	              String newname=s.nextLine();

						               	                   while(Product.checkletter(newname)==false)
											    	    {
												    	    	 System.out.println("Enter your new product name");

												    	    newname=s.nextLine();
												    	    Product.checkletter(newname);
											    	    }
						               	              int found=searchproduct(newname);

						               	                     	while(found>=0){



						               	                     		System.out.println("Product is present in the record");
						               	                     	      System.out.println("Enter your new product name");

																	    	    newname=s.nextLine();

						               	                     	     while(Product.checkletter(newname)==false)
																    	    {

						               	                               System.out.println("Enter your new product name");

																	    	    newname=s.nextLine();
																	    	    Product.checkletter(newname);
																    	    }

						               	                     		       found=searchproduct(newname);
						               	                     		 }




						               	                     	       boolean result=true;


								               	                       do
								               	                        {         try
												               	                        {
																               	                        	 	System.out.println("Enter your new product price");
														               	                         newprice=s.nextDouble();
														               	                         if(newprice>0)
														               	                         {
														               	                         	
														               	                         	result=false;
														               	                         }
														               	                        
												               	                        }
								               	                                  catch(Exception e)
								               	                                  {


								               	                                  		System.out.println("your input is non digit");
								               	                                  		s.nextLine();



								               	                                  }



								               	                        } while(result);
								               	                        //System.out.println("Enter your new stock quantity");
								               	                   ///int newstockquantity=s.nextInt();
								               	                    //Product.checkdigit(newstockquantity);
								               	                    //int newstockquantity;
								               	                     boolean negative=true;
								               	                       do
								               	                        {        try
											               	                        {
														               	                        	 	System.out.println("Enter your new product stock quantity");
													               	                       newstockquantity=s.nextInt();
													               	                       if(newstockquantity>0)
													               	                       {
													               	                       	 negative=false;
													               	                       	
													               	                       }
													               	                      
											               	                        }
										               	                       catch(Exception e)
										               	                       {


										               	                      	System.out.println("your input is non digit");
										               	                          s.nextLine();
										               	                       }

								               	                        }   while(negative);
								               	                    //goods[record-1]=new Product(newname,newprice,"D",newstockquantity );
								               	                      	 //item.productname.add(newname);
								               	                      	 // item.add(goods[record-1]);
								               	                      	//item.productprice.add(newprice);
								               	                      	 //item.stockquantity.add(newstockquantity);


								               	                      	 	//item.CopyTo(goods);


								               	                       record++;
								               	                         //ArrayList<Product>item=new ArrayList<Product>(record);
								               	                        //record++;
								               	                     item.ensureCapacity(record);

								               	                  String sweet=Drinks.typeofdrink();

						               	                      	      	String alpha="D";
						               	                      	      	String id=alpha+bidno;

						               	                      	         	goods[record-1]=new Drinks(newname,id,newprice,newstockquantity,sweet);
						               	                      	         	//goods[record-1]=new Food(newname,id,newprice,newstockquantity,category);
						               	                      	         //addfood.toString();
						               	                      	         item.add(goods[record-1]);
						               	                      	      goods = item.toArray(goods);

						               	                      	         bidno++;

			               	                      }


                                                 
			               	                      else if(caps.equalsIgnoreCase("food")==false&&caps.equalsIgnoreCase("drinks")==false)
			               	                      {
			               	                      	 //
			               	                      	System.out.println("you have keyed in wrong inputs");

			               	                      }
                                                    
                                                    
                                                    s.nextLine();
               	                              	 displayproduct();
               	                              	 System.out.println("add new food or drinks cancel to exit");
               	                                 caps=s.nextLine();

               	                             }

               	                       //System.out.println(record);
               	                      //displayproduct();



                                }








               	       ///end of add method<<<<<
               	       ///<<<<


     //////////////////////////////////////////

		      public static int searchproduct(String searchname)
		      	{
		      		//String productname=test.getProductname();
		      		//String productid=test.getProductid();

				   	  	  	//goods=Arrays.copyOf(product,Product.record);
		             	 	//goods=Arrays.copyOf(product,product.length);

					    	//System.out.println(record);
					     int k=0,d=-1;

					    //	if(repeat.equalsIgnoreCase("yes"))
					    		//{

											    	 Scanner s = new Scanner(System.in);
											    	 /*
					    	 System.out.println("Search the id or name?");
											    	 String option=s.nextLine();

											          if(option.equalsIgnoreCase("name"))*/



											    	                          //s.nextLine();

															          	 if(searchname.equalsIgnoreCase("cancel")==false)
															          	 	{


																			    	for(int i=0;i<record;i++)
																			    		{


																						    		if(searchname.equalsIgnoreCase(goods[i].getProductname()))
																						    			{
																						    				 System.out.println("record is  present in the record ");
																						    				 	System.out.println("Product name\t\t\t\tProduct code \t\t\t Product Price\t\t Stock quantity\t\tCategory or sugar content");
																									    			System.out.println(goods[i].toString());
																									    		   k=i;
																									    		   d++;
																									    		return k;
																						    				}

																	                                 else
																	                                 {

																	                                 	d--;

																	                                 }

																	                       }


																	              if(d<0)
																		                 {
																		                 	System.out.println("record is not present in the record ");
																		                 	return d;
																		                 }

															          	 	}



														                   //System.out.println("Enter the name of product,cancel to exit");
																     //searchname=s.nextLine();






									                         /*
										                  else if(option.equalsIgnoreCase("id"))
										                  	{
														                  	System.out.println("enter the id of product");
																              String searchid=s.nextLine();
											                                for(int i=0;i<record;i++)
											                                	{


																			    		if(searchid.equalsIgnoreCase(goods[i].getProductid()))
																			    			{

																						    			System.out.println("Product name\t\t Product code \t\t\t\t Product Price\t\t Stock quantity");
																						    			System.out.println(goods[i].toString());
																						    		   k=i;
																						    		   b++;

																						    			return k;
																			                    }
														    		        }

														                   	if(b==-1)
														                   		{
																	                           System.out.println("record is not found ");
																	                           return b;
														                           	}
										                        }

										                        */









										          //}








			/*
			  else if(repeat.equalsIgnoreCase("cancel")==false)

			  	{
			    		 System.out.println("invalid inputs ");
			    		  return d;

			     }*/

					         k--;
					        return k;





		   }








		    ///////////////////////////////////////////////////////

		      /////////////////////////////////////////
		     public static void displayproduct( ){

		     		//goods=Arrays.copyOf(product,Product.record);


		    	System.out.println("Product name\t\t\t\t\t Product code \t\t\t\t Product Price\t\t\t Stock quantity\t\t\tCategory or sugar contents");

		          for(int i=0;i<record;i++)
		          	{

		          		if(goods[i]instanceof Food)
		          		{


		          				System.out.print("Food:\t");




		          		}
		          		else if (goods[i]instanceof Drinks)
		          		{

		          			System.out.print("Drink:\t");

		          		}


		          				System.out.println(goods[i].toString());



		             }
		             
		             
		             
		             
		             
		             
		          


		    }

		    ///////////////////////////////////////////





		      /////////////////////////////////////////
		    public static void addstock()
		        {
		        	int numstock=0;
		          Scanner s =new Scanner(System.in);
		        	System.out.println("please enter the name of stock you would like to return");
		        	String  stockreturn=s.nextLine();
		        	int found=searchproduct(stockreturn);
		        	if(found>=0)
		        	{
		        		
		        		
		        		
		        		
		        //	System.out.println("please enter the number of stock you would like to return");
		              // int numstock=s.nextInt();
		               
		        		   boolean result=true;
						               	                        
						               	                               do
								               	                        {

								               	                        	 try
												               	                  {
																               	     System.out.println("please enter the number of stock you would like to add");
		                                                                               numstock=s.nextInt();
		                                                                               if(numstock>0)
		                                                                               {
		                                                                               	
		                                                                               	result=false;
		                                                                               }
														               	              
												               	                   }
								               	                                  catch(Exception e)
								               	                                  {



																               	         System.out.println("your input is non digit");
																               	                        	 
		                                                                                  s.nextLine();

                                                                                      }


                                                                             } while(result);
								               	                               

                                         int newstock=goods[found].getStockquantity()+numstock;
                                         goods[found].setStockquantity(newstock);
                                       displayproduct();
								               	                     
		        		
		        		
		        		
		        	}
		        	
		        	
		        	
		        }

		    ///////////////////////////////////////////

}