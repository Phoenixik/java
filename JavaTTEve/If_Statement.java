class If_Statement
{
	public static void main(String[] args)
	{
		String nam1 = "Pulaine";
		String nam2 = "Funke";
		double sal = 30000.00;
		
		
		if (sal < 25000)
		{
			System.out.println("Full Name\tSalary");
			System.out.println("===============\t========");
			System.out.println(nam1 +" "+ nam2 +"\t"+ sal);
		}
		else
		{
			System.out.println("No Report");
		}
	}
}