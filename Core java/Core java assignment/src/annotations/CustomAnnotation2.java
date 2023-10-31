package annotations;

// Question 2

import java.lang.annotation.*;

import java.lang.reflect.Method;  

@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Info
{
	int authorID();                      //Mandatory Input 
	String authorName() default "Aman";  //Optional Input 
	String supervisor() default "Ram";   //Optional Input
	String date();                       //Mandatory Input
	String time();                       //Mandatory Input
	int version();						//Mandatory Input
	String description() default "No description available";   //Optional Input
}

public class CustomAnnotation2 
{
	@Info(authorID=1001,supervisor="Raghu",date="11-05-23",time="12:00 pm",version=10) 
	public void display1()
	{
		
	}  
	public static void main(String args[])throws Exception
	{  
		  
		CustomAnnotation2 ca2=new CustomAnnotation2();  
		  
		Method[] m1= ca2.getClass().getDeclaredMethods();
		
		for(Method method : m1)
		{
			if(method.isAnnotationPresent(Info.class))
			{
				Annotation an1 = method.getAnnotation(Info.class);
				Info i=(Info)an1;
				System.out.println("Author ID: " + i.authorID() + "\nAuthor name: " + i.authorName() + "\nDate: " + i.date());
				System.out.println("\nSupervisor: "+ i.supervisor() + "\nTime:" + i.time() + "\nVersion:" + i.version());
			}
		} 
	}
}
