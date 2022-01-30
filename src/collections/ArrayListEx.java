package collections;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sachin"); 
		al.add("Dhoni");
		al.add("Dravid");
		System.out.println("size is " + al.size());
		System.out.println(("first index value is " + al.get(0)));
		al.remove(0); //index starts from 0. so Sachin is removed
		System.out.println("size is  " + al.size());
		System.out.println(al);

	}

}
