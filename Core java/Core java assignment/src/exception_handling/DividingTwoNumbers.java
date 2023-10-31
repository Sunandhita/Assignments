package exception_handling;

// Question 1
// Arithmetic Exception

import java.util.Scanner;
public class DividingTwoNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1st no.: ");
		int num1=sc.nextInt();
		
		System.out.println("\nEnter the 2nd no.: ");
		int num2=sc.nextInt();
		
		try
		{
			int result=num1/num2;
			System.out.println("\nResult = " + result);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Arithmetic exception occured");
		}
		finally
		{
			sc.close();
		}
	}
}
