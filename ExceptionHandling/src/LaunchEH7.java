class Gamma
{
	public int disp()
	{
		try
		{
			System.out.println("Disp method of alpha");
			return 10;
		}
		finally {
			
			System.out.println("Finally block of Gamma");
			return 44;
		}
	}
}

public class LaunchEH7 
{

	public static void main(String[] args)
	{
		Gamma g=new Gamma();
		System.out.println(g.disp());
		

	}

}
