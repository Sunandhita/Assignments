package stringBuilder_class;

// StringBuilder class

public class StringBuilderClass 
{
	public static void main(String[] args) 
	{
		StringBuilder str1= new StringBuilder("StringBuilder");
		StringBuilder str2= new StringBuilder(" is a peer class of String");
		StringBuilder str3= new StringBuilder(" that provides much of");
	    StringBuilder str4=new StringBuilder(" the functionality of strings");
	       
	    // to append the specified strings
	    str1.append(str2);
	    str1.append(str3);
	    str1.append(str4);
	    System.out.println(str1);
	    System.out.println();
	       
	    
	    // Insert String
	    StringBuilder str5=new StringBuilder("It is used to at the specified index position");
	    System.out.println(str5.insert(14,"insert text "));
	    System.out.println();

	    
	    //Reverse a string
	    StringBuilder str6=new StringBuilder("This method returns the reversed object on which it was "
	    		+ "called");
	    System.out.println(str6.reverse()); //System.out.println(str6);	       
	}

}
