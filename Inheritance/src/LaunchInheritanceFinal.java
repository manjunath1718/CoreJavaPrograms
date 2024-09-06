//final class Plane1
//{
//	public void fly()
//	{
//		System.out.println("Plane is flying");
//	}
//}

class Plane1
{
	
	static
	{
		System.out.println("static of parent");
	}
	
//	public final Plane1() //illegal
//	{
//		
//	}
	 final static int a=10;
	
	final public void fly()
	{
		//a=20;
		System.out.println("Plane is flying");
	}
	
//	final public static void fly()
//	{
//		//a=20;
//		System.out.println("Plane is flying");
//	}
}
class FighterPlane1 extends Plane1
{
	
	static
	{
		System.out.println("static of child");
	}
//	public void fly()//Cannot override the final method from Plane1
//	{
//		System.out.println("Plane is flying");
//	}
}
public class LaunchInheritanceFinal 
{

	public static void main(String[] args) 
	{
		FighterPlane1 fp=new FighterPlane1();
		fp.fly();

	}

}
