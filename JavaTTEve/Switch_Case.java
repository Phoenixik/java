import java.util.Scanner;

class Switch_Case
{
	Scanner sc = new Scanner(System.in);
	
	public void  Show()
	{
		System.out.println("Show Options");
		System.out.println("1. GoTv");
		System.out.println("2. DsTv");
		System.out.println("3. Startime");
		System.out.println("4. Exit");
		
		System.out.print("Enter your Choice from [1 - 4] ");
		int cho = sc.nextInt();
		
		switch( cho )
		{
			case 1:
				Gotv();
				break;
			case 2:
				Dstv();
				break;
			case 3:
				Startime();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Oops!!!, you no know book, i sey make una pick 1 to 4");
				break;				
		}
	}
	
	public void Gotv()
	{
		System.out.println("GoTv selected,");
		System.out.println("Your UCI Number is 000000001");
	}
	
	public void Dstv()
	{
		System.out.println("GoTv selected,");
		System.out.println("Your UCI Number is 000000001");
	}
	
	public void Startime()
	{
		System.out.println("Startime selected,");
		System.out.println("Your UCI Number is 000000003");
	}
	
	public static void main(String[] args)
	{
		Switch_Case  s = new Switch_Case();
		s.Show();
	}
}