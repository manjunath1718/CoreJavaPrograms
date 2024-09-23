package service;

public class Java implements ICourse {

	@Override
	public Boolean getTheCourse(Double amount) 
	{
		System.out.println("Java Course purchased and the price paid is "+ amount);
		return true;
	}

}
