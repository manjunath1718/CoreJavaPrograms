
public class LaunchP4 
{

	public static void main(String[] args) 
	{
		int n=11;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
//				if(j==0 || j==n-1 || i==(n-1)/2)
//				if(i==0 || j==(n-1)/2)
//				if(i==0 || j==0 || i==(n-1)/2 || i==n-1)
//				if( i==0&&j>0  || i==n-1 && j>0   || j==0 && i>0 && i<n-1 )
//				if( i==(n-1)/2  || (i==0 && j>0 && j<n-1)  || (j==0 && i>0)  || (j==n-1 && i>0) )
				if(j==0 || i==0 && j<n-1  || i==(n-1)/2 && j<n-1  || i==n-1 && j<n-1  || 
						j==n-1 && i>0 && i<n-1 && i!=(n-1)/2)

				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}

}
