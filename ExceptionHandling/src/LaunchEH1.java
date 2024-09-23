import java.util.Scanner;

public class LaunchEH1 
{

	public static void main(String[] args)
	{
		//int void=10; CE
		
		System.out.println("Connection Established");
		
//		try
//		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Kindly Enter the Numerator for division");
			int n=scan.nextInt();
		
			System.out.println("Kindly Enter the Denominator for division");
			int d=scan.nextInt();
		
			int res=n/d;
		
			System.out.println("Result is "+ res);
//		}
//		catch(Exception e)
//		{
//			System.out.println("Please enter non zero denominator");
//		}
		
		System.out.println("Connection Terminated");

		

	}

}
