package treeMapExample;

//Question 1

import java.util.Collections;
import java.util.TreeMap;

public class TreeMapForContact 
{

	public static void main(String[] args) 
	{
		Contact c1= new Contact(1234567890,"Aditya","adi1998@gmail.com",Gender.MALE);
		Contact c2= new Contact(1982736460,"Vikram","vikram@gmail.com",Gender.MALE);
		Contact c3= new Contact(1384759200,"Avni","avni1998@gmail.com",Gender.FEMALE);
		Contact c4= new Contact(1020304050,"Kriti","kriti2000@gmail.com",Gender.FEMALE);
		
		TreeMap<Long,Contact> contactDetails= new TreeMap<>(Collections.reverseOrder());
		contactDetails.put(c1.phoneNumber,c1);
		contactDetails.put(c2.phoneNumber,c2);
		contactDetails.put(c3.phoneNumber,c3);
		contactDetails.put(c4.phoneNumber,c4);
		
		System.out.println("Set of keys:\n");
        for(Long phno:contactDetails.keySet())
        {
            System.out.println(phno);
        }
        System.out.println("--------------------------------------\n\n");
        
        
        System.out.println("Set of values:\n");
        for(Contact c:contactDetails.values())
        {
            System.out.println(c);
        }
        System.out.println("--------------------------------------\n\n");
        
        
        System.out.println("Set of key-value pairs:\n");
        for(Long phno:contactDetails.keySet())
        {
            System.out.println(phno + "\t\t" + contactDetails.get(phno));
        }
        System.out.println("--------------------------------------\n\n");
		
	}
}