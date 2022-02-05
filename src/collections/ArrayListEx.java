package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sachin"); 
		al.add("Dhoni");
		al.add("Dravid");
		al.add("Shastri");
		al.add("Azhar");
		System.out.println("size is " + al.size());
		System.out.println(("first index value is " + al.get(0)));
		al.remove(0); //index starts from 0. so Sachin is removed
		System.out.println("size is  " + al.size());
		System.out.println(al);
		System.out.println("display using for loop");
		for (int i=0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("display using for each loop");
		for (String name : al) {
			System.out.println(name);
		}
		al.set(1, "VenkateshPrasad"); // replacing the value
		System.out.println("display using for Iterator");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Sorting and reversing..");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	}

}
