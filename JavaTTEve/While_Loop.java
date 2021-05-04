
class While_Loop
{

	public void  ShowLoop()
	{
		int k = 1;
		while( k <= 50 )
		{
			System.out.print( k + "\t" );	
			k++;
		}
		//Outside Loop
		}	
	
	public static void main(String[] args)
	{
		While_Loop  wl = new While_Loop();
		wl.ShowLoop();
	}
}