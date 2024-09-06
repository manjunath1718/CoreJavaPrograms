class Telusko2
{
	{
		System.out.println("instance block");
	}
	Telusko2()
	{
		System.out.println("Telusko 2 zero param Constructor");
	}
	
}

class Alien2 extends Telusko2
{
	
}


public class LaunchInheritance5 
{

	public static void main(String[] args) 
	{
		
			Alien2 a=new Alien2();
	}

}
