package test;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 10;
		int n2 = 20;
		
		int sum = n1 + n2;
		int sub = n1 - n2;
		int mul = n1 * n2;
		float div = (float) n1 / n2;
		
		System.out.println("sumation of two numbers = " + sum);
		System.out.println("subtraction of two numbers = " + sub);
		System.out.println("multiplication of two numbers = " + mul);
		System.out.println("divsion of two numbers = " + div);
		
		String name = "String Class Practice";
		System.out.println("total chars" + name.length());
		System.out.println(name.length() -1);
		
		char c1 = name.charAt(0);
		System.out.println("Char at first plase is " + c1);
		
		
		System.out.println("string in uppercase " + name.toUpperCase());
		System.out.println("string in lowercase " + name.toLowerCase());





		
	}

}
