class Triangle
{
	public double Area(double b, double h)
	{
		double a = 0.5 * b * h;
		return a;
	}
	
	public static void main(String[] args)
	{
		Triangle t; // Declare object
		t = new Triangle(); // Initialize object
		System.out.println("Area of Triangle is " + t.Area(7,9));
	}
}