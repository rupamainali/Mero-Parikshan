package programming;

public /*final */ class Exception_Programming {
	
	public  /*final */ static void getArithmeticException() { //Can not override or extend i.e inherit.
		
		int a = 10;
		int b = 0;
		int c ;
		int [] arrayInput = {1,2,3,4,5};
		
		try {
			// c = a/b;
			int x = arrayInput[10];
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds exception.");
			
		}
		catch (ArithmeticException e) {
			System.out.println("Exception Caught");
			c = a/5;
			System.out.println("Division is:"+c);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			System.out.println("Finally Block.");
		}
		
	}

	public static void main(String[] args) {
		
		 getArithmeticException();
	}

}
