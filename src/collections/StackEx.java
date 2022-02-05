package collections;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st);
		st.pop();
		st.push(40);
		System.out.println(st);
		System.out.println("Last element is " + st.peek());
	}

}
