package java_11;

// Question 4

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
public class ListOfStudents 
{
	public static void main(String[] args) throws IOException 
	{
		var path="C:\\Users\\sayee\\eclipse-workspace\\Core java assignment\\src\\StudentList.txt";
		try
		{
			String data = Files.readString(Path.of(path));
			System.out.println("List of students:\n\n" +data);
			
			ArrayList<String> list=new ArrayList<String>(Arrays.asList(data.split("\n")));
			String count[]=list.toArray(size-> new String[size]);
			System.out.println("\n\nNumber of students: " + count.length);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
