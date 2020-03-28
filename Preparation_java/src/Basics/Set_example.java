package Basics;

import java.util.HashSet;
import java.util.Set;

public class Set_example 
{
public static void main(String[] args)
{
	Set<String> set=new HashSet<>();
	set.add("1");
	set.add("");
	for(String s:set)
	{
		System.out.println(s);
		
	}
	
}
}
