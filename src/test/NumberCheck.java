package test;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			Scanner scanner = new Scanner(System.in); 
			System.out.println("Please enter a number  ");
			int num = scanner.nextInt();
			
			/*
			int res = num%2;
			if (res == 0) 
					System.out.println(num + " is even");
			else
				System.out.println(num + " is odd");
			*/
			if(num%2==0)
				System.out.println(num + " is even");
			else
				System.out.println(num + " is odd");
			scanner.close();
		}
	}


