package game;

import java.util.Scanner;

class PrintArray
{
	public String states[] = {"Lagos","Ogun","Oyo","Ekiti","Ondo","Osun","Kwara","Kogi","Delta"};
		
	public void Output()
	{
		System.out.println("Odua States");
		System.out.println("Total Number of States in Odua Country " + states.length);
		
		for(int k = 0; k < states.length; k++)
		{	
			System.out.println( states[k] + "\t\t" );
		}
		System.out.println("Total Number of States in Odua Country " + states.length);
		for( String n:states)
		{
			System.out.println( n );
		}
	}
	
	public static void main(String[] args)
	{
		PrintArray pa = new PrintArray();
		pa.Output();
	}
}