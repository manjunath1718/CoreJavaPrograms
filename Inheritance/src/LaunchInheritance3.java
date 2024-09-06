class Telusko1
{
	private String name="Telusko Edu";
	
	void disp()
	{
		System.out.println("Name is "+ name);
	}
}
class Alien1 extends Telusko1
{
	
//	void disp2()
//	{
//		name="alien";
//	}
	
}


public class LaunchInheritance3 
{

	public static void main(String[] args) 
	{
		Alien1 a=new Alien1();
		a.disp();
		

	}

}
