package Function;

public class Methods {
	
	public static void add(int a, int b) {
		int c =  a+b;
		System.out.println("Addition of two numbers are:"+c);
	}
	public static void  add(String Str1, String Str2){
		
		String Str3 = Str1 + Str2;
		System.out.println("Conctenation:"+Str3);
		
	}
	
	public static void add(String Str1,int no ) {
		
	}
	
	public static void add(int a,int b, int c ) {
		
		
	}
	public static int findFactorial(int no) {
		int fact = 1;
		for (int i = no; i >= 1 ; i--) {
			fact = fact*i;
		}
		return fact;
	}
	
	  // isStartsWith =>Welcome ,Wel=>True,Should return False
	public static boolean startsWith(String str,String startsWith) {
		
		if (str.startsWith(startsWith)) {
			return true;
		}
		return false;
	}
	public static int[] addArray(int[] intArray) {
		for (int i = 0; i<intArray.length ; i++) {
			intArray[i] = intArray[i]+1;
		}
		return intArray;
		
		
	}
	public static void dispArray(int[] intArray) {
		for (int i = 0; i<intArray.length ; i++) {
			System.out.println(intArray[i]);
		}
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add(10,5);
		add(5,8);
		add(9,2);
		
		int result = findFactorial(5);
		println("Factorial is:"+result);
//		System.out.println("Factorial is:"+result);
		
		add("Welcome","Java Programming");
		
	boolean resultValue =	startsWith("Welcome","Wel");
	System.out.println("Reult of comparison:"+resultValue);
	
	int inputArray [] = {1,2,3,4,5};
	 int resultArray[] = addArray(inputArray);
	
	 
	 dispArray (resultArray);
       
	}
	
	public static void println(String str) {
		System.out.println(str);
	}

}
