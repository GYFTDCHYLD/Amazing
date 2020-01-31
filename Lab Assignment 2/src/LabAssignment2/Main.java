package LabAssignment2;

import java.util.Scanner;

public class Main {
	static int x = 3;
	static int y = 4;
	
	static int array[];
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		IterationMathLib iterationLibrary = new IterationMathLib();
		RecursiveMathLib recursionLibrary = new RecursiveMathLib();
		/*
		Scanner input = new Scanner(System.in);
			System.out.println("enter your first number: ");
				x = input.nextInt();
			System.out.println("enter your second number: ");
				y = input.nextInt();
		*/
		
		System.out.println("---- Recursion -----");
		runCode(recursionLibrary);
		System.out.println("\n---- Iteration -----");
		runCode(iterationLibrary);
	}
	
		public static void runCode(MathLib library) {
/* #1 */	System.out.println("GCD ("+x+","+y+") = "+library.gcd(x,y));
	

/* #2 */	System.out.println("Ack ("+x+","+y+") = "+ library.ack(x, y));
		

/* #3 */	System.out.print("Fibonacci (" + x + ") numbers Series \n");
		 	for(int i = 0; i < x; i++){
		 		System.out.println(library.fib(i));
		 	}
		
/* #4 */	System.out.println("Hanoi tower ("+ x +"): "+library.hanoi(x));
/**/		
		}
}