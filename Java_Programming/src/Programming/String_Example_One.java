package Programming;

public class String_Example_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Str = "Welcome";
		int length = Str.length();
		System.out.println("Length of the String:"+length);  
		
		char ch = Str.charAt(4);
		System.out.println("Character is :"+ch);
		
		
		for (int i = 0;i < Str.length(); i++) {
			ch = Str.charAt(i);
			System.out.println(ch);
		}
	}

}
