package test;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//My Logic
		int num = 1, rem;
		while (num > 0)
		{
			rem = num%2;
			if (rem == 0)
			{
				System.out.println("not a prime number"); break;
			}
				else if (rem == 1)
				{
					System.out.println("is a prime number");
					break;
				}
		}
		//Class logic
		int num1 = 12; 
		boolean flag = true;
		for (int i=2; i<num/2; i++ ) {
			int rem1 = num1%i;
			if (rem1 == 0) {
				flag = false;
				break;
			}
		}
		if (flag==true) 
			System.out.println("not a prime number");
		else
			System.out.println("is a prime number");
		}
	
	}


