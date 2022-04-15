package Programming;

public class Break_Continue_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loop = 1;
		while (true) {
			System.out.println("Looping:" + loop);
			if (loop == 10) {

				break; //Break Loop
			}
			loop++;
			System.out.println("Running");

		}
		int y = 1;
		while (y < 10)
		{
			if (y == 7)
			{
				continue;   //Continue Loop
				
			}
			System.out.println(y);
			y++;
		}

	}
}
