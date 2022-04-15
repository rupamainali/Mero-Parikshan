package Programming;

import java.util.Scanner;

public class Getting_User_Input {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//Create Scanner object.
		Scanner input = new Scanner (System.in);
		
		//Output the prompt
		System.out.println("Enter a integer:"); //("Enter a line of text: ") 
		
		//Wait for the user to enter a line of text.
		int value = input.nextInt();  //input.nextLine(); // instead int write down double.
		
		
		//Tell them what they entered.
		System.out.println("You entered: + value");  //("You entered: + line");r

	}
	

}
