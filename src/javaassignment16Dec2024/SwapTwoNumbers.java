package javaassignment16Dec2024;

public class SwapTwoNumbers {

	int a, b;

	SwapTwoNumbers(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("value of a before swapping: " + a); //a=10
		System.out.println("value of b before swapping: " + b); //b=20
	}

	void swapUsingThirdVar() {
		// using third var
		int c;

		c = a;  // c=10
		a = b;  //a=20
		b = c;  //b=10

		System.out.println("value of a after swapping using third var: " + a);  //a=20
		System.out.println("value of b after swapping using third var: " + b);  //b=10
	}

	void swapWithoutThirdVar() {

		// without using third var using operator+
		a = a + b; // a=10+20= 30
		b = a - b; // b=30-20= 10
		a = a - b; // c=30-10= 20

		// using *
		/*
		a = a * b; // a=20*10=200
		b = a / b; // b=200/20=10
		a = a / b; // a=200/10=20 */

		System.out.println("value of a after swapping without using third var: " + a);  //a=20
		System.out.println("value of b after swapping without using third var: " + b);  //b=10
		
	}

	public static void main(String[] args) {

		new SwapTwoNumbers(10, 20).swapUsingThirdVar();
		new SwapTwoNumbers(10, 20).swapWithoutThirdVar();

	}

}
