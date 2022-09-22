package CoreJava;

class Teacher{
	public void teach()
	{
		System.out.println("teaching subject Java");
	}

}



class Student extends Teacher{
	public void listen() {
		System.out.println("Listening to the Teacher");
	}
  }
	public static void main(String[] args)
	{
		Student s= new Student();
		s.teach();
		s.listen();
	}