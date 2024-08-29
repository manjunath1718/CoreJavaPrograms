
public class LaunchMo3 
{
	public static void main(String[] args) 
	{
		System.out.println("main method with String of args[]");
		main(44);
		main("Rohan", 4);
	}
	
	public static void main(int arg) 
	{
		System.out.println("main method with int of arg");
	}
	
	public static void main(int[] arg) 
	{
		System.out.println("main method with int[] of arg");
	}
	public static void main(String name, int age) 
	{
		System.out.println("main method with int and String of arg");
	}

}
