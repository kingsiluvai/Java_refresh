package Basics;

public class Fact_recursion
{
public int fact(int n)
{
	if(n==1)
	{
		return 1;
	}
	else
	{
		return n*fact(n-1);
	}
	
}
public static void main(String[] args) 
{
	Fact_recursion fact=new Fact_recursion();
	
	System.out.println("The factorial value is "+fact.fact(5));
}
}
