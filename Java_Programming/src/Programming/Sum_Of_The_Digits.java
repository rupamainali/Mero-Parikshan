package Programming;

public class Sum_Of_The_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 123;
		int sum = 0;
		while (no > 0 ) {
			int rem = no % 10;
			sum = sum + rem;
			no = no/10;
		}
		System.out.println("Sum of the digits: "+sum);

	}

}
