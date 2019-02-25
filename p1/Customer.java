package p1;
import p2.*;
import java.util.*;
public class Customer implements MegaStore{
	
	String cust_id, name;
	int no_of_yrs_of_association;
	Items items_purchased;
	Scanner sc = new Scanner(System.in);
	
	Customer(String c,String n,int na,Items ip)
	 {
		 cust_id = c;
		 name=n;
		 no_of_yrs_of_association = na;
		 items_purchased = ip;
	 }
	 
	public void getdetails()
	{
		cust_id=sc.next();
		name=sc.next();
		no_of_yrs_of_association=sc.nextInt();
		items_purchased.item_id=sc.next();
		items_purchased.name=sc.next();
		items_purchased.cost=sc.nextInt();
	}
	
	public void printover5()
	{
		System.out.println("Customer name -"+name);
		System.out.println("Customer Id -"+cust_id);
		System.out.println("No of years of association -"+no_of_yrs_of_association);
		System.out.println("Total no of items purcahsed: "+Items.noitems);
	}
	
   public static void main(String args[])
   {
	   Scanner sc = new Scanner(System.in);
	   MegaStore rit_megastore;
	   System.out.println("Enter the details of customer and items purchased");
	   String c = sc.next();
	   String n = sc.next();
	   int na = sc.nextInt();
	   System.out.println("Enter the details items purchased");
	   String i = sc.next();
	   String in = sc.next();
	   int co = sc.nextInt();
	   Items ip = new Items(i,in,co);
	   
	   rit_megastore = new Customer(c,n,na,ip);
	   rit_megastore.getdetails();
	   if (Items.noitems > 5)
	   {
		   rit_megastore.printover5();
	   }
	   sc.close();
   }
}

class Items{
	String item_id, name;
	int cost;
	static int noitems;
	Items(String i,String n,int c)
	{
		item_id=i;
		name=n;
		cost = c;
		noitems++;
	}
	void itemspurchase()
	{
		System.out.println("Items name -"+name);
		System.out.println("Items Id -"+item_id);
		System.out.println("Cost of item -"+cost);
	}
}