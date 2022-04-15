package Programming;

public class Prime_Numbers {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int no = 13;
		
		boolean flag = false;
		
		for ( int i = 2; i< no ; i++)
		{
			if ( no % i == 0)
			{
				flag = true;
				break;
			}
			else
			{
				continue;
			}
		}
		if (flag == true)
		{
			System.out.println("The given number is not a prime number");
		}
	    else
		{
			System.out.println("The given number is prime number");
		}
	}

}
