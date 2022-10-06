/*
 Program: Reverse the number
 @author: Prashant Kumar Srivastav
 @date: 06/10/2022
 */
package CoreJava;
import java.util.Scanner;
//declaring class
 class ReverseNumber 
 {
	 //calling main method
	 public static void main(String args[])
	 {
		 int m ,n ,sum = 0;
		//creating scanner object to take input from user
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter The Number :- ");
		  m = sc.nextInt();
		  while(m > 0)
		  {
			  n = m % 10;
			  sum = sum * 10 + n;
			  m = m / 10;
		  
		  }
		 System.out.println("Reverse :" + sum);
	}//end of main
	 
	}//end of class
