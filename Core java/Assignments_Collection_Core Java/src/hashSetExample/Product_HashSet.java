package hashSetExample;

//Question 2

import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;

public class Product_HashSet 
{
	public static void main(String args[])
	{	
		Set<Products> prod=new HashSet<>();
		
		prod.add(new Products(1001,"Smart phones"));
		prod.add(new Products(1002,"Laptops"));
		prod.add(new Products(1003,"Earpods"));
		prod.add(new Products(1004,"Books"));
		prod.add(new Products(1005,"Pencil Box"));
		prod.add(new Products(1006,"Carpet"));
		prod.add(new Products(1007,"Tables"));
		prod.add(new Products(1008,"Chairs"));
		prod.add(new Products(1009,"Headphones"));
		prod.add(new Products(1010,"Pens"));
		
		System.out.println("HashSet after adding 10 unique items:\n\n");
		
		for(Products p:prod)
		{
			System.out.println(p + "\n");
			
		}
		
		prod.add(new Products(1010,"Pens")); // Duplicate value
		
		System.out.println("\n\nHashSet after trying to add a duplicate item:\n\n");
		for(Products p:prod)
		{
			System.out.println(p + "\n");
			
		}
	}
}
