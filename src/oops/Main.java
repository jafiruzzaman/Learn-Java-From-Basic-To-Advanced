package oops;

/* How to Create a Class */
class Car{
	int wheel;
	int topSpeed;
	void run(){
		System.out.println("The 🚗 is Running...");
	}
}

public class Main {
	static void main() {
		System.out.println("Object Oriented Programming...");

		/*
			Object-Oriented-Programming: Object-Oriented Programming is a programming paradigm
			class: class is a user defined blueprint with some attributes(data) and behaviours(methods)
			object: object is an instance of class
		*/

		/* How to Create Object */
		Car car = new Car();
		// Access Properties
		car.wheel = 4;
		car.topSpeed = 400;
		car.run();
	}
}
