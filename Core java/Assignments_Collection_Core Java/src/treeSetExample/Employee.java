package treeSetExample;

//Question 3

import java.util.Comparator;

public class Employee
{
	int id;
	String name;
	String department;
	int salary;
	
	public Employee(int id,String name,String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.department=dept;
		this.salary=salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
	
class IdComparator implements Comparator<Employee>
{	   
    public int compare(Employee e1, Employee e2) 
    {
        return e1.getId()-e2.getId();
    }
}

class NameComparator implements Comparator<Employee>
{	   
    public int compare(Employee e1, Employee e2) 
    {
        return e1.getName().compareTo(e2.getName());
    }
}

class DepartmentComparator implements Comparator<Employee>
{	   
    public int compare(Employee e1, Employee e2) 
    {
    	return e1.getDepartment().compareTo(e2.getDepartment());
    }
}

class SalaryComparator implements Comparator<Employee>
{	   
    public int compare(Employee e1, Employee e2) 
    {
        return e1.getSalary()-e2.getSalary();
    }
}
