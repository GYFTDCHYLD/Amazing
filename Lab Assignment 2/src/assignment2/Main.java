package assignment2;

public class Main {

	public static void main(String[] args) {
		IterationMathLib iterationLibrary = new IterationMathLib();
		RecursiveMathLib recursionLibrary = new RecursiveMathLib();
		
		System.out.println("---- Recursion -----");
		runCode(recursionLibrary);
		System.out.println("---- Iteration -----");
		runCode(iterationLibrary);


	}

	public static void runCode(MathLib library) {
		System.out.println("GCD(4,2) = "+library.gcd(0, 2));
	}

}
