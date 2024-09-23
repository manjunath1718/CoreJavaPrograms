interface Telusko
{
	void show();
	default void disp()
	{
		System.out.println("Telusko is coming up with fast tract spring boot course");
	}
}

class Alien implements Telusko
{
	public void show()
	{
		System.out.println("Hello Aliens, Welcome back!");
	}
	
//	public void disp()
//	{
//		System.out.println("Telusko is coming up with fast tract spring boot course");
//	}
	
}


public class LaunchInterface3 
{

	public static void main(String[] args)
	{
		
		Alien a=new Alien();
		a.show();
		a.disp();
	}

}
