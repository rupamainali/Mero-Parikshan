package Programming;

public class Charecter_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char []vowelArray = {'a','e','i','o','u'};
	//	int length = vowelArray.length;
	//	System.out.println("Length of the Array:"+length);
		
		boolean name = false;
		for (int i = 0; i < vowelArray.length;i++){
			if (vowelArray [i] =='i') {
				//	System.out.println("vowel is present");
				name = true;
				break;
	//	}else {
		//	System.out.println("vowel is not present");
	//	}

	}
     
	}
		if (name) {
			System.out.println("vowel is present");
		}else {
			System.out.println("vowel is not present");
		}
}
}

