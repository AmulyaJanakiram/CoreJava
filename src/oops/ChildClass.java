package oops;

public class ChildClass extends Person{

	String Profession;
	public ChildClass() {
		System.out.println("child constructor..");
	}
	public ChildClass(String name, int age, String profession) {
		super(name, age); //to call the constructor of the parent class
		this.Profession = profession;
	}
	public void display() {
		System.out.println("inside child..");
	}
	

	public void print() {
		
		System.out.println("inside child...");
	}
	
}
