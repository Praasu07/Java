package methods;

public class TestFunction {

	public static void addition() {
		int x=10,y=20;
		System.out.println("Result is=" +(x+y));
		// TODO Auto-generated method stub
	
	}
	public static void Subtraction() {
		int x=10,y=5;
		System.out.println("Result is=" +(x-y));
	}
	public static void Multiplication() {
		int x=2,y=5;
		System.out.println("Result is=" +(x*y));
	}
	public static void Division() {
		int x=10,y=5;
		System.out.println("Result is=" +(x/y));
	}

public static void main(String args[]){
	addition();
	Subtraction();
	Multiplication();
	Division();
}
}
