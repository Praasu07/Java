/*
 Program: Create a program for calculation
 @author: Prashant kumar Srivastav
 @date: 26/09/22
 */
package CoreJava;
import java.util.Scanner;
//declaring class
class Calculation {
	 
	 public static void main(String args[])
	 {
		//creating scanner object to take input from user
		 Scanner sc= new Scanner(System.in);
		 Calculation obj= new Calculation();
		 
		 System.out.println("Enter the First Number :");
		 int num1= sc.nextInt();
		 System.out.println("Enter The Second Number :");
		 int num2= sc.nextInt();
		 System.out.println("Press 1 for addition /n Press 2 for subtraction /n press 3 for multiplication /n press 4 for division ");
		 int opr=sc.nextInt();
		  
		//using switch case for executing statement
		  switch(opr)
		  {
		  case 1:
		 obj.addition(num1,num2);
		  break;
		
		  case 2:
			 obj.subtraction(num1,num2);
			  break;
		  case 3:
			  obj.multiplication(num1,num2);
			  break;
		  case 4:
			  obj.division(num1,num2);
			  break;
			 
		  }
	 }
	 public void addition(int num1, int num2)
	 {
		 System.out.println("Addition is =" +(num1+num2));
			  
		  }
    public void subtraction(int num1, int num2)
    {
  	  System.out.println("Subtraction is =" + (num1-num2));
    }
    public void multiplication(int num1,int num2)
    {
  	  System.out.println("Multiplication is =" + (num1*num2));
    }
    public void division(int num1,int num2)
    {
  	  System.out.println("Division is =" +(num1/num2));
    }//end of main 
}//end of class


