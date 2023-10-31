package question1;

//Question 1

import java.util.HashSet;
import java.util.Set;

public class GenericClassEmployee 
{
	public static void main(String args[])
	{
		Set<Employee> emp = new HashSet<>();
		
		emp.add(new Employee(101,"Aditya",1050200,"Research"));
		emp.add(new Employee(102,"Ravi",1150200,"Development"));
		emp.add(new Employee(103,"Raghu",1200200,"Marketing"));
		emp.add(new Employee(104,"Avni",1050000,"Automation"));
		
		System.out.println("Display list of employees:\n\n");
		System.out.println("ID\t\tName\t\tDepartment\t\tSalary\n\n");
		for(Employee e:emp)
		{
			e.displayDetails();
		}
	
	}	
}

