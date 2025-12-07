package oops.inheritance;

public class Main {
	static void main() {
		System.out.println("Inheritance...");
		Dog dog = new Dog();
		System.out.println(dog.name = "bob");
		System.out.println(dog.age = 3);
		dog.eat();
		dog.bark();
	}
}
