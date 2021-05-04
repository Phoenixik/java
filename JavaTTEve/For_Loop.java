
class For_Loop
{

	public void  ShowLoop()
	{
		for ( int k = 2; k <= 50; k++ )
		{
			System.out.print( ++k + "\t" );		
		}
		//Outside Loop
		//System.out.println("2. DsTv");
	}	
	
	public static void main(String[] args)
	{
		For_Loop  fl = new For_Loop();
		fl.ShowLoop();
	}
}