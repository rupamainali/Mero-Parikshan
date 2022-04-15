package Programming;

import java.util.Scanner;

public class Switch_Case {
	public static void main(String[] args) 
	{
 		Scanner input = new Scanner (System.in);
 		
 		System.out.println("Please enter a command");
 		String text = input.nextLine();
 		
 		switch (text)
 		{
 		case "Start":
 			System.out.println("Machine Operated!");
 			break;
 			
 			
 		case "Stop":
 		System.out.println("Machine Stooped!");
 		break;
 		
 		default:
 			System.out.println("Command not recognized");
 			
 		}
		
	}

}
