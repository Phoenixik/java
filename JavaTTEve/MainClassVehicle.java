class Vehicle 
{
    int max_speed = 210;
    public Vehicle(int max_speed) 
    {
        this.max_speed = max_speed;
    }
	
    public void showmaxspeed() 
    {
		System.out.println("The top speed is " + max_speed);
    }
}

class MainClassVehicle 
{
    public static void main(String args[]) 
    {
        Vehicle a = new Vehicle(250);
        a.showmaxspeed();
    }
}
