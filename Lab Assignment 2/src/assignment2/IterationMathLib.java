package assignment2;

public class IterationMathLib extends MathLib {

	@Override
	public int gcd(int x, int y) {
		for(int i = y; i > 0; i--) {
			if(x < y) {
				return y/x;	
			}else {
				return x/y;
			}
		}
		return y;
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
