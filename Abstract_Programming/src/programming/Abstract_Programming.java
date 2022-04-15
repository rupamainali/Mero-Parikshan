package programming;

interface Bonus{
	final int bonusPercentage = 100;
	
	public void calculateBonus();
	
}

interface Common{
	
}
abstract class Person{
	String personId;
	String personName;
	static int count = 100;
	
	Person(String personId,String personName){
		this.personId = personId;
		this.personName = personName;
		count++;
	}
	
	public static int getPersonCount() {
		return count;
	}
	
	public String getEmployeeName() {
		return this.personName;
	}
	public abstract void display();
	
}
class Employee extends Person implements Bonus,Common{
int empSalary;
	Employee(String personId, String personName,int empSalary) {
		super(personId, personName);
		this.empSalary = empSalary;
		

	}
	@Override
	public void display() {
		System.out.println("Employee Id"+personId);
		System.out.println("Employee Name"+super.getEmployeeName());
		System.out.println("Employee Salary"+this.empSalary);
		
		
	}
	@Override
	public void calculateBonus() {
		
		
	}
	
}

class Student extends Person{
     int marks;
	Student(String personId, String personName,int marks) {
		super(personId, personName);
		this.marks = marks;
	}
	@Override
	public void display() {
		
		System.out.println("Student Id"+personId);
		System.out.println("Student Name"+super.personName);
		System.out.println("Student Marks"+this.marks);
		
		
		
	}
	
}

public class Abstract_Programming {

	public static void main(String[] args) {
		Employee emp = new Employee("100","Robert",50000);
		emp.display();
		System.out.println("Person Count"+Employee.getPersonCount());
		
		Student stud = new Student("200","Steve",300);
		stud.display();
		System.out.println("Student Count"+Student.getPersonCount());
		
	}

}
