package string_class;

// Question 2
// Join the two Strings “Hello, ” & “How are you?” 

public class StringConcat 
{

	public static void main(String[] args) 
	{
	    String str1 = "Hello World!!";
	    String str2=" How are you?";
	    
	    System.out.println("String obtained by concatinating 2 strings given is: " + str1.concat(str2));
	    System.out.println("\n\nOriginal string:" + str1);
	}

}
