package Basics;

import java.util.ArrayList;

public class Array_list
{
public static void main(String[] args) 
{
	ArrayList<String> al=new ArrayList<>();
    al.add("king");
    al.add("king");
    al.add("king");
    al.add("king");
    
    System.out.println(al);
    
    for(String name:al)
    {
    	System.out.println(name);
    }
    
}
}
