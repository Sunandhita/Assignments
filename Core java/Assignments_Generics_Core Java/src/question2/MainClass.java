package question2;

// Question 2

import java.util.HashMap;
import java.util.Map;

public class MainClass 
{
	public static void main(String args[])
	{
		MyGenericClass1<Integer,Double> gc=new MyGenericClass1<Integer,Double>();
		
		Map<Integer,Double> hm=new HashMap<Integer,Double>();
		hm.put(1,100.0);
		hm.put(2,200.0);
		hm.put(3,300.0);
		hm.put(4,400.0);
		hm.put(5,500.0);
		hm.put(6,600.0);
		hm.put(7,700.0);
		hm.put(8,800.0);
		hm.put(9,900.0);
		hm.put(10,1000.0);
		
		//hm.put(100.0,1); --> error
		
		gc.setHm(hm);
		Map<Integer,Double> hm1=gc.getHm();
		
		hm1.forEach((key, value) -> System.out.println("Key: " + key + "\t Value: " + value + "\n"));
	}
}
