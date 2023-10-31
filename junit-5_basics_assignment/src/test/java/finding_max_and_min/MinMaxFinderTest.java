package finding_max_and_min;

// Question 1 test

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MinMaxFinderTest 
{
	MinMaxFinder mmf;
	
	@BeforeEach
	void init()
	{
		mmf=new MinMaxFinder();
	}
	
	@Test
	@DisplayName("Testing for array containing only +ve numbers")
	void testForPositiveArray()
	{
		int expected[]=new int[] {1,40};
		int actual[] = mmf.findMinMax(new int[]{10,9,1,3,22,40});
		//System.out.println("Min and max: " + actual[0] + " and " + actual[1]);
		assertArrayEquals(expected,actual);
	}
	
	@Test
	@DisplayName("Testing for array containing only -ve numbers")
	void testForNegativeArray()
	{
		int expected[]=new int[] {-91,-3};
		int actual[] = mmf.findMinMax(new int[]{-10,-9,-91,-3,-22,-40});
		//System.out.println("Min and max: " + actual[0] + " and " + actual[1]);
		assertArrayEquals(expected,actual);
	}
	
	@Test
	@DisplayName("Testing for array containing 0, +ve and -ve numbers")
	void testForArray()
	{
		int expected[]=new int[] {-44,9};
		int actual[] = mmf.findMinMax(new int[]{-10,9,0,-3,2,-44,-44});
		//System.out.println("Min and max: " + actual[0] + " and " + actual[1]);
		assertArrayEquals(expected,actual);
	}
	
	@Test
	@DisplayName("Testing for array containing no values")
	void testForEmptyArray()
	{
		assertThrows(ArrayIndexOutOfBoundsException.class,() -> mmf.findMinMax(new int[]{}),"Empty array: Must throw ArrayIndexOutOfBoundsException");
	}
	
	@Test
	@DisplayName("Testing for array containing elements of equal value")
	void testForArrayHavingSameElements()
	{
		int expected[]=new int[] {1,1};
		int actual[] = mmf.findMinMax(new int[]{1,1,1,1,1,1,1,1});
		//System.out.println("Min and max: " + actual[0] + " and " + actual[1]);
		assertArrayEquals(expected,actual);
	}

	
}
