package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Employee empob1 = new Employee(); //new will allocation memory for empobject
		empob1.Name = "Dhoni";
		empob1.Id = 7;
		empob1.Salary = 5000;
		
		Employee empob2 = new Employee(); //new will allocation memory for empobject
		empob2.Name = "Sachin";
		empob2.Id = 10;
		empob2.Salary = 1000;
	
		System.out.println(empob1.Name); // accessing the object value
		System.out.println(empob2.Name);
		
		empob1.PrintName(); // accessing the method
		empob2.PrintName();*/
		
		
		Employee emp1 = new Employee("Dhonii",1,100);
		Employee emp2 = new Employee("Sachinn",2,200);
		Employee emp3 = new Employee("Dravid",3);
		
		emp1.PrintName();
		emp2.PrintName();
		emp3.PrintName();
		emp1.PrintBonus();
		Employee.ChangeBonus();
		
		Employee emp4 = new Employee(); //Default constructor
		Person per = new Person();
		
		ChildClass ch = new ChildClass();
		ch.print();
		ch.display();
		
		ChildClass ch1 = new ChildClass("Sachin",30,"Sportsmen");
		ch1.display();
		per.display();
		
		MethodOverloadingEx m = new MethodOverloadingEx();
		m.sum(10, 20);
		m.sum(10, 20, 30);
		m.sum(10.3, 10);
		
		
		//Abstract class cannot be intiated. Meaning an object cannot be created. Object can be created via the child class
		//BankEx bank = new BankEx();
		ICICBank icici = new ICICBank();
		icici.CreditCard();
		icici.welcome();
		icici.CheckBalance();
		
		
		EncapsulationEx En = new EncapsulationEx();
		En.setName("Dhoni");
		System.out.println(En.getName());
	}
}
