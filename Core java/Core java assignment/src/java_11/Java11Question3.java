package java_11;

// Question 3
// Create an ArrayList from the given String and convert it to an array using Java 11 features

import java.util.ArrayList;
import java.util.Arrays;

public class Java11Question3 
{
	public static void main(String args[])
	{
		String str1="A quick brown fox jumps over the lazy dog";
		
		//Create an ArrayList from the given String
		ArrayList<String> list=new ArrayList<String>(Arrays.asList(str1.split(" ")));
		
		System.out.println("String to ArrayList:\n ");
		for(String s: list)
			System.out.println(s);
		
		//Convert such List to an array using Java 11 methods and print the output
		System.out.println("\n\nArrayList to an array:\n ");
		String arr[]=list.toArray(size-> new String[size]);
		System.out.println(Arrays.toString(arr));
	}
}
