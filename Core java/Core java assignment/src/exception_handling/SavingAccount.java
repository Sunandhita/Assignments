package exception_handling;
import java.util.Scanner;

// Question 3
// perform withdraw functionality on a SavingAccount object

class InsufficientBalanceException extends Exception 
{
	InsufficientBalanceException(String message) 
	{
		super(message);
	}
}

class  IllegalBankTransactionException extends Exception 
{
	 IllegalBankTransactionException(String message) 
	{
		super(message);
	}
}

public class SavingAccount 
{
	long id=101;
	double balance;
	double withdraw_amt;
	double deposit_amt;
	
	public void deposit(double deposit_amt)
	{
		this.deposit_amt=deposit_amt;
		this.balance=this.balance+this.deposit_amt;
	}
	
	public void withdraw(double withdraw_amt)
	{
		this.withdraw_amt=withdraw_amt;
		try
		{
			if((this.withdraw_amt>this.balance)||(this.balance==0))
			{
				throw new InsufficientBalanceException("Insufficient balance");
			}
			else if(this.withdraw_amt<0)
			{
				throw new IllegalBankTransactionException("Trying to withdraw negative amount");
			}
			else
			{
				System.out.println("Successfully withdrawn: Balance left= " + (this.balance - this.withdraw_amt));
			}
		}
		catch (InsufficientBalanceException e) 
		{
			System.out.println("Caught InsufficientBalanceException");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (IllegalBankTransactionException e) 
		{
			System.out.println("Caught IllegalBankTransactionException");
			System.out.println(e.getMessage());
		}
	}
	public static void main(String args[])
	{
		SavingAccount sa=new SavingAccount();
		sa.balance=2000;
		System.out.println("Enter amount to be deposited:");
		Scanner sc=new Scanner(System.in);
		double dep=sc.nextInt();
		if(dep==0)
		{
			System.out.println("Enter amount to be withdrawn: ");
			Scanner sc1=new Scanner(System.in);
			double amt=sc1.nextInt();
			sa.withdraw(amt);
		}
		if(dep>0)
		{
			sa.deposit(dep);
			System.out.println("Enter amount to be withdrawn: ");
			Scanner sc2=new Scanner(System.in);
			double amt1=sc2.nextInt();
			sa.withdraw(amt1);
		}
	}
}
