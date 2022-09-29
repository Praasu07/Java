/*
 Program: Multilevel Inheritance
 @author: Prashant Kumar Srivastav
 @date: 28/09/22
 */
package Inheritance;

//declaring class
class Parent {
	void sing()
	{
		System.out.println(" Johny Johny Yes Papa ");
	}

}
//using extends 
class Child extends Parent
{
	void speak()
	{
		
		System.out.println("### Hindi ###");
		
	}
	void dance()
	{
		System.out.println("$$$ Classical $$$");
		
	}
}
//using extends to inherit the properties of child
class Inheritance extends Child
{
	public static void main(String args[])
	{
		Inheritance obj= new Inheritance();
		obj.speak();
		obj.dance();
	}//end of main
}// end of class