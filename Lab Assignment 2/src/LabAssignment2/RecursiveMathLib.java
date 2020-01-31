package LabAssignment2;

public class RecursiveMathLib extends MathLib {

	@Override
	public int gcd(int x, int y) {
		if(x < y) {
			int t = 0;
			t=x;
			x=y;
			y=t;
		}
		if(y == 0) {
			return x;
		}
		else if(x >= y && y !=0) { 
			return gcd(y, x % y);
		}
		return 1;
	}

	@Override
	public int ack(int x, int y) {
		if(x == 0) {
			return y+1;
		}
		else if (y == 0) {
			return ack(x - 1, 1);
		}
		else if (!(x == 0 && y == 0)){
			return ack(x - 1, ack(x , y-1));
		}
		
		return 0;
	}
	

	@Override
	public int fib(int x) {
		if(x == 0){
			return 0;
		}
		else if(x == 1){
				return 1;
			}
		else return fib(x-2) + fib(x-1);
	}

	@Override
	public int hanoi(int n) {
		if(n == 1){
			return 1;
		}
		else {
			return 2*hanoi(n-1)+1;
		}
	}

}