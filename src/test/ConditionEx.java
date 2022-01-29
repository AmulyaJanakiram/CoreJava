package test;

import java.util.Scanner;

public class ConditionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Please enter Age ");
		int age = scanner.nextInt(); //nextInt is the method of scanner class to get the input from user
		
		if (age>=18)
			System.out.println("Can vote");
		else if(age==17)
			System.out.println("can vote next year");
		else if (age < 18)
			{
			int nxtyear = 18 - age;
			System.out.println("Cannot vote. Try after " + nxtyear + " years");
			}
		else
			System.out.println("invalid input entered"); //never gets executed as int is expected as input
		
		scanner.close(); //object to be closed for memory deallocation and optimization
		
	}

}
