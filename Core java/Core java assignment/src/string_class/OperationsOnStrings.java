package string_class;

// Question 3
// Given a String perform the following operations

public class OperationsOnStrings 
{
	public static void main(String[] args) 
	{
		String str3="Java String pool refers to collection of Strings which are stored in heap memory";
		
		//Lower case
		System.out.println("Given string in lower case letters:\n" + str3.toLowerCase());
		
		
		//Upper case
		System.out.println("\n\nGiven string in upper case letters:\n" + str3.toUpperCase());
		
		
		// Replace all 'a' with '$' sign
		System.out.println("\n\nReplacing 'a' with $ sign:\n" + str3.replace('a','$'));
		
		
		//check if string contains "collection"
		System.out.println("\n\nChecking if string contains \"collection\"\n" + str3.contains("collection"));
		
		
		//check “java string pool refers to collection of strings which are stored in heap memory” matches the original
		String str4="java string pool refers to collection of strings which are stored in heap memory";
		System.out.println("\n\nChecking if \"java string pool refers to collection of strings which are stored in heap memory\" matches the original\n" + str3.equals(str4));
		
		
		//If the string does not match check if there is another method which can be used to check if the strings are equal
		System.out.println("\n\nChecking if \"java string pool refers to collection of strings which are stored in heap memory\" matches the original\n" + str3.equalsIgnoreCase(str4));
		
	}

}
