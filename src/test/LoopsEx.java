package test;

public class LoopsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("printing 1 to 10 using WHILE loop");
		int num = 1;
		while (num <= 10)
		{
			if (num == 5){ 
				num = num + 1;
				continue;
				};
			System.out.println(num);
			num = num + 1;
		}
		
		System.out.println("printing 1 to 10 using FOR loop");
		for (int i=1; i <=10; i++)
		{
			if (i == 4){ 
				break;
				};
			System.out.println("for loop " + i);
		}
		
		System.out.println("printing 10 to 1 using FOR loop");
		for (int j=10; j>=1; j--)
		{
			System.out.println(j);
		}
		
		System.out.println("Arrays with Loop");
		int[] array = {10,20,30,40,50};
		for (int index = 0; index < array.length; index++ )
		{
			System.out.println(array[index]);
		}
		System.out.println("Enhanced/ForEach Loop. continue and break cannot be used");
		for (int num1:array) {  //num1 will have real values of the array. And not the index
			System.out.println(num1);
		}
		
	}

}
