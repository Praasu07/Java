/*
 Program: Calculate the average value of an arrays
 @author: Prashant Kumar Srivastav
 @date: 20/10/22
 */
package CoreJava;
import java.util.Scanner;
//declaring class
 class ArrayAverage 
 {
	 public static void main(String[] args)
	 {
		 
	        //creating scanner object to take input from user
	        Scanner sc = new Scanner(System.in);
	       // print the array size.
	        System.out.println("Enter array size: ");
	        int size = sc.nextInt();
	        // create an array
	        int[] array = new int[size];
	 
	        // print values from user keyboard
	        System.out.println("Enter array values :  ");
	        for (int i = 0; i < size; i++) {
	            int value = sc.nextInt();
	            array[i] = value;
	 
	        }
	 
	        // getting array length
	        int length = array.length;
	 
	        // default sum value.
	        int sum = 0;
	 
	        // sum of all values in array using for loop
	        for (int i = 0; i < array.length; i++) {
	            sum += array[i];
	        }
	 
	        double average = sum / length;
	 
	        System.out.println("Average of array : " + average);
	 
	    }//end of main
	 
}//end of class
