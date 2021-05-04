import java.util.Scanner;

class multiply{
		
		int n;
		Scanner input = new Scanner(System.in);
		
	public static void main(String[] args) 	{
		multiply m =  new multiply();
		m.assignment();	
	}

	public void assignment() {
	for (n = 1; n < 51; n++) {
		System.out.println(2 * n);
	}	
		
}
}