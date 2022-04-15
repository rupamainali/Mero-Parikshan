package Programming;

public class MyFirstProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
		int c = a + b;
		int x = 3, y = 4, z = 7;
		char myClass = 'A';
		char m = 5, n = 5, o = 5;
		String myString = "With Greetings";
		byte myByte = 90;
		short myShort = 1000;
		long myLong = 140000000l;
		float myFloat = 4.23f;
		double myDouble = 20.88d;
		float F0 = 45e4f;
		double D0 = 15E4d;

		for (int h = 1; h < 5; h++) {
			System.out.println(h);
		}

		boolean myBoolean1 = true;
		boolean myBoolean2 = false;
		String mySentence = "Hello World";
		String myWord = "Good Morning";
		String myFriend = "With Respect";
		String myMorning = "Please Say 'Thank You' To Her.";
		String myFirstName = "RUPA";
		String myLastName = "MAINALI";
		String myName = "Rupa ";
		String mySurName = "Mainali";
		String mySchool = "The Char \\ is known as backslash in java";
		String myBook = "it\'s OK";
		String L = "20";
		String K = "30";
		String J = L + K;
		int f = 1;
		do {
			System.out.println(f);
			f++;
		}

		while (f < 5);

		System.out.println("Hello Rupa");
		System.out.println(L + K);
		System.out.println(myBook);
		System.out.println(mySchool);
		System.out.println(myName.concat(mySurName));
		System.out.println(myFirstName + " " + myLastName);
		System.out.println(myMorning.indexOf("Thank You"));
		System.out.println(myFriend.toLowerCase());
		System.out.println(myWord.toUpperCase());
		System.out.println("The length of the sentence is: " + mySentence.length());
		System.out.println(myBoolean2);
		System.out.println(myBoolean1);
		System.out.println(D0);
		System.out.println(F0);
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myLong);
		System.out.println(myShort);
		System.out.println(myByte);
		System.out.println(myString);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(myClass);
		System.out.println(x + y + z);
		System.out.println(c);
	}

}
