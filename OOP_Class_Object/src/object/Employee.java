package object;

public class Employee {
	
	int employeeId;
	String employeeName;

	public static void main(String[] args) {
		
		Employee jackObj = new Employee();
		jackObj.employeeId = 102;
		jackObj.employeeName = "Jack"; 
		
		
		System.out.println("Employee Id:"+jackObj.employeeId);
		System.out.println("Employee Name:"+jackObj.employeeName);
		
		Employee markObj = new Employee();
		markObj.employeeId = 103;
		markObj.employeeName = "Mark";
	
		System.out.println("Employee Id:"+markObj.employeeId);
		System.out.println("Employee Id:"+markObj.employeeName);

	}
 
}
