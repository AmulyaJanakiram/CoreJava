package test;

public class ExceptionHandlingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int arr[] = { 10, 20, 30 };
		try {

			int res = num / 2;
			//System.out.println(arr[5]);
		} catch (ArithmeticException e)
		{
			System.out.println("Arithmetic Exception is " + e);
		} catch (ArrayIndexOutOfBoundsException e)

		{
			System.out.println("ArrayIndexOutOfBoundsException is " + e);
		}
		catch (Exception e)

		{
			System.out.println("default exception " + e);
		}
		finally {
			System.out.println("finally block. Will be executed");
		}
		System.out.println("after try and catch");

	}

}
