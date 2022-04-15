package Programming;

public class Conditional_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 30;
		
		String result = ( a > b)? "a is greater than b":"b is greater than a";
		System.out.println(result);
		
	    boolean flag = (a>b)? true : false;
	    System.out.println(flag);
	    
	    int biggestNum =( a > b )? a:b;
	    System.out.println(biggestNum);

	}

}
