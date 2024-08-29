class Employee1
{
	private int id;
	private String name;
	
	//setter
	void setId(int i)
	{
		id=i;
	}
	
	void setName(String n)
	{
		name=n;
	}
	
	
	//getter
	int getId()
	{
		return id;
	}
	
	String getName()
	{
		return name;
	}
}


public class LaunchEmp 
{

	public static void main(String[] args) 
	{
		Employee1 emp=new Employee1();
		//emp.id=1;
		
		emp.setId(4);
		emp.setName("Rohan");
		
	//	System.out.println(emp.id);
		System.out.println(emp.getId());
		System.out.println(emp.getName());

	}

}
