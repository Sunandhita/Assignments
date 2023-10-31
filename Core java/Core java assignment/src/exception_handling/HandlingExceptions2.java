package exception_handling;

// Question 2
// Handle ArithmeticException by raising UnsupportedOperationException as a solution. 

import java.util.Scanner;

public class HandlingExceptions2 
{
	public static void main(String[] args) 
	{
		int num1,num2;
		Scanner sc1=new Scanner(System.in);
				
		System.out.println("Enter the 1st no.: ");
		num1=sc1.nextInt();
				
		System.out.println("\nEnter the 2nd no.: ");
		num2=sc1.nextInt();
				
		try
		{
			int result=num1/num2;
			System.out.println("\nResult = " + result);
		}
		catch(ArithmeticException e)
		{
			throw new UnsupportedOperationException("Arithmetic exception occured");
		}
		finally
		{
			sc1.close();
		}
	}

}
