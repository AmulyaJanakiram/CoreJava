package test;

public class ReversalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("REverse A String");
		
		String str = "To err is human";
		String revstr = "";		
		for (int i=str.length()-1; i>=0; i--) {
			revstr = revstr + str.charAt(i);
		}
		System.out.println("Reversed Sting " + revstr);
		
		System.out.println("Number of Vowels");
		int res = 0;
		for (int i=0; i<str.length();i++)
		{
			if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				res++;
		}
		System.out.println(res);

		System.out.println("Reverse An Array");
		int arr[] = {10,20,30,40};
		int arr2[] = new int[5]; //declaring array - allocation of memory is done.
		for (int i=arr.length-1; i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	
		System.out.println("REverse A Number");
		int number = 123456789;
		int rev = 0;
		while (number > 0) {
			int rem = number%10;
			rev = rev*10 +rem;
			number = number/10;
		}
		System.out.println(rev);
		
		System.out.println("REverse A Number using string");
		
		/*
    	String str1 = String.valueOf(n1);
        
        String[] str2 = str1.split("");
        int len = str2.length;
        for (int j= len-1; j>=0; j--) {
            System.out.print(str2[j]);
        }
		*/
		
		
	}

}
