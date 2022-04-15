package Programming;

public class Increment_Decrement_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20;
		a = a + 1; // 21
		System.out.println("Update value:"+a);

		a++; // post increment -  
		
		
		System.out.println("Update value: with post increment" +a);
		
		
		System.out.println(a++);
		
		System.out.println(+a); //
		
		System.out.println(a+1); //
		
		System.out.println(a++);
		
		a = 10;
		
		System.out.println(++a);//Pre increment
		
		System.out.println("Pre increent:"+ (++a)); // Pre increment, execution and assignment will happen at the same step.
		
		
		a = 9;
		a-- ;
		System.out.println("Post Decrement:"+a);
		
		System.out.println(--a);
		

	}

}
