package Programming;

import java.util.Scanner;

public class Do_While_Loop {
  public static void main(String[] args) {
	
	/* int loop = 0; // Ist process
	do
	 {
		 System.out.println("Loop:"+loop);
		 loop++;
	 }
	 while (loop < 5);*/
	  
	  
	  /*  Scanner scanner = new Scanner (System.in); // No 
	  
	  System.out.println("Enter a num: ");
	  int value = scanner.nextInt();
	  
	  while (value != 5)
	  {
		  System.out.println("Enter a num: ");
		  value = scanner.nextInt();
	  }*/
	  Scanner scanner = new Scanner (System.in);
	  int value = 0;
	  do 
	  {
		  System.out.println("Enter a num: ");
		  value = scanner.nextInt();
	  }
	  while (value != 5);
	  System.out.println("Got 5!");
	  
	  
}

}
