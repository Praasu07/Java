package CoreJava;
//use of extense keyword to perform inheritance
class Dog extends Animal
{
//methods and fields of Animal
//methods and fields of Dog
public void display(){
System.out.println("My Name is :" +name);
}
public static void main(String args[]){
//creating a object of child class
Dog d= new Dog();
//access fields of super class
d.name= "Bulldog";
d.display();
//call method of super class using object of sub class
d.eat();
}
}

