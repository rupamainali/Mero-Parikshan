package Programming;

public class Factoiral {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int no = 5;
		int fact = 1;
		for ( int i = no; i >= 1; i--)
		{
			fact = fact*i;
		}
    System.out.println("Factorial of given number is :"+fact);
	}

}
