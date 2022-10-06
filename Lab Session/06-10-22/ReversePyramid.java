/*
 Program:Create Reverse Pyramid
 @author: Prashant Kumar Srivastav
 @date: 06/10/2022
 */
package CoreJava;
//declaring class
 class ReversePyramid 
 {
	 //calling main method
	 public static void main(String[] args)
	    {
		 
	        for
	        (int i = 7; i >= 1; i--)
	        {
	            for 
	            (int j = 7 - i; j >= 1; j--)
	            {
	                System.out.print(" ");
	            }
	            for
	            (int j = 1; j <= 2 * i - 1; j++)
	            {
	                System.out.print("$");
	            }
	            System.out.println();
	        }
	    }//end of main
}//end of class
