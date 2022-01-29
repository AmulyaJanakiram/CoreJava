package oops;

public class Employee {

	public String Name;
	public int Id;
	public int Salary;
	public static int Bonus = 900; //static variable should be accessed using Class Name. Only one memory will be allocated. No object is required.

	public void PrintName() {
		System.out.println("accessing the method : " + this.Name);
	}

	public Employee(String name, int empid, int sal) {
		// Constructor : used to intialize an object, Should be of same name of Class,
		// cannot return any value
		this.Name = name;
		this.Id = empid;
		this.Salary = sal;

	}

	public Employee(String name, int empid) {
		this.Name = name;
		this.Id = empid;

	}
	public Employee() {
		//Default constructor
	}
	
	public void PrintBonus() {
		System.out.println("bonus for all employees is  " + Employee.Bonus);
	}

	public static void ChangeBonus() {
		Employee.Bonus = 800;
		System.out.println("changed bonus for all employees is  " + Employee.Bonus);
	}
}
