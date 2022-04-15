package programming;

public class Employee {
	static int count;
	
	public Employee() {
		++count;
	}
	
	static {
		System.out.println("I am from class called STATIC BLOCK.");
	}
public static void displayDetails() {
	
	System.out.println("Greetings , I am from static method.");
	
}
	public static void main(String[] args) {
		
		Employee.displayDetails();
	//	displayDetails(); //Either.

		System.out.println("Count value is:"+count);
		
		Employee Emp = new Employee();
		System.out.println("Count value is:"+count);
		
		Employee Emp2 = new Employee();
		System.out.println("Count value is:"+count);
		

	}

}
