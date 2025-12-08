package oops.polymorphism;

// Compile-Time Polymorphism (Method Overloading)
class Calculator {
	// Add two integers
	int add(int a, int b) {
		return a + b;
	}

	// Add three integers
	int add(int a, int b, int c) {
		return a + b + c;
	}

	// Add two doubles
	double add(double a, double b) {
		return a + b;
	}
}

// Runtime Polymorphism (Method Overriding)
class Animal {
	void sound() {
		System.out.println("Some generic animal sound");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Woof Woof!");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("Meow Meow!");
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println("Polymorphism Demo\n");

		// Compile-Time Polymorphism
		Calculator calc = new Calculator();
		System.out.println("Add 2 numbers: " + calc.add(5, 10));
		System.out.println("Add 3 numbers: " + calc.add(5, 10, 15));
		System.out.println("Add 2 doubles: " + calc.add(5.5, 10.5));

		System.out.println("\n--- Runtime Polymorphism ---");
		// Runtime Polymorphism
		Animal myAnimal = new Dog(); // reference type Animal, object type Dog
		myAnimal.sound(); // prints "Woof Woof!"

		myAnimal = new Cat();
		myAnimal.sound(); // prints "Meow Meow!"
	}
}
