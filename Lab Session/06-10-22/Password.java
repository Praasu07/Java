/*
 Program:Check the condition for checking the correct password
 @author: Prashant Kumar Srivastav
 @date: 06/10/2022
 */
package CoreJava;
import java.util.Scanner;
//declaring class
 class Password 
 {
     //calling main method
	public static void main(String args[])
	{
		 
		    int password;
		  //creating scanner object to take input from user
	        Scanner input = new Scanner(System.in);
	      
	        System.out.println("Enter Password");//to get the password
	        password=input.nextInt();
	        System.out.println(password);
	        {
	        	 if (password==7654321) //condition for checking the correct password
	        {
	 	            System.out.println("Password is valid: "); //print password is valid
	        }
	        	 else
	        {
	 	            System.out.println("Not a valid password: ");//print password is not valid
	        	
	        }
	        }
	}//end of main
 }//end of class
	     
	

