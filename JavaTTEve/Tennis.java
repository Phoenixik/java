import java.util.Scanner;

class Tennis
{
	public String name,country;
	public int rn;
	
	Scanner scan = new Scanner(System.in);
	
	public void Input()
	{
		System.out.println("Enter Tennis Player ");
		name = scan.nextLine();
		
		System.out.println("Enter Player Country ");
		country = scan.nextLine();
		
		System.out.println("Enter Player Rank Number ");
		rn = scan.nextInt();		
	}

	public void Output()
	{
		System.out.println("Player Name is " + name);
		System.out.println("Player Country is " + country);
		System.out.println("Player Rank Number is " + rn);
	}
}