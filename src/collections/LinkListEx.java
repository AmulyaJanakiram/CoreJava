package collections;

import java.util.LinkedList;

public class LinkListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls = new  LinkedList<String>();
		ls.add("abc");
		ls.add("xyz");
		ls.add("def");
		ls.add("lmn");
		ls.add("abc");
		ls.addFirst("123");
		ls.addLast("789");
		System.out.println(ls);
		
		System.out.println("display using for loop");
		for (int i=0; i < ls.size(); i++)
		{
			System.out.println(ls.get(i));
		}
		
	}

}
