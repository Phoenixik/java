package game;

import java.util.Scanner;

class Multi_Array
{
	public String name[][] = new String[3][2];
	
	public void Input()
	{
		name[0][0] = "Lagos";
		name[0][1] = "Ogun";
		name[1][0] = "Oyo";
		name[1][1] = "Osun";
		name[2][0] = "Ekiti";
		name[2][1] = "Ondo";
	}
	
	public void Output()
	{
		System.out.println("Player Name \t Player Country");
		for(int k = 0; k < 3; k++)
		{	
			for(int c=0;c < 2; c++)
			{
				System.out.println( name[k][c]);
			}
		}
	}
	
	public static void main(String[] args)
	{
		Multi_Array t = new Multi_Array();
		t.Input();
		t.Output();
	}
}