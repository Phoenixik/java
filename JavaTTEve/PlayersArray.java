package game;

import java.util.Scanner;

class PlayersArray
{
	public String name[] = new String[2];
	public String country[] = new String[2];
	
	public String ans;
	
	Scanner scan = new Scanner(System.in);
	
	public void Input()
	{
		for(int k = 0; k < 2; k++)
		{	
			System.out.println("Player " + (k+1));
			
			System.out.println("Enter Player Name ");
			name[k] = scan.next();
			
			System.out.println("Enter Player Country ");
			country[k] = scan.next();	
			country[k] = scan.next();			
		}		
	}
	
	public void Output()
	{
		System.out.println("Player Name \t Player Country");
		for(int k = 0; k < 2; k++)
		{	
			System.out.println( name[k] + "\t\t" + country[k]);
		}
	}
	
	public static void main(String[] args)
	{
		PlayersArray t = new PlayersArray();
		t.Input();
		t.Output();
	}
}