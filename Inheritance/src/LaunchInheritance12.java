class Shape{
	
	private Shape() {
		System.out.println("Obj of shape is created");
	}
	public Shape(String name) {
		System.out.println("Obj of shape is created");
	}
	
}
class Traingle extends Shape{//Implicit super constructor Shape() is not visible for default constructor. Must define an explicit constructor
	
//	public Traingle() {//Implicit super constructor Shape() is not visible. Must explicitly invoke another constructor
//		System.out.println("Obj of shape is created");
//	}
	public Traingle(String name) {
		super(name);
		System.out.println("Obj of Traingle is created");
	}
	
}
public class LaunchInheritance12 {

	public static void main(String[] args) {
		
		Traingle t1=new Traingle("equ-traingle");
	}
}
