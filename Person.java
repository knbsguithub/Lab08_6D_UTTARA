/*10) Person has a name and age. A person has a number of pet 
names(20max) which he obtains over a period of time. He can dance; if 
his age is less than 25 he can do chacha. If his age is greater than 25, 
he does the waltz. He can sing too and when he is asked to sing, he 
uses his petnames to form the song (randomly). Write a tester program 
to test persons.
See this below code only after trying to solve the problem on your first. 
This is important.*/


import java.util.*;
public class Person
{
	private String name;
	private int age;
	private String[] petNames = new String[20];
	private int count=0;
	
	public void setName(String s)
	{
		name=s;
	}
	
	public void setAge(int a)
	{
		if(age<0)
		{
			System.out.println("ENTER APPROPRIATE AGE");
		}
		else
			age=a;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void sing()
	{
		String song = "SALAM ROCKY BHAI";
		for(int i = 0; i < petNames.length; i++)
		{
			int n = (int)(20 * Math.random()); 
			if(petNames[n]!=null)
				song = song +" "+ petNames[n];
		}
		System.out.println(song);
	}
	
	public void addPetName(String n)
	{
		if(count < petNames.length)
			petNames[count++] = n;
		else
			System.out.println();
	}
	
	public boolean searchPetName(String n)
	{
		for(String s : petNames)
		{
			if(s.equals(n))
			return true;
		}
		return false;
	}
	
	public void dance(int age)
	{
		if(age<25)
			System.out.println("CHACHA");
		else
			System.out.println("waltz");
	}
}