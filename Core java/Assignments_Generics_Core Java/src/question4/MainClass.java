package question4;

// Question 4

import java.util.Date;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Pair<String,String> pair1=new Pair<String,String>();
		pair1.setKey("1");
		pair1.setValue("Hello");
		
		System.out.println("Scenario 1:");
		System.out.println("Key: " + pair1.getKey() + "\tValue : " + pair1.getValue());
		
		Pair<String,Date> pair2=new Pair<String,Date>();
		pair2.setKey("Today is"); 
		pair2.setValue(new Date());
		
		System.out.println("\nScenario 2:");
		System.out.println("Key: " + pair2.getKey() + "\tValue : " + pair2.getValue());
		
	}

}
