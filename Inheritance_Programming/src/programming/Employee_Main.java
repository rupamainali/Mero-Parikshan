package programming;

public class Employee_Main {

	public static void main(String[] args) {
		
		Bonus b = new Bonus();
		b.setName("Jack");
		b.setBonus(555);
		b.setBonus(15000);
		
		System.out.println("Name is :"+b.getName());
		System.out.println("No is :"+b.getBonus());
		System.out.println("Bonus is:"+b.bonus);
		
	}

}
