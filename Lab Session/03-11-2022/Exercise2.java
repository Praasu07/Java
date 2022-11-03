/*
 Program: Replace the second element of a ArrayList with specified element
 @author: Prashant Kumar Srivastav
 @date: 03/11/22
 */
package Assignment;
import java.util.ArrayList;
//declaring class
class Exercise2
{
	//declaring main method
	  public static void main(String[] args)
	  {
		  ArrayList<String>  color = new ArrayList<String>();

		  color.add("Sky Blue");
		  color.add("Purple");
         //print original array list
		  System.out.println("Original array list: " + color);
		  String new_color = "Yellow";
		  color.set(1,new_color);

		  int num=color.size();
		  //replacing second element with yellow then print
		  System.out.println("Replace second element with 'Yellow'."); 
		  //using for loop
		  for(int i=0;i<num;i++)
		  System.out.println(color.get(i));
		  }//end of main
		}//end of class

