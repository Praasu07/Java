/*
 Program: Find the maximum and minimum value of an array
 @author: Prashant Kumar Srivastav
 @date: 20/10/22
 */
package CoreJava;
import java.util.Scanner;
//declaring class
 class ArrayMinMax 
{
	public static void main(String args[])
	{
		//Creating Scanner object to take input from user
	Scanner sc=new Scanner(System.in);
	//Print the array size
	System.out.print(" Enter Size of Array: ");
	int n=sc.nextInt();
	int i,sum=0;
	int arr[]=new int[n];   //Creating N-size Array

	for(i=0;i<n;i++)   //Entering N numbers in array
	{
	System.out.print(" Enter Number: ");
	arr[i]=sc.nextInt();
	}

	int max=arr[0],min=arr[0];  //Initializing with first element.

	for(i=0;i<n;i++)
	{
	if(arr[i]>max)   //Checking Maximum element
	 max=arr[i];

	if(arr[i]<min)  //Checking Minimum element
	 min=arr[i];
	 
	}
	   
	//Printing Result
	System.out.println(" Maximum Number: "+max);
	System.out.println(" Minimum Number: "+min);

	}//end of main
	}//end of class


