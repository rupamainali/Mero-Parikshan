package Programming;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = 153;
		int temp = no;
		int sum = 0;
		while (no>0) { //
			int rem = no % 10; //
			sum = sum+(rem*rem*rem);
		    no = no/10; //
					
		}
		if (temp == sum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong Number");
		}
		

	}

}
