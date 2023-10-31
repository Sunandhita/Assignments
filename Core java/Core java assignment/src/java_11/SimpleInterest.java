package java_11;

// Question 1
// Calculate the Simple Interest using features of Java 11

import java.util.Scanner;
public class SimpleInterest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the principle amount: ");
		var principle = sc.nextDouble();
		
		System.out.println("\n\nEnter the rate: ");
		var rate = sc.nextDouble();
		
		System.out.println("\n\nEnter the time in years: ");
		var time=sc.nextInt();
		
		CalculateSimpleInterest si = (var p,var r, var t) -> (p*r*t)/100;
		System.out.println("\n\nSimple Interest = " + si.simpleInterest(principle,rate,time));
	}
}
interface CalculateSimpleInterest
{
	double simpleInterest(double p,double r,int t);
}