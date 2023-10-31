package java_11;

// Question 5

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class CalculateTotalPrice 
{
	public static void main(String args[])
	{
		int choice1,choice2;
		double total=0, price=0;
		String total_amount;
		do
		{
			System.out.println("\nSelect your option:\n1: Insert New Price\n2: View Purchase Total\n3: Exit\n\n");
			Scanner sc=new Scanner(System.in);
			choice1=sc.nextInt();
			switch(choice1) 
			{
				case 1: var products="C:\\Users\\sayee\\eclipse-workspace\\Core java assignment\\src\\Price_of_products.txt"; 
				try 
						{
							do
							{
								System.out.println("\nEnter price of the product: ");
								price=sc.nextDouble();
								Files.writeString(Path.of(products),Double.toString(price),StandardOpenOption.APPEND);
								Files.writeString(Path.of(products),"\n",StandardOpenOption.APPEND);
								total=total+price;
								System.out.println("\nDo you want to enter price for more items? 1.Yes 2.No\n");
								choice2=sc.nextInt();
							}while(choice2!=2);
							
							Files.writeString(Path.of("C:\\Users\\sayee\\eclipse-workspace\\Core java assignment\\src\\Total_amount.txt"),Double.toString(total) ,StandardOpenOption.CREATE, StandardOpenOption.WRITE);
							
						}catch(Exception e) 
						{
							e.printStackTrace();
						}
						break;
				case 2: try
						{
							total_amount=Files.readString(Path.of("C:\\Users\\sayee\\eclipse-workspace\\Core java assignment\\src\\Total_amount.txt"));
							System.out.println("\n\nTotal amount = " + total_amount);
						}catch(Exception e)
						{
							e.printStackTrace();
						}
						break;
				case 3: System.out.println("\nExit");
					    break;
				default:System.out.println("Enter valid choice (1, 2 or 3)");
			
			}
		}while(choice1!=3);
	}

}
