package Programming;

public class Relational_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8;//Declaration and Defining the values in the same statement
		int b = 4;
        
		boolean myBoolean = a > b ; // a should be than b 8 > 4
		System.out.println("A is greater than B:"+myBoolean);
		
	    boolean myNum = a <= b;
	    System.out.println("A is lesser equal to B:"+myNum);
	    
	    b = 10;
	    boolean  myMap = (a==b);
	    System.out.println("A is equal to B:"+myMap);
	    
	    b = 4;
	    	myMap = a!=b;
	    	System.out.println("A is not equal to B:"+myMap);
	    
	    b = 8;
		  myMap = a!=b;
		  System.out.println("A is not equal to B:"+myMap);
	   
	}

}
