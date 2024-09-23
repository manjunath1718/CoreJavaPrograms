import java.util.Scanner;

public class LaunchEh9 {

	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("Main method task started");
		
		Thread.sleep(5000);
		
		System.out.println("Main method task completed");
		
		try {
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Kindly Enter the Numerator for division");
			int n=scan.nextInt();
		
			System.out.println("Kindly Enter the Denominator for division");
			int d=scan.nextInt();
		
			int res=n/d;
		
			System.out.println("Result is "+ res);
			
			System.out.println("Kindly enter size of an array");
			int size=scan.nextInt();
			
			int ar[]=new int[size];
			
			System.out.println("Kindly enter element to be inserted in an array");
			int elem=scan.nextInt();
			
			System.out.println("kindly enter position at which element to be inserted");
			int index=scan.nextInt();
			ar[index]=elem;
			
			System.out.println("Data iserted in a array is "+ ar[index]);
			try {
				
				System.out.println("Inner try");				
			}
			catch(Exception e) {
				System.out.println("inner Catch");
			}
			finally {
				System.out.println("inner finally block");
			}

		}catch(Exception e) {
			System.out.println("outer Catch");
		}
		finally {
			System.out.println("outer finally block");
		}
		
	}

}
