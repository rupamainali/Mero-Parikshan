package Programming;

public class Leap_Year {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int year = 1900;
		if (year % 4 == 0 )
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					System.out.println("Is a leap year");
				}
				else
				{
					System.out.println("Is not a leap year");
				}
				
			}
			else
			{
				System.out.println("Is a leap year");
			}
		}
		else
		{
			System.out.println("Year is not the leap year");
		}
		

	}

}
