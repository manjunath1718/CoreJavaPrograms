class Alien
{
	int id;
	String name;
	String course;
}


public class LaunchAr3 
{

	public static void main(String[] args) 
	{
		Alien []arr=new Alien[3];
		
		arr[0]=new Alien();
		arr[1]=new Alien();
		arr[2]=new Alien();
		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=new Alien();
//		}
		
		arr[0].id=1;
		arr[0].name="Rohan";
		arr[0].course="Java";
		
//		System.out.println(arr[0].id);
//
//		System.out.println(arr[0].name);
//
//		System.out.println(arr[0].course);
		System.out.println(arr[0]);

	}

}
