package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("name1");
		hs.add("name2");
		hs.add("name3");
		hs.add("name4");

		hs.add("name1"); // duplicates values not allowed
		hs.add(null);
		hs.add(null); // duplicates values not allowed
		System.out.println(hs);

		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("name1");
		lhs.add("name2");
		lhs.add("name3");
		lhs.add("name4");
		lhs.add("name1"); // duplicates values not allowed
		lhs.add(null);
		lhs.add(null); // duplicates values not allowed
		System.out.println(lhs);

		Iterator<String> itr1 = lhs.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("name1");
		ts.add("name2");
		ts.add("name3");
		ts.add("name4");
		ts.add("name1"); // duplicates values not allowed
		// ts.add(null); //null values not allowed
		System.out.println(ts);

		Iterator<String> itr2 = lhs.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
