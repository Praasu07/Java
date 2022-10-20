/*
 Program: Sort a numeric array and a string array
 @author: Prashant Kumar Srivastav
 @date: 20/10/22
 */
package CoreJava;
import java.util.Arrays;
//declaring class
class SortArray
{
	public static void main(String[] args)
	{   
	    //numeric array values
	    int[] array1 = 
	    	{ 77,95,55,44,13,71,65,25,49,69,17,73,14};
	            
	    //string array
	    String[] array2 =
	    	  { "Java",
	            "Python",
	            "PHP",
	            "C#",
	            "C Programming",
	            "C++" }; 
	    //print original numeric array
	    System.out.println("Original numeric array : "+Arrays.toString(array1));
	    Arrays.sort(array1);
	    //print after sorting numeric array
	    System.out.println("Sorted numeric array : "+Arrays.toString(array1));
	    
	    //print original string array
	    System.out.println("Original string array : "+Arrays.toString(array2));
	    Arrays.sort(array2);
	    //print after sorting string array
	    System.out.println("Sorted string array : "+Arrays.toString(array2));
	    
	    }//end of main
	}//end of class


