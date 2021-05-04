package game;

import java.util.Scanner;

class StringManipulation
{
	public String n1 = "abdul";
	public String n2 = new String("Crossley");
	
	public StringBuilder n3 = new StringBuilder("abdul");
	public StringBuilder n4 = new StringBuilder("Crossley");
	
	
	public void Output()
	{
		System.out.println(n2.length());
		System.out.println(n1 + "lah");
		System.out.println(n1);
		//System.out.println(n1.equals(trim(" abdul ")));
		
		
		System.out.println("String Builder Class");
		System.out.println(n3.append("lah"));
		System.out.println(n3);
		System.out.println(n4.insert(1,"am"));
	}
	
	public static void main(String[] args)
	{
		StringManipulation pa = new StringManipulation();
		pa.Output();
	}
}