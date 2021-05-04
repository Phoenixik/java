import java.util.Scanner;

public class NetSalary
{
	public String surname, othername, department;
	public double bs, hra, sa, pfd, NetSalary;
	
	
	Scanner scan = new Scanner(System.in);
	
	public void Input()
	{	
		System.out.println("Enter Staff Surname ");
		surname = scan.nextLine();
		
		System.out.println("Enter Staff Othername ");
		othername = scan.nextLine();
		
		System.out.println("Enter Staff Department ");
		department = scan.nextLine();
		
		System.out.println("Enter Staff Basic salary ");
		bs = scan.nextDouble();
		
		Calculate();
	}
	
	public void Calculate()
	{
		hra = 0.5 * bs;
		sa =  bs * 0.75;
		pfd = 0.12 * bs;
		NetSalary = (hra + sa) - pfd;
		
		DetailReport();
		SummaryReport();
	}
	public void DetailReport()
	{
		System.out.println("Staff Surname: "+ surname);
		System.out.println("Staff Othername: "+ othername);
		System.out.println("Staff Department: "+ department);
		System.out.println("Staff Special Allowance: "+ sa);
		System.out.println("Staff Basic Salary: "+ bs);
		System.out.println("Staff NetSalary: "+ NetSalary);
	}
	
	public void SummaryReport()
	{
		System.out.println("Staff surname		Staff othername			Staff department		Staff NetSalary");
		System.out.println(surname+"		"+  othername+"				"+department+"			"+  NetSalary);
	}	
}