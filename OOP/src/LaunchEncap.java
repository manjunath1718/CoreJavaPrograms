class Book
{
	private int pageNum;
	
	//setter
	void setPageNum(int pgNo)
	{
		if(pgNo>=0)
		{
			pageNum=pgNo;
		}
		else
		{
			System.out.println("Kindly add non zero number");
		}
	}
	//getter
	int getPageNum()
	{
		return pageNum;
	}
	
	
	void disp()
	{
		System.out.println("Java and Inheritance is present in pageNumber : "+ pageNum);
	}

}

public class LaunchEncap 
{

	public static void main(String[] args) 
	{
		Book book=new Book();
		//book.pageNum=-4;
		book.setPageNum(44);
		
	//	System.out.println(book.pageNum);
		System.out.println(book.getPageNum());
		
	//	System.out.println(book.pageNum);
		book.disp();

	}

}
