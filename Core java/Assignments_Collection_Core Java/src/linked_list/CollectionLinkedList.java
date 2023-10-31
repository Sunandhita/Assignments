package linked_list;

// Question 4

import java.util.LinkedList;
import java.util.Iterator;
import java.time.LocalDate;

public class CollectionLinkedList 
{
    public static boolean CheckLeapYear(int year) 
    { 
        boolean leapYear = false; 
  
        if (year % 4 == 0) 
        { 
        	leapYear=true;
            if (year % 100 == 0) 
            { 
            	if (year % 400 == 0) 
            		leapYear = true; 
                else
                    leapYear = false; 
            } 
        } 
        else
        {
            leapYear = false; 
        }
  
        return leapYear;
    }

	public static void main(String[] args) 
	{
		int year; 
		boolean result;
		
		LinkedList<LocalDate> ld = new LinkedList<>();
		ld.add(LocalDate.of(2000, 12, 23));
		ld.add(LocalDate.of(1998, 10, 16));
		ld.add(LocalDate.of(2001, 12, 23));
		ld.add(LocalDate.of(1996, 11, 17));
		
		Iterator<LocalDate> localDate = ld.descendingIterator();

		while(localDate.hasNext())
		{
			LocalDate locDate = localDate.next();
			year=locDate.getYear();
			result = CheckLeapYear(year);
			if(result)
				System.out.println("Your date of birth is " + locDate.getDayOfMonth()+ "-" + locDate.getMonthValue() + "-" + year + " and it was a leap year\n");
			else
				System.out.println("Your date of birth is " + locDate.getDayOfMonth()+ "-" + locDate.getMonthValue() + "-" + year + " and it was not a leap year\n");
			
		}
	}

}
