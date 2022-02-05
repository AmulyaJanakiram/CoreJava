package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "dhoni");
		map1.put(10, "Yuvaraj");
		map1.put(2, "dhoni");
		map1.put(3, "Sachin");
		map1.put(4, "Rahul");
		map1.put(5, "Prasad");

		System.out.println(map1);
		// update
		map1.put(10, "Yuvaraj Singh");
		System.out.println(map1);
		// remove
		map1.remove(10);
		System.out.println(map1);
		System.out.println(map1.get(3));
		// Iterate thru the map
		for (Map.Entry<Integer, String> entry1 : map1.entrySet()) {
			System.out.println(entry1.getKey());
			System.out.println(entry1.getValue());
		}
		// Iterate thru keys
		for (Integer val : map1.keySet()) {
			System.out.println("keys are " + val);
			System.out.println("values are " + map1.get(val));
		}
		// Iterate thru the values
		for (String val : map1.values()) {
			System.out.println("values are " + val);
		}
		LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		map2.put(1, "dhoni");
		map2.put(10, "Yuvaraj");
		map2.put(2, "dhoni");
		map2.put(3, "Sachin");
		map2.put(4, "Rahul");
		map2.put(5, "Prasad");

		System.out.println(map2);

		TreeMap<Integer, String> map3 = new TreeMap<Integer, String>();
		map3.put(1, "dhoni");
		map3.put(10, "Yuvaraj");
		map3.put(5, "Prasad");
		map3.put(3, "Sachin");
		map3.put(2, "dhoni");
		map3.put(4, "Rahul");

		System.out.println(map3);
	}

}
