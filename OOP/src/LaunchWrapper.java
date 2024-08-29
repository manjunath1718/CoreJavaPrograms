import java.util.ArrayList;

public class LaunchWrapper 
{
	public static void main(String[] args) 
	{
		
		int a=10;
		System.out.println("a "+a);
		
//		Integer i=new Integer(10);
		Integer i=Integer.valueOf(10);
		System.out.println("i "+i);
		
		
		//Boxing : Converting primitive data type into its corresponding wrapper class object
		//Auto Boxing: Automatically Converting primitive data type into its corresponding wrapper class object by Java compiler
		int n1=14;
		Integer n2=n1;//auto boxing
		Integer x=Integer.valueOf(n1);  //boxing
		
		//UnBoxing : Converting wrapper class object back to its corrsponding primitive data type
		//UnBoxing : Automatically Converting wrapper class object back to its corrsponding primitive data type by java compiler
		
		Integer n3=Integer.valueOf(44);
		int n4=n3;//auto unboxing
		
		int n5=n3.intValue(); //unboxing
		
//		ArrayList<Integer> al=new ArrayList<>();
//		
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		//int-->primitive

		
		
	}

}
