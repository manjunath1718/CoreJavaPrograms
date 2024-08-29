class Calculator
{
	int num1, num2, res;
	
//	void add()
//	{
//		num1=10;
//		num2=20;
//		res=num1+num2;
//		System.out.println("Result is : "+ res);
//	}
//	void add(int n1, int n2)
//	{
////		num1=n1;
////		num2=n2;
////		res=num1+num2;
//		res=n1+n2;
//		System.out.println("Res is : "+ res);
//		
//	}
//	
//	int add()
//	{
//		num1=4;
//		num2=4;
//		res=num1+num2;
//		return res;
//	}
	
	int add(int n1, int n2)
	{
		res=n1+n2;
		System.out.println("Please enter number");
		return res;
	}

		
}

public class LaunchMethod1 
{

	public static void main(String[] args) 
	{
		Calculator calc=new Calculator();
		//calc.add();
		//calc.add(10, 4);
		int result =calc.add(10,4);
		System.out.println("Result is "+ result);

	}

}
