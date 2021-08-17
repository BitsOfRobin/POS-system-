/**
 * @(#)Order.java
 *
 *
 * @author
 * @version 1.00 2019/7/22
 */

import java.util.Scanner;

public class Order {

	Scanner s = new Scanner(System.in);
	private double discount;
	private int[] orderQuantity;
	private Product[] product;
	private Product[] order = new Product[10];
	private Member member;

 

    public Order(double discount,int[] orderQuantity,Product[] order,Member member) {
    	this.discount = discount;
    	this.orderQuantity = orderQuantity;
    	this.order = order;
    	this.member = member;

    }

	// should be in main class
    public void int getOrder(int i)
    {
    	boolean z;
    	String j;
    	do{
    	int k;
    	System.out.print("Enter Product ID >");
    	 j = s.nextLine();

    	 for( k=0; z== true;k++)
    	 {
    	 	z=j.equalsignorecase(product[k].getproductid());
    	 }
    	if(z=true)
    	{
    	order[i].setproductid() = j;
    	order[i].setproductprice() = product[k].getproductprice();
    	order[i].setproductname() = product[k].getproductname();
    	}
    	}while(z==false);
    	System.out.print("Enter quantity to be order >");
    	orderQuantity[i] = s.nextInt();
    	return i;
    }

    public void displayOrder(){
    	Scanner s = new Scanner(System.in);
		int i=1;
		do
		{
			System.out.print(i+". " + order[i] + orderQuantity[i]);
			i++;
		}while(i<order.length+1);
    }

	public void editOrder(){
		displayOrder();
		int edit;
		do
		{
			System.out.print("Select order to be edit >");
			edit = s.nextInt();

		}while( edit < product.length);
		int sel;
		do{System.out.print("1.Order item"+"2.Order Quantity"+"Select object to be edit >");
		sel = s.nextInt();
		}while(sel!=1&&sel!=2);

		if(sel==1){
			String no;
			//do{
			System.out.print("Enter the item code >");
			no = s.nextLine();
			order[edit].setProductid(no);
			//}while(no==product[edit].getProductid());
		}
		if(sel==2){
			System.out.print("Enter the quantity >");
			orderQuantity[edit] = s.nextInt();
		}
	}

		public double calculateTotal(boolean getMember){
			double cala,calb;
			cala = calculatePrice();
			calb = calculateDiscount(getMember);
			return cala-calb;
		}

		private double calculatePrice(){
			double total =0;
			for(int i=0;i<order.length;i++)
			{
				total=+order[i].getProductprice();
			}
			return total;
		}

		private double calculateDiscount(boolean getMember){
			if(getMember = true)
				return calculatePrice()*(20/100);
				else
					return 0;
		}

     
       public static void addstock()
       {
       	
       	
       	
       	
       }	
		    	
		    	
		 
		    
		     public static  void stockout()
		     {
		     	
		     	
		     	
		     }


















}

/*class Payment extends Order{

	private double calculateTotal(){
		return calculatePrice()-calculateDiscount();
	}

	private double calculatePrice(){
		double total;
		for(int i=0;i<product.length();i++)
		{
			total=+product.productprice[i];
		}
		return total;
	}

	private double calculateDiscount(){
		if(getMember = true)
			return calculatePrice()*(20/100);
			else
				return 0;
	}

}*/