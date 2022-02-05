package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PriorityQueue");
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("java");
		pq.add("javascript");
		pq.add("c++");
		pq.add("java"); //duplicate values are allowed
		pq.add("python");
		
		
		System.out.println(pq);
		System.out.println("first element is " + pq.peek());
		System.out.println("Retrieves and removes the head of this queue " + pq.poll());
		System.out.println(pq);
		
		System.out.println("ArrayDeque");
		ArrayDeque<String> aq = new ArrayDeque<String>();

		aq.add("java");
		aq.add("javascript");
		aq.add("c++");
		aq.add("python");
		
		System.out.println(aq);
		System.out.println(aq.peek());
		System.out.println(aq.peekFirst());
		System.out.println(aq.peekLast());
		
		System.out.println(aq);
		System.out.println(aq.poll()); System.out.println(aq);
		System.out.println(aq.pollFirst()); System.out.println(aq);
		System.out.println(aq.pollLast()); System.out.println(aq);
	
		//aq.add(null); null values are not allowed in queue
	
	}
	

}
