package assignment2;

public class RecursiveMathLib extends MathLib {

	@Override
	public int gcd(int x, int y) {
		if(y == 0) {
			return x;
		}else if(x > y && x != 0) { 
			return gcd(y, x % y);
		}
		return 0;
	}

	@Override
	public int ack(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int fib(int x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int hanoi(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

}
