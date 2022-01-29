package oops;

public class MethodOverloadingEx {
	
	public void sum(int a, int b) {
		
		int res = a + b;
		System.out.println("sum is " + res);
	}
public void sum(int a, int b, int c) {
		
		int res = a + b + c;
		System.out.println("sum is " + res);
	}
public void sum(double a, int b) {
	
	double res = a + b;
	System.out.println("sum is " + res);
}
}
