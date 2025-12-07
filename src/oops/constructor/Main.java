package oops.constructor;
class Student{
	String name;
	int age;
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
}
public class Main {
	static void main() {
		System.out.println("Constructors");
		/*
			Constructor: Constructor is a special method that runs automatically when an Object Created.
		*/
		Student student = new Student("Jafiruzzaman",21);
		System.out.println(student.name+" "+student.age);
	}
}
