package game;

import java.util.Scanner;

class Do_While_Loop
{
	public String name,country,ans;
	
	Scanner scan = new Scanner(System.in);
	
	public void Input()
	{
		ans = "y";
		do
		{
			System.out.println("Enter Tennis Player ");
			name = scan.next();
			
			System.out.println("Enter Player Country ");
			country = scan.next();	
		
			System.out.println("Player Name is " + name);
			System.out.println("Player Country is " + country);
		
			System.out.print("\n Do you want to enter another record [ Y/N ] ");
			ans = scan.next();	
				
		}while (ans.equals("y"));	
	}
	
	public static void main(String[] args)
	{
		Do_While_Loop t = new Do_While_Loop();
		t.Input();
	}
}