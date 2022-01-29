package oops;

public class Person {

	public String Name;
	public int Age;
	
	public Person() {
		System.out.println("parent constructor..");
	}
	public Person(String name, int age) {
		this.Name = name;
		this.Age = age;
	}
	
	public void display() {
		System.out.println("inside parent..");
	}
	
	}


