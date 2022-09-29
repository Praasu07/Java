/*
 Program: to find largest of two numbers
 @author: Prashant Kumar Srivastav
 @date: 28/09/22
 */

package CoreJava;
import java.util.Scanner;
//declaring class
class Program {
	 
	public static void main(String[] args)
	{
	//creating scanner object to take input from user
		Scanner sc = new Scanner (System.in);
		//getting input value from user
		System.out.println("Enter the First Number : ");
		int number1 = sc.nextInt();
		
		System.out.println("Enter the Second Number : ");
		int number2 = sc.nextInt();
	
		if
		(number1>number2)
		{
			
			System.out.println("Largest Number =" +number1);
		}
			else {
				System.out.println("Largest Number =" +number2);
			}
		
		
	}//end of main
	
	}//end of class


