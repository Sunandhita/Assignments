package bankQuestion;

// Question 3 test

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankAccountTest 
{
	BankAccount bankAccount;
	
	@BeforeEach
	void init() 
	{
		bankAccount=new BankAccount();
	}
	
	@Test
	@DisplayName("Testing withdraw method when amount to be withdrawn is greater than balance")
	void testForLessBalance()
	{
		assertThrows(InsufficientFundsException.class, () -> bankAccount.withdraw(21000),"Should throw exception");
	}
}
