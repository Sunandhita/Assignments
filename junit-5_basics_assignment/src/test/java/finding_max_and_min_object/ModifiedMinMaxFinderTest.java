package finding_max_and_min_object;

// Question 2 test

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ModifiedMinMaxFinderTest 
{
	ModifiedMinMax mf2;
	
	@Test
	@DisplayName("Testing for array containing only +ve numbers")
	void testForPositiveArray()
	{
		int min = 1;
		int max = 9;
		mf2 = ModifiedMinMaxFinder.ModifiedFindMinMax(new int[] {4,2,3,1,5,3,9,5,6,7});
		assertAll(
				 () -> assertEquals(min,mf2.getMin()),
				 () -> assertEquals(max,mf2.getMax())
				);
		System.out.println("Minimum: " + mf2.getMin() + " Maximum: " + mf2.getMax());
	}
	
	@Test
	@DisplayName("Testing for array containing only -ve numbers")
	void testForNegativeArray()
	{
		int min = -91;
		int max = -3;
		mf2 = ModifiedMinMaxFinder.ModifiedFindMinMax(new int[] {-10,-9,-91,-3,-22,-40});
		assertAll(
				 () -> assertEquals(min,mf2.getMin()),
				 () -> assertEquals(max,mf2.getMax())
				);
		System.out.println("Minimum: " + mf2.getMin() + " Maximum: " + mf2.getMax());
	}
	
	@Test
	@DisplayName("Testing for array containing 0, +ve and -ve numbers")
	void testForArray()
	{
		mf2 = ModifiedMinMaxFinder.ModifiedFindMinMax(new int[] {-10,9,0,-3,2,-44,-44});
		assertAll(
				 () -> assertEquals(-44,mf2.getMin()),
				 () -> assertEquals(9,mf2.getMax())
				);
		System.out.println("Minimum: " + mf2.getMin() + " Maximum: " + mf2.getMax());
	}
	
	@Test
	@DisplayName("Testing for array containing no values")
	void testForEmptyArray()
	{
		assertThrows(ArrayIndexOutOfBoundsException.class,() -> ModifiedMinMaxFinder.ModifiedFindMinMax(new int[]{}),"Empty array: Must throw ArrayIndexOutOfBoundsException");
	}
	
	@Test
	@DisplayName("Testing for array containing elements of equal value")
	void testForArrayHavingSameElements()
	{
		int min = 1;
		int max = 1;
		mf2 = ModifiedMinMaxFinder.ModifiedFindMinMax(new int[] {1,1,1,1,1,1,1});
		assertAll(
				 () -> assertEquals(min,mf2.getMin()),
				 () -> assertEquals(max,mf2.getMax())
				);
		System.out.println("Minimum: " + mf2.getMin() + " Maximum: " + mf2.getMax());
	}

}
