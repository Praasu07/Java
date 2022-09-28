package CoreJava;
import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		// creating scanner class to take input from user
		Scanner sc= new Scanner (System.in);
		//getting input value from user
		System.out.println("Enter the First Value: ");
		int num1= sc.nextInt();
		System.out.println("Enter The Second Value: ");
		int num2= sc.nextInt();
		System.out.println("Enter the Third Value");
		int num3= sc.nextInt();
		//performing equals to operation
		System.out.println("num1==num2 :"  +(num1==num2));
		//performing is not equal to operation
		System.out.println("num1!=num2 :" + (num1!=num2));
		
		//performing greater than operation
		System.out.println("num1>num2 :" + (num1>num2));
		
		//performing less than or equal to operation
		System.out.println("num1<num2 :" +(num1<num2));
		
		//performing greater than or equal to operation
		System.out.println("num1>=num2 :" +(num1>=num2));
		
		//performing less than or equal to operation
		System.out.println("num1<=num2 :" +(num1<=num2));

	}

}
