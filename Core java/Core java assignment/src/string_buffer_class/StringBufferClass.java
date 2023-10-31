package string_buffer_class;

// Question 1, 2 and 3

public class StringBufferClass 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1= new StringBuffer("StringBuffer");
	    StringBuffer sb2= new StringBuffer(" is a peer class of String");
	    StringBuffer sb3= new StringBuffer(" that provides much of");
	    StringBuffer sb4=new StringBuffer(" the functionality of strings");
	       
	    // to append the specified strings
	    sb1.append(sb2);
	    sb1.append(sb3);
	    sb1.append(sb4);
	    System.out.println(sb1);
	    System.out.println();
	       
	    
	    // Insert String
	    StringBuffer sb5=new StringBuffer("It is used to at the specified index position");
	    System.out.println(sb5.insert(14,"insert text "));
	    System.out.println();

	    
	    //Reverse a string
	    StringBuffer sb6=new StringBuffer("This method returns the reversed object on which it was "
	    		+ "called");
	    System.out.println(sb6.reverse()); // System.out.println(sb6);	       
	}

}

