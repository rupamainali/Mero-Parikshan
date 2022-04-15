package Programming;

public class Reverse_The_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = 123;
		int sum = 0;
		while (no > 0) {// 0>0
			int rem = no % 10; //rem = 1 % 10>=1
			sum = rem +(sum*10); // 1+(32*10)=>321
			
			no = no/10; // 0
		}
		System.out.println(no);
		System.out.println(sum);
	}

}
