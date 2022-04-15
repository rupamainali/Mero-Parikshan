package Programming;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 456;
		int temp = no;
		int sum = 0;
		while ( no > 0) {
			int rem = no % 10; // rem = 1 % 10 >=1
			sum = rem + (sum*10); // 1+(32*10)=>1+320=>321
			no = no/10; // 0
		}
		if (sum == temp) {
			System.out.println("Given input is Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
