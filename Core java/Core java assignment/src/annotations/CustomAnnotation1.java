package annotations;
//Question 1

import java.lang.annotation.*;

import java.lang.reflect.Method;  

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test
{
	int value();
}

public class CustomAnnotation1 
{
	@Test(value=10)  
	public void display()
	{
		//System.out.println("hello annotation"); 
	}  
	public static void main(String args[])throws Exception
	{  
		  
		CustomAnnotation1 ca1=new CustomAnnotation1();  
		  
		Method[] m= ca1.getClass().getDeclaredMethods();
		
		for(Method method : m)
		{
			if(method.isAnnotationPresent(Test.class))
			{
				Annotation an = method.getAnnotation(Test.class);
				Test t=(Test)an;
				System.out.println("Value is: "+t.value());
			}
		} 
	}
}
