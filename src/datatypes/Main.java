package datatypes;

public class Main {
	static void main() {
		/*
	variable: variable is a container to store values.If you want to store milk you have to store it into a 🍼 or 🧴
*/
		System.out.println("variables and data-types");
//		Integer Data-Types
		// Byte
		byte byteValue = 127; // range from -128 to 127
		System.out.println(byteValue);
		// Short
		short shortValue = 32767; // range from -32768 to 32767
		System.out.println(shortValue);
		int intValue = 2144655452; // range: 2 Billion
		System.out.println(intValue);
		// long
		long longValue = 2313416545645465462L;
		System.out.println(longValue);

		// Floating Type

		// float
		float floatingValue = 124.4452465456545544f; // range after decimal-point 7 value
		System.out.println(floatingValue);

		// double
		double doubleValue = 124.4452465456545544; // range after decimal-point 15 value
		System.out.println(doubleValue);

		// char
		char a = 'a';
		System.out.println(a);

//		boolean
		boolean isCoder = true;
		System.out.println(isCoder);


		// Types Conversion Implicit & Explicit
		// (Implicit Or wedening)
		byte bytevalue = 127;
		short shortvalue= bytevalue;
		int intvalue = shortvalue;
		long longvalue = intvalue;

		// (Explicit Or Narrowing)
		int x = (int) 10.5;
		System.out.println(x);
		int ch = (int) 'a';
		System.out.println(ch);
	}
}
