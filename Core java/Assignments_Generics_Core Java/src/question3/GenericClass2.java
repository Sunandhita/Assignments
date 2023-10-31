package question3;

// Question 3

public class GenericClass2 
{
	public static <T> void swapping(T[] arr, int i, int j) 
	{ 
	    T temp = arr[i]; 
	    arr[i] = arr[j]; 
	    arr[j] = temp; 
	} 
	
	public static void main(String args[])
	{ 
		Integer[] arr1 = {20, 40, 30, 10, 50}; 
		
		System.out.println("Integer Array before exchange:\n" );
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		swapping(arr1, 0, 3); 
		
		System.out.println("\nInteger Array after exchange:\n" );
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}
}
