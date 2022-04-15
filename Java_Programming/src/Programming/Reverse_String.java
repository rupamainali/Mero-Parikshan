package Programming;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str = "MADAM";    //"MADAN" not a palindrome.
		
		String reverse = "";
		
		int length = Str.length();
		System.out.println("Length:"+length);
		
		for (int i = length - 1 ;i >= 0; i--) {
			reverse = reverse + Str.charAt(i);
			
		}
		System.out.println("reverse String:"+reverse);
		
		if (Str.equals(reverse)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}

	}

}
