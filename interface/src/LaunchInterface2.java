//interface Demo1
//{
//	void disp();
//}
//
//interface Demo2 implements Demo1
//{
//	
//}

interface Beta
{
	
}

interface Demo1
{
	void disp();
	float pi=3.14f;// public static final float pi=3.14f;
}

interface Demo2
{
//	Demo2()
//	{
//		
//	}
	void disp();
}

//interface Demo2 extends Demo1
//{
//	void show();
//}

class Alpha implements Demo2, Demo1
{

	
	public void disp()
	{
		System.out.println("Focus is the key");
		
	}
	public void show()
	{
		System.out.println("Focus is the key");
		
	}
	
}


public class LaunchInterface2 
{

	public static void main(String[] args) 
	{
//		Demo1 d=new Alpha();
//		d.disp();
		
//		Demo2 d2=new Alpha();
//		d2.disp();
		//d2.show();
	//	Demo1.pi=4.5f;its final and static
		

	}

}
