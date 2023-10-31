package bankQuestion;

// Question 3

class InsufficientFundsException extends Exception 
{
	InsufficientFundsException(String message) 
	{
		super(message);
	}
}

public class BankAccount
{
	double balance =20000;
	double withdraw_amount;
	
	public void withdraw(double withdraw_amt) throws InsufficientFundsException
	{
		this.withdraw_amount=withdraw_amt;
		if((this.withdraw_amount>this.balance))
		{
			throw new InsufficientFundsException("Insufficient balance");
		}
		else
		{
			System.out.println("Successfully withdrawn: Balance left= " + (this.balance - this.withdraw_amount));
			this.balance = this.balance - this.withdraw_amount;
		}
	}
}
