package test;

public class ArraysEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {10,20,30,40,50,60};
		
		System.out.println("length is " + num.length);
		System.out.println("value at 1st position is  " + num[0]);
		System.out.println("value at 2nd position is  " + num[1]);
		System.out.println("value at 4th position is  " + num[3]);
		System.out.println("value at last position is  " + num[num.length - 1]);
		
		String[] name = {"cricket", "hockey", "badminton"};
		System.out.println("value at 2nd pos is  "  + name[1]);	
		
		
		String name1 = "To err is human";
		
		String[] arrayWords = name1.split(" ");
		System.out.println("total number of words are " + arrayWords.length);
		System.out.println("Value at 3rd pos is " + arrayWords[2]);
		
		
	

		
	}

}
