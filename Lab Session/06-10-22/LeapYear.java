/*
 Program: Check for Leap Year
 @author: Prashant Kumar Srivastav
 @date: 06/10/2022
 */
package CoreJava;

import java.util.Scanner;
//declaring class
 class LeapYear {
	 
	           //calling main method
	    public static void main(String[] args)
	    {
	       int year;
	      
	     //getting input value from user
	       System.out.println("Enter an Year ::- ");
	       
	     //creating scanner object to take input from user
	       Scanner sc = new Scanner(System.in);
	       year = sc.nextInt();
	       
  //using if-else statement to specified condition is true or false
	       if (((year % 4 == 0) && (year % 100 == 0)) || (year % 400 == 0))
	          System.out.println(" Year is a leap year");
	       else
	          System.out.println(" Year is not a leap year");
	   
	    }//end of main
	    
	 }//end of class

