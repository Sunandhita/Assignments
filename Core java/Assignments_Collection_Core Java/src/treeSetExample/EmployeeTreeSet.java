package treeSetExample;

//Question 3

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeTreeSet 
{
	public static void main(String args[])
	{
		int choice=0;
		
		Employee e1=new Employee(101,"Raghav","Research",1050000);
		Employee e2=new Employee(102,"Avni","Marketing",1150000);
		Employee e3=new Employee(103,"Harshita","Automation",1000000);
		Employee e4=new Employee(104,"Vipul","Development",500000);
		Employee e5=new Employee(105,"Bhumika","Testing",500000);
		Employee e6=new Employee(106,"Anirudh","Research",1010000);
		Employee e7=new Employee(107,"Taniya","Development",1050000);
		Employee e8=new Employee(108,"Rashmi","Marketing",1200000);
		Employee e9=new Employee(109,"Vikram","Automation",1600000);
		Employee e10=new Employee(110,"Saket","Marketing",1100000);
		
		TreeSet<Employee> emp=new TreeSet<Employee>(Comparator.comparing(Employee::getName));
		do
		{
			System.out.println("\n\nPlease select the attribute based on which the set must be sorted and displayed:\n");
			System.out.println("1.ID\n2.Name\n3.Department\n4.Salary\n5.Exit\n\n");
			
			Scanner sc=new Scanner(System.in);
			choice= sc.nextInt();
			
			switch(choice)
			{
				case 1: emp=new TreeSet<Employee>(new IdComparator());
						break;
						
				case 2: emp=new TreeSet<Employee>(new NameComparator());
						break;
				
				case 3: emp=new TreeSet<Employee>(new DepartmentComparator());
						break;
				
				case 4: emp=new TreeSet<Employee>(new SalaryComparator());
						break;
						
				case 5: System.out.println("EXIT");
						break;
						
				default:System.out.println("\nSelect option from 1 to 4 only");
			}
			emp.add(e1);
			emp.add(e2);
			emp.add(e3);
			emp.add(e4);
			emp.add(e5);
			emp.add(e6);
			emp.add(e7);
			emp.add(e8);
			emp.add(e9);
			emp.add(e10);
			
			if(choice!=5)
			{
				for(Employee employee : emp) 
				{
					System.out.print(employee.getId() +"\t"+ employee.getName() + "\t" + employee.getDepartment() +"\t"+ employee.getSalary());
					System.out.println();
				}
			}
		}while(choice!=5);
	}
}
