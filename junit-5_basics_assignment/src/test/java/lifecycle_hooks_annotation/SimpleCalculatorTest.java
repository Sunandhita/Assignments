package lifecycle_hooks_annotation;

// Question 4 test

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class SimpleCalculatorTest 
{
	SimpleCalculator sc;
	static int count=0;
	
	@BeforeAll
	static void beforeAllMethod()
	{
		System.out.println("------Starting the tests-----\n");
	}
	
	@BeforeEach
	void init()
	{
		sc=new SimpleCalculator();
	}
	
	@AfterEach
	void afterEachMethod()
	{
		count++;
		System.out.println("Completed test number :" + count);
	}
	
	
	@Nested
	@DisplayName("Add numbers")
	class AddTest
	{
		@Test
		@DisplayName("Testing add method for positive numbers")
		void testAddPositive() 
		{
			assertEquals(2,sc.add(1, 1));
		}
		
		@Test
		@DisplayName("Testing add method for negative numbers")
		void testAddNegative() 
		{
			assertEquals(-2,sc.add(-1, -1));
		}
		
		@Test
		@DisplayName("Adding a positive and a negative number")
		void testAdd() 
		{
			assertEquals(-2,sc.add(-3, 1));
		}		
	}
	
	@Nested
	@DisplayName("Multiply numbers")	
	class MultiplyTest
	{
		@Test
		@DisplayName("Testing multiplication of 2 positive numbers")
		void testMultiplyPositive() 
		{
			assertEquals(4,sc.multiply(2, 2));
		}
		
		@Test
		@DisplayName("Testing multiplication with negative numbers")
		void testMultiplyNegative() 
		{
			assertEquals(-6,sc.multiply(-3, 2));
		}
		
		@Test
		@DisplayName("Testing multiplication with 0")
		void testMultiplyWithZero() 
		{
			assertEquals(0,sc.multiply(2, 0));
		}		
	}
	
	@Test
	@DisplayName("Testing division method")
	void testDivide() 
	{
		assertThrows(ArithmeticException.class, () -> sc.divide(1, 0));
	}
	
	@AfterAll
	static void completed()
	{
		System.out.println("\n\n------- Tests completed---------");
	}

}
