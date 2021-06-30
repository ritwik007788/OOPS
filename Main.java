package oops;

public class Main {

	public static void main(String[] args) {
		
//		Person p1 = new Person();
//		Person p2 = new Person(27,"Raunak");
//		p1.age = 21;
//		p1.name = "Ritwik";
		
//		p1.walk();
//		p1.walk(1000);
//		p2.walk();
//		System.out.println(Person.count);
		
		Developer d1 = new Developer(21,"Hasu");
		d1.walk(); // run - time polymorphism

		
	}

}

class Person{
	String name ;
	int age ;
	
	static int count;
	
//	Person() {   //Default constructor
//		count++;
//	}
	
	Person(int age, String name){
//		this(); // calls the default constructor.this() calls a constructor in the same class.
		this.age = age;
		this.name = name;
	}
	
	void walk() {
		System.out.println(name+" is walking.");
	}
	
	void walk(int steps) { // compile time polymorphism 
		System.out.println(name+" walked "+steps+" steps.");
	}
	
//	void doWork() {
//		System.out.println("Person is working");
//	}
}

class Developer extends Person{

	Developer(int age, String name) { // constructor to be created same as parent class
		super(age, name); // calls parent class constructors
	}
	void walk() {
		System.out.println("developer "+name+" is walking.");
	}
	
}