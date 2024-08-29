class Learner
{
	
	private int id;
	private String name;
	private String city;
	
//	Learner()
//	{
//		
//	}
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	
	
	
	
}

public class LaunchLearner 
{

	public static void main(String[] args) 
	{
		Learner learner=new Learner();
		learner.setId(1);
		learner.setName("Rohan");
		learner.setCity("bengaluru");
		
		
		int id=learner.getId();
		System.out.println("Id is : "+ id);
		
		System.out.println(learner.getName());
		System.out.println(learner.getCity());
		
		System.out.println("********************************");
		
		Learner learner2=new Learner();
		learner2.setId(2);
		learner2.setName("Rohit");
		learner2.setCity("mumbai");
		
		
		int id2=learner2.getId();
		System.out.println("Id is : "+ id2);
		
		System.out.println(learner2.getName());
		System.out.println(learner2.getCity());
		
		
		
		

	}

}
