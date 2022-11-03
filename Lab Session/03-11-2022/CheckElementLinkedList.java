/*
 Program: Check particular elements exist in LinkedList
 @author: Prashant Kumar Srivastav
 @date: 03/11/22
 */
package Assignment;

import java.util.LinkedList;

public class CheckElementLinkedList 
{
	public static void main(String[] args) 
	{
		 // create an empty linked list
		  LinkedList <String> c1 = new LinkedList <String> ();
		          c1.add("Orange");
		          c1.add("Purple");
		          c1.add("Black");
		          c1.add("White");
		          c1.add("Yellow");
		          System.out.println("Original linked list: " + c1);
		           
		     // Checks whether the color "Purple" exists or not.
		    if (c1.contains("Purple")) {
		       System.out.println("Color Purple is present in the linked list.");
		    } else 
		    {
		       System.out.println("Color Purplr is not present in the linked list.");
		    }
		    
		     // Checks whether the color "Brown" exists or not.
		    if (c1.contains("Brown")) 
		    {
		       System.out.println("Color Brown is present in the linked list.");
		    } else {
		       System.out.println("Color Brown is not present in the linked list.");
		     }
		    
		 }
		}
	   